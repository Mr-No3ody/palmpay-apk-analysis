package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class N extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.i f37779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37780b;

    public N(long j6, df.i iVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f37780b = j6;
        this.f37779a = iVar;
    }

    @Override // df.d
    public final void j(Observer observer) {
        M m7 = new M(observer);
        observer.onSubscribe(m7);
        Disposable disposableC = this.f37779a.c(m7, this.f37780b, TimeUnit.MILLISECONDS);
        while (!m7.compareAndSet(null, disposableC)) {
            if (m7.get() != null) {
                if (m7.get() == p001if.a.f37585a) {
                    disposableC.dispose();
                    return;
                }
                return;
            }
        }
    }
}
