package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
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
public final class Ints extends IntsMethodsForWeb {
    public static final int BYTES = 4;
    public static final int MAX_POWER_OF_TWO = 1073741824;

    @GwtCompatible
    public static class IntArrayAsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final int[] array;
        final int end;
        final int start;

        public IntArrayAsList(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IntArrayAsList)) {
                return super.equals(obj);
            }
            IntArrayAsList intArrayAsList = (IntArrayAsList) obj;
            int size = size();
            if (intArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != intArrayAsList.array[intArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Integer) || (iIndexOf = Ints.indexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Integer) || (iLastIndexOf = Ints.lastIndexOf(this.array, ((Integer) obj).intValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i11 = this.start;
            return new IntArrayAsList(iArr, i7 + i11, i11 + i10);
        }

        public int[] toIntArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
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

        public IntArrayAsList(int[] iArr, int i7, int i10) {
            this.array = iArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Integer.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer set(int i7, Integer num) {
            Preconditions.checkElementIndex(i7, size());
            int[] iArr = this.array;
            int i10 = this.start;
            int i11 = iArr[i10 + i7];
            iArr[i10 + i7] = ((Integer) Preconditions.checkNotNull(num)).intValue();
            return Integer.valueOf(i11);
        }
    }

    public static final class IntConverter extends Converter<String, Integer> implements Serializable {
        static final IntConverter INSTANCE = new IntConverter();
        private static final long serialVersionUID = 1;

        private IntConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Ints.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Integer num) {
            return num.toString();
        }

        @Override // com.google.common.base.Converter
        public Integer doForward(String str) {
            return Integer.decode(str);
        }
    }

    public enum LexicographicalComparator implements Comparator<int[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Ints.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(int[] iArr, int[] iArr2) {
            int iMin = Math.min(iArr.length, iArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Ints.compare(iArr[i7], iArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private Ints() {
    }

    public static List<Integer> asList(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new IntArrayAsList(iArr);
    }

    public static int checkedCast(long j6) {
        int i7 = (int) j6;
        Preconditions.checkArgument(((long) i7) == j6, "Out of range: %s", j6);
        return i7;
    }

    public static int compare(int i7, int i10) {
        if (i7 < i10) {
            return -1;
        }
        return i7 > i10 ? 1 : 0;
    }

    public static int[] concat(int[]... iArr) {
        int length = 0;
        for (int[] iArr2 : iArr) {
            length += iArr2.length;
        }
        int[] iArr3 = new int[length];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return iArr3;
    }

    @Beta
    public static int constrainToRange(int i7, int i10, int i11) {
        Preconditions.checkArgument(i10 <= i11, "min (%s) must be less than or equal to max (%s)", i10, i11);
        return Math.min(Math.max(i7, i10), i11);
    }

    public static boolean contains(int[] iArr, int i7) {
        for (int i10 : iArr) {
            if (i10 == i7) {
                return true;
            }
        }
        return false;
    }

    public static int[] ensureCapacity(int[] iArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return iArr.length < i7 ? Arrays.copyOf(iArr, i7 + i10) : iArr;
    }

    public static int fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int fromBytes(byte b7, byte b10, byte b11, byte b12) {
        return (b7 << Ascii.CAN) | ((b10 & UnsignedBytes.MAX_VALUE) << 16) | ((b11 & UnsignedBytes.MAX_VALUE) << 8) | (b12 & UnsignedBytes.MAX_VALUE);
    }

    public static int hashCode(int i7) {
        return i7;
    }

    public static int indexOf(int[] iArr, int i7) {
        return indexOf(iArr, i7, 0, iArr.length);
    }

    public static String join(String str, int... iArr) {
        Preconditions.checkNotNull(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(iArr.length * 5);
        sb2.append(iArr[0]);
        for (int i7 = 1; i7 < iArr.length; i7++) {
            sb2.append(str);
            sb2.append(iArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(int[] iArr, int i7) {
        return lastIndexOf(iArr, i7, 0, iArr.length);
    }

    public static Comparator<int[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int max(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i7 = iArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 > i7) {
                i7 = i11;
            }
        }
        return i7;
    }

    @GwtIncompatible("Available in GWT! Annotation is to avoid conflict with GWT specialization of base class.")
    public static int min(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        int i7 = iArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < i7) {
                i7 = i11;
            }
        }
        return i7;
    }

    public static void reverse(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        reverse(iArr, 0, iArr.length);
    }

    public static int saturatedCast(long j6) {
        if (j6 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j6 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j6;
    }

    public static void sortDescending(int[] iArr) {
        Preconditions.checkNotNull(iArr);
        sortDescending(iArr, 0, iArr.length);
    }

    @Beta
    public static Converter<String, Integer> stringConverter() {
        return IntConverter.INSTANCE;
    }

    public static int[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof IntArrayAsList) {
            return ((IntArrayAsList) collection).toIntArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            iArr[i7] = ((Number) Preconditions.checkNotNull(array[i7])).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(int i7) {
        return new byte[]{(byte) (i7 >> 24), (byte) (i7 >> 16), (byte) (i7 >> 8), (byte) i7};
    }

    @Beta
    @CheckForNull
    public static Integer tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(int[] iArr, int i7, int i10, int i11) {
        while (i10 < i11) {
            if (iArr[i10] == i7) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(int[] iArr, int i7, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            if (iArr[i12] == i7) {
                return i12;
            }
        }
        return -1;
    }

    @Beta
    @CheckForNull
    public static Integer tryParse(String str, int i7) {
        Long lTryParse = Longs.tryParse(str, i7);
        if (lTryParse == null || lTryParse.longValue() != lTryParse.intValue()) {
            return null;
        }
        return Integer.valueOf(lTryParse.intValue());
    }

    public static int indexOf(int[] iArr, int[] iArr2) {
        Preconditions.checkNotNull(iArr, "array");
        Preconditions.checkNotNull(iArr2, "target");
        if (iArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (iArr.length - iArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < iArr2.length; i10++) {
                if (iArr[i7 + i10] != iArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(int[] iArr, int i7, int i10) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i7, i10, iArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            int i12 = iArr[i7];
            iArr[i7] = iArr[i11];
            iArr[i11] = i12;
            i7++;
        }
    }

    public static void sortDescending(int[] iArr, int i7, int i10) {
        Preconditions.checkNotNull(iArr);
        Preconditions.checkPositionIndexes(i7, i10, iArr.length);
        Arrays.sort(iArr, i7, i10);
        reverse(iArr, i7, i10);
    }
}
