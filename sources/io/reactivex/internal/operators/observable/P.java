package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observer f37784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sd.b f37785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q[] f37786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f37787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f37788e;

    public P(Observer observer, Sd.b bVar, int i7) {
        this.f37784a = observer;
        this.f37785b = bVar;
        this.f37786c = new Q[i7];
        this.f37787d = new Object[i7];
    }

    public final void a() {
        Q[] qArr = this.f37786c;
        for (Q q10 : qArr) {
            q10.f37790b.clear();
        }
        for (Q q11 : qArr) {
            p001if.a.a(q11.f37793e);
        }
    }

    public final void b() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        Q[] qArr = this.f37786c;
        Observer observer = this.f37784a;
        Object[] objArr = this.f37787d;
        int iAddAndGet = 1;
        while (true) {
            int i7 = 0;
            int i10 = 0;
            for (Q q10 : qArr) {
                if (objArr[i10] == null) {
                    boolean z3 = q10.f37791c;
                    Object objPoll = q10.f37790b.poll();
                    boolean z8 = objPoll == null;
                    if (this.f37788e) {
                        a();
                        return;
                    }
                    if (z3) {
                        Throwable th2 = q10.f37792d;
                        if (th2 != null) {
                            this.f37788e = true;
                            a();
                            observer.onError(th2);
                            return;
                        } else if (z8) {
                            this.f37788e = true;
                            a();
                            observer.onComplete();
                            return;
                        }
                    }
                    if (z8) {
                        i7++;
                    } else {
                        objArr[i10] = objPoll;
                    }
                } else if (q10.f37791c && (th = q10.f37792d) != null) {
                    this.f37788e = true;
                    a();
                    observer.onError(th);
                    return;
                }
                i10++;
            }
            if (i7 != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f37785b.apply(objArr.clone());
                    p147jf.a.a(objApply, "The zipper returned a null value");
                    observer.onNext(objApply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    D3.a.H(th3);
                    a();
                    observer.onError(th3);
                    return;
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f37788e) {
            return;
        }
        this.f37788e = true;
        for (Q q10 : this.f37786c) {
            p001if.a.a(q10.f37793e);
        }
        if (getAndIncrement() == 0) {
            for (Q q11 : this.f37786c) {
                q11.f37790b.clear();
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f37788e;
    }
}
