package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends AtomicInteger implements Observer, Runnable, QueueDisposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.h f37750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SimpleQueue f37752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Disposable f37753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Throwable f37754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f37755g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f37756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f37757j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37758o;

    public C(Observer observer, df.h hVar, int i7) {
        this.f37749a = observer;
        this.f37750b = hVar;
        this.f37751c = i7;
    }

    public final boolean a(boolean z3, boolean z8, Observer observer) {
        if (this.f37756i) {
            this.f37752d.clear();
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f37754f;
        if (th != null) {
            this.f37756i = true;
            this.f37752d.clear();
            observer.onError(th);
            this.f37750b.dispose();
            return true;
        }
        if (!z8) {
            return false;
        }
        this.f37756i = true;
        observer.onComplete();
        this.f37750b.dispose();
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f37752d.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f37756i) {
            return;
        }
        this.f37756i = true;
        this.f37753e.dispose();
        this.f37750b.dispose();
        if (this.f37758o || getAndIncrement() != 0) {
            return;
        }
        this.f37752d.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37756i;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f37752d.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f37755g) {
            return;
        }
        this.f37755g = true;
        if (getAndIncrement() == 0) {
            this.f37750b.c(this);
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f37755g) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f37754f = th;
        this.f37755g = true;
        if (getAndIncrement() == 0) {
            this.f37750b.c(this);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37755g) {
            return;
        }
        if (this.f37757j != 2) {
            this.f37752d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f37750b.c(this);
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37753e, disposable)) {
            this.f37753e = disposable;
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f37757j = iRequestFusion;
                    this.f37752d = queueDisposable;
                    this.f37755g = true;
                    this.f37749a.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.f37750b.c(this);
                        return;
                    }
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f37757j = iRequestFusion;
                    this.f37752d = queueDisposable;
                    this.f37749a.onSubscribe(this);
                    return;
                }
            }
            this.f37752d = new p175lf.b(this.f37751c);
            this.f37749a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        return this.f37752d.poll();
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        if ((i7 & 2) == 0) {
            return 0;
        }
        this.f37758o = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f37758o) {
            int iAddAndGet = 1;
            while (!this.f37756i) {
                boolean z3 = this.f37755g;
                Throwable th = this.f37754f;
                if (z3 && th != null) {
                    this.f37756i = true;
                    this.f37749a.onError(this.f37754f);
                    this.f37750b.dispose();
                    return;
                }
                this.f37749a.onNext(null);
                if (z3) {
                    this.f37756i = true;
                    Throwable th2 = this.f37754f;
                    if (th2 != null) {
                        this.f37749a.onError(th2);
                    } else {
                        this.f37749a.onComplete();
                    }
                    this.f37750b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            return;
        }
        SimpleQueue simpleQueue = this.f37752d;
        Observer observer = this.f37749a;
        int iAddAndGet2 = 1;
        while (!a(this.f37755g, simpleQueue.isEmpty(), observer)) {
            while (true) {
                boolean z8 = this.f37755g;
                try {
                    Object objPoll = simpleQueue.poll();
                    boolean z10 = objPoll == null;
                    if (a(z8, z10, observer)) {
                        return;
                    }
                    if (z10) {
                        break;
                    } else {
                        observer.onNext(objPoll);
                    }
                } catch (Throwable th3) {
                    D3.a.H(th3);
                    this.f37756i = true;
                    this.f37753e.dispose();
                    simpleQueue.clear();
                    observer.onError(th3);
                    this.f37750b.dispose();
                    return;
                }
            }
            iAddAndGet2 = addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
