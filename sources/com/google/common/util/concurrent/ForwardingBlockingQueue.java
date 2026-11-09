package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingQueue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@CanIgnoreReturnValue
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract BlockingQueue<E> delegate();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i7) {
        return delegate().drainTo(collection, i7);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().offer(e10, j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CheckForNull
    public E poll(long j6, TimeUnit timeUnit) throws InterruptedException {
        return delegate().poll(j6, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        delegate().put(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return delegate().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return delegate().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return delegate().drainTo(collection);
    }
}
