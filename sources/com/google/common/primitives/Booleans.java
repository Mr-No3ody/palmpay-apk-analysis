package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
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
public final class Booleans {

    @GwtCompatible
    public static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        public BooleanArrayAsList(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Boolean) && Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != booleanArrayAsList.array[booleanArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Booleans.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Boolean) || (iIndexOf = Booleans.indexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
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
            if (!(obj instanceof Boolean) || (iLastIndexOf = Booleans.lastIndexOf(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Boolean> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            boolean[] zArr = this.array;
            int i11 = this.start;
            return new BooleanArrayAsList(zArr, i7 + i11, i11 + i10);
        }

        public boolean[] toBooleanArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 7);
            sb2.append(this.array[this.start] ? "[true" : "[false");
            int i7 = this.start;
            while (true) {
                i7++;
                if (i7 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(this.array[i7] ? ", true" : ", false");
            }
        }

        public BooleanArrayAsList(boolean[] zArr, int i7, int i10) {
            this.array = zArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Boolean.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Boolean set(int i7, Boolean bool) {
            Preconditions.checkElementIndex(i7, size());
            boolean[] zArr = this.array;
            int i10 = this.start;
            boolean z3 = zArr[i10 + i7];
            zArr[i10 + i7] = ((Boolean) Preconditions.checkNotNull(bool)).booleanValue();
            return Boolean.valueOf(z3);
        }
    }

    public enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");

        private final String toString;
        private final int trueValue;

        BooleanComparator(int i7, String str) {
            this.trueValue = i7;
            this.toString = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.toString;
        }

        @Override // java.util.Comparator
        public int compare(Boolean bool, Boolean bool2) {
            return (bool2.booleanValue() ? this.trueValue : 0) - (bool.booleanValue() ? this.trueValue : 0);
        }
    }

    public enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int iMin = Math.min(zArr.length, zArr2.length);
            for (int i7 = 0; i7 < iMin; i7++) {
                int iCompare = Booleans.compare(zArr[i7], zArr2[i7]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private Booleans() {
    }

    public static List<Boolean> asList(boolean... zArr) {
        return zArr.length == 0 ? Collections.EMPTY_LIST : new BooleanArrayAsList(zArr);
    }

    public static int compare(boolean z3, boolean z8) {
        if (z3 == z8) {
            return 0;
        }
        return z3 ? 1 : -1;
    }

    public static boolean[] concat(boolean[]... zArr) {
        int length = 0;
        for (boolean[] zArr2 : zArr) {
            length += zArr2.length;
        }
        boolean[] zArr3 = new boolean[length];
        int length2 = 0;
        for (boolean[] zArr4 : zArr) {
            System.arraycopy(zArr4, 0, zArr3, length2, zArr4.length);
            length2 += zArr4.length;
        }
        return zArr3;
    }

    public static boolean contains(boolean[] zArr, boolean z3) {
        for (boolean z8 : zArr) {
            if (z8 == z3) {
                return true;
            }
        }
        return false;
    }

    @Beta
    public static int countTrue(boolean... zArr) {
        int i7 = 0;
        for (boolean z3 : zArr) {
            if (z3) {
                i7++;
            }
        }
        return i7;
    }

    public static boolean[] ensureCapacity(boolean[] zArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return zArr.length < i7 ? Arrays.copyOf(zArr, i7 + i10) : zArr;
    }

    @Beta
    public static Comparator<Boolean> falseFirst() {
        return BooleanComparator.FALSE_FIRST;
    }

    public static int hashCode(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int indexOf(boolean[] zArr, boolean z3) {
        return indexOf(zArr, z3, 0, zArr.length);
    }

    public static String join(String str, boolean... zArr) {
        Preconditions.checkNotNull(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(zArr.length * 7);
        sb2.append(zArr[0]);
        for (int i7 = 1; i7 < zArr.length; i7++) {
            sb2.append(str);
            sb2.append(zArr[i7]);
        }
        return sb2.toString();
    }

    public static int lastIndexOf(boolean[] zArr, boolean z3) {
        return lastIndexOf(zArr, z3, 0, zArr.length);
    }

    public static Comparator<boolean[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static void reverse(boolean[] zArr) {
        Preconditions.checkNotNull(zArr);
        reverse(zArr, 0, zArr.length);
    }

    public static boolean[] toArray(Collection<Boolean> collection) {
        if (collection instanceof BooleanArrayAsList) {
            return ((BooleanArrayAsList) collection).toBooleanArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i7 = 0; i7 < length; i7++) {
            zArr[i7] = ((Boolean) Preconditions.checkNotNull(array[i7])).booleanValue();
        }
        return zArr;
    }

    @Beta
    public static Comparator<Boolean> trueFirst() {
        return BooleanComparator.TRUE_FIRST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(boolean[] zArr, boolean z3, int i7, int i10) {
        while (i7 < i10) {
            if (zArr[i7] == z3) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(boolean[] zArr, boolean z3, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (zArr[i11] == z3) {
                return i11;
            }
        }
        return -1;
    }

    public static int indexOf(boolean[] zArr, boolean[] zArr2) {
        Preconditions.checkNotNull(zArr, "array");
        Preconditions.checkNotNull(zArr2, "target");
        if (zArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (zArr.length - zArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < zArr2.length; i10++) {
                if (zArr[i7 + i10] != zArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(boolean[] zArr, int i7, int i10) {
        Preconditions.checkNotNull(zArr);
        Preconditions.checkPositionIndexes(i7, i10, zArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            boolean z3 = zArr[i7];
            zArr[i7] = zArr[i11];
            zArr[i11] = z3;
            i7++;
        }
    }
}
