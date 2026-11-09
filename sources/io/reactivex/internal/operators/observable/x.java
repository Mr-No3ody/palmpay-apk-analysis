package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37879b;

    public x(Observer observer) {
        this.f37878a = observer;
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
        if (get() != p001if.a.f37585a) {
            long j6 = this.f37879b;
            this.f37879b = 1 + j6;
            this.f37878a.onNext(Long.valueOf(j6));
        }
    }
}
