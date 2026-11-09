package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient ImmutableSortedMultiset<E> forward;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.forward = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        return this.forward.count(obj);
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> firstEntry() {
        return this.forward.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i7) {
        return this.forward.entrySet().asList().reverse().get(i7);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.forward.isPartialView();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> lastEntry() {
        return this.forward.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.forward.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.forward;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e10, BoundType boundType) {
        return this.forward.tailMultiset((Object) e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e10, BoundType boundType) {
        return this.forward.headMultiset((Object) e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.forward.elementSet().descendingSet();
    }
}
