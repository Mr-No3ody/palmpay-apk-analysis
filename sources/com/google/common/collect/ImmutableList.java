package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final UnmodifiableListIterator<Object> EMPTY_ITR = new Itr(RegularImmutableList.EMPTY, 0);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            addAll(builder.contents, builder.size);
            return this;
        }

        public Builder(int i7) {
            super(i7);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableList<E> build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.contents, this.size);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            super.add((Object) e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {
        private final ImmutableList<E> list;

        public Itr(ImmutableList<E> immutableList, int i7) {
            super(immutableList.size(), i7);
            this.list = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public E get(int i7) {
            return this.list.get(i7);
        }
    }

    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.forwardList = immutableList;
        }

        private int reverseIndex(int i7) {
            return (size() - 1) - i7;
        }

        private int reversePosition(int i7) {
            return size() - i7;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // java.util.List
        public E get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return this.forwardList.get(reverseIndex(i7));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iLastIndexOf = this.forwardList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return reverseIndex(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iIndexOf = this.forwardList.indexOf(obj);
            if (iIndexOf >= 0) {
                return reverseIndex(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.forwardList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            return this.forwardList.subList(reversePosition(i10), reversePosition(i7)).reverse();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }
    }

    public class SubList extends ImmutableList<E> {
        final transient int length;
        final transient int offset;

        public SubList(int i7, int i10) {
            this.offset = i7;
            this.length = i10;
        }

        @Override // java.util.List
        public E get(int i7) {
            Preconditions.checkElementIndex(i7, this.length);
            return ImmutableList.this.get(i7 + this.offset);
        }

        @Override // com.google.common.collect.ImmutableCollection
        @CheckForNull
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
            return super.listIterator(i7);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i11 = this.offset;
            return immutableList.subList(i7 + i11, i10 + i11);
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    @Beta
    public static <E> Builder<E> builderWithExpectedSize(int i7) {
        CollectPreconditions.checkNonnegative(i7, "expectedSize");
        return new Builder<>(i7);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(ObjectArrays.checkElementsNotNull(objArr));
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) RegularImmutableList.EMPTY;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) Iterables.toArray(iterable, new Comparable[0]);
        ObjectArrays.checkElementsNotNull(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i7, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i7, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i7) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i7 + i10] = get(i10);
        }
        return i7 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@CheckForNull Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = ~(~(get(i10).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.indexOfImpl(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.lastIndexOfImpl(this, obj);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i7) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i7, E e10) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> subListUnchecked(int i7, int i10) {
        return new SubList(i7, i10 - i7);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i7) {
        return i7 == 0 ? of() : new RegularImmutableList(objArr, i7);
    }

    public static <E> ImmutableList<E> of(E e10) {
        return construct(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i7, int i10) {
        Preconditions.checkPositionIndexes(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? of() : subListUnchecked(i7, i10);
    }

    public static <E> ImmutableList<E> of(E e10, E e11) {
        return construct(e10, e11);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12) {
        return construct(e10, e11, e12);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i7) {
        Preconditions.checkPositionIndex(i7, size());
        if (isEmpty()) {
            return (UnmodifiableListIterator<E>) EMPTY_ITR;
        }
        return new Itr(this, i7);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(collection.toArray());
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13) {
        return construct(e10, e11, e12, e13);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] array = Iterables.toArray(iterable);
        ObjectArrays.checkElementsNotNull(array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14) {
        return construct(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15) {
        return construct(e10, e11, e12, e13, e14, e15);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return construct(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return construct(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return construct(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return construct(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20) {
        return construct(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return construct((Object[]) eArr.clone());
    }
}
