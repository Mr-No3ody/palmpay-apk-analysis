package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1763o extends AtomicReference implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1764p f37847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f37848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile SimpleQueue f37849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37850e;

    public C1763o(C1764p c1764p, long j6) {
        this.f37846a = j6;
        this.f37847b = c1764p;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37848c = true;
        this.f37847b.c();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (!this.f37847b.f37859g.a(th)) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        C1764p c1764p = this.f37847b;
        c1764p.getClass();
        c1764p.b();
        this.f37848c = true;
        this.f37847b.c();
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37850e != 0) {
            this.f37847b.c();
            return;
        }
        C1764p c1764p = this.f37847b;
        if (c1764p.get() == 0 && c1764p.compareAndSet(0, 1)) {
            c1764p.f37853a.onNext(obj);
            if (c1764p.decrementAndGet() == 0) {
                return;
            }
        } else {
            SimpleQueue bVar = this.f37849d;
            if (bVar == null) {
                bVar = new p175lf.b(c1764p.f37856d);
                this.f37849d = bVar;
            }
            bVar.offer(obj);
            if (c1764p.getAndIncrement() != 0) {
                return;
            }
        }
        c1764p.d();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.c(this, disposable) && (disposable instanceof QueueDisposable)) {
            QueueDisposable queueDisposable = (QueueDisposable) disposable;
            int iRequestFusion = queueDisposable.requestFusion(7);
            if (iRequestFusion == 1) {
                this.f37850e = iRequestFusion;
                this.f37849d = queueDisposable;
                this.f37848c = true;
                this.f37847b.c();
                return;
            }
            if (iRequestFusion == 2) {
                this.f37850e = iRequestFusion;
                this.f37849d = queueDisposable;
            }
        }
    }
}
