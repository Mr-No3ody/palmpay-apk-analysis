package com.google.protobuf;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final IntArrayList EMPTY_LIST = new IntArrayList(new int[0], 0, false);
    private int[] array;
    private int size;

    public IntArrayList() {
        this(new int[10], 0, true);
    }

    public static IntArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i7 = intArrayList.size;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.array;
        if (i11 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int element) {
        ensureIsMutable();
        int i7 = this.size;
        int[] iArr = this.array;
        if (i7 == iArr.length) {
            int[] iArr2 = new int[u.c(i7, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i7);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        iArr3[i10] = element;
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
        if (!(o10 instanceof IntArrayList)) {
            return super.equals(o10);
        }
        IntArrayList intArrayList = (IntArrayList) o10;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i7 = 0; i7 < this.size; i7++) {
            if (this.array[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.size; i10++) {
            i7 = (i7 * 31) + this.array[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) element).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.array[i7] == iIntValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, toIndex, iArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int index, int element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i7 = iArr[index];
        iArr[index] = element;
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int index) {
        return Integer.valueOf(getInt(index));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new IntArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        int[] iArr = this.array;
        int i7 = iArr[index];
        int i10 = this.size;
        if (index < i10 - 1) {
            System.arraycopy(iArr, index + 1, iArr, index, (i10 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i7);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int index, Integer element) {
        return Integer.valueOf(setInt(index, element.intValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer element) {
        addInt(element.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Integer element) {
        addInt(index, element.intValue());
    }

    private void addInt(int index, int element) {
        int i7;
        ensureIsMutable();
        if (index >= 0 && index <= (i7 = this.size)) {
            int[] iArr = this.array;
            if (i7 < iArr.length) {
                System.arraycopy(iArr, index, iArr, index + 1, i7 - index);
            } else {
                int[] iArr2 = new int[u.c(i7, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, index);
                System.arraycopy(this.array, index, iArr2, index + 1, this.size - index);
                this.array = iArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
