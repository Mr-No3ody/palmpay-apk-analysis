package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends df.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.i f37705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37708e;

    public m(long j6, long j10, long j11, df.i iVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f37707d = j10;
        this.f37708e = j11;
        this.f37705b = iVar;
        this.f37706c = j6;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        l lVar = new l(flowableSubscriber, this.f37706c);
        flowableSubscriber.onSubscribe(lVar);
        df.i iVar = this.f37705b;
        boolean z3 = iVar instanceof p190mf.t;
        AtomicReference atomicReference = lVar.f37704d;
        if (!z3) {
            p001if.a.c(atomicReference, iVar.d(lVar, this.f37707d, this.f37708e, TimeUnit.SECONDS));
            return;
        }
        ((p190mf.t) iVar).getClass();
        p190mf.s sVar = new p190mf.s();
        p001if.a.c(atomicReference, sVar);
        sVar.d(lVar, this.f37707d, this.f37708e, TimeUnit.SECONDS);
    }
}
