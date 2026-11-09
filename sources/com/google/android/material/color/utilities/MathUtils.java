package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public class MathUtils {
    private MathUtils() {
    }

    public static double clampDouble(double d2, double d10, double d11) {
        if (d11 < d2) {
            return d2;
        }
        return d11 > d10 ? d10 : d11;
    }

    public static int clampInt(int i7, int i10, int i11) {
        if (i11 < i7) {
            return i7;
        }
        return i11 > i10 ? i10 : i11;
    }

    public static double differenceDegrees(double d2, double d10) {
        return 180.0d - Math.abs(Math.abs(d2 - d10) - 180.0d);
    }

    public static double lerp(double d2, double d10, double d11) {
        return (d11 * d10) + ((1.0d - d11) * d2);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d10 = dArr3[0] * d2;
        double d11 = dArr[1];
        double d12 = (dArr3[1] * d11) + d10;
        double d13 = dArr[2];
        double d14 = (dArr3[2] * d13) + d12;
        double[] dArr4 = dArr2[1];
        double d15 = (dArr4[2] * d13) + (dArr4[1] * d11) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d14, d15, (d13 * dArr5[2]) + (d11 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static double rotationDirection(double d2, double d10) {
        return sanitizeDegreesDouble(d10 - d2) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double sanitizeDegreesDouble(double d2) {
        double d10 = d2 % 360.0d;
        return d10 < 0.0d ? d10 + 360.0d : d10;
    }

    public static int sanitizeDegreesInt(int i7) {
        int i10 = i7 % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
        return i10 < 0 ? i10 + MessageEvent.EVENT_CL_REPAYMENT_FAILED : i10;
    }

    public static int signum(double d2) {
        if (d2 < 0.0d) {
            return -1;
        }
        return d2 == 0.0d ? 0 : 1;
    }
}
