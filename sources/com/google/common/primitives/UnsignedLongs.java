package com.google.common.primitives;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
public final class UnsignedLongs {
    public static final long MAX_VALUE = -1;

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                long j6 = jArr[i7];
                long j10 = jArr2[i7];
                if (j6 != j10) {
                    return UnsignedLongs.compare(j6, j10);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    public static final class ParseOverflowDetection {
        static final long[] maxValueDivs = new long[37];
        static final int[] maxValueMods = new int[37];
        static final int[] maxSafeDigits = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i7 = 2; i7 <= 36; i7++) {
                long j6 = i7;
                maxValueDivs[i7] = UnsignedLongs.divide(-1L, j6);
                maxValueMods[i7] = (int) UnsignedLongs.remainder(-1L, j6);
                maxSafeDigits[i7] = bigInteger.toString(i7).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }

        public static boolean overflowInParse(long j6, int i7, int i10) {
            if (j6 < 0) {
                return true;
            }
            long j10 = maxValueDivs[i10];
            if (j6 < j10) {
                return false;
            }
            return j6 > j10 || i7 > maxValueMods[i10];
        }
    }

    private UnsignedLongs() {
    }

    public static int compare(long j6, long j10) {
        return Longs.compare(flip(j6), flip(j10));
    }

    @CanIgnoreReturnValue
    public static long decode(String str) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedLong(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e10) {
            String strValueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(strValueOf.length() != 0 ? "Error parsing value: ".concat(strValueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static long divide(long j6, long j10) {
        if (j10 < 0) {
            return compare(j6, j10) < 0 ? 0L : 1L;
        }
        if (j6 >= 0) {
            return j6 / j10;
        }
        long j11 = ((j6 >>> 1) / j10) << 1;
        return j11 + ((long) (compare(j6 - (j11 * j10), j10) < 0 ? 0 : 1));
    }

    private static long flip(long j6) {
        return j6 ^ Long.MIN_VALUE;
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 5);
        sb2.append(toString(jArr[0]));
        for (int i7 = 1; i7 < jArr.length; i7++) {
            sb2.append(str);
            sb2.append(toString(jArr[i7]));
        }
        return sb2.toString();
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long jFlip2 = flip(jArr[i7]);
            if (jFlip2 > jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long jFlip = flip(jArr[0]);
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long jFlip2 = flip(jArr[i7]);
            if (jFlip2 < jFlip) {
                jFlip = jFlip2;
            }
        }
        return flip(jFlip);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str) {
        return parseUnsignedLong(str, 10);
    }

    public static long remainder(long j6, long j10) {
        if (j10 < 0) {
            return compare(j6, j10) < 0 ? j6 : j6 - j10;
        }
        if (j6 >= 0) {
            return j6 % j10;
        }
        long j11 = j6 - ((((j6 >>> 1) / j10) << 1) * j10);
        if (compare(j11, j10) < 0) {
            j10 = 0;
        }
        return j11 - j10;
    }

    public static void sort(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sort(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static String toString(long j6) {
        return toString(j6, 10);
    }

    @CanIgnoreReturnValue
    public static long parseUnsignedLong(String str, int i7) {
        Preconditions.checkNotNull(str);
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (i7 < 2 || i7 > 36) {
            throw new NumberFormatException(d.g(26, i7, "illegal radix: "));
        }
        int i10 = ParseOverflowDetection.maxSafeDigits[i7] - 1;
        long j6 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            int iDigit = Character.digit(str.charAt(i11), i7);
            if (iDigit == -1) {
                throw new NumberFormatException(str);
            }
            if (i11 > i10 && ParseOverflowDetection.overflowInParse(j6, iDigit, i7)) {
                throw new NumberFormatException(str.length() != 0 ? "Too large for unsigned long: ".concat(str) : new String("Too large for unsigned long: "));
            }
            j6 = (j6 * ((long) i7)) + ((long) iDigit);
        }
        return j6;
    }

    public static String toString(long j6, int i7) {
        Preconditions.checkArgument(i7 >= 2 && i7 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i7);
        if (j6 == 0) {
            return "0";
        }
        if (j6 > 0) {
            return Long.toString(j6, i7);
        }
        int i10 = 64;
        char[] cArr = new char[64];
        int i11 = i7 - 1;
        if ((i7 & i11) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i7);
            do {
                i10--;
                cArr[i10] = Character.forDigit(((int) j6) & i11, i7);
                j6 >>>= iNumberOfTrailingZeros;
            } while (j6 != 0);
        } else {
            long jDivide = (i7 & 1) == 0 ? (j6 >>> 1) / ((long) (i7 >>> 1)) : divide(j6, i7);
            long j10 = i7;
            int i12 = 63;
            cArr[63] = Character.forDigit((int) (j6 - (jDivide * j10)), i7);
            while (jDivide > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (jDivide % j10), i7);
                jDivide /= j10;
            }
            i10 = i12;
        }
        return new String(cArr, i10, 64 - i10);
    }

    public static void sort(long[] jArr, int i7, int i10) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i7, i10, jArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            jArr[i11] = flip(jArr[i11]);
        }
        Arrays.sort(jArr, i7, i10);
        while (i7 < i10) {
            jArr[i7] = flip(jArr[i7]);
            i7++;
        }
    }

    public static void sortDescending(long[] jArr, int i7, int i10) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i7, i10, jArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            jArr[i11] = Long.MAX_VALUE ^ jArr[i11];
        }
        Arrays.sort(jArr, i7, i10);
        while (i7 < i10) {
            jArr[i7] = jArr[i7] ^ Long.MAX_VALUE;
            i7++;
        }
    }
}
