package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
@Deprecated
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingDeque<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return delegate().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offer(e10, j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e10, long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offerFirst(e10, j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e10, long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offerLast(e10, j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    @CheckForNull
    public E poll(long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().poll(j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollFirst(long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().pollFirst(j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    @CheckForNull
    public E pollLast(long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().pollLast(j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        delegate().put(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e10) throws InterruptedException {
        delegate().putFirst(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e10) throws InterruptedException {
        delegate().putLast(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return delegate().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return delegate().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i7) {
        return delegate().drainTo(collection, i7);
    }
}
