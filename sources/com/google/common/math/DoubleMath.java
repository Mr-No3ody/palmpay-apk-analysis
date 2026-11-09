package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class DoubleMath {

    @VisibleForTesting
    static final int MAX_FACTORIAL = 170;
    private static final double MAX_INT_AS_DOUBLE = 2.147483647E9d;
    private static final double MAX_LONG_AS_DOUBLE_PLUS_ONE = 9.223372036854776E18d;
    private static final double MIN_INT_AS_DOUBLE = -2.147483648E9d;
    private static final double MIN_LONG_AS_DOUBLE = -9.223372036854776E18d;
    private static final double LN_2 = Math.log(2.0d);

    @VisibleForTesting
    static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: com.google.common.math.DoubleMath$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private DoubleMath() {
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    private static double checkFinite(double d2) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d2));
        return d2;
    }

    public static double factorial(int i7) {
        MathPreconditions.checkNonNegative("n", i7);
        if (i7 > MAX_FACTORIAL) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0d;
        for (int i10 = (i7 & (-16)) + 1; i10 <= i7; i10++) {
            d2 *= (double) i10;
        }
        return d2 * everySixteenthFactorial[i7 >> 4];
    }

    public static int fuzzyCompare(double d2, double d10, double d11) {
        if (fuzzyEquals(d2, d10, d11)) {
            return 0;
        }
        if (d2 < d10) {
            return -1;
        }
        if (d2 > d10) {
            return 1;
        }
        return Booleans.compare(Double.isNaN(d2), Double.isNaN(d10));
    }

    public static boolean fuzzyEquals(double d2, double d10, double d11) {
        MathPreconditions.checkNonNegative("tolerance", d11);
        if (Math.copySign(d2 - d10, 1.0d) <= d11 || d2 == d10) {
            return true;
        }
        return Double.isNaN(d2) && Double.isNaN(d10);
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d2) {
        if (DoubleUtils.isFinite(d2)) {
            return d2 == 0.0d || 52 - Long.numberOfTrailingZeros(DoubleUtils.getSignificand(d2)) <= Math.getExponent(d2);
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d2) {
        if (d2 > 0.0d && DoubleUtils.isFinite(d2)) {
            long significand = DoubleUtils.getSignificand(d2);
            if ((significand & (significand - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    public static double log2(double d2) {
        return Math.log(d2) / LN_2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(dArr[0]);
        long j6 = 1;
        for (int i7 = 1; i7 < dArr.length; i7++) {
            checkFinite(dArr[i7]);
            j6++;
            dCheckFinite += (dArr[i7] - dCheckFinite) / j6;
        }
        return dCheckFinite;
    }

    @GwtIncompatible
    public static double roundIntermediate(double d2, RoundingMode roundingMode) {
        if (!DoubleUtils.isFinite(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isMathematicalInteger(d2));
                return d2;
            case 2:
                return (d2 >= 0.0d || isMathematicalInteger(d2)) ? d2 : ((long) d2) - 1;
            case 3:
                return (d2 <= 0.0d || isMathematicalInteger(d2)) ? d2 : ((long) d2) + 1;
            case 4:
                return d2;
            case 5:
                if (isMathematicalInteger(d2)) {
                    return d2;
                }
                return ((long) d2) + ((long) (d2 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d2);
            case 7:
                double dRint = Math.rint(d2);
                return Math.abs(d2 - dRint) == 0.5d ? Math.copySign(0.5d, d2) + d2 : dRint;
            case 8:
                double dRint2 = Math.rint(d2);
                return Math.abs(d2 - dRint2) == 0.5d ? d2 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d2, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d2, roundingMode);
        if ((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) && (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE)) {
            return BigInteger.valueOf((long) dRoundIntermediate);
        }
        BigInteger bigIntegerShiftLeft = BigInteger.valueOf(DoubleUtils.getSignificand(dRoundIntermediate)).shiftLeft(Math.getExponent(dRoundIntermediate) - 52);
        return dRoundIntermediate < 0.0d ? bigIntegerShiftLeft.negate() : bigIntegerShiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d2, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d2, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((dRoundIntermediate > -2.147483649E9d) & (dRoundIntermediate < 2.147483648E9d), d2, roundingMode);
        return (int) dRoundIntermediate;
    }

    @GwtIncompatible
    public static long roundToLong(double d2, RoundingMode roundingMode) {
        double dRoundIntermediate = roundIntermediate(d2, roundingMode);
        MathPreconditions.checkInRangeForRoundingInputs((MIN_LONG_AS_DOUBLE - dRoundIntermediate < 1.0d) & (dRoundIntermediate < MAX_LONG_AS_DOUBLE_PLUS_ONE), d2, roundingMode);
        return (long) dRoundIntermediate;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    @GwtIncompatible
    public static int log2(double d2, RoundingMode roundingMode) {
        boolean zIsPowerOfTwo;
        boolean z3 = false;
        Preconditions.checkArgument(d2 > 0.0d && DoubleUtils.isFinite(d2), "x must be positive and finite");
        int exponent = Math.getExponent(d2);
        if (!DoubleUtils.isNormal(d2)) {
            return log2(d2 * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(d2));
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z3 = !isPowerOfTwo(d2);
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z3 = exponent < 0;
                zIsPowerOfTwo = isPowerOfTwo(d2);
                z3 &= !zIsPowerOfTwo;
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z3 = exponent >= 0;
                zIsPowerOfTwo = isPowerOfTwo(d2);
                z3 &= !zIsPowerOfTwo;
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dScaleNormalize = DoubleUtils.scaleNormalize(d2);
                if (dScaleNormalize * dScaleNormalize > 2.0d) {
                    z3 = true;
                }
                if (z3) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j6 = 0;
        for (int i7 : iArr) {
            j6 += (long) i7;
        }
        return j6 / ((double) iArr.length);
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d2 = jArr[0];
        long j6 = 1;
        for (int i7 = 1; i7 < jArr.length; i7++) {
            j6++;
            d2 += (jArr[i7] - d2) / j6;
        }
        return d2;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double dCheckFinite = checkFinite(it.next().doubleValue());
        long j6 = 1;
        while (it.hasNext()) {
            j6++;
            dCheckFinite += (checkFinite(it.next().doubleValue()) - dCheckFinite) / j6;
        }
        return dCheckFinite;
    }
}
