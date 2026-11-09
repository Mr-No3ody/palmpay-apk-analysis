package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    private final transient long[] cumulativeCounts;

    @VisibleForTesting
    final transient RegularImmutableSortedSet<E> elementSet;
    private final transient int length;
    private final transient int offset;
    private static final long[] ZERO_CUMULATIVE_COUNTS = {0};
    static final ImmutableSortedMultiset<Comparable> NATURAL_EMPTY_MULTISET = new RegularImmutableSortedMultiset(Ordering.natural());

    public RegularImmutableSortedMultiset(Comparator<? super E> comparator) {
        this.elementSet = ImmutableSortedSet.emptySet(comparator);
        this.cumulativeCounts = ZERO_CUMULATIVE_COUNTS;
        this.offset = 0;
        this.length = 0;
    }

    private int getCount(int i7) {
        long[] jArr = this.cumulativeCounts;
        int i10 = this.offset;
        return (int) (jArr[(i10 + i7) + 1] - jArr[i10 + i7]);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@CheckForNull Object obj) {
        int iIndexOf = this.elementSet.indexOf(obj);
        if (iIndexOf >= 0) {
            return getCount(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i7) {
        return Multisets.immutableEntry(this.elementSet.asList().get(i7), getCount(i7));
    }

    public ImmutableSortedMultiset<E> getSubMultiset(int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i10, this.length);
        if (i7 == i10) {
            return ImmutableSortedMultiset.emptyMultiset(comparator());
        }
        return (i7 == 0 && i10 == this.length) ? this : new RegularImmutableSortedMultiset(this.elementSet.getSubSet(i7, i10), this.cumulativeCounts, this.offset + i7, i10 - i7);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return this.offset > 0 || this.length < this.cumulativeCounts.length - 1;
    }

    @Override // com.google.common.collect.SortedMultiset
    @CheckForNull
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.cumulativeCounts;
        int i7 = this.offset;
        return Ints.saturatedCast(jArr[this.length + i7] - jArr[i7]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e10, BoundType boundType) {
        return getSubMultiset(0, this.elementSet.headIndex(e10, Preconditions.checkNotNull(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e10, BoundType boundType) {
        return getSubMultiset(this.elementSet.tailIndex(e10, Preconditions.checkNotNull(boundType) == BoundType.CLOSED), this.length);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.elementSet;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet<E> regularImmutableSortedSet, long[] jArr, int i7, int i10) {
        this.elementSet = regularImmutableSortedSet;
        this.cumulativeCounts = jArr;
        this.offset = i7;
        this.length = i10;
    }
}
