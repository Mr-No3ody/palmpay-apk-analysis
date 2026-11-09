package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1765q extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1765q(df.d dVar, Object obj, int i7, int i10) {
        super(dVar);
        this.f37866b = i10;
        this.f37868d = obj;
        this.f37867c = i7;
    }

    @Override // df.d
    public final void j(Observer observer) {
        switch (this.f37866b) {
            case 0:
                Function function = (Function) this.f37868d;
                ObservableSource observableSource = this.f37797a;
                if (!p140j8.f.H(observableSource, observer, function)) {
                    observableSource.subscribe(new C1764p(observer, function, this.f37867c));
                    break;
                }
                break;
            default:
                df.i iVar = (df.i) this.f37868d;
                boolean z3 = iVar instanceof p190mf.t;
                ObservableSource observableSource2 = this.f37797a;
                if (!z3) {
                    observableSource2.subscribe(new C(observer, iVar.a(), this.f37867c));
                } else {
                    observableSource2.subscribe(observer);
                }
                break;
        }
    }
}
