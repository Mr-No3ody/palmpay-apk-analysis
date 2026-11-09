package com.google.common.primitives;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@Beta
@GwtCompatible
public final class UnsignedInts {
    static final long INT_MASK = 4294967295L;

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int i10 = iArr[i7];
                int i11 = iArr2[i7];
                if (i10 != i11) {
                    return UnsignedInts.compare(i10, i11);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private UnsignedInts() {
    }

    public static int checkedCast(long j6) {
        Preconditions.checkArgument((j6 >> 32) == 0, "out of range: %s", j6);
        return (int) j6;
    }

    public static int compare(int i7, int i10) {
        return Ints.compare(flip(i7), flip(i10));
    }

    @CanIgnoreReturnValue
    public static int decode(String str) {
        ParseRequest parseRequestFromString = ParseRequest.fromString(str);
        try {
            return parseUnsignedInt(parseRequestFromString.rawValue, parseRequestFromString.radix);
        } catch (NumberFormatException e10) {
            String strValueOf = String.valueOf(str);
            NumberFormatException numberFormatException = new NumberFormatException(strValueOf.length() != 0 ? "Error parsing value: ".concat(strValueOf) : new String("Error parsing value: "));
            numberFormatException.initCause(e10);
            throw numberFormatException;
        }
    }

    public static int divide(int i7, int i10) {
        return (int) (toLong(i7) / toLong(i10));
    }

    public static int flip(int i7) {
        return i7 ^ Integer.MIN_VALUE;
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(toString(iArr[0]));
        for (int i7 = 1; i7 < iArr.length; i7++) {
            sb2.append(str);
            sb2.append(toString(iArr[i7]));
        }
        return sb2.toString();
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int iFlip = flip(iArr[0]);
        for (int i7 = 1; i7 < iArr.length; i7++) {
            int iFlip2 = flip(iArr[i7]);
            if (iFlip2 > iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int iFlip = flip(iArr[0]);
        for (int i7 = 1; i7 < iArr.length; i7++) {
            int iFlip2 = flip(iArr[i7]);
            if (iFlip2 < iFlip) {
                iFlip = iFlip2;
            }
        }
        return flip(iFlip);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str) {
        return parseUnsignedInt(str, 10);
    }

    public static int remainder(int i7, int i10) {
        return (int) (toLong(i7) % toLong(i10));
    }

    public static int saturatedCast(long j6) {
        if (j6 <= 0) {
            return 0;
        }
        if (j6 >= 4294967296L) {
            return -1;
        }
        return (int) j6;
    }

    public static void sort(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sort(iArr, 0, iArr.length);
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    public static long toLong(int i7) {
        return ((long) i7) & INT_MASK;
    }

    public static String toString(int i7) {
        return toString(i7, 10);
    }

    @CanIgnoreReturnValue
    public static int parseUnsignedInt(String str, int i7) {
        Preconditions.checkNotNull(str);
        long j6 = Long.parseLong(str, i7);
        if ((INT_MASK & j6) == j6) {
            return (int) j6;
        }
        StringBuilder sb2 = new StringBuilder(d.c(69, str));
        sb2.append("Input ");
        sb2.append(str);
        sb2.append(" in base ");
        sb2.append(i7);
        sb2.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb2.toString());
    }

    public static String toString(int i7, int i10) {
        return Long.toString(((long) i7) & INT_MASK, i10);
    }

    public static void sort(int[] iArr, int i7, int i10) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i7, i10, iArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            iArr[i11] = flip(iArr[i11]);
        }
        Arrays.sort(iArr, i7, i10);
        while (i7 < i10) {
            iArr[i7] = flip(iArr[i7]);
            i7++;
        }
    }

    public static void sortDescending(int[] iArr, int i7, int i10) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i7, i10, iArr.length);
        for (int i11 = i7; i11 < i10; i11++) {
            iArr[i11] = Integer.MAX_VALUE ^ iArr[i11];
        }
        Arrays.sort(iArr, i7, i10);
        while (i7 < i10) {
            iArr[i7] = iArr[i7] ^ Integer.MAX_VALUE;
            i7++;
        }
    }
}
