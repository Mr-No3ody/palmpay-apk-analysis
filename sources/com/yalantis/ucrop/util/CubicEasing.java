package com.yalantis.ucrop.util;

/* JADX INFO: loaded from: classes4.dex */
public final class CubicEasing {
    public static float easeIn(float f10, float f11, float f12, float f13) {
        float f14 = f10 / f13;
        return (f12 * f14 * f14 * f14) + f11;
    }

    public static float easeInOut(float f10, float f11, float f12, float f13) {
        float f14 = f10 / (f13 / 2.0f);
        float f15 = f12 / 2.0f;
        if (f14 < 1.0f) {
            return (f15 * f14 * f14 * f14) + f11;
        }
        float f16 = f14 - 2.0f;
        return (((f16 * f16 * f16) + 2.0f) * f15) + f11;
    }

    public static float easeOut(float f10, float f11, float f12, float f13) {
        float f14 = (f10 / f13) - 1.0f;
        return (((f14 * f14 * f14) + 1.0f) * f12) + f11;
    }
}
