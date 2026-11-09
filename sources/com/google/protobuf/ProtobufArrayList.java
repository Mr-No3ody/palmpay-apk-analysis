package com.google.protobuf;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class ProtobufArrayList<E> extends AbstractProtobufList<E> implements RandomAccess {
    private static final ProtobufArrayList<Object> EMPTY_LIST = new ProtobufArrayList<>(new Object[0], 0, false);
    private E[] array;
    private int size;

    public ProtobufArrayList() {
        this(new Object[10], 0, true);
    }

    private static <E> E[] createArray(int i7) {
        return (E[]) new Object[i7];
    }

    public static <E> ProtobufArrayList<E> emptyList() {
        return (ProtobufArrayList<E>) EMPTY_LIST;
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

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ensureIsMutable();
        int i7 = this.size;
        E[] eArr = this.array;
        if (i7 == eArr.length) {
            this.array = (E[]) Arrays.copyOf(eArr, ((i7 * 3) / 2) + 1);
        }
        E[] eArr2 = this.array;
        int i10 = this.size;
        this.size = i10 + 1;
        eArr2[i10] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        ensureIndexInRange(index);
        return this.array[index];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E remove(int index) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e10 = eArr[index];
        int i7 = this.size;
        if (index < i7 - 1) {
            System.arraycopy(eArr, index + 1, eArr, index, (i7 - index) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        ensureIsMutable();
        ensureIndexInRange(index);
        E[] eArr = this.array;
        E e10 = eArr[index];
        eArr[index] = element;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private ProtobufArrayList(E[] array, int size, boolean isMutable) {
        super(isMutable);
        this.array = array;
        this.size = size;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public ProtobufArrayList<E> mutableCopyWithCapacity2(int capacity) {
        if (capacity >= this.size) {
            return new ProtobufArrayList<>(Arrays.copyOf(this.array, capacity), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i7, E e10) {
        int i10;
        ensureIsMutable();
        if (i7 >= 0 && i7 <= (i10 = this.size)) {
            E[] eArr = this.array;
            if (i10 < eArr.length) {
                System.arraycopy(eArr, i7, eArr, i7 + 1, i10 - i7);
            } else {
                E[] eArr2 = (E[]) createArray(u.c(i10, 3, 2, 1));
                System.arraycopy(this.array, 0, eArr2, 0, i7);
                System.arraycopy(this.array, i7, eArr2, i7 + 1, this.size - i7);
                this.array = eArr2;
            }
            this.array[i7] = e10;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i7));
    }
}
