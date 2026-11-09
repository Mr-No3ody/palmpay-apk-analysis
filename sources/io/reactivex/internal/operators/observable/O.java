package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends AtomicBoolean implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.i f37782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f37783c;

    public O(Observer observer, df.i iVar) {
        this.f37781a = observer;
        this.f37782b = iVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f37782b.b(new androidx.customview.widget.e(this, 27));
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (get()) {
            return;
        }
        this.f37781a.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (get()) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else {
            this.f37781a.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (get()) {
            return;
        }
        this.f37781a.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37783c, disposable)) {
            this.f37783c = disposable;
            this.f37781a.onSubscribe(this);
        }
    }
}
