package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
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
public final class Chars {
    public static final int BYTES = 2;

    @GwtCompatible
    public static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        public CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Character) && Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != charArrayAsList.array[charArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Chars.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Character) || (iIndexOf = Chars.indexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Character) || (iLastIndexOf = Chars.lastIndexOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            char[] cArr = this.array;
            int i11 = this.start;
            return new CharArrayAsList(cArr, i7 + i11, i11 + i10);
        }

        public char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 3);
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

        public CharArrayAsList(char[] cArr, int i7, int i10) {
            this.array = cArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Character.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i7, Character ch2) {
            Preconditions.checkElementIndex(i7, size());
            char[] cArr = this.array;
            int i10 = this.start;
            char c6 = cArr[i10 + i7];
            cArr[i10 + i7] = ((Character) Preconditions.checkNotNull(ch2)).charValue();
            return Character.valueOf(c6);
        }
    }

    public enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int iMin = Math.min(cArr.length, cArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Chars.compare(cArr[i7], cArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private Chars() {
    }

    public static List<Character> asList(char... cArr) {
        return cArr.length == 0 ? Collections.EMPTY_LIST : new CharArrayAsList(cArr);
    }

    public static char checkedCast(long j6) {
        char c6 = (char) j6;
        Preconditions.checkArgument(((long) c6) == j6, "Out of range: %s", j6);
        return c6;
    }

    public static int compare(char c6, char c10) {
        return c6 - c10;
    }

    public static char[] concat(char[]... cArr) {
        int length = 0;
        for (char[] cArr2 : cArr) {
            length += cArr2.length;
        }
        char[] cArr3 = new char[length];
        int length2 = 0;
        for (char[] cArr4 : cArr) {
            System.arraycopy(cArr4, 0, cArr3, length2, cArr4.length);
            length2 += cArr4.length;
        }
        return cArr3;
    }

    @Beta
    public static char constrainToRange(char c6, char c10, char c11) {
        Preconditions.checkArgument(c10 <= c11, "min (%s) must be less than or equal to max (%s)", c10, c11);
        if (c6 < c10) {
            return c10;
        }
        return c6 < c11 ? c6 : c11;
    }

    public static boolean contains(char[] cArr, char c6) {
        for (char c10 : cArr) {
            if (c10 == c6) {
                return true;
            }
        }
        return false;
    }

    public static char[] ensureCapacity(char[] cArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return cArr.length < i7 ? Arrays.copyOf(cArr, i7 + i10) : cArr;
    }

    @GwtIncompatible
    public static char fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 2, "array too small: %s < %s", bArr.length, 2);
        return fromBytes(bArr[0], bArr[1]);
    }

    @GwtIncompatible
    public static char fromBytes(byte b7, byte b10) {
        return (char) ((b7 << 8) | (b10 & UnsignedBytes.MAX_VALUE));
    }

    public static int hashCode(char c6) {
        return c6;
    }

    public static int indexOf(char[] cArr, char c6) {
        return indexOf(cArr, c6, 0, cArr.length);
    }

    public static String join(String str, char... cArr) {
        Preconditions.checkNotNull(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(((length - 1) * str.length()) + length);
        sb2.append(cArr[0]);
        for (int i7 = 1; i7 < length; i7++) {
            sb2.append(str);
            sb2.append(cArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(char[] cArr, char c6) {
        return lastIndexOf(cArr, c6, 0, cArr.length);
    }

    public static Comparator<char[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static char max(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c6 = cArr[0];
        for (int i7 = 1; i7 < cArr.length; i7++) {
            char c10 = cArr[i7];
            if (c10 > c6) {
                c6 = c10;
            }
        }
        return c6;
    }

    public static char min(char... cArr) {
        Preconditions.checkArgument(cArr.length > 0);
        char c6 = cArr[0];
        for (int i7 = 1; i7 < cArr.length; i7++) {
            char c10 = cArr[i7];
            if (c10 < c6) {
                c6 = c10;
            }
        }
        return c6;
    }

    public static void reverse(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        reverse(cArr, 0, cArr.length);
    }

    public static char saturatedCast(long j6) {
        if (j6 > 65535) {
            return (char) 65535;
        }
        if (j6 < 0) {
            return (char) 0;
        }
        return (char) j6;
    }

    public static void sortDescending(char[] cArr) {
        Preconditions.checkNotNull(cArr);
        sortDescending(cArr, 0, cArr.length);
    }

    public static char[] toArray(Collection<Character> collection) {
        if (collection instanceof CharArrayAsList) {
            return ((CharArrayAsList) collection).toCharArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            cArr[i7] = ((Character) Preconditions.checkNotNull(array[i7])).charValue();
        }
        return cArr;
    }

    @GwtIncompatible
    public static byte[] toByteArray(char c6) {
        return new byte[]{(byte) (c6 >> '\b'), (byte) c6};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(char[] cArr, char c6, int i7, int i10) {
        while (i7 < i10) {
            if (cArr[i7] == c6) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(char[] cArr, char c6, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (cArr[i11] == c6) {
                return i11;
            }
        }
        return -1;
    }

    public static int indexOf(char[] cArr, char[] cArr2) {
        Preconditions.checkNotNull(cArr, "array");
        Preconditions.checkNotNull(cArr2, "target");
        if (cArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (cArr.length - cArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < cArr2.length; i10++) {
                if (cArr[i7 + i10] != cArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(char[] cArr, int i7, int i10) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i7, i10, cArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            char c6 = cArr[i7];
            cArr[i7] = cArr[i11];
            cArr[i11] = c6;
            i7++;
        }
    }

    public static void sortDescending(char[] cArr, int i7, int i10) {
        Preconditions.checkNotNull(cArr);
        Preconditions.checkPositionIndexes(i7, i10, cArr.length);
        Arrays.sort(cArr, i7, i10);
        reverse(cArr, i7, i10);
    }
}
