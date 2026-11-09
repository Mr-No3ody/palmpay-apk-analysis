package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37886c = 0;

    public z(Observer observer, long j6) {
        this.f37884a = observer;
        this.f37885b = j6;
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
        long j6 = this.f37886c;
        Long lValueOf = Long.valueOf(j6);
        Observer observer = this.f37884a;
        observer.onNext(lValueOf);
        if (j6 != this.f37885b) {
            this.f37886c = j6 + 1;
        } else {
            p001if.a.a(this);
            observer.onComplete();
        }
    }
}
