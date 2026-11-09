package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f37776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f37777d = 4;

    public L(Observer observer) {
        this.f37774a = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37776c.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37776c.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f37775b) {
            return;
        }
        this.f37775b = true;
        this.f37776c.dispose();
        this.f37774a.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f37775b) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f37775b = true;
        this.f37776c.dispose();
        this.f37774a.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        if (this.f37775b) {
            return;
        }
        long j6 = this.f37777d;
        long j10 = j6 - 1;
        this.f37777d = j10;
        if (j6 > 0) {
            boolean z3 = j10 == 0;
            this.f37774a.onNext(obj);
            if (z3) {
                onComplete();
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37776c, disposable)) {
            this.f37776c = disposable;
            long j6 = this.f37777d;
            Observer observer = this.f37774a;
            if (j6 != 0) {
                observer.onSubscribe(this);
                return;
            }
            this.f37775b = true;
            disposable.dispose();
            observer.onSubscribe(p001if.b.f37587a);
            observer.onComplete();
        }
    }
}
