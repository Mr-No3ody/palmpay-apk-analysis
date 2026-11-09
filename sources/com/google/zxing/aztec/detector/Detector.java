package com.google.zxing.aztec.detector;

import N8.q0;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes3.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = {3808, 476, 2107, 1799};
    private boolean compact;
    private final BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    public static final class CorrectedParameter {
        private final int data;
        private final int errorsCorrected;

        public CorrectedParameter(int i7, int i10) {
            this.data = i7;
            this.errorsCorrected = i10;
        }

        public int getData() {
            return this.data;
        }

        public int getErrorsCorrected() {
            return this.errorsCorrected;
        }
    }

    public static final class Point {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final int f23106x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final int f23107y;

        public Point(int i7, int i10) {
            this.f23106x = i7;
            this.f23107y = i10;
        }

        public int getX() {
            return this.f23106x;
        }

        public int getY() {
            return this.f23107y;
        }

        public ResultPoint toResultPoint() {
            return new ResultPoint(this.f23106x, this.f23107y);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(this.f23106x);
            sb2.append(' ');
            return q0.m(sb2, this.f23107y, '>');
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private static float distance(Point point, Point point2) {
        return MathUtils.distance(point.getX(), point.getY(), point2.getX(), point2.getY());
    }

    private static ResultPoint[] expandSquare(ResultPoint[] resultPointArr, int i7, int i10) {
        float f10 = i10 / (i7 * 2.0f);
        float x3 = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y8 = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x7 = (resultPointArr[2].getX() + resultPointArr[0].getX()) / 2.0f;
        float y10 = (resultPointArr[2].getY() + resultPointArr[0].getY()) / 2.0f;
        float f11 = x3 * f10;
        float f12 = y8 * f10;
        ResultPoint resultPoint = new ResultPoint(x7 + f11, y10 + f12);
        ResultPoint resultPoint2 = new ResultPoint(x7 - f11, y10 - f12);
        float x10 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y11 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x11 = (resultPointArr[3].getX() + resultPointArr[1].getX()) / 2.0f;
        float y12 = (resultPointArr[3].getY() + resultPointArr[1].getY()) / 2.0f;
        float f13 = x10 * f10;
        float f14 = f10 * y11;
        return new ResultPoint[]{resultPoint, new ResultPoint(x11 + f13, y12 + f14), resultPoint2, new ResultPoint(x11 - f13, y12 - f14)};
    }

    private int extractParameters(ResultPoint[] resultPointArr) throws NotFoundException {
        long j6;
        long j10;
        if (!isValid(resultPointArr[0]) || !isValid(resultPointArr[1]) || !isValid(resultPointArr[2]) || !isValid(resultPointArr[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i7 = this.nbCenterLayers * 2;
        int[] iArr = {sampleLine(resultPointArr[0], resultPointArr[1], i7), sampleLine(resultPointArr[1], resultPointArr[2], i7), sampleLine(resultPointArr[2], resultPointArr[3], i7), sampleLine(resultPointArr[3], resultPointArr[0], i7)};
        this.shift = getRotation(iArr, i7);
        long j11 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = iArr[(this.shift + i10) % 4];
            if (this.compact) {
                j6 = j11 << 7;
                j10 = (i11 >> 1) & 127;
            } else {
                j6 = j11 << 10;
                j10 = ((i11 >> 2) & 992) + ((i11 >> 1) & 31);
            }
            j11 = j6 + j10;
        }
        CorrectedParameter correctedParameterData = getCorrectedParameterData(j11, this.compact);
        int data = correctedParameterData.getData();
        if (this.compact) {
            this.nbLayers = (data >> 6) + 1;
            this.nbDataBlocks = (data & 63) + 1;
        } else {
            this.nbLayers = (data >> 11) + 1;
            this.nbDataBlocks = (data & 2047) + 1;
        }
        return correctedParameterData.getErrorsCorrected();
    }

    private ResultPoint[] getBullsEyeCorners(Point point) throws NotFoundException {
        this.nbCenterLayers = 1;
        Point point2 = point;
        Point point3 = point2;
        Point point4 = point3;
        boolean z3 = true;
        while (this.nbCenterLayers < 9) {
            Point firstDifferent = getFirstDifferent(point, z3, 1, -1);
            Point firstDifferent2 = getFirstDifferent(point2, z3, 1, 1);
            Point firstDifferent3 = getFirstDifferent(point3, z3, -1, 1);
            Point firstDifferent4 = getFirstDifferent(point4, z3, -1, -1);
            if (this.nbCenterLayers > 2) {
                double dDistance = (distance(firstDifferent4, firstDifferent) * this.nbCenterLayers) / (distance(point4, point) * (this.nbCenterLayers + 2));
                if (dDistance < 0.75d || dDistance > 1.25d || !isWhiteOrBlackRectangle(firstDifferent, firstDifferent2, firstDifferent3, firstDifferent4)) {
                    break;
                }
            }
            z3 = !z3;
            this.nbCenterLayers++;
            point4 = firstDifferent4;
            point = firstDifferent;
            point2 = firstDifferent2;
            point3 = firstDifferent3;
        }
        int i7 = this.nbCenterLayers;
        if (i7 != 5 && i7 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.compact = i7 == 5;
        ResultPoint[] resultPointArr = {new ResultPoint(point.getX() + 0.5f, point.getY() - 0.5f), new ResultPoint(point2.getX() + 0.5f, point2.getY() + 0.5f), new ResultPoint(point3.getX() - 0.5f, point3.getY() + 0.5f), new ResultPoint(point4.getX() - 0.5f, point4.getY() - 0.5f)};
        int i10 = this.nbCenterLayers;
        return expandSquare(resultPointArr, (i10 * 2) - 3, i10 * 2);
    }

    private int getColor(Point point, Point point2) {
        float fDistance = distance(point, point2);
        if (fDistance == 0.0f) {
            return 0;
        }
        float x3 = (point2.getX() - point.getX()) / fDistance;
        float y8 = (point2.getY() - point.getY()) / fDistance;
        float x7 = point.getX();
        float y10 = point.getY();
        boolean z3 = this.image.get(point.getX(), point.getY());
        int iFloor = (int) Math.floor(fDistance);
        int i7 = 0;
        for (int i10 = 0; i10 < iFloor; i10++) {
            if (this.image.get(MathUtils.round(x7), MathUtils.round(y10)) != z3) {
                i7++;
            }
            x7 += x3;
            y10 += y8;
        }
        float f10 = i7 / fDistance;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == z3 ? 1 : -1;
        }
        return 0;
    }

    private static CorrectedParameter getCorrectedParameterData(long j6, boolean z3) throws NotFoundException {
        int i7;
        int i10;
        if (z3) {
            i7 = 7;
            i10 = 2;
        } else {
            i7 = 10;
            i10 = 4;
        }
        int i11 = i7 - i10;
        int[] iArr = new int[i7];
        for (int i12 = i7 - 1; i12 >= 0; i12--) {
            iArr[i12] = ((int) j6) & 15;
            j6 >>= 4;
        }
        try {
            int iDecodeWithECCount = new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decodeWithECCount(iArr, i11);
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 = (i13 << 4) + iArr[i14];
            }
            return new CorrectedParameter(i13, iDecodeWithECCount);
        } catch (ReedSolomonException unused) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    private int getDimension() {
        if (this.compact) {
            return (this.nbLayers * 4) + 11;
        }
        int i7 = this.nbLayers;
        return ((((i7 * 2) + 6) / 15) * 2) + (i7 * 4) + 15;
    }

    private Point getFirstDifferent(Point point, boolean z3, int i7, int i10) {
        int x3 = point.getX() + i7;
        int y8 = point.getY();
        while (true) {
            y8 += i10;
            if (!isValid(x3, y8) || this.image.get(x3, y8) != z3) {
                break;
            }
            x3 += i7;
        }
        int i11 = x3 - i7;
        int i12 = y8 - i10;
        while (isValid(i11, i12) && this.image.get(i11, i12) == z3) {
            i11 += i7;
        }
        int i13 = i11 - i7;
        while (isValid(i13, i12) && this.image.get(i13, i12) == z3) {
            i12 += i10;
        }
        return new Point(i13, i12 - i10);
    }

    private Point getMatrixCenter() {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        ResultPoint resultPoint6;
        ResultPoint resultPoint7;
        ResultPoint resultPoint8;
        try {
            ResultPoint[] resultPointArrDetect = new WhiteRectangleDetector(this.image).detect();
            resultPoint3 = resultPointArrDetect[0];
            resultPoint4 = resultPointArrDetect[1];
            resultPoint2 = resultPointArrDetect[2];
            resultPoint = resultPointArrDetect[3];
        } catch (NotFoundException unused) {
            int width = this.image.getWidth() / 2;
            int height = this.image.getHeight() / 2;
            int i7 = width + 7;
            int i10 = height - 7;
            ResultPoint resultPoint9 = getFirstDifferent(new Point(i7, i10), false, 1, -1).toResultPoint();
            int i11 = height + 7;
            ResultPoint resultPoint10 = getFirstDifferent(new Point(i7, i11), false, 1, 1).toResultPoint();
            int i12 = width - 7;
            ResultPoint resultPoint11 = getFirstDifferent(new Point(i12, i11), false, -1, 1).toResultPoint();
            resultPoint = getFirstDifferent(new Point(i12, i10), false, -1, -1).toResultPoint();
            resultPoint2 = resultPoint11;
            resultPoint3 = resultPoint9;
            resultPoint4 = resultPoint10;
        }
        int iRound = MathUtils.round((resultPoint2.getX() + (resultPoint4.getX() + (resultPoint.getX() + resultPoint3.getX()))) / 4.0f);
        int iRound2 = MathUtils.round((resultPoint2.getY() + (resultPoint4.getY() + (resultPoint.getY() + resultPoint3.getY()))) / 4.0f);
        try {
            ResultPoint[] resultPointArrDetect2 = new WhiteRectangleDetector(this.image, 15, iRound, iRound2).detect();
            resultPoint5 = resultPointArrDetect2[0];
            resultPoint6 = resultPointArrDetect2[1];
            resultPoint7 = resultPointArrDetect2[2];
            resultPoint8 = resultPointArrDetect2[3];
        } catch (NotFoundException unused2) {
            int i13 = iRound + 7;
            int i14 = iRound2 - 7;
            resultPoint5 = getFirstDifferent(new Point(i13, i14), false, 1, -1).toResultPoint();
            int i15 = iRound2 + 7;
            resultPoint6 = getFirstDifferent(new Point(i13, i15), false, 1, 1).toResultPoint();
            int i16 = iRound - 7;
            resultPoint7 = getFirstDifferent(new Point(i16, i15), false, -1, 1).toResultPoint();
            resultPoint8 = getFirstDifferent(new Point(i16, i14), false, -1, -1).toResultPoint();
        }
        return new Point(MathUtils.round((resultPoint7.getX() + (resultPoint6.getX() + (resultPoint8.getX() + resultPoint5.getX()))) / 4.0f), MathUtils.round((resultPoint7.getY() + (resultPoint6.getY() + (resultPoint8.getY() + resultPoint5.getY()))) / 4.0f));
    }

    private ResultPoint[] getMatrixCornerPoints(ResultPoint[] resultPointArr) {
        return expandSquare(resultPointArr, this.nbCenterLayers * 2, getDimension());
    }

    private static int getRotation(int[] iArr, int i7) throws NotFoundException {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 = (i10 << 3) + ((i11 >> (i7 - 2)) << 1) + (i11 & 1);
        }
        int i12 = ((i10 & 1) << 11) + (i10 >> 1);
        for (int i13 = 0; i13 < 4; i13++) {
            if (Integer.bitCount(EXPECTED_CORNER_BITS[i13] ^ i12) <= 2) {
                return i13;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean isValid(int i7, int i10) {
        return i7 >= 0 && i7 < this.image.getWidth() && i10 >= 0 && i10 < this.image.getHeight();
    }

    private boolean isWhiteOrBlackRectangle(Point point, Point point2, Point point3, Point point4) {
        Point point5 = new Point(Math.max(0, point.getX() - 3), Math.min(this.image.getHeight() - 1, point.getY() + 3));
        Point point6 = new Point(Math.max(0, point2.getX() - 3), Math.max(0, point2.getY() - 3));
        Point point7 = new Point(Math.min(this.image.getWidth() - 1, point3.getX() + 3), Math.max(0, Math.min(this.image.getHeight() - 1, point3.getY() - 3)));
        Point point8 = new Point(Math.min(this.image.getWidth() - 1, point4.getX() + 3), Math.min(this.image.getHeight() - 1, point4.getY() + 3));
        int color = getColor(point8, point5);
        return color != 0 && getColor(point5, point6) == color && getColor(point6, point7) == color && getColor(point7, point8) == color;
    }

    private BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        GridSampler gridSampler = GridSampler.getInstance();
        int dimension = getDimension();
        float f10 = dimension / 2.0f;
        int i7 = this.nbCenterLayers;
        float f11 = f10 - i7;
        float f12 = f10 + i7;
        return gridSampler.sampleGrid(bitMatrix, dimension, dimension, f11, f11, f12, f11, f12, f12, f11, f12, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int sampleLine(ResultPoint resultPoint, ResultPoint resultPoint2, int i7) {
        float fDistance = distance(resultPoint, resultPoint2);
        float f10 = fDistance / i7;
        float x3 = resultPoint.getX();
        float y8 = resultPoint.getY();
        float x7 = ((resultPoint2.getX() - resultPoint.getX()) * f10) / fDistance;
        float y10 = ((resultPoint2.getY() - resultPoint.getY()) * f10) / fDistance;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            float f11 = i11;
            if (this.image.get(MathUtils.round((f11 * x7) + x3), MathUtils.round((f11 * y10) + y8))) {
                i10 |= 1 << ((i7 - i11) - 1);
            }
        }
        return i10;
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    private static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private boolean isValid(ResultPoint resultPoint) {
        return isValid(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    public AztecDetectorResult detect(boolean z3) throws NotFoundException {
        ResultPoint[] bullsEyeCorners = getBullsEyeCorners(getMatrixCenter());
        if (z3) {
            ResultPoint resultPoint = bullsEyeCorners[0];
            bullsEyeCorners[0] = bullsEyeCorners[2];
            bullsEyeCorners[2] = resultPoint;
        }
        int iExtractParameters = extractParameters(bullsEyeCorners);
        BitMatrix bitMatrix = this.image;
        int i7 = this.shift;
        return new AztecDetectorResult(sampleGrid(bitMatrix, bullsEyeCorners[i7 % 4], bullsEyeCorners[(i7 + 1) % 4], bullsEyeCorners[(i7 + 2) % 4], bullsEyeCorners[(i7 + 3) % 4]), getMatrixCornerPoints(bullsEyeCorners), this.compact, this.nbDataBlocks, this.nbLayers, iExtractParameters);
    }
}
