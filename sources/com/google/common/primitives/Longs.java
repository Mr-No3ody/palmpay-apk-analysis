package com.google.common.primitives;

import com.airbnb.lottie.model.layer.d;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i7 = 0; i7 < 10; i7++) {
                bArr[i7 + 48] = (byte) i7;
            }
            for (int i10 = 0; i10 < 26; i10++) {
                byte b7 = (byte) (i10 + 10);
                bArr[i10 + 65] = b7;
                bArr[i10 + 97] = b7;
            }
            asciiDigits = bArr;
        }

        private AsciiDigits() {
        }

        public static int digit(char c6) {
            if (c6 < 128) {
                return asciiDigits[c6];
            }
            return -1;
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Longs.compare(jArr[i7], jArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Long) && Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != longArrayAsList.array[longArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Long) || (iIndexOf = Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Long) || (iLastIndexOf = Longs.lastIndexOf(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.array;
            int i11 = this.start;
            return new LongArrayAsList(jArr, i7 + i11, i11 + i10);
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 10);
            sb2.append('[');
            sb2.append(this.array[this.start]);
            int i7 = this.start;
            while (true) {
                i7++;
                if (i7 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i7]);
            }
        }

        public LongArrayAsList(long[] jArr, int i7, int i10) {
            this.array = jArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Long.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i7, Long l5) {
            Preconditions.checkElementIndex(i7, size());
            long[] jArr = this.array;
            int i10 = this.start;
            long j6 = jArr[i10 + i7];
            jArr[i10 + i7] = ((Long) Preconditions.checkNotNull(l5)).longValue();
            return Long.valueOf(j6);
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final LongConverter INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l5) {
            return l5.toString();
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new LongArrayAsList(jArr);
    }

    public static int compare(long j6, long j10) {
        if (j6 < j10) {
            return -1;
        }
        return j6 > j10 ? 1 : 0;
    }

    public static long[] concat(long[]... jArr) {
        int length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        long[] jArr3 = new long[length];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    @Beta
    public static long constrainToRange(long j6, long j10, long j11) {
        Preconditions.checkArgument(j10 <= j11, "min (%s) must be less than or equal to max (%s)", j10, j11);
        return Math.min(Math.max(j6, j10), j11);
    }

    public static boolean contains(long[] jArr, long j6) {
        for (long j10 : jArr) {
            if (j10 == j6) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return jArr.length < i7 ? Arrays.copyOf(jArr, i7 + i10) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b7, byte b10, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16) {
        return ((((long) b10) & 255) << 48) | ((((long) b7) & 255) << 56) | ((((long) b11) & 255) << 40) | ((((long) b12) & 255) << 32) | ((((long) b13) & 255) << 24) | ((((long) b14) & 255) << 16) | ((((long) b15) & 255) << 8) | (((long) b16) & 255);
    }

    public static int hashCode(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static int indexOf(long[] jArr, long j6) {
        return indexOf(jArr, j6, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(jArr.length * 10);
        sb2.append(jArr[0]);
        for (int i7 = 1; i7 < jArr.length; i7++) {
            sb2.append(str);
            sb2.append(jArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(long[] jArr, long j6) {
        return lastIndexOf(jArr, j6, 0, jArr.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j6 = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long j10 = jArr[i7];
            if (j10 > j6) {
                j6 = j10;
            }
        }
        return j6;
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j6 = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long j10 = jArr[i7];
            if (j10 < j6) {
                j6 = j10;
            }
        }
        return j6;
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    @Beta
    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i7 = 0; i7 < length; i7++) {
            jArr[i7] = ((Number) Preconditions.checkNotNull(array[i7])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j6) {
        byte[] bArr = new byte[8];
        for (int i7 = 7; i7 >= 0; i7--) {
            bArr[i7] = (byte) (255 & j6);
            j6 >>= 8;
        }
        return bArr;
    }

    @Beta
    @CheckForNull
    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] jArr, long j6, int i7, int i10) {
        while (i7 < i10) {
            if (jArr[i7] == j6) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] jArr, long j6, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (jArr[i11] == j6) {
                return i11;
            }
        }
        return -1;
    }

    @Beta
    @CheckForNull
    public static Long tryParse(String str, int i7) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i7 < 2 || i7 > 36) {
            throw new IllegalArgumentException(d.g(65, i7, "radix must be between MIN_RADIX and MAX_RADIX but was "));
        }
        int i10 = str.charAt(0) == '-' ? 1 : 0;
        if (i10 == str.length()) {
            return null;
        }
        int i11 = i10 + 1;
        int iDigit = AsciiDigits.digit(str.charAt(i10));
        if (iDigit < 0 || iDigit >= i7) {
            return null;
        }
        long j6 = -iDigit;
        long j10 = i7;
        long j11 = Long.MIN_VALUE / j10;
        while (i11 < str.length()) {
            int i12 = i11 + 1;
            int iDigit2 = AsciiDigits.digit(str.charAt(i11));
            if (iDigit2 < 0 || iDigit2 >= i7 || j6 < j11) {
                return null;
            }
            long j12 = j6 * j10;
            long j13 = iDigit2;
            if (j12 < j13 - Long.MIN_VALUE) {
                return null;
            }
            j6 = j12 - j13;
            i11 = i12;
        }
        if (i10 != 0) {
            return Long.valueOf(j6);
        }
        if (j6 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j6);
    }

    public static int indexOf(long[] jArr, long[] jArr2) {
        Preconditions.checkNotNull(jArr, "array");
        Preconditions.checkNotNull(jArr2, "target");
        if (jArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (jArr.length - jArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < jArr2.length; i10++) {
                if (jArr[i7 + i10] != jArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(long[] jArr, int i7, int i10) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i7, i10, jArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            long j6 = jArr[i7];
            jArr[i7] = jArr[i11];
            jArr[i11] = j6;
            i7++;
        }
    }

    public static void sortDescending(long[] jArr, int i7, int i10) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i7, i10, jArr.length);
        Arrays.sort(jArr, i7, i10);
        reverse(jArr, i7, i10);
    }
}
