package com.google.protobuf;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final LongArrayList EMPTY_LIST = new LongArrayList(new long[0], 0, false);
    private long[] array;
    private int size;

    public LongArrayList() {
        this(new long[10], 0, true);
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int index) {
        StringBuilder sbE = F.e(index, "Index:", ", Size:");
        sbE.append(this.size);
        return sbE.toString();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i7 = longArrayList.size;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        long[] jArr = this.array;
        if (i11 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long element) {
        ensureIsMutable();
        int i7 = this.size;
        long[] jArr = this.array;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[u.c(i7, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        jArr3[i10] = element;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (!(o10 instanceof LongArrayList)) {
            return super.equals(o10);
        }
        LongArrayList longArrayList = (LongArrayList) o10;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i7 = 0; i7 < this.size; i7++) {
            if (this.array[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i7 = 0; i7 < this.size; i7++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.array[i7]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) element).longValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.array[i7] == jLongValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    public void removeRange(int fromIndex, int toIndex) {
        ensureIsMutable();
        if (toIndex < fromIndex) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.array;
        System.arraycopy(jArr, toIndex, jArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int index, long element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        long[] jArr = this.array;
        long j6 = jArr[index];
        jArr[index] = element;
        return j6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int index) {
        return Long.valueOf(getLong(index));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new LongArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        long[] jArr = this.array;
        long j6 = jArr[index];
        int i7 = this.size;
        if (index < i7 - 1) {
            System.arraycopy(jArr, index + 1, jArr, index, (i7 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int index, Long element) {
        return Long.valueOf(setLong(index, element.longValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long element) {
        addLong(element.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Long element) {
        addLong(index, element.longValue());
    }

    private void addLong(int index, long element) {
        int i7;
        ensureIsMutable();
        if (index >= 0 && index <= (i7 = this.size)) {
            long[] jArr = this.array;
            if (i7 < jArr.length) {
                System.arraycopy(jArr, index, jArr, index + 1, i7 - index);
            } else {
                long[] jArr2 = new long[u.c(i7, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, index);
                System.arraycopy(this.array, index, jArr2, index + 1, this.size - index);
                this.array = jArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
