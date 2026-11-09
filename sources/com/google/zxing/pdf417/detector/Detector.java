package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final float MAX_STOP_PATTERN_HEIGHT_VARIANCE = 0.5f;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    private static final int[] ROTATIONS = {0, 180, 270, 90};

    private Detector() {
    }

    private static BitMatrix applyRotation(BitMatrix bitMatrix, int i7) {
        if (i7 % MessageEvent.EVENT_CL_REPAYMENT_FAILED == 0) {
            return bitMatrix;
        }
        BitMatrix bitMatrixM105clone = bitMatrix.m105clone();
        bitMatrixM105clone.rotate(i7);
        return bitMatrixM105clone;
    }

    private static void copyToResult(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i7 = 0; i7 < iArr.length; i7++) {
            resultPointArr[iArr[i7]] = resultPointArr2[i7];
        }
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z3) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        for (int i7 : ROTATIONS) {
            BitMatrix bitMatrixApplyRotation = applyRotation(blackMatrix, i7);
            List<ResultPoint[]> listDetect = detect(z3, bitMatrixApplyRotation);
            if (!listDetect.isEmpty()) {
                return new PDF417DetectorResult(bitMatrixApplyRotation, listDetect, i7);
            }
        }
        return new PDF417DetectorResult(blackMatrix, new ArrayList(), 0);
    }

    private static int[] findGuardPattern(BitMatrix bitMatrix, int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bitMatrix.get(i7, i10) && i7 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i7--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i7;
        int i15 = 0;
        boolean z3 = false;
        while (i7 < i11) {
            if (bitMatrix.get(i7, i10) != z3) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (patternMatchVariance(iArr2, iArr) < MAX_AVG_VARIANCE) {
                        return new int[]{i14, i7};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z3 = !z3;
            }
            i7++;
        }
        if (i15 != length - 1 || patternMatchVariance(iArr2, iArr) >= MAX_AVG_VARIANCE) {
            return null;
        }
        return new int[]{i14, i7 - 1};
    }

    private static ResultPoint[] findRowsWithPattern(BitMatrix bitMatrix, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        int i14;
        boolean z3;
        int[] iArrFindGuardPattern;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i15 = i11;
        while (true) {
            if (i15 >= i7) {
                i14 = i15;
                z3 = false;
                break;
            }
            int[] iArrFindGuardPattern2 = findGuardPattern(bitMatrix, i12, i15, i10, iArr2, iArr3);
            if (iArrFindGuardPattern2 != null) {
                int[] iArr4 = iArrFindGuardPattern2;
                while (true) {
                    i14 = i15;
                    if (i14 <= 0 || (iArrFindGuardPattern = findGuardPattern(bitMatrix, i12, (i15 = i14 - 1), i10, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrFindGuardPattern;
                }
                float f10 = i14;
                resultPointArr[0] = new ResultPoint(iArr4[0], f10);
                resultPointArr[1] = new ResultPoint(iArr4[1], f10);
                z3 = true;
                break;
            }
            i15 += 5;
            iArr2 = iArr;
        }
        int i16 = i14 + 1;
        if (z3) {
            int[] iArr5 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i17 = i16;
            int i18 = 0;
            while (i17 < i7) {
                int[] iArrFindGuardPattern3 = findGuardPattern(bitMatrix, iArr5[0], i17, i10, iArr, iArr3);
                if (iArrFindGuardPattern3 != null && Math.abs(iArr5[0] - iArrFindGuardPattern3[0]) < 5 && Math.abs(iArr5[1] - iArrFindGuardPattern3[1]) < 5) {
                    iArr5 = iArrFindGuardPattern3;
                    i18 = 0;
                } else {
                    if (i18 > 25) {
                        break;
                    }
                    i18++;
                }
                i17++;
            }
            i16 = i17 - (i18 + 1);
            float f11 = i16;
            resultPointArr[2] = new ResultPoint(iArr5[0], f11);
            resultPointArr[3] = new ResultPoint(iArr5[1], f11);
        }
        if (i16 - i14 < i13) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    private static ResultPoint[] findVertices(BitMatrix bitMatrix, int i7, int i10) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        int iMax = 10;
        int i11 = i7;
        int i12 = i10;
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i11, i12, 10, START_PATTERN), INDEXES_START_PATTERN);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            int x3 = (int) resultPoint.getX();
            int y8 = (int) resultPointArr[4].getY();
            ResultPoint resultPoint2 = resultPointArr[5];
            iMax = resultPoint2 != null ? (int) Math.max((((int) resultPoint2.getY()) - y8) * MAX_STOP_PATTERN_HEIGHT_VARIANCE, 10.0f) : 10;
            i11 = y8;
            i12 = x3;
        }
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i11, i12, iMax, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f10 = i7;
        float f11 = f10 / i10;
        float f12 = MAX_INDIVIDUAL_VARIANCE * f11;
        float f13 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f14 = iArr2[i12] * f11;
            float f15 = i13;
            float f16 = f15 > f14 ? f15 - f14 : f14 - f15;
            if (f16 > f12) {
                return Float.POSITIVE_INFINITY;
            }
            f13 += f16;
        }
        return f13 / f10;
    }

    private static List<ResultPoint[]> detect(boolean z3, BitMatrix bitMatrix) {
        int x3;
        float y8;
        ArrayList<ResultPoint[]> arrayList = new ArrayList();
        int iMax = 0;
        int i7 = 0;
        loop0: while (true) {
            int i10 = i7;
            while (iMax < bitMatrix.getHeight()) {
                ResultPoint[] resultPointArrFindVertices = findVertices(bitMatrix, iMax, i7);
                if (resultPointArrFindVertices[0] == null && resultPointArrFindVertices[3] == null) {
                    if (i10 == 0) {
                        break;
                    }
                    for (ResultPoint[] resultPointArr : arrayList) {
                        ResultPoint resultPoint = resultPointArr[1];
                        if (resultPoint != null) {
                            iMax = (int) Math.max(iMax, resultPoint.getY());
                        }
                        ResultPoint resultPoint2 = resultPointArr[3];
                        if (resultPoint2 != null) {
                            iMax = Math.max(iMax, (int) resultPoint2.getY());
                        }
                    }
                    iMax += 5;
                    i7 = 0;
                } else {
                    arrayList.add(resultPointArrFindVertices);
                    if (!z3) {
                        break loop0;
                    }
                    ResultPoint resultPoint3 = resultPointArrFindVertices[2];
                    if (resultPoint3 != null) {
                        x3 = (int) resultPoint3.getX();
                        y8 = resultPointArrFindVertices[2].getY();
                    } else {
                        x3 = (int) resultPointArrFindVertices[4].getX();
                        y8 = resultPointArrFindVertices[4].getY();
                    }
                    iMax = (int) y8;
                    i7 = x3;
                    i10 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }
}
