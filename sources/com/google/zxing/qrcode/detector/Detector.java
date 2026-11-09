package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.PerspectiveTransform;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.qrcode.decoder.Version;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Detector {
    private final BitMatrix image;
    private ResultPointCallback resultPointCallback;

    public Detector(BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    private float calculateModuleSizeOneWay(ResultPoint resultPoint, ResultPoint resultPoint2) {
        float fSizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float fSizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        if (Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays)) {
            return fSizeOfBlackWhiteBlackRunBothWays2 / 7.0f;
        }
        return Float.isNaN(fSizeOfBlackWhiteBlackRunBothWays2) ? fSizeOfBlackWhiteBlackRunBothWays / 7.0f : (fSizeOfBlackWhiteBlackRunBothWays + fSizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    private static int computeDimension(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, float f10) throws NotFoundException {
        int iRound = (MathUtils.round(ResultPoint.distance(resultPoint, resultPoint3) / f10) + MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2) / f10)) / 2;
        int i7 = iRound + 7;
        int i10 = i7 & 3;
        if (i10 == 0) {
            return iRound + 8;
        }
        if (i10 == 2) {
            return iRound + 6;
        }
        if (i10 != 3) {
            return i7;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static PerspectiveTransform createTransform(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i7) {
        float x3;
        float y8;
        float f10;
        float f11 = i7 - 3.5f;
        if (resultPoint4 != null) {
            x3 = resultPoint4.getX();
            y8 = resultPoint4.getY();
            f10 = f11 - 3.0f;
        } else {
            x3 = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y8 = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f10 = f11;
        }
        return PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f11, 3.5f, f10, f10, 3.5f, f11, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x3, y8, resultPoint3.getX(), resultPoint3.getY());
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, PerspectiveTransform perspectiveTransform, int i7) throws NotFoundException {
        return GridSampler.getInstance().sampleGrid(bitMatrix, i7, i7, perspectiveTransform);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[RETURN] */
    private float sizeOfBlackWhiteBlackRun(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z3 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z3) {
            i14 = i7;
            i13 = i10;
            i16 = i11;
            i15 = i12;
        } else {
            i13 = i7;
            i14 = i10;
            i15 = i11;
            i16 = i12;
        }
        int iAbs = Math.abs(i15 - i13);
        int iAbs2 = Math.abs(i16 - i14);
        int i19 = 2;
        int i20 = (-iAbs) / 2;
        int i21 = i13 < i15 ? 1 : -1;
        int i22 = i14 < i16 ? 1 : -1;
        int i23 = i15 + i21;
        int i24 = i13;
        int i25 = i14;
        int i26 = 0;
        while (i24 != i23) {
            boolean z8 = z3;
            if ((i26 == i18 ? i18 : 0) == this.image.get(z3 ? i25 : i24, z3 ? i24 : i25)) {
                if (i26 == 2) {
                    return MathUtils.distance(i24, i25, i13, i14);
                }
                i26++;
            }
            i20 += iAbs2;
            if (i20 > 0) {
                if (i25 == i16) {
                    i17 = 2;
                    if (i26 == i17) {
                        return MathUtils.distance(i23, i16, i13, i14);
                    }
                    return Float.NaN;
                }
                i25 += i22;
                i20 -= iAbs;
            }
            i24 += i21;
            iAbs = iAbs;
            z3 = z8;
            i18 = 1;
            i19 = 2;
        }
        i17 = i19;
        if (i26 == i17) {
            return MathUtils.distance(i23, i16, i13, i14);
        }
        return Float.NaN;
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i7, int i10, int i11, int i12) {
        float width;
        float height;
        float fSizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i7, i10, i11, i12);
        int width2 = i7 - (i11 - i7);
        int height2 = 0;
        if (width2 < 0) {
            width = i7 / (i7 - width2);
            width2 = 0;
        } else if (width2 >= this.image.getWidth()) {
            width = ((this.image.getWidth() - 1) - i7) / (width2 - i7);
            width2 = this.image.getWidth() - 1;
        } else {
            width = 1.0f;
        }
        float f10 = i10;
        int i13 = (int) (f10 - ((i12 - i10) * width));
        if (i13 < 0) {
            height = f10 / (i10 - i13);
        } else if (i13 >= this.image.getHeight()) {
            height = ((this.image.getHeight() - 1) - i10) / (i13 - i10);
            height2 = this.image.getHeight() - 1;
        } else {
            height2 = i13;
            height = 1.0f;
        }
        return (fSizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i7, i10, (int) (((width2 - i7) * height) + i7), height2)) - 1.0f;
    }

    public final float calculateModuleSize(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    public DetectorResult detect() throws NotFoundException, FormatException {
        return detect(null);
    }

    public final AlignmentPattern findAlignmentInRegion(float f10, int i7, int i10, float f11) throws NotFoundException {
        int i11 = (int) (f11 * f10);
        int iMax = Math.max(0, i7 - i11);
        int iMin = Math.min(this.image.getWidth() - 1, i7 + i11) - iMax;
        float f12 = 3.0f * f10;
        if (iMin < f12) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iMax2 = Math.max(0, i10 - i11);
        int iMin2 = Math.min(this.image.getHeight() - 1, i10 + i11) - iMax2;
        if (iMin2 >= f12) {
            return new AlignmentPatternFinder(this.image, iMax, iMax2, iMin, iMin2, f10, this.resultPointCallback).find();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final BitMatrix getImage() {
        return this.image;
    }

    public final ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    public final DetectorResult processFinderPatternInfo(FinderPatternInfo finderPatternInfo) throws NotFoundException, FormatException {
        AlignmentPattern alignmentPatternFindAlignmentInRegion;
        FinderPattern topLeft = finderPatternInfo.getTopLeft();
        FinderPattern topRight = finderPatternInfo.getTopRight();
        FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float fCalculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (fCalculateModuleSize < 1.0f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int iComputeDimension = computeDimension(topLeft, topRight, bottomLeft, fCalculateModuleSize);
        Version provisionalVersionForDimension = Version.getProvisionalVersionForDimension(iComputeDimension);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion() - 7;
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length <= 0) {
            alignmentPatternFindAlignmentInRegion = null;
            break;
        }
        float x3 = bottomLeft.getX() + (topRight.getX() - topLeft.getX());
        float y8 = bottomLeft.getY() + (topRight.getY() - topLeft.getY());
        float f10 = 1.0f - (3.0f / dimensionForVersion);
        int x7 = (int) (((x3 - topLeft.getX()) * f10) + topLeft.getX());
        int y10 = (int) (((y8 - topLeft.getY()) * f10) + topLeft.getY());
        int i7 = 4;
        while (true) {
            if (i7 > 16) {
                alignmentPatternFindAlignmentInRegion = null;
                break;
            }
            try {
                alignmentPatternFindAlignmentInRegion = findAlignmentInRegion(fCalculateModuleSize, x7, y10, i7);
                break;
            } catch (NotFoundException unused) {
                i7 <<= 1;
            }
        }
        return new DetectorResult(sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPatternFindAlignmentInRegion, iComputeDimension), iComputeDimension), alignmentPatternFindAlignmentInRegion == null ? new ResultPoint[]{bottomLeft, topLeft, topRight} : new ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPatternFindAlignmentInRegion});
    }

    public final DetectorResult detect(Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return processFinderPatternInfo(new FinderPatternFinder(this.image, this.resultPointCallback).find(map));
    }
}
