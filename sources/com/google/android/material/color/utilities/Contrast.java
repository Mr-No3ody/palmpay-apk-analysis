package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    private Contrast() {
    }

    public static double darker(double d2, double d10) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d2);
            double d11 = ((dYFromLstar + 5.0d) / d10) - 5.0d;
            if (d11 >= 0.0d && d11 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d11);
                double dAbs = Math.abs(dRatioOfYs - d10);
                if (dRatioOfYs < d10 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d11) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double darkerUnsafe(double d2, double d10) {
        return Math.max(0.0d, darker(d2, d10));
    }

    public static double lighter(double d2, double d10) {
        if (d2 >= 0.0d && d2 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d2);
            double d11 = ((dYFromLstar + 5.0d) * d10) - 5.0d;
            if (d11 >= 0.0d && d11 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d11, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d10);
                if (dRatioOfYs < d10 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d11) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighterUnsafe(double d2, double d10) {
        double dLighter = lighter(d2, d10);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d2, double d10) {
        return ratioOfYs(ColorUtils.yFromLstar(d2), ColorUtils.yFromLstar(d10));
    }

    public static double ratioOfYs(double d2, double d10) {
        double dMax = Math.max(d2, d10);
        if (dMax != d10) {
            d2 = d10;
        }
        return (dMax + 5.0d) / (d2 + 5.0d);
    }
}
