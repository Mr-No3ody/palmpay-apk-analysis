package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public int copyIntoArray(Object[] objArr, int i7) {
        return asList().copyIntoArray(objArr, i7);
    }

    @Override // com.google.common.collect.ImmutableSet
    public ImmutableList<E> createAsList() {
        return new ImmutableList<E>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public E get(int i7) {
                return (E) IndexedImmutableSet.this.get(i7);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public boolean isPartialView() {
                return IndexedImmutableSet.this.isPartialView();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    public abstract E get(int i7);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}
