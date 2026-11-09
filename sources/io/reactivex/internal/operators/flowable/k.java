package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends df.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.i f37698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37700d;

    public k(long j6, long j10, df.i iVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f37699c = j6;
        this.f37700d = j10;
        this.f37698b = iVar;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        j jVar = new j(flowableSubscriber);
        flowableSubscriber.onSubscribe(jVar);
        df.i iVar = this.f37698b;
        boolean z3 = iVar instanceof p190mf.t;
        AtomicReference atomicReference = jVar.f37697c;
        if (!z3) {
            p001if.a.c(atomicReference, iVar.d(jVar, this.f37699c, this.f37700d, TimeUnit.SECONDS));
            return;
        }
        ((p190mf.t) iVar).getClass();
        p190mf.s sVar = new p190mf.s();
        p001if.a.c(atomicReference, sVar);
        sVar.d(jVar, this.f37699c, this.f37700d, TimeUnit.SECONDS);
    }
}
