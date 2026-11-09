package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37778a;

    public M(Observer observer) {
        this.f37778a = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        p001if.a.a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == p001if.a.f37585a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDisposed()) {
            return;
        }
        Observer observer = this.f37778a;
        observer.onNext(0L);
        lazySet(p001if.b.f37587a);
        observer.onComplete();
    }
}
