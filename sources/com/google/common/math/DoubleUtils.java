package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DoubleUtils {
    static final int EXPONENT_BIAS = 1023;
    static final long EXPONENT_MASK = 9218868437227405312L;
    static final long IMPLICIT_BIT = 4503599627370496L;

    @VisibleForTesting
    static final long ONE_BITS = 4607182418800017408L;
    static final int SIGNIFICAND_BITS = 52;
    static final long SIGNIFICAND_MASK = 4503599627370495L;
    static final long SIGN_MASK = Long.MIN_VALUE;

    private DoubleUtils() {
    }

    public static double bigToDouble(BigInteger bigInteger) {
        BigInteger bigIntegerAbs = bigInteger.abs();
        int iBitLength = bigIntegerAbs.bitLength();
        int i7 = iBitLength - 1;
        if (i7 < 63) {
            return bigInteger.longValue();
        }
        if (i7 > EXPONENT_BIAS) {
            return ((double) bigInteger.signum()) * Double.POSITIVE_INFINITY;
        }
        int i10 = iBitLength - 54;
        long jLongValue = bigIntegerAbs.shiftRight(i10).longValue();
        long j6 = jLongValue >> 1;
        long j10 = SIGNIFICAND_MASK & j6;
        if ((jLongValue & 1) != 0 && ((j6 & 1) != 0 || bigIntegerAbs.getLowestSetBit() < i10)) {
            j10++;
        }
        return Double.longBitsToDouble(((((long) (iBitLength + 1022)) << 52) + j10) | (((long) bigInteger.signum()) & Long.MIN_VALUE));
    }

    public static double ensureNonNegative(double d2) {
        Preconditions.checkArgument(!Double.isNaN(d2));
        return Math.max(d2, 0.0d);
    }

    public static long getSignificand(double d2) {
        Preconditions.checkArgument(isFinite(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & SIGNIFICAND_MASK;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | IMPLICIT_BIT;
    }

    public static boolean isFinite(double d2) {
        return Math.getExponent(d2) <= EXPONENT_BIAS;
    }

    public static boolean isNormal(double d2) {
        return Math.getExponent(d2) >= -1022;
    }

    public static double nextDown(double d2) {
        return -Math.nextUp(-d2);
    }

    public static double scaleNormalize(double d2) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & SIGNIFICAND_MASK) | ONE_BITS);
    }
}
