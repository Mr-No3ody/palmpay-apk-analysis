package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;

    @VisibleForTesting
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    @Beta
    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> ordering() {
            return Ordering.from(this.comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.EMPTY_SET);
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i7) {
            Preconditions.checkArgument(i7 >= 0);
            this.expectedSize = i7;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i7) {
            Preconditions.checkArgument(i7 > 0);
            this.maximumSize = i7;
            return this;
        }

        private Builder(Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }
    }

    public class Heap {
        final Ordering<E> ordering;

        @Weak
        MinMaxPriorityQueue<E>.Heap otherHeap;

        public Heap(Ordering<E> ordering) {
            this.ordering = ordering;
        }

        private int getGrandparentIndex(int i7) {
            return getParentIndex(getParentIndex(i7));
        }

        private int getLeftChildIndex(int i7) {
            return (i7 * 2) + 1;
        }

        private int getParentIndex(int i7) {
            return (i7 - 1) / 2;
        }

        private int getRightChildIndex(int i7) {
            return (i7 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i7) {
            if (getLeftChildIndex(i7) < MinMaxPriorityQueue.this.size && compareElements(i7, getLeftChildIndex(i7)) > 0) {
                return false;
            }
            if (getRightChildIndex(i7) < MinMaxPriorityQueue.this.size && compareElements(i7, getRightChildIndex(i7)) > 0) {
                return false;
            }
            if (i7 <= 0 || compareElements(i7, getParentIndex(i7)) <= 0) {
                return i7 <= 2 || compareElements(getGrandparentIndex(i7), i7) <= 0;
            }
            return false;
        }

        public void bubbleUp(int i7, E e10) {
            Heap heap;
            int iCrossOverUp = crossOverUp(i7, e10);
            if (iCrossOverUp == i7) {
                iCrossOverUp = i7;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(iCrossOverUp, e10);
        }

        @CanIgnoreReturnValue
        public int bubbleUpAlternatingLevels(int i7, E e10) {
            while (i7 > 2) {
                int grandparentIndex = getGrandparentIndex(i7);
                Object objElementData = MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare((E) objElementData, e10) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.queue[i7] = objElementData;
                i7 = grandparentIndex;
            }
            MinMaxPriorityQueue.this.queue[i7] = e10;
            return i7;
        }

        public int compareElements(int i7, int i10) {
            return this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(i7), (E) MinMaxPriorityQueue.this.elementData(i10));
        }

        public int crossOver(int i7, E e10) {
            int iFindMinChild = findMinChild(i7);
            if (iFindMinChild <= 0 || this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(iFindMinChild), e10) >= 0) {
                return crossOverUp(i7, e10);
            }
            MinMaxPriorityQueue.this.queue[i7] = MinMaxPriorityQueue.this.elementData(iFindMinChild);
            MinMaxPriorityQueue.this.queue[iFindMinChild] = e10;
            return iFindMinChild;
        }

        public int crossOverUp(int i7, E e10) {
            int rightChildIndex;
            if (i7 == 0) {
                MinMaxPriorityQueue.this.queue[0] = e10;
                return 0;
            }
            int parentIndex = getParentIndex(i7);
            Object objElementData = MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData2 = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData2, (E) objElementData) < 0) {
                    parentIndex = rightChildIndex;
                    objElementData = objElementData2;
                }
            }
            if (this.ordering.compare((E) objElementData, e10) >= 0) {
                MinMaxPriorityQueue.this.queue[i7] = e10;
                return i7;
            }
            MinMaxPriorityQueue.this.queue[i7] = objElementData;
            MinMaxPriorityQueue.this.queue[parentIndex] = e10;
            return parentIndex;
        }

        public int fillHoleAt(int i7) {
            while (true) {
                int iFindMinGrandChild = findMinGrandChild(i7);
                if (iFindMinGrandChild <= 0) {
                    return i7;
                }
                MinMaxPriorityQueue.this.queue[i7] = MinMaxPriorityQueue.this.elementData(iFindMinGrandChild);
                i7 = iFindMinGrandChild;
            }
        }

        public int findMin(int i7, int i10) {
            if (i7 >= MinMaxPriorityQueue.this.size) {
                return -1;
            }
            Preconditions.checkState(i7 > 0);
            int iMin = Math.min(i7, MinMaxPriorityQueue.this.size - i10) + i10;
            for (int i11 = i7 + 1; i11 < iMin; i11++) {
                if (compareElements(i11, i7) < 0) {
                    i7 = i11;
                }
            }
            return i7;
        }

        public int findMinChild(int i7) {
            return findMin(getLeftChildIndex(i7), 2);
        }

        public int findMinGrandChild(int i7) {
            int leftChildIndex = getLeftChildIndex(i7);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        public int swapWithConceptuallyLastElement(E e10) {
            int rightChildIndex;
            int parentIndex = getParentIndex(MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData, e10) < 0) {
                    MinMaxPriorityQueue.this.queue[rightChildIndex] = e10;
                    MinMaxPriorityQueue.this.queue[MinMaxPriorityQueue.this.size] = objElementData;
                    return rightChildIndex;
                }
            }
            return MinMaxPriorityQueue.this.size;
        }

        @CheckForNull
        public MoveDesc<E> tryCrossOverAndBubbleUp(int i7, int i10, E e10) {
            int iCrossOver = crossOver(i10, e10);
            if (iCrossOver == i10) {
                return null;
            }
            Object objElementData = iCrossOver < i7 ? MinMaxPriorityQueue.this.elementData(i7) : MinMaxPriorityQueue.this.elementData(getParentIndex(i7));
            if (this.otherHeap.bubbleUpAlternatingLevels(iCrossOver, e10) < i7) {
                return new MoveDesc<>(e10, objElementData);
            }
            return null;
        }
    }

    public static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        public MoveDesc(E e10, E e11) {
            this.toTrickle = e10;
            this.replaced = e11;
        }
    }

    public class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;

        @CheckForNull
        private Queue<E> forgetMeNot;

        @CheckForNull
        private E lastFromForgetMeNot;
        private int nextCursor;

        @CheckForNull
        private List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = MinMaxPriorityQueue.this.modCount;
        }

        private void checkModCount() {
            if (MinMaxPriorityQueue.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e10) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e10) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i7) {
            if (this.nextCursor < i7) {
                if (this.skipMe != null) {
                    while (i7 < MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, MinMaxPriorityQueue.this.elementData(i7))) {
                        i7++;
                    }
                }
                this.nextCursor = i7;
            }
        }

        private boolean removeExact(Object obj) {
            for (int i7 = 0; i7 < MinMaxPriorityQueue.this.size; i7++) {
                if (MinMaxPriorityQueue.this.queue[i7] == obj) {
                    MinMaxPriorityQueue.this.removeAt(i7);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            return this.nextCursor < MinMaxPriorityQueue.this.size() || !((queue = this.forgetMeNot) == null || queue.isEmpty());
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size()) {
                int i7 = this.nextCursor;
                this.cursor = i7;
                this.canRemove = true;
                return (E) MinMaxPriorityQueue.this.elementData(i7);
            }
            if (this.forgetMeNot != null) {
                this.cursor = MinMaxPriorityQueue.this.size();
                E ePoll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = ePoll;
                if (ePoll != null) {
                    this.canRemove = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor >= MinMaxPriorityQueue.this.size()) {
                E e10 = this.lastFromForgetMeNot;
                Objects.requireNonNull(e10);
                Preconditions.checkState(removeExact(e10));
                this.lastFromForgetMeNot = null;
                return;
            }
            MoveDesc<E> moveDescRemoveAt = MinMaxPriorityQueue.this.removeAt(this.cursor);
            if (moveDescRemoveAt != null) {
                if (this.forgetMeNot == null || this.skipMe == null) {
                    this.forgetMeNot = new ArrayDeque();
                    this.skipMe = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.skipMe, moveDescRemoveAt.toTrickle)) {
                    this.forgetMeNot.add(moveDescRemoveAt.toTrickle);
                }
                if (!foundAndRemovedExactReference(this.forgetMeNot, moveDescRemoveAt.replaced)) {
                    this.skipMe.add(moveDescRemoveAt.replaced);
                }
            }
            this.cursor--;
            this.nextCursor--;
        }
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int i7, int i10) {
        return Math.min(i7 - 1, i10) + 1;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    public static Builder<Comparable> expectedSize(int i7) {
        return new Builder(Ordering.natural()).expectedSize(i7);
    }

    @CheckForNull
    private MoveDesc<E> fillHole(int i7, E e10) {
        MinMaxPriorityQueue<E>.Heap heapHeapForIndex = heapForIndex(i7);
        int iFillHoleAt = heapHeapForIndex.fillHoleAt(i7);
        int iBubbleUpAlternatingLevels = heapHeapForIndex.bubbleUpAlternatingLevels(iFillHoleAt, e10);
        if (iBubbleUpAlternatingLevels == iFillHoleAt) {
            return heapHeapForIndex.tryCrossOverAndBubbleUp(i7, iFillHoleAt, e10);
        }
        if (iBubbleUpAlternatingLevels < i7) {
            return new MoveDesc<>(e10, elementData(i7));
        }
        return null;
    }

    private int getMaxElementIndex() {
        int i7 = this.size;
        if (i7 != 1) {
            return (i7 == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.queue;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i7) {
        return isEvenLevel(i7) ? this.minHeap : this.maxHeap;
    }

    @VisibleForTesting
    public static int initialQueueSize(int i7, int i10, Iterable<?> iterable) {
        if (i7 == -1) {
            i7 = 11;
        }
        if (iterable instanceof Collection) {
            i7 = Math.max(i7, ((Collection) iterable).size());
        }
        return capAtMaximumSize(i7, i10);
    }

    @VisibleForTesting
    public static boolean isEvenLevel(int i7) {
        int i10 = ~(~(i7 + 1));
        Preconditions.checkState(i10 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i10) > (i10 & ODD_POWERS_OF_TWO);
    }

    public static Builder<Comparable> maximumSize(int i7) {
        return new Builder(Ordering.natural()).maximumSize(i7);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    private E removeAndGet(int i7) {
        E eElementData = elementData(i7);
        removeAt(i7);
        return eElementData;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e10) {
        offer(e10);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            offer(it.next());
            z3 = true;
        }
        return z3;
    }

    @VisibleForTesting
    public int capacity() {
        return this.queue.length;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i7 = 0; i7 < this.size; i7++) {
            this.queue[i7] = null;
        }
        this.size = 0;
    }

    public Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    public E elementData(int i7) {
        E e10 = (E) this.queue[i7];
        Objects.requireNonNull(e10);
        return e10;
    }

    @VisibleForTesting
    public boolean isIntact() {
        for (int i7 = 1; i7 < this.size; i7++) {
            if (!heapForIndex(i7).verifyIndex(i7)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e10) {
        Preconditions.checkNotNull(e10);
        this.modCount++;
        int i7 = this.size;
        this.size = i7 + 1;
        growIfNeeded();
        heapForIndex(i7).bubbleUp(i7, e10);
        return this.size <= this.maximumSize || pollLast() != e10;
    }

    @Override // java.util.Queue
    @CheckForNull
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    @CheckForNull
    public E peekFirst() {
        return peek();
    }

    @CheckForNull
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    @CheckForNull
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    @CheckForNull
    public MoveDesc<E> removeAt(int i7) {
        Preconditions.checkPositionIndex(i7, this.size);
        this.modCount++;
        int i10 = this.size - 1;
        this.size = i10;
        if (i10 == i7) {
            this.queue[i10] = null;
            return null;
        }
        E eElementData = elementData(i10);
        int iSwapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(eElementData);
        if (iSwapWithConceptuallyLastElement == i7) {
            this.queue[this.size] = null;
            return null;
        }
        E eElementData2 = elementData(this.size);
        this.queue[this.size] = null;
        MoveDesc<E> moveDescFillHole = fillHole(i7, eElementData2);
        if (iSwapWithConceptuallyLastElement < i7) {
            return moveDescFillHole == null ? new MoveDesc<>(eElementData, eElementData2) : new MoveDesc<>(eElementData, moveDescFillHole.replaced);
        }
        return moveDescFillHole;
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i7 = this.size;
        Object[] objArr = new Object[i7];
        System.arraycopy(this.queue, 0, objArr, 0, i7);
        return objArr;
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i7) {
        Ordering ordering = builder.ordering();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(ordering);
        this.minHeap = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((Builder) builder).maximumSize;
        this.queue = new Object[i7];
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }
}
