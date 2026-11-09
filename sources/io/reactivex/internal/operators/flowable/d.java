package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p287se.d f37686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f37687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p262r2.c f37688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p262r2.c f37689f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, p287se.d dVar) {
        super(tVar);
        retrofit2.adapter.rxjava2.d dVar2 = p147jf.a.f38600d;
        p262r2.c cVar = p147jf.a.f38599c;
        this.f37686c = dVar;
        this.f37687d = dVar2;
        this.f37688e = cVar;
        this.f37689f = cVar;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        boolean z3 = flowableSubscriber instanceof ConditionalSubscriber;
        df.b bVar = this.f37677b;
        if (z3) {
            bVar.c(new b((ConditionalSubscriber) flowableSubscriber, this.f37686c, this.f37687d, this.f37688e, this.f37689f));
        } else {
            bVar.c(new c(flowableSubscriber, this.f37686c, this.f37687d, this.f37688e, this.f37689f));
        }
    }
}
