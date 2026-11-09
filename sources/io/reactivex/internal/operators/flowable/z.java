package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37743c;

    public z(df.b bVar) {
        super(bVar);
        this.f37743c = 4L;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        this.f37677b.c(new y(flowableSubscriber, this.f37743c));
    }
}
