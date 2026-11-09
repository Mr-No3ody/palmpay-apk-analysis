package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.DoNotCall;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    final DiscreteDomain<C> domain;

    public ContiguousSet(DiscreteDomain<C> discreteDomain) {
        super(Ordering.natural());
        this.domain = discreteDomain;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @Beta
    public static ContiguousSet<Integer> closed(int i7, int i10) {
        return create(Range.closed(Integer.valueOf(i7), Integer.valueOf(i10)), DiscreteDomain.integers());
    }

    @Beta
    public static ContiguousSet<Integer> closedOpen(int i7, int i10) {
        return create(Range.closedOpen(Integer.valueOf(i7), Integer.valueOf(i10)), DiscreteDomain.integers());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(range);
        Preconditions.checkNotNull(discreteDomain);
        try {
            Range<C> rangeIntersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(discreteDomain.minValue())) : range;
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableLeastValueAbove = range.lowerBound.leastValueAbove(discreteDomain);
                Objects.requireNonNull(comparableLeastValueAbove);
                Comparable comparableGreatestValueBelow = range.upperBound.greatestValueBelow(discreteDomain);
                Objects.requireNonNull(comparableGreatestValueBelow);
                if (Range.compareOrThrow(comparableLeastValueAbove, comparableGreatestValueBelow) <= 0) {
                    return new RegularContiguousSet(rangeIntersection, discreteDomain);
                }
            }
            return new EmptyContiguousSet(discreteDomain);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public ImmutableSortedSet<C> createDescendingSet() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> headSetImpl(C c6, boolean z3);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> subSetImpl(C c6, boolean z3, C c10, boolean z8);

    @Override // com.google.common.collect.ImmutableSortedSet
    public abstract ContiguousSet<C> tailSetImpl(C c6, boolean z3);

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Beta
    public static ContiguousSet<Long> closed(long j6, long j10) {
        return create(Range.closed(Long.valueOf(j6), Long.valueOf(j10)), DiscreteDomain.longs());
    }

    @Beta
    public static ContiguousSet<Long> closedOpen(long j6, long j10) {
        return create(Range.closedOpen(Long.valueOf(j6), Long.valueOf(j10)), DiscreteDomain.longs());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c6) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c6), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c6, C c10) {
        Preconditions.checkNotNull(c6);
        Preconditions.checkNotNull(c10);
        Preconditions.checkArgument(comparator().compare(c6, c10) <= 0);
        return subSetImpl((Comparable) c6, true, (Comparable) c10, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c6) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c6), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> headSet(C c6, boolean z3) {
        return headSetImpl((Comparable) Preconditions.checkNotNull(c6), z3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> tailSet(C c6, boolean z3) {
        return tailSetImpl((Comparable) Preconditions.checkNotNull(c6), z3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> subSet(C c6, boolean z3, C c10, boolean z8) {
        Preconditions.checkNotNull(c6);
        Preconditions.checkNotNull(c10);
        Preconditions.checkArgument(comparator().compare(c6, c10) <= 0);
        return subSetImpl((Comparable) c6, z3, (Comparable) c10, z8);
    }
}
