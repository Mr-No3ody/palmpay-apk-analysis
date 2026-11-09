package io.reactivex.internal.operators.observable;

import N8.q0;
import io.reactivex.ObservableEmitter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1753e extends AtomicReference implements ObservableEmitter, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37812a;

    public C1753e(Observer observer) {
        this.f37812a = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        p001if.a.a(this);
    }

    @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return ((Disposable) get()) == p001if.a.f37585a;
    }

    @Override // io.reactivex.Emitter
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        try {
            this.f37812a.onComplete();
        } finally {
            p001if.a.a(this);
        }
    }

    @Override // io.reactivex.Emitter
    public final void onError(Throwable th) {
        if (tryOnError(th)) {
            return;
        }
        org.chromium.support_lib_boundary.util.b.V(th);
    }

    @Override // io.reactivex.Emitter
    public final void onNext(Object obj) {
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (isDisposed()) {
                return;
            }
            this.f37812a.onNext(obj);
        }
    }

    @Override // io.reactivex.ObservableEmitter
    public final ObservableEmitter serialize() {
        return new C1754f(this);
    }

    @Override // io.reactivex.ObservableEmitter
    public final void setCancellable(Cancellable cancellable) {
        setDisposable(new p103gf.b(cancellable, 1));
    }

    @Override // io.reactivex.ObservableEmitter
    public final void setDisposable(Disposable disposable) {
        while (true) {
            Disposable disposable2 = (Disposable) get();
            if (disposable2 == p001if.a.f37585a) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else {
                do {
                    if (compareAndSet(disposable2, disposable)) {
                        if (disposable2 != null) {
                            disposable2.dispose();
                            return;
                        }
                        return;
                    }
                } while (get() == disposable2);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return q0.l(C1753e.class.getSimpleName(), "{", super.toString(), "}");
    }

    @Override // io.reactivex.ObservableEmitter
    public final boolean tryOnError(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isDisposed()) {
            return false;
        }
        try {
            this.f37812a.onError(th);
            return true;
        } finally {
            p001if.a.a(this);
        }
    }
}
