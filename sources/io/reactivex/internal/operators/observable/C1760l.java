package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1760l extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f37837c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1760l(df.d dVar, Object obj, int i7) {
        super(dVar);
        this.f37836b = i7;
        this.f37837c = obj;
    }

    @Override // df.d
    public final void j(Observer observer) {
        switch (this.f37836b) {
            case 0:
                this.f37797a.subscribe(new p161kf.c(observer, (Consumer) this.f37837c));
                break;
            case 1:
                this.f37797a.subscribe(new C1762n(observer, (Predicate) this.f37837c, 0));
                break;
            default:
                this.f37797a.subscribe(new C1762n(observer, (Function) this.f37837c, 1));
                break;
        }
    }
}
