package p257qf;

import Pa.C0505b;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.chromium.support_lib_boundary.util.b;
import p239pf.d;
import p239pf.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Observer, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f41521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f41522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0505b f41524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f41525e;

    public a(Observer observer) {
        this.f41521a = observer;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f41522b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f41522b.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.f41525e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f41525e) {
                    return;
                }
                if (!this.f41523c) {
                    this.f41525e = true;
                    this.f41523c = true;
                    this.f41521a.onComplete();
                } else {
                    C0505b c0505b = this.f41524d;
                    if (c0505b == null) {
                        c0505b = new C0505b();
                        this.f41524d = c0505b;
                    }
                    c0505b.a(e.f41308a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        if (this.f41525e) {
            b.V(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z3 = true;
                if (!this.f41525e) {
                    if (this.f41523c) {
                        this.f41525e = true;
                        C0505b c0505b = this.f41524d;
                        if (c0505b == null) {
                            c0505b = new C0505b();
                            this.f41524d = c0505b;
                        }
                        ((Object[]) c0505b.f7073c)[0] = new d(th);
                        return;
                    }
                    this.f41525e = true;
                    this.f41523c = true;
                    z3 = false;
                }
                if (z3) {
                    b.V(th);
                } else {
                    this.f41521a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        Object obj2;
        if (this.f41525e) {
            return;
        }
        if (obj == null) {
            this.f41522b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f41525e) {
                    return;
                }
                if (this.f41523c) {
                    C0505b c0505b = this.f41524d;
                    if (c0505b == null) {
                        c0505b = new C0505b();
                        this.f41524d = c0505b;
                    }
                    c0505b.a(obj);
                    return;
                }
                this.f41523c = true;
                this.f41521a.onNext(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            C0505b c0505b2 = this.f41524d;
                            if (c0505b2 == null) {
                                this.f41523c = false;
                                return;
                            }
                            this.f41524d = null;
                            Observer observer = this.f41521a;
                            for (Object[] objArr = (Object[]) c0505b2.f7073c; objArr != null; objArr = (Object[]) objArr[4]) {
                                for (int i7 = 0; i7 < 4 && (obj2 = objArr[i7]) != null; i7++) {
                                    if (obj2 == e.f41308a) {
                                        observer.onComplete();
                                        return;
                                    } else {
                                        if (obj2 instanceof d) {
                                            observer.onError(((d) obj2).f41307a);
                                            return;
                                        }
                                        observer.onNext(obj2);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        if (p001if.a.d(this.f41522b, disposable)) {
            this.f41522b = disposable;
            this.f41521a.onSubscribe(this);
        }
    }
}
