package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {
    private int position;
    private final int size;

    public AbstractIndexedListIterator(int i7) {
        this(i7, 0);
    }

    @ParametricNullness
    public abstract E get(int i7);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.position < this.size;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.position > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.position;
        this.position = i7 + 1;
        return get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.position;
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.position - 1;
        this.position = i7;
        return get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.position - 1;
    }

    public AbstractIndexedListIterator(int i7, int i10) {
        Preconditions.checkPositionIndex(i10, i7);
        this.size = i7;
        this.position = i10;
    }
}
