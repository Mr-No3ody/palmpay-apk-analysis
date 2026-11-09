package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.luck.picture.lib.config.FileSizeUnit;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import face.security.device.api.FaceSecCode;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class IntMath {

    @VisibleForTesting
    static final int FLOOR_SQRT_MAX_INT = 46340;

    @VisibleForTesting
    static final int MAX_POWER_OF_SQRT2_UNSIGNED = -1257966797;

    @VisibleForTesting
    static final int MAX_SIGNED_POWER_OF_TWO = 1073741824;

    @VisibleForTesting
    static final byte[] maxLog10ForLeadingZeros = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    @VisibleForTesting
    static final int[] powersOf10 = {1, 10, 100, 1000, FaceSecCode.SC_SUCCESS, 100000, FileSizeUnit.ACCURATE_MB, 10000000, 100000000, FileSizeUnit.ACCURATE_GB};

    @VisibleForTesting
    static final int[] halfPowersOf10 = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    private static final int[] factorials = {1, 1, 2, 6, 24, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    @VisibleForTesting
    static int[] biggestBinomials = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, HomeDialogState.PRIORITY_HIGHEST, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: com.google.common.math.IntMath$1, reason: invalid class name */
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

    private IntMath() {
    }

    public static int binomial(int i7, int i10) {
        MathPreconditions.checkNonNegative("n", i7);
        MathPreconditions.checkNonNegative("k", i10);
        int i11 = 0;
        Preconditions.checkArgument(i10 <= i7, "k (%s) > n (%s)", i10, i7);
        if (i10 > (i7 >> 1)) {
            i10 = i7 - i10;
        }
        int[] iArr = biggestBinomials;
        if (i10 >= iArr.length || i7 > iArr[i10]) {
            return Integer.MAX_VALUE;
        }
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return i7;
        }
        long j6 = 1;
        while (i11 < i10) {
            long j10 = j6 * ((long) (i7 - i11));
            i11++;
            j6 = j10 / ((long) i11);
        }
        return (int) j6;
    }

    @Beta
    public static int ceilingPowerOfTwo(int i7) {
        MathPreconditions.checkPositive("x", i7);
        if (i7 <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i7 - 1));
        }
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("ceilingPowerOfTwo(");
        sb2.append(i7);
        sb2.append(") not representable as an int");
        throw new ArithmeticException(sb2.toString());
    }

    public static int checkedAdd(int i7, int i10) {
        long j6 = ((long) i7) + ((long) i10);
        int i11 = (int) j6;
        MathPreconditions.checkNoOverflow(j6 == ((long) i11), "checkedAdd", i7, i10);
        return i11;
    }

    public static int checkedMultiply(int i7, int i10) {
        long j6 = ((long) i7) * ((long) i10);
        int i11 = (int) j6;
        MathPreconditions.checkNoOverflow(j6 == ((long) i11), "checkedMultiply", i7, i10);
        return i11;
    }

    public static int checkedPow(int i7, int i10) {
        MathPreconditions.checkNonNegative("exponent", i10);
        if (i7 == -2) {
            MathPreconditions.checkNoOverflow(i10 < 32, "checkedPow", i7, i10);
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i7 == -1) {
            return (i10 & 1) == 0 ? 1 : -1;
        }
        if (i7 == 0) {
            return i10 == 0 ? 1 : 0;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            MathPreconditions.checkNoOverflow(i10 < 31, "checkedPow", i7, i10);
            return 1 << i10;
        }
        int iCheckedMultiply = 1;
        while (i10 != 0) {
            if (i10 == 1) {
                return checkedMultiply(iCheckedMultiply, i7);
            }
            if ((i10 & 1) != 0) {
                iCheckedMultiply = checkedMultiply(iCheckedMultiply, i7);
            }
            i10 >>= 1;
            if (i10 > 0) {
                MathPreconditions.checkNoOverflow((-46340 <= i7) & (i7 <= FLOOR_SQRT_MAX_INT), "checkedPow", i7, i10);
                i7 *= i7;
            }
        }
        return iCheckedMultiply;
    }

    public static int checkedSubtract(int i7, int i10) {
        long j6 = ((long) i7) - ((long) i10);
        int i11 = (int) j6;
        MathPreconditions.checkNoOverflow(j6 == ((long) i11), "checkedSubtract", i7, i10);
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int divide(int i7, int i10, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i7 / i10;
        int i12 = i7 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i7 ^ i10) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                return i11 + i13;
            case 4:
                return i11 + i13;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                return i11 + i13;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i11 & 1) != 0))) {
                            return i11;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i11;
                }
                return i11 + i13;
            default:
                throw new AssertionError();
        }
    }

    public static int factorial(int i7) {
        MathPreconditions.checkNonNegative("n", i7);
        int[] iArr = factorials;
        if (i7 < iArr.length) {
            return iArr[i7];
        }
        return Integer.MAX_VALUE;
    }

    @Beta
    public static int floorPowerOfTwo(int i7) {
        MathPreconditions.checkPositive("x", i7);
        return Integer.highestOneBit(i7);
    }

    public static int gcd(int i7, int i10) {
        MathPreconditions.checkNonNegative("a", i7);
        MathPreconditions.checkNonNegative("b", i10);
        if (i7 == 0) {
            return i10;
        }
        if (i10 == 0) {
            return i7;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i7);
        int iNumberOfTrailingZeros2 = i7 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(i10);
        int i11 = i10 >> iNumberOfTrailingZeros3;
        while (iNumberOfTrailingZeros2 != i11) {
            int i12 = iNumberOfTrailingZeros2 - i11;
            int i13 = (i12 >> 31) & i12;
            int i14 = (i12 - i13) - i13;
            i11 += i13;
            iNumberOfTrailingZeros2 = i14 >> Integer.numberOfTrailingZeros(i14);
        }
        return iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
    }

    public static boolean isPowerOfTwo(int i7) {
        return (i7 > 0) & ((i7 & (i7 + (-1))) == 0);
    }

    @Beta
    @GwtIncompatible
    public static boolean isPrime(int i7) {
        return LongMath.isPrime(i7);
    }

    @VisibleForTesting
    public static int lessThanBranchFree(int i7, int i10) {
        return (~(~(i7 - i10))) >>> 31;
    }

    @GwtIncompatible
    public static int log10(int i7, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkPositive("x", i7);
        int iLog10Floor = log10Floor(i7);
        int i10 = powersOf10[iLog10Floor];
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(i7 == i10);
                return iLog10Floor;
            case 2:
            case 3:
                return iLog10Floor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(i10, i7);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree(halfPowersOf10[iLog10Floor], i7);
                break;
            default:
                throw new AssertionError();
        }
        return iLessThanBranchFree + iLog10Floor;
    }

    private static int log10Floor(int i7) {
        byte b7 = maxLog10ForLeadingZeros[Integer.numberOfLeadingZeros(i7)];
        return b7 - lessThanBranchFree(i7, powersOf10[b7]);
    }

    public static int log2(int i7, RoundingMode roundingMode) {
        MathPreconditions.checkPositive("x", i7);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(isPowerOfTwo(i7));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return lessThanBranchFree(MAX_POWER_OF_SQRT2_UNSIGNED >>> iNumberOfLeadingZeros, i7) + (31 - iNumberOfLeadingZeros);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    public static int mean(int i7, int i10) {
        return (i7 & i10) + ((i7 ^ i10) >> 1);
    }

    public static int mod(int i7, int i10) {
        if (i10 > 0) {
            int i11 = i7 % i10;
            return i11 >= 0 ? i11 : i11 + i10;
        }
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append("Modulus ");
        sb2.append(i10);
        sb2.append(" must be > 0");
        throw new ArithmeticException(sb2.toString());
    }

    @GwtIncompatible
    public static int pow(int i7, int i10) {
        MathPreconditions.checkNonNegative("exponent", i10);
        if (i7 == -2) {
            if (i10 < 32) {
                return (i10 & 1) == 0 ? 1 << i10 : -(1 << i10);
            }
            return 0;
        }
        if (i7 == -1) {
            return (i10 & 1) == 0 ? 1 : -1;
        }
        if (i7 == 0) {
            return i10 == 0 ? 1 : 0;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            if (i10 < 32) {
                return 1 << i10;
            }
            return 0;
        }
        int i11 = 1;
        while (i10 != 0) {
            if (i10 == 1) {
                return i7 * i11;
            }
            i11 *= (i10 & 1) == 0 ? 1 : i7;
            i7 *= i7;
            i10 >>= 1;
        }
        return i11;
    }

    @Beta
    public static int saturatedAdd(int i7, int i10) {
        return Ints.saturatedCast(((long) i7) + ((long) i10));
    }

    @Beta
    public static int saturatedMultiply(int i7, int i10) {
        return Ints.saturatedCast(((long) i7) * ((long) i10));
    }

    @Beta
    public static int saturatedPow(int i7, int i10) {
        MathPreconditions.checkNonNegative("exponent", i10);
        if (i7 == -2) {
            if (i10 >= 32) {
                return (i10 & 1) + Integer.MAX_VALUE;
            }
            return (i10 & 1) == 0 ? 1 << i10 : (-1) << i10;
        }
        if (i7 == -1) {
            return (i10 & 1) == 0 ? 1 : -1;
        }
        if (i7 == 0) {
            return i10 == 0 ? 1 : 0;
        }
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            if (i10 >= 31) {
                return Integer.MAX_VALUE;
            }
            return 1 << i10;
        }
        int i11 = ((i7 >>> 31) & i10 & 1) + Integer.MAX_VALUE;
        int iSaturatedMultiply = 1;
        while (i10 != 0) {
            if (i10 == 1) {
                return saturatedMultiply(iSaturatedMultiply, i7);
            }
            if ((i10 & 1) != 0) {
                iSaturatedMultiply = saturatedMultiply(iSaturatedMultiply, i7);
            }
            i10 >>= 1;
            if (i10 > 0) {
                if ((-46340 > i7) || (i7 > FLOOR_SQRT_MAX_INT)) {
                    return i11;
                }
                i7 *= i7;
            }
        }
        return iSaturatedMultiply;
    }

    @Beta
    public static int saturatedSubtract(int i7, int i10) {
        return Ints.saturatedCast(((long) i7) - ((long) i10));
    }

    @GwtIncompatible
    public static int sqrt(int i7, RoundingMode roundingMode) {
        int iLessThanBranchFree;
        MathPreconditions.checkNonNegative("x", i7);
        int iSqrtFloor = sqrtFloor(i7);
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
                MathPreconditions.checkRoundingUnnecessary(iSqrtFloor * iSqrtFloor == i7);
                return iSqrtFloor;
            case 2:
            case 3:
                return iSqrtFloor;
            case 4:
            case 5:
                iLessThanBranchFree = lessThanBranchFree(iSqrtFloor * iSqrtFloor, i7);
                break;
            case 6:
            case 7:
            case 8:
                iLessThanBranchFree = lessThanBranchFree((iSqrtFloor * iSqrtFloor) + iSqrtFloor, i7);
                break;
            default:
                throw new AssertionError();
        }
        return iLessThanBranchFree + iSqrtFloor;
    }

    private static int sqrtFloor(int i7) {
        return (int) Math.sqrt(i7);
    }
}
