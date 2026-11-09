package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.internal.fuseable.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends AtomicInteger implements QueueDisposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37760b;

    public E(Observer observer, Object obj) {
        this.f37759a = observer;
        this.f37760b = obj;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(3);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        set(3);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == 3;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f37760b;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        if ((i7 & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Observer observer = this.f37759a;
            observer.onNext(this.f37760b);
            if (get() == 2) {
                lazySet(3);
                observer.onComplete();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
