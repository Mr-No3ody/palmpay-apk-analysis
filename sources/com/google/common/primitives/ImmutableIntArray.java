package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableIntArray implements Serializable {
    private static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);
    private final int[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        private final ImmutableIntArray parent;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof AsList) {
                return this.parent.equals(((AsList) obj).parent);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (size() != list.size()) {
                return false;
            }
            int i7 = this.parent.start;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i10 = i7 + 1;
                    if (this.parent.array[i7] == ((Integer) obj2).intValue()) {
                        i7 = i10;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            return this.parent.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.parent.indexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                return this.parent.lastIndexOf(((Integer) obj).intValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i7, int i10) {
            return this.parent.subArray(i7, i10).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableIntArray immutableIntArray) {
            this.parent = immutableIntArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Integer get(int i7) {
            return Integer.valueOf(this.parent.get(i7));
        }
    }

    public static Builder builder(int i7) {
        Preconditions.checkArgument(i7 >= 0, "Invalid initialCapacity: %s", i7);
        return new Builder(i7);
    }

    public static ImmutableIntArray copyOf(int[] iArr) {
        return iArr.length == 0 ? EMPTY : new ImmutableIntArray(Arrays.copyOf(iArr, iArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableIntArray of() {
        return EMPTY;
    }

    public List<Integer> asList() {
        return new AsList();
    }

    public boolean contains(int i7) {
        return indexOf(i7) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length(); i7++) {
            if (get(i7) != immutableIntArray.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public int get(int i7) {
        Preconditions.checkElementIndex(i7, length());
        return this.array[this.start + i7];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i7 = this.start; i7 < this.end; i7++) {
            iHashCode = (iHashCode * 31) + Ints.hashCode(this.array[i7]);
        }
        return iHashCode;
    }

    public int indexOf(int i7) {
        for (int i10 = this.start; i10 < this.end; i10++) {
            if (this.array[i10] == i7) {
                return i10 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(int i7) {
        int i10;
        int i11 = this.end;
        do {
            i11--;
            i10 = this.start;
            if (i11 < i10) {
                return -1;
            }
        } while (this.array[i11] != i7);
        return i11 - i10;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableIntArray subArray(int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i10, length());
        if (i7 == i10) {
            return EMPTY;
        }
        int[] iArr = this.array;
        int i11 = this.start;
        return new ImmutableIntArray(iArr, i7 + i11, i11 + i10);
    }

    public int[] toArray() {
        return Arrays.copyOfRange(this.array, this.start, this.end);
    }

    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(length() * 5);
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

    public ImmutableIntArray trimmed() {
        return isPartialView() ? new ImmutableIntArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableIntArray(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static ImmutableIntArray copyOf(Collection<Integer> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableIntArray(Ints.toArray(collection));
    }

    public static ImmutableIntArray of(int i7) {
        return new ImmutableIntArray(new int[]{i7});
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private int[] array;
        private int count = 0;

        public Builder(int i7) {
            this.array = new int[i7];
        }

        private void ensureRoomFor(int i7) {
            int i10 = this.count + i7;
            int[] iArr = this.array;
            if (i10 > iArr.length) {
                this.array = Arrays.copyOf(iArr, expandedCapacity(iArr.length, i10));
            }
        }

        private static int expandedCapacity(int i7, int i10) {
            if (i10 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i7 + (i7 >> 1) + 1;
            if (iHighestOneBit < i10) {
                iHighestOneBit = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        public Builder add(int i7) {
            ensureRoomFor(1);
            int[] iArr = this.array;
            int i10 = this.count;
            iArr[i10] = i7;
            this.count = i10 + 1;
            return this;
        }

        public Builder addAll(int[] iArr) {
            ensureRoomFor(iArr.length);
            System.arraycopy(iArr, 0, this.array, this.count, iArr.length);
            this.count += iArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableIntArray build() {
            if (this.count == 0) {
                return ImmutableIntArray.EMPTY;
            }
            return new ImmutableIntArray(this.array, 0, this.count);
        }

        public Builder addAll(Iterable<Integer> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Integer>) iterable);
            }
            Iterator<Integer> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().intValue());
            }
            return this;
        }

        public Builder addAll(Collection<Integer> collection) {
            ensureRoomFor(collection.size());
            for (Integer num : collection) {
                int[] iArr = this.array;
                int i7 = this.count;
                this.count = i7 + 1;
                iArr[i7] = num.intValue();
            }
            return this;
        }

        public Builder addAll(ImmutableIntArray immutableIntArray) {
            ensureRoomFor(immutableIntArray.length());
            System.arraycopy(immutableIntArray.array, immutableIntArray.start, this.array, this.count, immutableIntArray.length());
            this.count = immutableIntArray.length() + this.count;
            return this;
        }
    }

    private ImmutableIntArray(int[] iArr, int i7, int i10) {
        this.array = iArr;
        this.start = i7;
        this.end = i10;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableIntArray copyOf(Iterable<Integer> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Integer>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableIntArray of(int i7, int i10) {
        return new ImmutableIntArray(new int[]{i7, i10});
    }

    public static ImmutableIntArray of(int i7, int i10, int i11) {
        return new ImmutableIntArray(new int[]{i7, i10, i11});
    }

    public static ImmutableIntArray of(int i7, int i10, int i11, int i12) {
        return new ImmutableIntArray(new int[]{i7, i10, i11, i12});
    }

    public static ImmutableIntArray of(int i7, int i10, int i11, int i12, int i13) {
        return new ImmutableIntArray(new int[]{i7, i10, i11, i12, i13});
    }

    public static ImmutableIntArray of(int i7, int i10, int i11, int i12, int i13, int i14) {
        return new ImmutableIntArray(new int[]{i7, i10, i11, i12, i13, i14});
    }

    public static ImmutableIntArray of(int i7, int... iArr) {
        Preconditions.checkArgument(iArr.length <= 2147483646, "the total number of elements must fit in an int");
        int[] iArr2 = new int[iArr.length + 1];
        iArr2[0] = i7;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new ImmutableIntArray(iArr2);
    }
}
