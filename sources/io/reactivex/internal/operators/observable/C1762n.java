package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.QueueDisposable;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1762n implements Observer, QueueDisposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f37840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueueDisposable f37841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f37845g;

    public C1762n(Observer observer, Object obj, int i7) {
        this.f37844f = i7;
        this.f37839a = observer;
        this.f37845g = obj;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f37841c.clear();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37840b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37840b.isDisposed();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f37841c.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f37842d) {
            return;
        }
        this.f37842d = true;
        this.f37839a.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f37842d) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else {
            this.f37842d = true;
            this.f37839a.onError(th);
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        switch (this.f37844f) {
            case 0:
                int i7 = this.f37843e;
                Observer observer = this.f37839a;
                if (i7 != 0) {
                    observer.onNext(null);
                } else {
                    try {
                        if (((Predicate) this.f37845g).test(obj)) {
                            observer.onNext(obj);
                        }
                    } catch (Throwable th) {
                        D3.a.H(th);
                        this.f37840b.dispose();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.f37842d) {
                    int i10 = this.f37843e;
                    Observer observer2 = this.f37839a;
                    if (i10 != 0) {
                        observer2.onNext(null);
                    } else {
                        try {
                            Object objApply = ((Function) this.f37845g).apply(obj);
                            p147jf.a.a(objApply, "The mapper function returned a null value.");
                            observer2.onNext(objApply);
                        } catch (Throwable th2) {
                            D3.a.H(th2);
                            this.f37840b.dispose();
                            onError(th2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37840b, disposable)) {
            this.f37840b = disposable;
            if (disposable instanceof QueueDisposable) {
                this.f37841c = (QueueDisposable) disposable;
            }
            this.f37839a.onSubscribe(this);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        T tPoll;
        switch (this.f37844f) {
            case 0:
                break;
            default:
                T tPoll2 = this.f37841c.poll();
                if (tPoll2 == 0) {
                    return null;
                }
                Object objApply = ((Function) this.f37845g).apply(tPoll2);
                p147jf.a.a(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            tPoll = this.f37841c.poll();
            if (tPoll != 0) {
            }
            return tPoll;
        } while (!((Predicate) this.f37845g).test(tPoll));
        return tPoll;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i7) {
        QueueDisposable queueDisposable = this.f37841c;
        if (queueDisposable == null || (i7 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueDisposable.requestFusion(i7);
        if (iRequestFusion == 0) {
            return iRequestFusion;
        }
        this.f37843e = iRequestFusion;
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
