package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f37875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37876c;

    public /* synthetic */ u(Object obj, int i7) {
        this.f37874a = i7;
        this.f37876c = obj;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch (this.f37874a) {
            case 0:
                this.f37875b.dispose();
                break;
            default:
                this.f37875b.dispose();
                break;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f37874a) {
            case 0:
                break;
        }
        return this.f37875b.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        switch (this.f37874a) {
            case 0:
                ((Observer) this.f37876c).onComplete();
                break;
            default:
                ((CompletableObserver) this.f37876c).onComplete();
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        switch (this.f37874a) {
            case 0:
                ((Observer) this.f37876c).onError(th);
                break;
            default:
                ((CompletableObserver) this.f37876c).onError(th);
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        int i7 = this.f37874a;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f37874a) {
            case 0:
                this.f37875b = disposable;
                ((Observer) this.f37876c).onSubscribe(this);
                break;
            default:
                this.f37875b = disposable;
                ((CompletableObserver) this.f37876c).onSubscribe(this);
                break;
        }
    }

    private final void a(Object obj) {
    }

    private final void b(Object obj) {
    }
}
