package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ObservableSource[] f37794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Sd.b f37795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37796c;

    public S(ObservableSource[] observableSourceArr, Sd.b bVar, int i7) {
        this.f37794a = observableSourceArr;
        this.f37795b = bVar;
        this.f37796c = i7;
    }

    @Override // df.d
    public final void j(Observer observer) {
        ObservableSource[] observableSourceArr = this.f37794a;
        int length = observableSourceArr.length;
        if (length == 0) {
            observer.onSubscribe(p001if.b.f37587a);
            observer.onComplete();
            return;
        }
        P p3 = new P(observer, this.f37795b, length);
        int i7 = this.f37796c;
        Q[] qArr = p3.f37786c;
        int length2 = qArr.length;
        for (int i10 = 0; i10 < length2; i10++) {
            qArr[i10] = new Q(p3, i7);
        }
        p3.lazySet(0);
        p3.f37784a.onSubscribe(p3);
        for (int i11 = 0; i11 < length2 && !p3.f37788e; i11++) {
            observableSourceArr[i11].subscribe(qArr[i11]);
        }
    }
}
