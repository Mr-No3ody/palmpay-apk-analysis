package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends df.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.i f37744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37747d;

    public A(long j6, long j10, long j11, df.i iVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f37746c = j10;
        this.f37747d = j11;
        this.f37744a = iVar;
        this.f37745b = j6;
    }

    @Override // df.d
    public final void j(Observer observer) {
        z zVar = new z(observer, this.f37745b);
        observer.onSubscribe(zVar);
        df.i iVar = this.f37744a;
        if (!(iVar instanceof p190mf.t)) {
            p001if.a.c(zVar, iVar.d(zVar, this.f37746c, this.f37747d, TimeUnit.SECONDS));
            return;
        }
        ((p190mf.t) iVar).getClass();
        p190mf.s sVar = new p190mf.s();
        p001if.a.c(zVar, sVar);
        sVar.d(zVar, this.f37746c, this.f37747d, TimeUnit.SECONDS);
    }
}
