package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends AbstractC1749a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.i f37773c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(df.d dVar, df.i iVar, int i7) {
        super(dVar);
        this.f37772b = i7;
        this.f37773c = iVar;
    }

    @Override // df.d
    public final void j(Observer observer) {
        switch (this.f37772b) {
            case 0:
                J j6 = new J(observer);
                observer.onSubscribe(j6);
                p001if.a.c(j6, this.f37773c.b(new androidx.core.provider.m(this, 20, j6, false)));
                break;
            default:
                this.f37797a.subscribe(new O(observer, this.f37773c));
                break;
        }
    }
}
