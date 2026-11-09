package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1758j implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f37828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f37829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Action f37830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Disposable f37831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37832f;

    public C1758j(Observer observer, Consumer consumer, Consumer consumer2, Action action) {
        this.f37827a = observer;
        this.f37828b = consumer;
        this.f37829c = consumer2;
        this.f37830d = action;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37831e.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37831e.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f37832f) {
            return;
        }
        try {
            this.f37830d.run();
            this.f37832f = true;
            this.f37827a.onComplete();
        } catch (Throwable th) {
            D3.a.H(th);
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f37832f) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f37832f = true;
        try {
            this.f37829c.accept(th);
        } catch (Throwable th2) {
            D3.a.H(th2);
            th = new p118hf.b(th, th2);
        }
        this.f37827a.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37832f) {
            return;
        }
        try {
            this.f37828b.accept(obj);
            this.f37827a.onNext(obj);
        } catch (Throwable th) {
            D3.a.H(th);
            this.f37831e.dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37831e, disposable)) {
            this.f37831e = disposable;
            this.f37827a.onSubscribe(this);
        }
    }
}
