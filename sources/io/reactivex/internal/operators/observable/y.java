package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.i f37880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f37883d;

    public y(long j6, long j10, TimeUnit timeUnit, df.i iVar) {
        this.f37881b = j6;
        this.f37882c = j10;
        this.f37883d = timeUnit;
        this.f37880a = iVar;
    }

    @Override // df.d
    public final void j(Observer observer) {
        x xVar = new x(observer);
        observer.onSubscribe(xVar);
        df.i iVar = this.f37880a;
        if (!(iVar instanceof p190mf.t)) {
            p001if.a.c(xVar, iVar.d(xVar, this.f37881b, this.f37882c, this.f37883d));
            return;
        }
        ((p190mf.t) iVar).getClass();
        p190mf.s sVar = new p190mf.s();
        p001if.a.c(xVar, sVar);
        sVar.d(xVar, this.f37881b, this.f37882c, this.f37883d);
    }
}
