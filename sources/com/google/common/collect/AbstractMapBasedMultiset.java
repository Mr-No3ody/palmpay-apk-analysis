package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.microsoft.codepush.react.CodePushConstants;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    transient ObjectCountHashMap<E> backingMap;
    transient long size;

    public abstract class Itr<T> implements Iterator<T> {
        int entryIndex;
        int expectedModCount;
        int toRemove = -1;

        public Itr() {
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.firstIndex();
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        private void checkForConcurrentModification() {
            if (AbstractMapBasedMultiset.this.backingMap.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkForConcurrentModification();
            return this.entryIndex >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tResult = result(this.entryIndex);
            int i7 = this.entryIndex;
            this.toRemove = i7;
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndex(i7);
            return tResult;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.toRemove != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.removeEntry(this.toRemove);
            this.entryIndex = AbstractMapBasedMultiset.this.backingMap.nextIndexAfterRemove(this.entryIndex, this.toRemove);
            this.toRemove = -1;
            this.expectedModCount = AbstractMapBasedMultiset.this.backingMap.modCount;
        }

        @ParametricNullness
        public abstract T result(int i7);
    }

    public AbstractMapBasedMultiset(int i7) {
        this.backingMap = newBackingMap(i7);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int count = Serialization.readCount(objectInputStream);
        this.backingMap = newBackingMap(3);
        Serialization.populateMultiset(this, objectInputStream, count);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e10, int i7) {
        if (i7 == 0) {
            return count(e10);
        }
        Preconditions.checkArgument(i7 > 0, "occurrences cannot be negative: %s", i7);
        int iIndexOf = this.backingMap.indexOf(e10);
        if (iIndexOf == -1) {
            this.backingMap.put(e10, i7);
            this.size += (long) i7;
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        long j6 = i7;
        long j10 = ((long) value) + j6;
        Preconditions.checkArgument(j10 <= 2147483647L, "too many occurrences: %s", j10);
        this.backingMap.setValue(iIndexOf, (int) j10);
        this.size += j6;
        return value;
    }

    public void addTo(Multiset<? super E> multiset) {
        Preconditions.checkNotNull(multiset);
        int iFirstIndex = this.backingMap.firstIndex();
        while (iFirstIndex >= 0) {
            multiset.add(this.backingMap.getKey(iFirstIndex), this.backingMap.getValue(iFirstIndex));
            iFirstIndex = this.backingMap.nextIndex(iFirstIndex);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.clear();
        this.size = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(@CheckForNull Object obj) {
        return this.backingMap.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final int distinctElements() {
        return this.backingMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<E> elementIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            @ParametricNullness
            public E result(int i7) {
                return AbstractMapBasedMultiset.this.backingMap.getKey(i7);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public final Iterator<Multiset.Entry<E>> entryIterator() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            public Multiset.Entry<E> result(int i7) {
                return AbstractMapBasedMultiset.this.backingMap.getEntry(i7);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public abstract ObjectCountHashMap<E> newBackingMap(int i7);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(@CheckForNull Object obj, int i7) {
        if (i7 == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i7 > 0, "occurrences cannot be negative: %s", i7);
        int iIndexOf = this.backingMap.indexOf(obj);
        if (iIndexOf == -1) {
            return 0;
        }
        int value = this.backingMap.getValue(iIndexOf);
        if (value > i7) {
            this.backingMap.setValue(iIndexOf, value - i7);
        } else {
            this.backingMap.removeEntry(iIndexOf);
            i7 = value;
        }
        this.size -= (long) i7;
        return value;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e10, int i7) {
        CollectPreconditions.checkNonnegative(i7, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY);
        ObjectCountHashMap<E> objectCountHashMap = this.backingMap;
        int iRemove = i7 == 0 ? objectCountHashMap.remove(e10) : objectCountHashMap.put(e10, i7);
        this.size += (long) (i7 - iRemove);
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e10, int i7, int i10) {
        CollectPreconditions.checkNonnegative(i7, "oldCount");
        CollectPreconditions.checkNonnegative(i10, "newCount");
        int iIndexOf = this.backingMap.indexOf(e10);
        if (iIndexOf == -1) {
            if (i7 != 0) {
                return false;
            }
            if (i10 > 0) {
                this.backingMap.put(e10, i10);
                this.size += (long) i10;
            }
            return true;
        }
        if (this.backingMap.getValue(iIndexOf) != i7) {
            return false;
        }
        if (i10 == 0) {
            this.backingMap.removeEntry(iIndexOf);
            this.size -= (long) i7;
        } else {
            this.backingMap.setValue(iIndexOf, i10);
            this.size += (long) (i10 - i7);
        }
        return true;
    }
}
