package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Queues {
    private Queues() {
    }

    @Beta
    @GwtIncompatible
    @CanIgnoreReturnValue
    public static <E> int drain(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i7, long j6, TimeUnit timeUnit) throws InterruptedException {
        Preconditions.checkNotNull(collection);
        long nanos = timeUnit.toNanos(j6) + System.nanoTime();
        int iDrainTo = 0;
        while (iDrainTo < i7) {
            iDrainTo += blockingQueue.drainTo(collection, i7 - iDrainTo);
            if (iDrainTo < i7) {
                E ePoll = blockingQueue.poll(nanos - System.nanoTime(), TimeUnit.NANOSECONDS);
                if (ePoll == null) {
                    return iDrainTo;
                }
                collection.add(ePoll);
                iDrainTo++;
            }
        }
        return iDrainTo;
    }

    @CanIgnoreReturnValue
    @Beta
    @GwtIncompatible
    public static <E> int drainUninterruptibly(BlockingQueue<E> blockingQueue, Collection<? super E> collection, int i7, long j6, TimeUnit timeUnit) {
        E ePoll;
        Preconditions.checkNotNull(collection);
        long nanos = timeUnit.toNanos(j6) + System.nanoTime();
        int iDrainTo = 0;
        boolean z3 = false;
        while (iDrainTo < i7) {
            try {
                iDrainTo += blockingQueue.drainTo(collection, i7 - iDrainTo);
                if (iDrainTo < i7) {
                    while (true) {
                        try {
                            ePoll = blockingQueue.poll(nanos - System.nanoTime(), TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            z3 = true;
                        }
                    }
                    if (ePoll == null) {
                        break;
                    }
                    collection.add(ePoll);
                    iDrainTo++;
                }
            } finally {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return iDrainTo;
    }

    @GwtIncompatible
    public static <E> ArrayBlockingQueue<E> newArrayBlockingQueue(int i7) {
        return new ArrayBlockingQueue<>(i7);
    }

    public static <E> ArrayDeque<E> newArrayDeque() {
        return new ArrayDeque<>();
    }

    @GwtIncompatible
    public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue() {
        return new ConcurrentLinkedQueue<>();
    }

    @GwtIncompatible
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque() {
        return new LinkedBlockingDeque<>();
    }

    @GwtIncompatible
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue() {
        return new LinkedBlockingQueue<>();
    }

    @GwtIncompatible
    public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue() {
        return new PriorityBlockingQueue<>();
    }

    public static <E extends Comparable> PriorityQueue<E> newPriorityQueue() {
        return new PriorityQueue<>();
    }

    @GwtIncompatible
    public static <E> SynchronousQueue<E> newSynchronousQueue() {
        return new SynchronousQueue<>();
    }

    public static <E> Deque<E> synchronizedDeque(Deque<E> deque) {
        return Synchronized.deque(deque, null);
    }

    public static <E> Queue<E> synchronizedQueue(Queue<E> queue) {
        return Synchronized.queue(queue, null);
    }

    public static <E> ArrayDeque<E> newArrayDeque(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque<>((Collection) iterable);
        }
        ArrayDeque<E> arrayDeque = new ArrayDeque<>();
        Iterables.addAll(arrayDeque, iterable);
        return arrayDeque;
    }

    @GwtIncompatible
    public static <E> ConcurrentLinkedQueue<E> newConcurrentLinkedQueue(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue<>((Collection) iterable);
        }
        ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        Iterables.addAll(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    @GwtIncompatible
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int i7) {
        return new LinkedBlockingDeque<>(i7);
    }

    @GwtIncompatible
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(int i7) {
        return new LinkedBlockingQueue<>(i7);
    }

    @GwtIncompatible
    public static <E extends Comparable> PriorityBlockingQueue<E> newPriorityBlockingQueue(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue<>((Collection) iterable);
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = new PriorityBlockingQueue<>();
        Iterables.addAll(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static <E extends Comparable> PriorityQueue<E> newPriorityQueue(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue<>((Collection) iterable);
        }
        PriorityQueue<E> priorityQueue = new PriorityQueue<>();
        Iterables.addAll(priorityQueue, iterable);
        return priorityQueue;
    }

    @GwtIncompatible
    public static <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque<>((Collection) iterable);
        }
        LinkedBlockingDeque<E> linkedBlockingDeque = new LinkedBlockingDeque<>();
        Iterables.addAll(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    @GwtIncompatible
    public static <E> LinkedBlockingQueue<E> newLinkedBlockingQueue(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue<>((Collection) iterable);
        }
        LinkedBlockingQueue<E> linkedBlockingQueue = new LinkedBlockingQueue<>();
        Iterables.addAll(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }
}
