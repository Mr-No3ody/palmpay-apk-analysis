package com.google.zxing.common.detector;

/* JADX INFO: loaded from: classes3.dex */
public final class MathUtils {
    private MathUtils() {
    }

    public static float distance(float f10, float f11, float f12, float f13) {
        double d2 = f10 - f12;
        double d10 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d2 * d2));
    }

    public static int round(float f10) {
        return (int) (f10 + (f10 < 0.0f ? -0.5f : 0.5f));
    }

    public static int sum(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        return i7;
    }

    public static float distance(int i7, int i10, int i11, int i12) {
        double d2 = i7 - i11;
        double d10 = i10 - i12;
        return (float) Math.sqrt((d10 * d10) + (d2 * d2));
    }
}
