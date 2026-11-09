package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Lists {

    public static class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        public AbstractListWrapper(List<E> list) {
            this.backingList = (List) Preconditions.checkNotNull(list);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i7, @ParametricNullness E e10) {
            this.backingList.add(i7, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i7, Collection<? extends E> collection) {
            return this.backingList.addAll(i7, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return this.backingList.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i7) {
            return this.backingList.get(i7);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i7) {
            return this.backingList.remove(i7);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i7, @ParametricNullness E e10) {
            return this.backingList.set(i7, e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }
    }

    public static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        public CharSequenceAsList(CharSequence charSequence) {
            this.sequence = charSequence;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.sequence.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Character.valueOf(this.sequence.charAt(i7));
        }
    }

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        public OnePlusArrayList(@ParametricNullness E e10, E[] eArr) {
            this.first = e10;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return i7 == 0 ? this.first : this.rest[i7 - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 1);
        }
    }

    public static class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        public Partition(List<T> list, int i7) {
            this.list = list;
            this.size = i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.list.size(), this.size, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            int i10 = this.size;
            int i11 = i7 * i10;
            return this.list.subList(i11, Math.min(i10 + i11, this.list.size()));
        }
    }

    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        public RandomAccessListWrapper(List<E> list) {
            super(list);
        }
    }

    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        public RandomAccessPartition(List<T> list, int i7) {
            super(list, i7);
        }
    }

    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    public static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        public ReverseList(List<T> list) {
            this.forwardList = (List) Preconditions.checkNotNull(list);
        }

        private int reverseIndex(int i7) {
            int size = size();
            Preconditions.checkElementIndex(i7, size);
            return (size - 1) - i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int i7) {
            int size = size();
            Preconditions.checkPositionIndex(i7, size);
            return size - i7;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i7, @ParametricNullness T t) {
            this.forwardList.add(reversePosition(i7), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i7) {
            return this.forwardList.get(reverseIndex(i7));
        }

        public List<T> getForwardList() {
            return this.forwardList;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i7) {
            final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i7));
            return new ListIterator<T>() { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;

                @Override // java.util.ListIterator
                public void add(@ParametricNullness T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return ReverseList.this.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                @ParametricNullness
                public T previous() {
                    if (!hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(@ParametricNullness T t) {
                    Preconditions.checkState(this.canRemoveOrSet);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i7) {
            return this.forwardList.remove(reverseIndex(i7));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i7, int i10) {
            subList(i7, i10).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i7, @ParametricNullness T t) {
            return this.forwardList.set(reverseIndex(i7), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            return Lists.reverse(this.forwardList.subList(reversePosition(i10), reversePosition(i7)));
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // java.util.List
        public Character get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Character.valueOf(this.string.charAt(i7));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            return Lists.charactersOf(this.string.substring(i7, i10));
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i7) {
            return this.function.apply(this.fromList.get(i7));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i7) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i7)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f10) {
                    return TransformingRandomAccessList.this.function.apply(f10);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i7) {
            return this.function.apply(this.fromList.remove(i7));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.fromList.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i7) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i7)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                @ParametricNullness
                public T transform(@ParametricNullness F f10) {
                    return TransformingSequentialList.this.function.apply(f10);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        @ParametricNullness
        final E second;

        public TwoPlusArrayList(@ParametricNullness E e10, @ParametricNullness E e11, E[] eArr) {
            this.first = e10;
            this.second = e11;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i7) {
            if (i7 == 0) {
                return this.first;
            }
            if (i7 == 1) {
                return this.second;
            }
            Preconditions.checkElementIndex(i7, size());
            return this.rest[i7 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 2);
        }
    }

    private Lists() {
    }

    public static <E> boolean addAllImpl(List<E> list, int i7, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i7);
        Iterator<? extends E> it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z3 = true;
        }
        return z3;
    }

    public static <E> List<E> asList(@ParametricNullness E e10, E[] eArr) {
        return new OnePlusArrayList(e10, eArr);
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.create(list);
    }

    public static <T> List<T> cast(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    @VisibleForTesting
    public static int computeArrayListCapacity(int i7) {
        CollectPreconditions.checkNonnegative(i7, "arraySize");
        return Ints.saturatedCast(((long) i7) + 5 + ((long) (i7 / 10)));
    }

    public static boolean equalsImpl(List<?> list, @CheckForNull Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!Objects.equal(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCodeImpl(List<?> list) {
        Iterator<?> it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i7 = ~(~((i7 * 31) + (next == null ? 0 : next.hashCode())));
        }
        return i7;
    }

    public static int indexOfImpl(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int indexOfRandomAccess(List<?> list, @CheckForNull Object obj) {
        int size = list.size();
        int i7 = 0;
        if (obj == null) {
            while (i7 < size) {
                if (list.get(i7) == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        while (i7 < size) {
            if (obj.equals(list.get(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static int lastIndexOfImpl(List<?> list, @CheckForNull Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List<?> list, @CheckForNull Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ListIterator<E> listIteratorImpl(List<E> list, int i7) {
        return new AbstractListWrapper(list).listIterator(i7);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i7) {
        CollectPreconditions.checkNonnegative(i7, "initialArraySize");
        return new ArrayList<>(i7);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i7) {
        return new ArrayList<>(computeArrayListCapacity(i7));
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i7) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(i7 > 0);
        return list instanceof RandomAccess ? new RandomAccessPartition(list, i7) : new Partition(list, i7);
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).getForwardList();
        }
        return list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static <E> List<E> subListImpl(List<E> list, int i7, int i10) {
        return (list instanceof RandomAccess ? new RandomAccessListWrapper<E>(list) { // from class: com.google.common.collect.Lists.1
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i11) {
                return this.backingList.listIterator(i11);
            }
        } : new AbstractListWrapper<E>(list) { // from class: com.google.common.collect.Lists.2
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i11) {
                return this.backingList.listIterator(i11);
            }
        }).subList(i7, i10);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    public static <E> List<E> asList(@ParametricNullness E e10, @ParametricNullness E e11, E[] eArr) {
        return new TwoPlusArrayList(e10, e11, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    @Beta
    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(computeArrayListCapacity(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        Iterables.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        Iterators.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }
}
