package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final df.i f37736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37737d;

    public x(df.b bVar, df.i iVar) {
        super(bVar);
        this.f37736c = iVar;
        this.f37737d = true;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        df.h hVarA = this.f37736c.a();
        w wVar = new w(flowableSubscriber, hVarA, this.f37677b, this.f37737d);
        flowableSubscriber.onSubscribe(wVar);
        hVarA.c(wVar);
    }
}
