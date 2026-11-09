package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends AtomicReference implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f37771b = new AtomicReference();

    public J(Observer observer) {
        this.f37770a = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        p001if.a.a(this.f37771b);
        p001if.a.a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return ((Disposable) get()) == p001if.a.f37585a;
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37770a.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f37770a.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f37770a.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        p001if.a.c(this.f37771b, disposable);
    }
}
