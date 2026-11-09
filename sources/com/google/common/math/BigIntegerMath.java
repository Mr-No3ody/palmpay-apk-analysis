package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class BigIntegerMath {

    @VisibleForTesting
    static final int SQRT2_PRECOMPUTE_THRESHOLD = 256;

    @VisibleForTesting
    static final BigInteger SQRT2_PRECOMPUTED_BITS = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    private static final double LN_10 = Math.log(10.0d);
    private static final double LN_2 = Math.log(2.0d);

    /* JADX INFO: renamed from: com.google.common.math.BigIntegerMath$1, reason: invalid class name */
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

    @GwtIncompatible
    public static class BigIntegerToDoubleRounder extends ToDoubleRounder<BigInteger> {
        static final BigIntegerToDoubleRounder INSTANCE = new BigIntegerToDoubleRounder();

        private BigIntegerToDoubleRounder() {
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public double roundToDoubleArbitrarily(BigInteger bigInteger) {
            return DoubleUtils.bigToDouble(bigInteger);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public int sign(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigInteger toX(double d2, RoundingMode roundingMode) {
            return DoubleMath.roundToBigInteger(d2, roundingMode);
        }
    }

    private BigIntegerMath() {
    }

    public static BigInteger binomial(int i7, int i10) {
        MathPreconditions.checkNonNegative("n", i7);
        MathPreconditions.checkNonNegative("k", i10);
        int i11 = 1;
        Preconditions.checkArgument(i10 <= i7, "k (%s) > n (%s)", i10, i7);
        if (i10 > (i7 >> 1)) {
            i10 = i7 - i10;
        }
        int[] iArr = LongMath.biggestBinomials;
        if (i10 < iArr.length && i7 <= iArr[i10]) {
            return BigInteger.valueOf(LongMath.binomial(i7, i10));
        }
        BigInteger bigIntegerDivide = BigInteger.ONE;
        long j6 = i7;
        int iLog2 = LongMath.log2(j6, RoundingMode.CEILING);
        long j10 = 1;
        while (true) {
            int i12 = iLog2;
            while (i11 < i10) {
                int i13 = i7 - i11;
                i11++;
                i12 += iLog2;
                if (i12 >= 63) {
                    bigIntegerDivide = bigIntegerDivide.multiply(BigInteger.valueOf(j6)).divide(BigInteger.valueOf(j10));
                    j6 = i13;
                    j10 = i11;
                } else {
                    j6 *= (long) i13;
                    j10 *= (long) i11;
                }
            }
            return bigIntegerDivide.multiply(BigInteger.valueOf(j6)).divide(BigInteger.valueOf(j10));
        }
    }

    @Beta
    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger factorial(int i7) {
        MathPreconditions.checkNonNegative("n", i7);
        long[] jArr = LongMath.factorials;
        if (i7 < jArr.length) {
            return BigInteger.valueOf(jArr[i7]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(i7, roundingMode) * i7, 64, roundingMode));
        int length = jArr.length;
        long j6 = jArr[length - 1];
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
        long j10 = j6 >> iNumberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i10 = 1;
        int iLog2 = LongMath.log2(j10, roundingMode2) + 1;
        long j11 = length;
        int iLog3 = LongMath.log2(j11, roundingMode2);
        int i11 = iLog3 + 1;
        int i12 = 1 << iLog3;
        while (j11 <= i7) {
            int i13 = i10;
            long j12 = j11;
            if ((((long) i12) & j12) != 0) {
                i12 <<= 1;
                i11++;
            }
            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j12);
            long j13 = j12 >> iNumberOfTrailingZeros2;
            iNumberOfTrailingZeros += iNumberOfTrailingZeros2;
            if ((i11 - iNumberOfTrailingZeros2) + iLog2 >= 64) {
                arrayList.add(BigInteger.valueOf(j10));
                j10 = 1;
            }
            j10 *= j13;
            iLog2 = LongMath.log2(j10, RoundingMode.FLOOR) + i13;
            j11 = j12 + 1;
            i10 = i13;
        }
        if (j10 > 1) {
            arrayList.add(BigInteger.valueOf(j10));
        }
        return listProduct(arrayList).shiftLeft(iNumberOfTrailingZeros);
    }

    @GwtIncompatible
    public static boolean fitsInLong(BigInteger bigInteger) {
        return bigInteger.bitLength() <= 63;
    }

    @Beta
    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        return bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1;
    }

    public static BigInteger listProduct(List<BigInteger> list) {
        return listProduct(list, 0, list.size());
    }

    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i7;
        int iCompareTo;
        MathPreconditions.checkPositive("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int iLog2 = (int) ((((double) log2(bigInteger, RoundingMode.FLOOR)) * LN_2) / LN_10);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger bigIntegerPow = bigInteger2.pow(iLog2);
        int iCompareTo2 = bigIntegerPow.compareTo(bigInteger);
        if (iCompareTo2 > 0) {
            do {
                iLog2--;
                bigIntegerPow = bigIntegerPow.divide(BigInteger.TEN);
                iCompareTo = bigIntegerPow.compareTo(bigInteger);
            } while (iCompareTo > 0);
        } else {
            BigInteger bigIntegerMultiply = bigInteger2.multiply(bigIntegerPow);
            int iCompareTo3 = bigIntegerMultiply.compareTo(bigInteger);
            while (true) {
                int i10 = iCompareTo3;
                i7 = iCompareTo2;
                iCompareTo2 = i10;
                if (iCompareTo2 > 0) {
                    break;
                }
                iLog2++;
                BigInteger bigIntegerMultiply2 = BigInteger.TEN.multiply(bigIntegerMultiply);
                iCompareTo3 = bigIntegerMultiply2.compareTo(bigInteger);
                bigIntegerPow = bigIntegerMultiply;
                bigIntegerMultiply = bigIntegerMultiply2;
            }
            iCompareTo = i7;
        }
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iCompareTo == 0);
                return iLog2;
            case 2:
            case 3:
                return iLog2;
            case 4:
            case 5:
                return bigIntegerPow.equals(bigInteger) ? iLog2 : iLog2 + 1;
            case 6:
            case 7:
            case 8:
                return bigInteger.pow(2).compareTo(bigIntegerPow.pow(2).multiply(BigInteger.TEN)) <= 0 ? iLog2 : iLog2 + 1;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[RETURN] */
    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", (BigInteger) Preconditions.checkNotNull(bigInteger));
        int iBitLength = bigInteger.bitLength();
        int i7 = iBitLength - 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(bigInteger));
                return i7;
            case 2:
            case 3:
                return i7;
            case 4:
            case 5:
                if (isPowerOfTwo(bigInteger)) {
                    return i7;
                }
                return iBitLength;
            case 6:
            case 7:
            case 8:
                if (i7 < 256) {
                    if (bigInteger.compareTo(SQRT2_PRECOMPUTED_BITS.shiftRight(256 - i7)) > 0) {
                        return iBitLength;
                    }
                } else if (bigInteger.pow(2).bitLength() - 1 >= (i7 * 2) + 1) {
                    return iBitLength;
                }
                return i7;
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return BigIntegerToDoubleRounder.INSTANCE.roundToDouble(bigInteger, roundingMode);
    }

    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        MathPreconditions.checkNonNegative("x", bigInteger);
        if (fitsInLong(bigInteger)) {
            return BigInteger.valueOf(LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        BigInteger bigIntegerSqrtFloor = sqrtFloor(bigInteger);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(bigIntegerSqrtFloor.pow(2).equals(bigInteger));
                return bigIntegerSqrtFloor;
            case 2:
            case 3:
                return bigIntegerSqrtFloor;
            case 4:
            case 5:
                int iIntValue = bigIntegerSqrtFloor.intValue();
                return (iIntValue * iIntValue == bigInteger.intValue() && bigIntegerSqrtFloor.pow(2).equals(bigInteger)) ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                return bigIntegerSqrtFloor.pow(2).add(bigIntegerSqrtFloor).compareTo(bigInteger) >= 0 ? bigIntegerSqrtFloor : bigIntegerSqrtFloor.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    private static BigInteger sqrtApproxWithDoubles(BigInteger bigInteger) {
        return DoubleMath.roundToBigInteger(Math.sqrt(DoubleUtils.bigToDouble(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @GwtIncompatible
    private static BigInteger sqrtFloor(BigInteger bigInteger) {
        BigInteger bigIntegerShiftLeft;
        int iLog2 = log2(bigInteger, RoundingMode.FLOOR);
        if (iLog2 < 1023) {
            bigIntegerShiftLeft = sqrtApproxWithDoubles(bigInteger);
        } else {
            int i7 = (iLog2 - 52) & (-2);
            bigIntegerShiftLeft = sqrtApproxWithDoubles(bigInteger.shiftRight(i7)).shiftLeft(i7 >> 1);
        }
        BigInteger bigIntegerShiftRight = bigIntegerShiftLeft.add(bigInteger.divide(bigIntegerShiftLeft)).shiftRight(1);
        if (bigIntegerShiftLeft.equals(bigIntegerShiftRight)) {
            return bigIntegerShiftLeft;
        }
        while (true) {
            BigInteger bigIntegerShiftRight2 = bigIntegerShiftRight.add(bigInteger.divide(bigIntegerShiftRight)).shiftRight(1);
            if (bigIntegerShiftRight2.compareTo(bigIntegerShiftRight) >= 0) {
                return bigIntegerShiftRight;
            }
            bigIntegerShiftRight = bigIntegerShiftRight2;
        }
    }

    public static BigInteger listProduct(List<BigInteger> list, int i7, int i10) {
        int i11 = i10 - i7;
        if (i11 == 0) {
            return BigInteger.ONE;
        }
        if (i11 == 1) {
            return list.get(i7);
        }
        if (i11 == 2) {
            return list.get(i7).multiply(list.get(i7 + 1));
        }
        if (i11 == 3) {
            return list.get(i7).multiply(list.get(i7 + 1)).multiply(list.get(i7 + 2));
        }
        int i12 = (i10 + i7) >>> 1;
        return listProduct(list, i7, i12).multiply(listProduct(list, i12, i10));
    }
}
