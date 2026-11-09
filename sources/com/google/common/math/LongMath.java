package com.google.common.math;

import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.google.mlkit.common.MlKitException;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class LongMath {

    @VisibleForTesting
    static final long FLOOR_SQRT_MAX_LONG = 3037000499L;

    @VisibleForTesting
    static final long MAX_POWER_OF_SQRT2_UNSIGNED = -5402926248376769404L;

    @VisibleForTesting
    static final long MAX_SIGNED_POWER_OF_TWO = 4611686018427387904L;
    private static final int SIEVE_30 = -545925251;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {19, Ascii.DC2, Ascii.DC2, Ascii.DC2, Ascii.DC2, 17, 17, 17, Ascii.DLE, Ascii.DLE, Ascii.DLE, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SI, Ascii.SO, Ascii.SO, Ascii.SO, Ascii.CR, Ascii.CR, Ascii.CR, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.FF, Ascii.VT, Ascii.VT, Ascii.VT, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] powersOf10 = {1, 10, 100, 1000, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    @VisibleForTesting
    @GwtIncompatible
    static final long[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, MessageEvent.EVENT_CL_OPEN_SUCCESS, 265, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 169, 143, 125, HomeDialogState.PRIORITY_HIGHEST_111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    @VisibleForTesting
    static final int[] biggestSimpleBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final long[][] millerRabinBaseSets = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* JADX INFO: renamed from: com.google.common.math.LongMath$1, reason: invalid class name */
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
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j6, long j10, long j11) {
                return (j6 * j10) % j11;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j6, long j10) {
                return (j6 * j6) % j10;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j6, long j10, long j11) {
                long j12 = j6 + j10;
                return j6 >= j11 - j10 ? j12 - j11 : j12;
            }

            private long times2ToThe32Mod(long j6, long j10) {
                int i7 = 32;
                do {
                    int iMin = Math.min(i7, Long.numberOfLeadingZeros(j6));
                    j6 = UnsignedLongs.remainder(j6 << iMin, j10);
                    i7 -= iMin;
                } while (i7 > 0);
                return j6;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j6, long j10, long j11) {
                long j12 = j6 >>> 32;
                long j13 = j10 >>> 32;
                long j14 = j6 & 4294967295L;
                long j15 = j10 & 4294967295L;
                long jTimes2ToThe32Mod = (j12 * j15) + times2ToThe32Mod(j12 * j13, j11);
                if (jTimes2ToThe32Mod < 0) {
                    jTimes2ToThe32Mod = UnsignedLongs.remainder(jTimes2ToThe32Mod, j11);
                }
                return plusMod(times2ToThe32Mod((j13 * j14) + jTimes2ToThe32Mod, j11), UnsignedLongs.remainder(j14 * j15, j11), j11);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j6, long j10) {
                long j11 = j6 >>> 32;
                long j12 = j6 & 4294967295L;
                long jTimes2ToThe32Mod = times2ToThe32Mod(j11 * j11, j10);
                long jRemainder = j11 * j12 * 2;
                if (jRemainder < 0) {
                    jRemainder = UnsignedLongs.remainder(jRemainder, j10);
                }
                return plusMod(times2ToThe32Mod(jTimes2ToThe32Mod + jRemainder, j10), UnsignedLongs.remainder(j12 * j12, j10), j10);
            }
        };

        private long powMod(long j6, long j10, long j11) {
            long jSquareMod = j6;
            long jMulMod = 1;
            while (j10 != 0) {
                long j12 = j11;
                if ((j10 & 1) != 0) {
                    jMulMod = mulMod(jMulMod, jSquareMod, j12);
                }
                jSquareMod = squareMod(jSquareMod, j12);
                j10 >>= 1;
                j11 = j12;
            }
            return jMulMod;
        }

        public static boolean test(long j6, long j10) {
            return (j10 <= LongMath.FLOOR_SQRT_MAX_LONG ? SMALL : LARGE).testWitness(j6, j10);
        }

        private boolean testWitness(long j6, long j10) {
            long j11 = j10 - 1;
            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
            long j12 = j11 >> iNumberOfTrailingZeros;
            long j13 = j6 % j10;
            if (j13 == 0) {
                return true;
            }
            long jPowMod = powMod(j13, j12, j10);
            if (jPowMod == 1) {
                return true;
            }
            int i7 = 0;
            while (jPowMod != j11) {
                i7++;
                if (i7 == iNumberOfTrailingZeros) {
                    return false;
                }
                jPowMod = squareMod(jPowMod, j10);
            }
            return true;
        }

        public abstract long mulMod(long j6, long j10, long j11);

        public abstract long squareMod(long j6, long j10);

        /* synthetic */ MillerRabinTester(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private LongMath() {
    }

    public static long binomial(int i7, int i10) {
        MathPreconditions.checkNonNegative("n", i7);
        MathPreconditions.checkNonNegative("k", i10);
        Preconditions.checkArgument(i10 <= i7, "k (%s) > n (%s)", i10, i7);
        if (i10 > (i7 >> 1)) {
            i10 = i7 - i10;
        }
        long jMultiplyFraction = 1;
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == 1) {
            return i7;
        }
        long[] jArr = factorials;
        if (i7 < jArr.length) {
            return jArr[i7] / (jArr[i10] * jArr[i7 - i10]);
        }
        int[] iArr = biggestBinomials;
        if (i10 >= iArr.length || i7 > iArr[i10]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = biggestSimpleBinomials;
        if (i10 < iArr2.length && i7 <= iArr2[i10]) {
            int i11 = i7 - 1;
            long j6 = i7;
            for (int i12 = 2; i12 <= i10; i12++) {
                j6 = (j6 * ((long) i11)) / ((long) i12);
                i11--;
            }
            return j6;
        }
        long j10 = i7;
        int iLog2 = log2(j10, RoundingMode.CEILING);
        int i13 = i7 - 1;
        int i14 = iLog2;
        int i15 = 2;
        long j11 = j10;
        long j12 = 1;
        while (i15 <= i10) {
            i14 += iLog2;
            if (i14 < 63) {
                j11 *= (long) i13;
                j12 *= (long) i15;
            } else {
                jMultiplyFraction = multiplyFraction(jMultiplyFraction, j11, j12);
                j11 = i13;
                j12 = i15;
                i14 = iLog2;
            }
            i15++;
            i13--;
        }
        return multiplyFraction(jMultiplyFraction, j11, j12);
    }

    @Beta
    public static long ceilingPowerOfTwo(long j6) {
        MathPreconditions.checkPositive("x", j6);
        if (j6 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j6 - 1));
        }
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(j6);
        sb2.append(") is not representable as a long");
        throw new ArithmeticException(sb2.toString());
    }

    @GwtIncompatible
    public static long checkedAdd(long j6, long j10) {
        long j11 = j6 + j10;
        MathPreconditions.checkNoOverflow(((j6 ^ j10) < 0) | ((j6 ^ j11) >= 0), "checkedAdd", j6, j10);
        return j11;
    }

    public static long checkedMultiply(long j6, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        MathPreconditions.checkNoOverflow(iNumberOfLeadingZeros >= 64, "checkedMultiply", j6, j10);
        MathPreconditions.checkNoOverflow((j6 >= 0) | (j10 != Long.MIN_VALUE), "checkedMultiply", j6, j10);
        long j11 = j6 * j10;
        MathPreconditions.checkNoOverflow(j6 == 0 || j11 / j6 == j10, "checkedMultiply", j6, j10);
        return j11;
    }

    @GwtIncompatible
    public static long checkedPow(long j6, int i7) {
        int i10 = i7;
        MathPreconditions.checkNonNegative("exponent", i10);
        long jCheckedMultiply = 1;
        if (!(j6 >= -2) || !(j6 <= 2)) {
            long j10 = j6;
            while (i10 != 0) {
                if (i10 == 1) {
                    return checkedMultiply(jCheckedMultiply, j10);
                }
                if ((i10 & 1) != 0) {
                    jCheckedMultiply = checkedMultiply(jCheckedMultiply, j10);
                }
                i10 >>= 1;
                if (i10 > 0) {
                    MathPreconditions.checkNoOverflow(-3037000499L <= j10 && j10 <= FLOOR_SQRT_MAX_LONG, "checkedPow", j10, i10);
                    j10 *= j10;
                }
            }
            return jCheckedMultiply;
        }
        int i11 = (int) j6;
        if (i11 == -2) {
            MathPreconditions.checkNoOverflow(i10 < 64, "checkedPow", j6, i10);
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i11 == -1) {
            return (i10 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return i10 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        MathPreconditions.checkNoOverflow(i10 < 63, "checkedPow", j6, i10);
        return 1 << i10;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j6, long j10) {
        long j11 = j6 - j10;
        MathPreconditions.checkNoOverflow(((j6 ^ j10) >= 0) | ((j6 ^ j11) >= 0), "checkedSubtract", j6, j10);
        return j11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static long divide(long j6, long j10, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j11 = j6 / j10;
        long j12 = j6 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i7 = ((int) ((j6 ^ j10) >> 63)) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i7 >= 0) {
                    return j11;
                }
                return j11 + ((long) i7);
            case 4:
                return j11 + ((long) i7);
            case 5:
                if (i7 <= 0) {
                    return j11;
                }
                return j11 + ((long) i7);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j12);
                long jAbs2 = jAbs - (Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
                return j11 + ((long) i7);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long factorial(int i7) {
        MathPreconditions.checkNonNegative("n", i7);
        long[] jArr = factorials;
        if (i7 < jArr.length) {
            return jArr[i7];
        }
        return Long.MAX_VALUE;
    }

    public static boolean fitsInInt(long j6) {
        return ((long) ((int) j6)) == j6;
    }

    @Beta
    public static long floorPowerOfTwo(long j6) {
        MathPreconditions.checkPositive("x", j6);
        return 1 << (63 - Long.numberOfLeadingZeros(j6));
    }

    public static long gcd(long j6, long j10) {
        MathPreconditions.checkNonNegative("a", j6);
        MathPreconditions.checkNonNegative("b", j10);
        if (j6 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j6;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long jNumberOfTrailingZeros = j6 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            jNumberOfTrailingZeros = j14 >> Long.numberOfTrailingZeros(j14);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j6) {
        return (j6 > 0) & ((j6 & (j6 - 1)) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(long j6) {
        if (j6 < 2) {
            MathPreconditions.checkNonNegative("n", j6);
            return false;
        }
        if (j6 < 66) {
            return ((722865708377213483 >> (((int) j6) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j6 % 30))) & SIEVE_30) != 0 || j6 % 7 == 0 || j6 % 11 == 0 || j6 % 13 == 0) {
            return false;
        }
        if (j6 < 289) {
            return true;
        }
        for (long[] jArr : millerRabinBaseSets) {
            if (j6 <= jArr[0]) {
                for (int i7 = 1; i7 < jArr.length; i7++) {
                    if (!MillerRabinTester.test(jArr[i7], j6)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @VisibleForTesting
    public static int lessThanBranchFree(long j6, long j10) {
        return (int) ((~(~(j6 - j10))) >>> 63);
    }

    @GwtIncompatible
    public static int log10(long j6, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", j6);
        int iLog10Floor = log10Floor(j6);
        long j10 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j6 == j10);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(j10, j6);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], j6);
                break;
            default:
                throw new AssertionError();
        }
        return iLessThanBranchFree + iLog10Floor;
    }

    @GwtIncompatible
    public static int log10Floor(long j6) {
        byte b7 = maxLog10ForLeadingZeros[Long.numberOfLeadingZeros(j6)];
        return b7 - lessThanBranchFree(j6, powersOf10[b7]);
    }

    public static int log2(long j6, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", j6);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(j6));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j6 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j6);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, j6) + (63 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j6);
    }

    public static long mean(long j6, long j10) {
        return (j6 & j10) + ((j6 ^ j10) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j6, int i7) {
        return (int) mod(j6, i7);
    }

    public static long multiplyFraction(long j6, long j10, long j11) {
        if (j6 == 1) {
            return j10 / j11;
        }
        long jGcd = gcd(j6, j11);
        return (j10 / (j11 / jGcd)) * (j6 / jGcd);
    }

    @GwtIncompatible
    public static long pow(long j6, int i7) {
        MathPreconditions.checkNonNegative("exponent", i7);
        if (-2 > j6 || j6 > 2) {
            long j10 = 1;
            while (i7 != 0) {
                if (i7 == 1) {
                    return j10 * j6;
                }
                j10 *= (i7 & 1) == 0 ? 1L : j6;
                j6 *= j6;
                i7 >>= 1;
            }
            return j10;
        }
        int i10 = (int) j6;
        if (i10 == -2) {
            if (i7 < 64) {
                return (i7 & 1) == 0 ? 1 << i7 : -(1 << i7);
            }
            return 0L;
        }
        if (i10 == -1) {
            return (i7 & 1) == 0 ? 1L : -1L;
        }
        if (i10 == 0) {
            return i7 == 0 ? 1L : 0L;
        }
        if (i10 == 1) {
            return 1L;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        if (i7 < 64) {
            return 1 << i7;
        }
        return 0L;
    }

    @GwtIncompatible
    public static double roundToDouble(long j6, RoundingMode roundingMode) {
        double dNextUp;
        long jCeil;
        double d2 = j6;
        long j10 = (long) d2;
        int iCompare = j10 == Long.MAX_VALUE ? -1 : Longs.compare(j6, j10);
        int[] iArr = AnonymousClass1.$SwitchMap$java$math$RoundingMode;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompare == 0);
                return d2;
            case 2:
                if (j6 >= 0) {
                    if (iCompare < 0) {
                        return DoubleUtils.nextDown(d2);
                    }
                } else if (iCompare > 0) {
                    return Math.nextUp(d2);
                }
                return d2;
            case 3:
                if (iCompare < 0) {
                    return DoubleUtils.nextDown(d2);
                }
                return d2;
            case 4:
                if (j6 >= 0) {
                    if (iCompare > 0) {
                        return Math.nextUp(d2);
                    }
                } else if (iCompare < 0) {
                    return DoubleUtils.nextDown(d2);
                }
                return d2;
            case 5:
                if (iCompare > 0) {
                    return Math.nextUp(d2);
                }
                return d2;
            case 6:
            case 7:
            case 8:
                if (iCompare >= 0) {
                    dNextUp = Math.nextUp(d2);
                    jCeil = (long) Math.ceil(dNextUp);
                } else {
                    double dNextDown = DoubleUtils.nextDown(d2);
                    long jFloor = (long) Math.floor(dNextDown);
                    dNextUp = d2;
                    d2 = dNextDown;
                    jCeil = j10;
                    j10 = jFloor;
                }
                long j11 = j6 - j10;
                long j12 = jCeil - j6;
                if (jCeil == 9223372036854775807) {
                    j12++;
                }
                int iCompare2 = Longs.compare(j11, j12);
                if (iCompare2 >= 0) {
                    if (iCompare2 <= 0) {
                        int i7 = iArr[roundingMode.ordinal()];
                        if (i7 != 6) {
                            if (i7 != 7) {
                                if (i7 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((DoubleUtils.getSignificand(d2) & 1) == 0) {
                                }
                            } else if (j6 >= 0) {
                            }
                        } else if (j6 >= 0) {
                        }
                    }
                    return dNextUp;
                }
                return d2;
            default:
                throw new AssertionError("impossible");
        }
    }

    @Beta
    public static long saturatedAdd(long j6, long j10) {
        long j11 = j6 + j10;
        return (((j10 ^ j6) > 0L ? 1 : ((j10 ^ j6) == 0L ? 0 : -1)) < 0) | ((j6 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @Beta
    public static long saturatedMultiply(long j6, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j6) + Long.numberOfLeadingZeros(j6);
        if (iNumberOfLeadingZeros > 65) {
            return j6 * j10;
        }
        long j11 = ((j6 ^ j10) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j6 < 0)))) {
            long j12 = j6 * j10;
            if (j6 == 0 || j12 / j6 == j10) {
                return j12;
            }
        }
        return j11;
    }

    @Beta
    public static long saturatedPow(long j6, int i7) {
        MathPreconditions.checkNonNegative("exponent", i7);
        long jSaturatedMultiply = 1;
        if (!(j6 >= -2) || !(j6 <= 2)) {
            long j10 = ((j6 >>> 63) & ((long) (i7 & 1))) + Long.MAX_VALUE;
            while (i7 != 0) {
                if (i7 == 1) {
                    return saturatedMultiply(jSaturatedMultiply, j6);
                }
                if ((i7 & 1) != 0) {
                    jSaturatedMultiply = saturatedMultiply(jSaturatedMultiply, j6);
                }
                i7 >>= 1;
                if (i7 > 0) {
                    if ((-3037000499L > j6) || (j6 > FLOOR_SQRT_MAX_LONG)) {
                        return j10;
                    }
                    j6 *= j6;
                }
            }
            return jSaturatedMultiply;
        }
        int i10 = (int) j6;
        if (i10 == -2) {
            if (i7 >= 64) {
                return ((long) (i7 & 1)) + Long.MAX_VALUE;
            }
            return (i7 & 1) == 0 ? 1 << i7 : (-1) << i7;
        }
        if (i10 == -1) {
            return (i7 & 1) == 0 ? 1L : -1L;
        }
        if (i10 == 0) {
            return i7 == 0 ? 1L : 0L;
        }
        if (i10 == 1) {
            return 1L;
        }
        if (i10 != 2) {
            throw new AssertionError();
        }
        if (i7 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i7;
    }

    @Beta
    public static long saturatedSubtract(long j6, long j10) {
        long j11 = j6 - j10;
        return (((j10 ^ j6) > 0L ? 1 : ((j10 ^ j6) == 0L ? 0 : -1)) >= 0) | ((j6 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j6, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", j6);
        if (fitsInInt(j6)) {
            return IntMath.sqrt((int) j6, roundingMode);
        }
        long jSqrt = (long) Math.sqrt(j6);
        long j10 = jSqrt * jSqrt;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(j10 == j6);
                return jSqrt;
            case 2:
            case 3:
                return j6 < j10 ? jSqrt - 1 : jSqrt;
            case 4:
            case 5:
                return j6 > j10 ? jSqrt + 1 : jSqrt;
            case 6:
            case 7:
            case 8:
                long j11 = jSqrt - ((long) (j6 < j10 ? 1 : 0));
                return j11 + ((long) lessThanBranchFree((j11 * j11) + j11, j6));
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j6, long j10) {
        if (j10 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j11 = j6 % j10;
        return j11 >= 0 ? j11 : j11 + j10;
    }
}
