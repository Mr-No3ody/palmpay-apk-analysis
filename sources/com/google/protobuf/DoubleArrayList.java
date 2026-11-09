package com.google.protobuf;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class DoubleArrayList extends AbstractProtobufList<Double> implements Internal.DoubleList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final DoubleArrayList EMPTY_LIST = new DoubleArrayList(new double[0], 0, false);
    private double[] array;
    private int size;

    public DoubleArrayList() {
        this(new double[10], 0, true);
    }

    public static DoubleArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Double> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof DoubleArrayList)) {
            return super.addAll(collection);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) collection;
        int i7 = doubleArrayList.size;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        double[] dArr = this.array;
        if (i11 > dArr.length) {
            this.array = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(doubleArrayList.array, 0, this.array, this.size, doubleArrayList.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double element) {
        ensureIsMutable();
        int i7 = this.size;
        double[] dArr = this.array;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[u.c(i7, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.array = dArr2;
        }
        double[] dArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        dArr3[i10] = element;
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
        if (!(o10 instanceof DoubleArrayList)) {
            return super.equals(o10);
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) o10;
        if (this.size != doubleArrayList.size) {
            return false;
        }
        double[] dArr = doubleArrayList.array;
        for (int i7 = 0; i7 < this.size; i7++) {
            if (Double.doubleToLongBits(this.array[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i7 = 0; i7 < this.size; i7++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.array[i7]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) element).doubleValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.array[i7] == dDoubleValue) {
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
        double[] dArr = this.array;
        System.arraycopy(dArr, toIndex, dArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int index, double element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d2 = dArr[index];
        dArr[index] = element;
        return d2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private DoubleArrayList(double[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Double get(int index) {
        return Double.valueOf(getDouble(index));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new DoubleArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        double[] dArr = this.array;
        double d2 = dArr[index];
        int i7 = this.size;
        if (index < i7 - 1) {
            System.arraycopy(dArr, index + 1, dArr, index, (i7 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Double set(int index, Double element) {
        return Double.valueOf(setDouble(index, element.doubleValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Double element) {
        addDouble(element.doubleValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Double element) {
        addDouble(index, element.doubleValue());
    }

    private void addDouble(int index, double element) {
        int i7;
        ensureIsMutable();
        if (index >= 0 && index <= (i7 = this.size)) {
            double[] dArr = this.array;
            if (i7 < dArr.length) {
                System.arraycopy(dArr, index, dArr, index + 1, i7 - index);
            } else {
                double[] dArr2 = new double[u.c(i7, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, index);
                System.arraycopy(this.array, index, dArr2, index + 1, this.size - index);
                this.array = dArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
