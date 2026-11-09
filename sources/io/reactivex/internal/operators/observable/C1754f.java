package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableEmitter;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Cancellable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1754f extends AtomicInteger implements ObservableEmitter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1753e f37813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p239pf.a f37814b = new p239pf.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p175lf.b f37815c = new p175lf.b(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f37816d;

    public C1754f(C1753e c1753e) {
        this.f37813a = c1753e;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            b();
        }
    }

    public final void b() {
        C1753e c1753e = this.f37813a;
        p175lf.b bVar = this.f37815c;
        p239pf.a aVar = this.f37814b;
        int iAddAndGet = 1;
        while (!c1753e.isDisposed()) {
            if (aVar.get() != null) {
                bVar.clear();
                c1753e.onError(aVar.b());
                return;
            }
            boolean z3 = this.f37816d;
            Object objPoll = bVar.poll();
            boolean z8 = objPoll == null;
            if (z3 && z8) {
                c1753e.onComplete();
                return;
            } else if (z8) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                c1753e.onNext(objPoll);
            }
        }
        bVar.clear();
    }

    @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37813a.isDisposed();
    }

    @Override // io.reactivex.Emitter
    public final void onComplete() {
        if (this.f37813a.isDisposed() || this.f37816d) {
            return;
        }
        this.f37816d = true;
        a();
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
        if (this.f37813a.isDisposed() || this.f37816d) {
            return;
        }
        if (obj == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            this.f37813a.onNext(obj);
            if (decrementAndGet() == 0) {
                return;
            }
        } else {
            p175lf.b bVar = this.f37815c;
            synchronized (bVar) {
                bVar.offer(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
        }
        b();
    }

    @Override // io.reactivex.ObservableEmitter
    public final ObservableEmitter serialize() {
        return this;
    }

    @Override // io.reactivex.ObservableEmitter
    public final void setCancellable(Cancellable cancellable) {
        this.f37813a.setCancellable(cancellable);
    }

    @Override // io.reactivex.ObservableEmitter
    public final void setDisposable(Disposable disposable) {
        this.f37813a.setDisposable(disposable);
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return this.f37813a.toString();
    }

    @Override // io.reactivex.ObservableEmitter
    public final boolean tryOnError(Throwable th) {
        if (this.f37813a.isDisposed() || this.f37816d) {
            return false;
        }
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (!this.f37814b.a(th)) {
            return false;
        }
        this.f37816d = true;
        a();
        return true;
    }
}
