package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p071ef.d f37726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37727d;

    public t(df.b bVar, p071ef.d dVar, int i7) {
        super(bVar);
        this.f37726c = dVar;
        this.f37727d = i7;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        df.h hVarA = this.f37726c.a();
        boolean z3 = flowableSubscriber instanceof ConditionalSubscriber;
        int i7 = this.f37727d;
        df.b bVar = this.f37677b;
        if (z3) {
            bVar.c(new r((ConditionalSubscriber) flowableSubscriber, hVarA, i7));
        } else {
            bVar.c(new s(flowableSubscriber, hVarA, i7));
        }
    }
}
