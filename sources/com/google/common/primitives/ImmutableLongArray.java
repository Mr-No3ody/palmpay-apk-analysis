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
public final class ImmutableLongArray implements Serializable {
    private static final ImmutableLongArray EMPTY = new ImmutableLongArray(new long[0]);
    private final long[] array;
    private final int end;
    private final transient int start;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private final ImmutableLongArray parent;

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
                if (obj2 instanceof Long) {
                    int i10 = i7 + 1;
                    if (this.parent.array[i7] == ((Long) obj2).longValue()) {
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
            if (obj instanceof Long) {
                return this.parent.indexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Long) {
                return this.parent.lastIndexOf(((Long) obj).longValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.parent.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i7, int i10) {
            return this.parent.subArray(i7, i10).asList();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return this.parent.toString();
        }

        private AsList(ImmutableLongArray immutableLongArray) {
            this.parent = immutableLongArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i7) {
            return Long.valueOf(this.parent.get(i7));
        }
    }

    public static Builder builder(int i7) {
        Preconditions.checkArgument(i7 >= 0, "Invalid initialCapacity: %s", i7);
        return new Builder(i7);
    }

    public static ImmutableLongArray copyOf(long[] jArr) {
        return jArr.length == 0 ? EMPTY : new ImmutableLongArray(Arrays.copyOf(jArr, jArr.length));
    }

    private boolean isPartialView() {
        return this.start > 0 || this.end < this.array.length;
    }

    public static ImmutableLongArray of() {
        return EMPTY;
    }

    public List<Long> asList() {
        return new AsList();
    }

    public boolean contains(long j6) {
        return indexOf(j6) >= 0;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableLongArray)) {
            return false;
        }
        ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
        if (length() != immutableLongArray.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length(); i7++) {
            if (get(i7) != immutableLongArray.get(i7)) {
                return false;
            }
        }
        return true;
    }

    public long get(int i7) {
        Preconditions.checkElementIndex(i7, length());
        return this.array[this.start + i7];
    }

    public int hashCode() {
        int iHashCode = 1;
        for (int i7 = this.start; i7 < this.end; i7++) {
            iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i7]);
        }
        return iHashCode;
    }

    public int indexOf(long j6) {
        for (int i7 = this.start; i7 < this.end; i7++) {
            if (this.array[i7] == j6) {
                return i7 - this.start;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.end == this.start;
    }

    public int lastIndexOf(long j6) {
        int i7;
        int i10 = this.end;
        do {
            i10--;
            i7 = this.start;
            if (i10 < i7) {
                return -1;
            }
        } while (this.array[i10] != j6);
        return i10 - i7;
    }

    public int length() {
        return this.end - this.start;
    }

    public Object readResolve() {
        return isEmpty() ? EMPTY : this;
    }

    public ImmutableLongArray subArray(int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i10, length());
        if (i7 == i10) {
            return EMPTY;
        }
        long[] jArr = this.array;
        int i11 = this.start;
        return new ImmutableLongArray(jArr, i7 + i11, i11 + i10);
    }

    public long[] toArray() {
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

    public ImmutableLongArray trimmed() {
        return isPartialView() ? new ImmutableLongArray(toArray()) : this;
    }

    public Object writeReplace() {
        return trimmed();
    }

    private ImmutableLongArray(long[] jArr) {
        this(jArr, 0, jArr.length);
    }

    public static ImmutableLongArray of(long j6) {
        return new ImmutableLongArray(new long[]{j6});
    }

    @CanIgnoreReturnValue
    public static final class Builder {
        private long[] array;
        private int count = 0;

        public Builder(int i7) {
            this.array = new long[i7];
        }

        private void ensureRoomFor(int i7) {
            int i10 = this.count + i7;
            long[] jArr = this.array;
            if (i10 > jArr.length) {
                this.array = Arrays.copyOf(jArr, expandedCapacity(jArr.length, i10));
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

        public Builder add(long j6) {
            ensureRoomFor(1);
            long[] jArr = this.array;
            int i7 = this.count;
            jArr[i7] = j6;
            this.count = i7 + 1;
            return this;
        }

        public Builder addAll(long[] jArr) {
            ensureRoomFor(jArr.length);
            System.arraycopy(jArr, 0, this.array, this.count, jArr.length);
            this.count += jArr.length;
            return this;
        }

        @CheckReturnValue
        public ImmutableLongArray build() {
            if (this.count == 0) {
                return ImmutableLongArray.EMPTY;
            }
            return new ImmutableLongArray(this.array, 0, this.count);
        }

        public Builder addAll(Iterable<Long> iterable) {
            if (iterable instanceof Collection) {
                return addAll((Collection<Long>) iterable);
            }
            Iterator<Long> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next().longValue());
            }
            return this;
        }

        public Builder addAll(Collection<Long> collection) {
            ensureRoomFor(collection.size());
            for (Long l5 : collection) {
                long[] jArr = this.array;
                int i7 = this.count;
                this.count = i7 + 1;
                jArr[i7] = l5.longValue();
            }
            return this;
        }

        public Builder addAll(ImmutableLongArray immutableLongArray) {
            ensureRoomFor(immutableLongArray.length());
            System.arraycopy(immutableLongArray.array, immutableLongArray.start, this.array, this.count, immutableLongArray.length());
            this.count = immutableLongArray.length() + this.count;
            return this;
        }
    }

    private ImmutableLongArray(long[] jArr, int i7, int i10) {
        this.array = jArr;
        this.start = i7;
        this.end = i10;
    }

    public static Builder builder() {
        return new Builder(10);
    }

    public static ImmutableLongArray of(long j6, long j10) {
        return new ImmutableLongArray(new long[]{j6, j10});
    }

    public static ImmutableLongArray copyOf(Collection<Long> collection) {
        return collection.isEmpty() ? EMPTY : new ImmutableLongArray(Longs.toArray(collection));
    }

    public static ImmutableLongArray of(long j6, long j10, long j11) {
        return new ImmutableLongArray(new long[]{j6, j10, j11});
    }

    public static ImmutableLongArray copyOf(Iterable<Long> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection<Long>) iterable);
        }
        return builder().addAll(iterable).build();
    }

    public static ImmutableLongArray of(long j6, long j10, long j11, long j12) {
        return new ImmutableLongArray(new long[]{j6, j10, j11, j12});
    }

    public static ImmutableLongArray of(long j6, long j10, long j11, long j12, long j13) {
        return new ImmutableLongArray(new long[]{j6, j10, j11, j12, j13});
    }

    public static ImmutableLongArray of(long j6, long j10, long j11, long j12, long j13, long j14) {
        return new ImmutableLongArray(new long[]{j6, j10, j11, j12, j13, j14});
    }

    public static ImmutableLongArray of(long j6, long... jArr) {
        Preconditions.checkArgument(jArr.length <= 2147483646, "the total number of elements must fit in an int");
        long[] jArr2 = new long[jArr.length + 1];
        jArr2[0] = j6;
        System.arraycopy(jArr, 0, jArr2, 1, jArr.length);
        return new ImmutableLongArray(jArr2);
    }
}
