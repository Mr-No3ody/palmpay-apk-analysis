package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
@GwtCompatible(emulated = true)
public final class Shorts extends ShortsMethodsForWeb {
    public static final int BYTES = 2;
    public static final short MAX_POWER_OF_TWO = 16384;

    public enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(short[] sArr, short[] sArr2) {
            int iMin = Math.min(sArr.length, sArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Shorts.compare(sArr[i7], sArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    @GwtCompatible
    public static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        public ShortArrayAsList(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Short) && Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != shortArrayAsList.array[shortArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Shorts.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Short) || (iIndexOf = Shorts.indexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Short) || (iLastIndexOf = Shorts.lastIndexOf(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Short> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            short[] sArr = this.array;
            int i11 = this.start;
            return new ShortArrayAsList(sArr, i7 + i11, i11 + i10);
        }

        public short[] toShortArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 6);
            sb2.append('[');
            sb2.append((int) this.array[this.start]);
            int i7 = this.start;
            while (true) {
                i7++;
                if (i7 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.array[i7]);
            }
        }

        public ShortArrayAsList(short[] sArr, int i7, int i10) {
            this.array = sArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Short get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Short.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Short set(int i7, Short sh2) {
            Preconditions.checkElementIndex(i7, size());
            short[] sArr = this.array;
            int i10 = this.start;
            short s3 = sArr[i10 + i7];
            sArr[i10 + i7] = ((Short) Preconditions.checkNotNull(sh2)).shortValue();
            return Short.valueOf(s3);
        }
    }

    public static final class ShortConverter extends Converter<String, Short> implements Serializable {
        static final ShortConverter INSTANCE = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Short sh2) {
            return sh2.toString();
        }

        @Override // com.google.common.base.Converter
        public Short doForward(String str) {
            return Short.decode(str);
        }
    }

    private Shorts() {
    }

    public static List<Short> asList(short... sArr) {
        return sArr.length == 0 ? Collections.EMPTY_LIST : new ShortArrayAsList(sArr);
    }

    public static short checkedCast(long j6) {
        short s3 = (short) j6;
        Preconditions.checkArgument(((long) s3) == j6, "Out of range: %s", j6);
        return s3;
    }

    public static int compare(short s3, short s8) {
        return s3 - s8;
    }

    public static short[] concat(short[]... sArr) {
        int length = 0;
        for (short[] sArr2 : sArr) {
            length += sArr2.length;
        }
        short[] sArr3 = new short[length];
        int length2 = 0;
        for (short[] sArr4 : sArr) {
            System.arraycopy(sArr4, 0, sArr3, length2, sArr4.length);
            length2 += sArr4.length;
        }
        return sArr3;
    }

    @Beta
    public static short constrainToRange(short s3, short s8, short s10) {
        Preconditions.checkArgument(s8 <= s10, "min (%s) must be less than or equal to max (%s)", (int) s8, (int) s10);
        if (s3 < s8) {
            return s8;
        }
        return s3 < s10 ? s3 : s10;
    }

    public static boolean contains(short[] sArr, short s3) {
        for (short s8 : sArr) {
            if (s8 == s3) {
                return true;
            }
        }
        return false;
    }

    public static short[] ensureCapacity(short[] sArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return sArr.length < i7 ? Arrays.copyOf(sArr, i7 + i10) : sArr;
    }

    @GwtIncompatible
    public static short fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static short fromBytes(byte b7, byte b10) {
        return (short) ((b7 << 8) | (b10 & UnsignedBytes.MAX_VALUE));
    }

    public static int hashCode(short s3) {
        return s3;
    }

    public static int indexOf(short[] sArr, short s3) {
        return indexOf(sArr, s3, 0, sArr.length);
    }

    public static String join(String str, short... sArr) {
        Preconditions.checkNotNull(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(sArr.length * 6);
        sb2.append((int) sArr[0]);
        for (int i7 = 1; i7 < sArr.length; i7++) {
            sb2.append(str);
            sb2.append((int) sArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(short[] sArr, short s3) {
        return lastIndexOf(sArr, s3, 0, sArr.length);
    }

    public static Comparator<short[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short max(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s3 = sArr[0];
        for (int i7 = 1; i7 < sArr.length; i7++) {
            short s8 = sArr[i7];
            if (s8 > s3) {
                s3 = s8;
            }
        }
        return s3;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static short min(short... sArr) {
        Preconditions.checkArgument(sArr.length > 0);
        short s3 = sArr[0];
        for (int i7 = 1; i7 < sArr.length; i7++) {
            short s8 = sArr[i7];
            if (s8 < s3) {
                s3 = s8;
            }
        }
        return s3;
    }

    public static void reverse(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        reverse(sArr, 0, sArr.length);
    }

    public static short saturatedCast(long j6) {
        if (j6 > 32767) {
            return Short.MAX_VALUE;
        }
        if (j6 < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) j6;
    }

    public static void sortDescending(short[] sArr) {
        Preconditions.checkNotNull(sArr);
        sortDescending(sArr, 0, sArr.length);
    }

    @Beta
    public static Converter<String, Short> stringConverter() {
        return ShortConverter.INSTANCE;
    }

    public static short[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ShortArrayAsList) {
            return ((ShortArrayAsList) collection).toShortArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i7 = 0; i7 < length; i7++) {
            sArr[i7] = ((Number) Preconditions.checkNotNull(array[i7])).shortValue();
        }
        return sArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(short s3) {
        return new byte[]{(byte) (s3 >> 8), (byte) s3};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(short[] sArr, short s3, int i7, int i10) {
        while (i7 < i10) {
            if (sArr[i7] == s3) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(short[] sArr, short s3, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (sArr[i11] == s3) {
                return i11;
            }
        }
        return -1;
    }

    public static int indexOf(short[] sArr, short[] sArr2) {
        Preconditions.checkNotNull(sArr, "array");
        Preconditions.checkNotNull(sArr2, "target");
        if (sArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (sArr.length - sArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < sArr2.length; i10++) {
                if (sArr[i7 + i10] != sArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(short[] sArr, int i7, int i10) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i7, i10, sArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            short s3 = sArr[i7];
            sArr[i7] = sArr[i11];
            sArr[i11] = s3;
            i7++;
        }
    }

    public static void sortDescending(short[] sArr, int i7, int i10) {
        Preconditions.checkNotNull(sArr);
        Preconditions.checkPositionIndexes(i7, i10, sArr.length);
        Arrays.sort(sArr, i7, i10);
        reverse(sArr, i7, i10);
    }
}
