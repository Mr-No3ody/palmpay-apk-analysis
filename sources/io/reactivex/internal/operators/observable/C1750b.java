package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1750b extends AtomicReference implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1751c f37799b;

    public C1750b(Observer observer, C1751c c1751c) {
        this.f37798a = observer;
        this.f37799b = c1751c;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        C1751c c1751c = this.f37799b;
        c1751c.f37807i = false;
        c1751c.a();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        C1751c c1751c = this.f37799b;
        if (!c1751c.f37803d.a(th)) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        c1751c.f37806g.dispose();
        c1751c.f37807i = false;
        c1751c.a();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f37798a.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        p001if.a.b(this, disposable);
    }
}
