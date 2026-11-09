package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1752d extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37811b;

    public C1752d(df.d dVar, int i7) {
        super(dVar);
        this.f37811b = Math.max(8, i7);
    }

    @Override // df.d
    public final void j(Observer observer) {
        Z4.a aVar = p147jf.a.f38597a;
        ObservableSource observableSource = this.f37797a;
        if (p140j8.f.H(observableSource, observer, aVar)) {
            return;
        }
        observableSource.subscribe(new C1751c(observer, this.f37811b));
    }
}
