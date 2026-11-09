package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1756h implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f37821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final df.h f37822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Disposable f37823e;

    public C1756h(Observer observer, long j6, TimeUnit timeUnit, df.h hVar) {
        this.f37819a = observer;
        this.f37820b = j6;
        this.f37821c = timeUnit;
        this.f37822d = hVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f37823e.dispose();
        this.f37822d.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37822d.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37822d.b(new androidx.customview.widget.e(this, 26), this.f37820b, this.f37821c);
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f37822d.b(new androidx.core.provider.m(this, 18, th, false), 0L, this.f37821c);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f37822d.b(new androidx.core.provider.m(19, this, obj), this.f37820b, this.f37821c);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f37823e, disposable)) {
            this.f37823e = disposable;
            this.f37819a.onSubscribe(this);
        }
    }
}
