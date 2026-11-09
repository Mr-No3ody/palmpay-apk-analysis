package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f37789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p175lf.b f37790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f37791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f37792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f37793e = new AtomicReference();

    public Q(P p3, int i7) {
        this.f37789a = p3;
        this.f37790b = new p175lf.b(i7);
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37791c = true;
        this.f37789a.b();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f37792d = th;
        this.f37791c = true;
        this.f37789a.b();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f37790b.offer(obj);
        this.f37789a.b();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        p001if.a.c(this.f37793e, disposable);
    }
}
