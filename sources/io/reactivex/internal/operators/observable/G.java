package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f37764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f37765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f37766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37767e;

    public /* synthetic */ G(Object obj, int i7) {
        this.f37763a = i7;
        this.f37767e = obj;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch (this.f37763a) {
            case 0:
                this.f37764b.dispose();
                break;
            default:
                this.f37764b.dispose();
                break;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f37763a) {
            case 0:
                break;
        }
        return this.f37764b.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        switch (this.f37763a) {
            case 0:
                if (!this.f37766d) {
                    this.f37766d = true;
                    Object obj = this.f37765c;
                    this.f37765c = null;
                    MaybeObserver maybeObserver = (MaybeObserver) this.f37767e;
                    if (obj != null) {
                        maybeObserver.onSuccess(obj);
                    } else {
                        maybeObserver.onComplete();
                    }
                    break;
                }
                break;
            default:
                if (!this.f37766d) {
                    this.f37766d = true;
                    Object obj2 = this.f37765c;
                    this.f37765c = null;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    SingleObserver singleObserver = (SingleObserver) this.f37767e;
                    if (obj2 == null) {
                        singleObserver.onError(new NoSuchElementException());
                    } else {
                        singleObserver.onSuccess(obj2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        switch (this.f37763a) {
            case 0:
                if (!this.f37766d) {
                    this.f37766d = true;
                    ((MaybeObserver) this.f37767e).onError(th);
                } else {
                    org.chromium.support_lib_boundary.util.b.V(th);
                }
                break;
            default:
                if (!this.f37766d) {
                    this.f37766d = true;
                    ((SingleObserver) this.f37767e).onError(th);
                } else {
                    org.chromium.support_lib_boundary.util.b.V(th);
                }
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        switch (this.f37763a) {
            case 0:
                if (!this.f37766d) {
                    if (this.f37765c == null) {
                        this.f37765c = obj;
                    } else {
                        this.f37766d = true;
                        this.f37764b.dispose();
                        ((MaybeObserver) this.f37767e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
            default:
                if (!this.f37766d) {
                    if (this.f37765c == null) {
                        this.f37765c = obj;
                    } else {
                        this.f37766d = true;
                        this.f37764b.dispose();
                        ((SingleObserver) this.f37767e).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    }
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        switch (this.f37763a) {
            case 0:
                if (p001if.a.d(this.f37764b, disposable)) {
                    this.f37764b = disposable;
                    ((MaybeObserver) this.f37767e).onSubscribe(this);
                }
                break;
            default:
                if (p001if.a.d(this.f37764b, disposable)) {
                    this.f37764b = disposable;
                    ((SingleObserver) this.f37767e).onSubscribe(this);
                }
                break;
        }
    }
}
