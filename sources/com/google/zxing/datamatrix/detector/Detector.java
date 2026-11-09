package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.WhiteRectangleDetector;

/* JADX INFO: loaded from: classes3.dex */
public final class Detector {
    private final BitMatrix image;
    private final WhiteRectangleDetector rectangleDetector;

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new WhiteRectangleDetector(bitMatrix);
    }

    private ResultPoint correctTopRight(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        ResultPoint resultPointShiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint2, resultPoint4) + 1) * 4);
        ResultPoint resultPointShiftPoint2 = shiftPoint(resultPoint3, resultPoint2, (iTransitionsBetween + 1) * 4);
        int iTransitionsBetween2 = transitionsBetween(resultPointShiftPoint, resultPoint4);
        int iTransitionsBetween3 = transitionsBetween(resultPointShiftPoint2, resultPoint4);
        float f10 = iTransitionsBetween2 + 1;
        ResultPoint resultPoint5 = new ResultPoint(((resultPoint3.getX() - resultPoint2.getX()) / f10) + resultPoint4.getX(), ((resultPoint3.getY() - resultPoint2.getY()) / f10) + resultPoint4.getY());
        float f11 = iTransitionsBetween3 + 1;
        ResultPoint resultPoint6 = new ResultPoint(((resultPoint.getX() - resultPoint2.getX()) / f11) + resultPoint4.getX(), ((resultPoint.getY() - resultPoint2.getY()) / f11) + resultPoint4.getY());
        if (isValid(resultPoint5)) {
            if (!isValid(resultPoint6) || transitionsBetween(resultPointShiftPoint, resultPoint5) + transitionsBetween(resultPointShiftPoint2, resultPoint5) > transitionsBetween(resultPointShiftPoint, resultPoint6) + transitionsBetween(resultPointShiftPoint2, resultPoint6)) {
                return resultPoint5;
            }
        } else if (!isValid(resultPoint6)) {
            return null;
        }
        return resultPoint6;
    }

    private ResultPoint[] detectSolid1(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[3];
        ResultPoint resultPoint4 = resultPointArr[2];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint2);
        int iTransitionsBetween2 = transitionsBetween(resultPoint2, resultPoint3);
        int iTransitionsBetween3 = transitionsBetween(resultPoint3, resultPoint4);
        int iTransitionsBetween4 = transitionsBetween(resultPoint4, resultPoint);
        ResultPoint[] resultPointArr2 = {resultPoint4, resultPoint, resultPoint2, resultPoint3};
        if (iTransitionsBetween > iTransitionsBetween2) {
            resultPointArr2[0] = resultPoint;
            resultPointArr2[1] = resultPoint2;
            resultPointArr2[2] = resultPoint3;
            resultPointArr2[3] = resultPoint4;
            iTransitionsBetween = iTransitionsBetween2;
        }
        if (iTransitionsBetween > iTransitionsBetween3) {
            resultPointArr2[0] = resultPoint2;
            resultPointArr2[1] = resultPoint3;
            resultPointArr2[2] = resultPoint4;
            resultPointArr2[3] = resultPoint;
        } else {
            iTransitionsBetween3 = iTransitionsBetween;
        }
        if (iTransitionsBetween3 > iTransitionsBetween4) {
            resultPointArr2[0] = resultPoint3;
            resultPointArr2[1] = resultPoint4;
            resultPointArr2[2] = resultPoint;
            resultPointArr2[3] = resultPoint2;
        }
        return resultPointArr2;
    }

    private ResultPoint[] detectSolid2(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = (transitionsBetween(resultPoint, resultPoint4) + 1) * 4;
        if (transitionsBetween(shiftPoint(resultPoint2, resultPoint3, iTransitionsBetween), resultPoint) < transitionsBetween(shiftPoint(resultPoint3, resultPoint2, iTransitionsBetween), resultPoint4)) {
            resultPointArr[0] = resultPoint;
            resultPointArr[1] = resultPoint2;
            resultPointArr[2] = resultPoint3;
            resultPointArr[3] = resultPoint4;
            return resultPointArr;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint3;
        resultPointArr[2] = resultPoint4;
        resultPointArr[3] = resultPoint;
        return resultPointArr;
    }

    private boolean isValid(ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() <= ((float) (this.image.getWidth() - 1)) && resultPoint.getY() > 0.0f && resultPoint.getY() <= ((float) (this.image.getHeight() - 1));
    }

    private static ResultPoint moveAway(ResultPoint resultPoint, float f10, float f11) {
        float x3 = resultPoint.getX();
        float y8 = resultPoint.getY();
        return new ResultPoint(x3 < f10 ? x3 - 1.0f : x3 + 1.0f, y8 < f11 ? y8 - 1.0f : y8 + 1.0f);
    }

    private static BitMatrix sampleGrid(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i7, int i10) throws NotFoundException {
        float f10 = i7 - 0.5f;
        float f11 = i10 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i7, i10, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private static ResultPoint shiftPoint(ResultPoint resultPoint, ResultPoint resultPoint2, int i7) {
        float f10 = i7 + 1;
        return new ResultPoint(resultPoint.getX() + ((resultPoint2.getX() - resultPoint.getX()) / f10), resultPoint.getY() + ((resultPoint2.getY() - resultPoint.getY()) / f10));
    }

    private ResultPoint[] shiftToModuleCenter(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint = resultPointArr[0];
        ResultPoint resultPoint2 = resultPointArr[1];
        ResultPoint resultPoint3 = resultPointArr[2];
        ResultPoint resultPoint4 = resultPointArr[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4) + 1;
        ResultPoint resultPointShiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint3, resultPoint4) + 1) * 4);
        ResultPoint resultPointShiftPoint2 = shiftPoint(resultPoint3, resultPoint2, iTransitionsBetween * 4);
        int iTransitionsBetween2 = transitionsBetween(resultPointShiftPoint, resultPoint4);
        int i7 = iTransitionsBetween2 + 1;
        int iTransitionsBetween3 = transitionsBetween(resultPointShiftPoint2, resultPoint4);
        int i10 = iTransitionsBetween3 + 1;
        if ((i7 & 1) == 1) {
            i7 = iTransitionsBetween2 + 2;
        }
        if ((i10 & 1) == 1) {
            i10 = iTransitionsBetween3 + 2;
        }
        float x3 = (resultPoint4.getX() + (resultPoint3.getX() + (resultPoint2.getX() + resultPoint.getX()))) / 4.0f;
        float y8 = (resultPoint4.getY() + (resultPoint3.getY() + (resultPoint2.getY() + resultPoint.getY()))) / 4.0f;
        ResultPoint resultPointMoveAway = moveAway(resultPoint, x3, y8);
        ResultPoint resultPointMoveAway2 = moveAway(resultPoint2, x3, y8);
        ResultPoint resultPointMoveAway3 = moveAway(resultPoint3, x3, y8);
        ResultPoint resultPointMoveAway4 = moveAway(resultPoint4, x3, y8);
        int i11 = i10 * 4;
        int i12 = i7 * 4;
        return new ResultPoint[]{shiftPoint(shiftPoint(resultPointMoveAway, resultPointMoveAway2, i11), resultPointMoveAway4, i12), shiftPoint(shiftPoint(resultPointMoveAway2, resultPointMoveAway, i11), resultPointMoveAway3, i12), shiftPoint(shiftPoint(resultPointMoveAway3, resultPointMoveAway4, i11), resultPointMoveAway2, i12), shiftPoint(shiftPoint(resultPointMoveAway4, resultPointMoveAway3, i11), resultPointMoveAway, i12)};
    }

    private int transitionsBetween(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x3 = (int) resultPoint.getX();
        int y8 = (int) resultPoint.getY();
        int x7 = (int) resultPoint2.getX();
        int iMin = Math.min(this.image.getHeight() - 1, (int) resultPoint2.getY());
        int i7 = 0;
        boolean z3 = Math.abs(iMin - y8) > Math.abs(x7 - x3);
        if (z3) {
            y8 = x3;
            x3 = y8;
            iMin = x7;
            x7 = iMin;
        }
        int iAbs = Math.abs(x7 - x3);
        int iAbs2 = Math.abs(iMin - y8);
        int i10 = (-iAbs) / 2;
        int i11 = y8 < iMin ? 1 : -1;
        int i12 = x3 >= x7 ? -1 : 1;
        boolean z8 = this.image.get(z3 ? y8 : x3, z3 ? x3 : y8);
        while (x3 != x7) {
            boolean z10 = this.image.get(z3 ? y8 : x3, z3 ? x3 : y8);
            if (z10 != z8) {
                i7++;
                z8 = z10;
            }
            i10 += iAbs2;
            if (i10 > 0) {
                if (y8 == iMin) {
                    return i7;
                }
                y8 += i11;
                i10 -= iAbs;
            }
            x3 += i12;
        }
        return i7;
    }

    public DetectorResult detect() throws NotFoundException {
        int iMax;
        ResultPoint[] resultPointArrDetectSolid2 = detectSolid2(detectSolid1(this.rectangleDetector.detect()));
        ResultPoint resultPointCorrectTopRight = correctTopRight(resultPointArrDetectSolid2);
        resultPointArrDetectSolid2[3] = resultPointCorrectTopRight;
        if (resultPointCorrectTopRight == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArrShiftToModuleCenter = shiftToModuleCenter(resultPointArrDetectSolid2);
        ResultPoint resultPoint = resultPointArrShiftToModuleCenter[0];
        ResultPoint resultPoint2 = resultPointArrShiftToModuleCenter[1];
        ResultPoint resultPoint3 = resultPointArrShiftToModuleCenter[2];
        ResultPoint resultPoint4 = resultPointArrShiftToModuleCenter[3];
        int iTransitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        int i7 = iTransitionsBetween + 1;
        int iTransitionsBetween2 = transitionsBetween(resultPoint3, resultPoint4);
        int i10 = iTransitionsBetween2 + 1;
        if ((i7 & 1) == 1) {
            i7 = iTransitionsBetween + 2;
        }
        if ((i10 & 1) == 1) {
            i10 = iTransitionsBetween2 + 2;
        }
        if (i7 * 4 >= i10 * 6 || i10 * 4 >= i7 * 6) {
            iMax = i7;
        } else {
            iMax = Math.max(i7, i10);
            i10 = iMax;
        }
        return new DetectorResult(sampleGrid(this.image, resultPoint, resultPoint2, resultPoint3, resultPoint4, iMax, i10), new ResultPoint[]{resultPoint, resultPoint2, resultPoint3, resultPoint4});
    }
}
