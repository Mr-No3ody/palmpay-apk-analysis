package com.google.protobuf;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, PrimitiveNonBoxingCollection {
    private static final FloatArrayList EMPTY_LIST = new FloatArrayList(new float[0], 0, false);
    private float[] array;
    private int size;

    public FloatArrayList() {
        this(new float[10], 0, true);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i7 = floatArrayList.size;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.size;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        float[] fArr = this.array;
        if (i11 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float element) {
        ensureIsMutable();
        int i7 = this.size;
        float[] fArr = this.array;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[u.c(i7, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        fArr3[i10] = element;
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
        if (!(o10 instanceof FloatArrayList)) {
            return super.equals(o10);
        }
        FloatArrayList floatArrayList = (FloatArrayList) o10;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i7 = 0; i7 < this.size; i7++) {
            if (Float.floatToIntBits(this.array[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i7 = 0; i7 < this.size; i7++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.array[i7]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        if (!(element instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) element).floatValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.array[i7] == fFloatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, toIndex, fArr, fromIndex, this.size - toIndex);
        this.size -= toIndex - fromIndex;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int index, float element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f10 = fArr[index];
        fArr[index] = element;
        return f10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] other, int size, boolean isMutable) {
        super(isMutable);
        this.array = other;
        this.size = size;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int index) {
        return Float.valueOf(getFloat(index));
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new FloatArrayList(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        float[] fArr = this.array;
        float f10 = fArr[index];
        int i7 = this.size;
        if (index < i7 - 1) {
            System.arraycopy(fArr, index + 1, fArr, index, (i7 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int index, Float element) {
        return Float.valueOf(setFloat(index, element.floatValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float element) {
        addFloat(element.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, Float element) {
        addFloat(index, element.floatValue());
    }

    private void addFloat(int index, float element) {
        int i7;
        ensureIsMutable();
        if (index >= 0 && index <= (i7 = this.size)) {
            float[] fArr = this.array;
            if (i7 < fArr.length) {
                System.arraycopy(fArr, index, fArr, index + 1, i7 - index);
            } else {
                float[] fArr2 = new float[u.c(i7, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, index);
                System.arraycopy(this.array, index, fArr2, index + 1, this.size - index);
                this.array = fArr2;
            }
            this.array[index] = element;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(index));
    }
}
