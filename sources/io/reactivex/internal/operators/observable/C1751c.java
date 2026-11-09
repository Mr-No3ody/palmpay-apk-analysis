package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1751c extends AtomicInteger implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z4.a f37801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p239pf.a f37803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1750b f37804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SimpleQueue f37805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f37806g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f37807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f37808j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f37809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f37810p;

    public C1751c(Observer observer, int i7) {
        Z4.a aVar = p147jf.a.f38597a;
        this.f37800a = observer;
        this.f37801b = aVar;
        this.f37802c = i7;
        this.f37803d = new p239pf.a();
        this.f37804e = new C1750b(observer, this);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        Observer observer = this.f37800a;
        SimpleQueue simpleQueue = this.f37805f;
        p239pf.a aVar = this.f37803d;
        while (true) {
            if (!this.f37807i) {
                if (this.f37809o) {
                    simpleQueue.clear();
                    return;
                }
                if (((Throwable) aVar.get()) != null) {
                    simpleQueue.clear();
                    this.f37809o = true;
                    observer.onError(aVar.b());
                    return;
                }
                boolean z3 = this.f37808j;
                try {
                    Object objPoll = simpleQueue.poll();
                    boolean z8 = objPoll == null;
                    if (z3 && z8) {
                        this.f37809o = true;
                        Throwable thB = aVar.b();
                        if (thB != null) {
                            observer.onError(thB);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    if (!z8) {
                        try {
                            this.f37801b.getClass();
                            p147jf.a.a(objPoll, "The mapper returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objPoll;
                            if (observableSource instanceof Callable) {
                                try {
                                    Object objCall = ((Callable) observableSource).call();
                                    if (objCall != null && !this.f37809o) {
                                        observer.onNext(objCall);
                                    }
                                } catch (Throwable th) {
                                    D3.a.H(th);
                                    aVar.a(th);
                                }
                            } else {
                                this.f37807i = true;
                                observableSource.subscribe(this.f37804e);
                            }
                        } catch (Throwable th2) {
                            D3.a.H(th2);
                            this.f37809o = true;
                            this.f37806g.dispose();
                            simpleQueue.clear();
                            aVar.a(th2);
                            observer.onError(aVar.b());
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    D3.a.H(th3);
                    this.f37809o = true;
                    this.f37806g.dispose();
                    aVar.a(th3);
                    observer.onError(aVar.b());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37809o = true;
        this.f37806g.dispose();
        C1750b c1750b = this.f37804e;
        c1750b.getClass();
        p001if.a.a(c1750b);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37809o;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37808j = true;
        a();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (!this.f37803d.a(th)) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else {
            this.f37808j = true;
            a();
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37810p == 0) {
            this.f37805f.offer(obj);
        }
        a();
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37806g, disposable)) {
            this.f37806g = disposable;
            if (disposable instanceof QueueDisposable) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int iRequestFusion = queueDisposable.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f37810p = iRequestFusion;
                    this.f37805f = queueDisposable;
                    this.f37808j = true;
                    this.f37800a.onSubscribe(this);
                    a();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f37810p = iRequestFusion;
                    this.f37805f = queueDisposable;
                    this.f37800a.onSubscribe(this);
                    return;
                }
            }
            this.f37805f = new p175lf.b(this.f37802c);
            this.f37800a.onSubscribe(this);
        }
    }
}
