package com.google.android.material.math;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    private MathUtils() {
    }

    public static boolean areAllElementsEqual(@NonNull float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f10 = fArr[0];
        for (int i7 = 1; i7 < fArr.length; i7++) {
            if (fArr[i7] != f10) {
                return false;
            }
        }
        return true;
    }

    public static float dist(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float distanceToFurthestCorner(float f10, float f11, float f12, float f13, float f14, float f15) {
        return max(dist(f10, f11, f12, f13), dist(f10, f11, f14, f13), dist(f10, f11, f14, f15), dist(f10, f11, f12, f15));
    }

    public static float floorMod(float f10, int i7) {
        float f11 = i7;
        int i10 = (int) (f10 / f11);
        if (Math.signum(f10) * f11 < 0.0f && i10 * i7 != f10) {
            i10--;
        }
        return f10 - (i10 * i7);
    }

    public static boolean geq(float f10, float f11, float f12) {
        return f10 + f12 >= f11;
    }

    public static float lerp(float f10, float f11, float f12) {
        return (f12 * f11) + ((1.0f - f12) * f10);
    }

    private static float max(float f10, float f11, float f12, float f13) {
        if (f10 > f11 && f10 > f12 && f10 > f13) {
            return f10;
        }
        if (f11 <= f12 || f11 <= f13) {
            return f12 > f13 ? f12 : f13;
        }
        return f11;
    }

    public static int floorMod(int i7, int i10) {
        int i11 = i7 / i10;
        if ((i7 ^ i10) < 0 && i11 * i10 != i7) {
            i11--;
        }
        return i7 - (i11 * i10);
    }
}
