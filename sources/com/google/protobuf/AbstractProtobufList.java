package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractProtobufList<E> extends AbstractList<E> implements Internal.ProtobufList<E> {
    protected static final int DEFAULT_CAPACITY = 10;
    private boolean isMutable;

    public AbstractProtobufList() {
        this(true);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ensureIsMutable();
        return super.add(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c6) {
        ensureIsMutable();
        return super.addAll(c6);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        super.clear();
    }

    public void ensureIsMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o10) {
        if (o10 == this) {
            return true;
        }
        if (!(o10 instanceof List)) {
            return false;
        }
        if (!(o10 instanceof RandomAccess)) {
            return super.equals(o10);
        }
        List list = (List) o10;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!get(i7).equals(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i7 = 0; i7 < size; i7++) {
            iHashCode = (iHashCode * 31) + get(i7).hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    public boolean isModifiable() {
        return this.isMutable;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    public final void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i7) {
        ensureIsMutable();
        return (E) super.remove(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c6) {
        ensureIsMutable();
        return super.removeAll(c6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c6) {
        ensureIsMutable();
        return super.retainAll(c6);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i7, E e10) {
        ensureIsMutable();
        return (E) super.set(i7, e10);
    }

    public AbstractProtobufList(boolean isMutable) {
        this.isMutable = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        ensureIsMutable();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c6) {
        ensureIsMutable();
        return super.addAll(index, c6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o10) {
        ensureIsMutable();
        int iIndexOf = indexOf(o10);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
