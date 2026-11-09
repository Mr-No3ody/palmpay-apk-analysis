package com.google.common.math;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@CanIgnoreReturnValue
@GwtCompatible
final class MathPreconditions {
    private MathPreconditions() {
    }

    public static void checkInRangeForRoundingInputs(boolean z3, double d2, RoundingMode roundingMode) {
        if (z3) {
            return;
        }
        String strValueOf = String.valueOf(roundingMode);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 83);
        sb2.append("rounded value is out of range for input ");
        sb2.append(d2);
        sb2.append(" and rounding mode ");
        sb2.append(strValueOf);
        throw new ArithmeticException(sb2.toString());
    }

    public static void checkNoOverflow(boolean z3, String str, int i7, int i10) {
        if (z3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(d.c(36, str));
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i7);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    public static int checkNonNegative(String str, int i7) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb2 = new StringBuilder(d.c(27, str));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i7);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int checkPositive(String str, int i7) {
        if (i7 > 0) {
            return i7;
        }
        StringBuilder sb2 = new StringBuilder(d.c(26, str));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i7);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void checkRoundingUnnecessary(boolean z3) {
        if (!z3) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static void checkNoOverflow(boolean z3, String str, long j6, long j10) {
        if (z3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(d.c(54, str));
        sb2.append("overflow: ");
        sb2.append(str);
        sb2.append("(");
        sb2.append(j6);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(")");
        throw new ArithmeticException(sb2.toString());
    }

    public static long checkNonNegative(String str, long j6) {
        if (j6 >= 0) {
            return j6;
        }
        StringBuilder sb2 = new StringBuilder(d.c(36, str));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j6);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static long checkPositive(String str, long j6) {
        if (j6 > 0) {
            return j6;
        }
        StringBuilder sb2 = new StringBuilder(d.c(35, str));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(j6);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static BigInteger checkNonNegative(String str, BigInteger bigInteger) {
        if (bigInteger.signum() >= 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(d.k(str, strValueOf.length() + d.c(16, str), " (", strValueOf, ") must be >= 0"));
    }

    public static BigInteger checkPositive(String str, BigInteger bigInteger) {
        if (bigInteger.signum() > 0) {
            return bigInteger;
        }
        String strValueOf = String.valueOf(bigInteger);
        throw new IllegalArgumentException(d.k(str, strValueOf.length() + d.c(15, str), " (", strValueOf, ") must be > 0"));
    }

    public static double checkNonNegative(String str, double d2) {
        if (d2 >= 0.0d) {
            return d2;
        }
        StringBuilder sb2 = new StringBuilder(d.c(40, str));
        sb2.append(str);
        sb2.append(" (");
        sb2.append(d2);
        sb2.append(") must be >= 0");
        throw new IllegalArgumentException(sb2.toString());
    }
}
