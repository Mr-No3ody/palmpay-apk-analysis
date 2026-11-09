package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class SignedBytes {
    public static final byte MAX_POWER_OF_TWO = 64;

    public enum LexicographicalComparator implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = SignedBytes.compare(bArr[i7], bArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    private SignedBytes() {
    }

    public static byte checkedCast(long j6) {
        byte b7 = (byte) j6;
        Preconditions.checkArgument(((long) b7) == j6, "Out of range: %s", j6);
        return b7;
    }

    public static int compare(byte b7, byte b10) {
        return b7 - b10;
    }

    public static String join(String str, byte... bArr) {
        Preconditions.checkNotNull(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 5);
        sb2.append((int) bArr[0]);
        for (int i7 = 1; i7 < bArr.length; i7++) {
            sb2.append(str);
            sb2.append((int) bArr[i7]);
        }
        return sb2.toString();
    }

    public static Comparator<byte[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static byte max(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b7 = bArr[0];
        for (int i7 = 1; i7 < bArr.length; i7++) {
            byte b10 = bArr[i7];
            if (b10 > b7) {
                b7 = b10;
            }
        }
        return b7;
    }

    public static byte min(byte... bArr) {
        Preconditions.checkArgument(bArr.length > 0);
        byte b7 = bArr[0];
        for (int i7 = 1; i7 < bArr.length; i7++) {
            byte b10 = bArr[i7];
            if (b10 < b7) {
                b7 = b10;
            }
        }
        return b7;
    }

    public static byte saturatedCast(long j6) {
        if (j6 > 127) {
            return Ascii.DEL;
        }
        return j6 < -128 ? UnsignedBytes.MAX_POWER_OF_TWO : (byte) j6;
    }

    public static void sortDescending(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        sortDescending(bArr, 0, bArr.length);
    }

    public static void sortDescending(byte[] bArr, int i7, int i10) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i7, i10, bArr.length);
        Arrays.sort(bArr, i7, i10);
        Bytes.reverse(bArr, i7, i10);
    }
}
