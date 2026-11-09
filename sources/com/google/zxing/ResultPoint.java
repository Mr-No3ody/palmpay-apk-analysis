package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ResultPoint {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float f23104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f23105y;

    public ResultPoint(float f10, float f11) {
        this.f23104x = f10;
        this.f23105y = f11;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f10 = resultPoint2.f23104x;
        float f11 = resultPoint2.f23105y;
        return ((resultPoint.f23105y - f11) * (resultPoint3.f23104x - f10)) - ((resultPoint.f23104x - f10) * (resultPoint3.f23105y - f11));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f23104x, resultPoint.f23105y, resultPoint2.f23104x, resultPoint2.f23105y);
    }

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f23104x == resultPoint.f23104x && this.f23105y == resultPoint.f23105y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f23104x;
    }

    public final float getY() {
        return this.f23105y;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f23105y) + (Float.floatToIntBits(this.f23104x) * 31);
    }

    public final String toString() {
        return "(" + this.f23104x + ',' + this.f23105y + ')';
    }
}
