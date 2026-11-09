package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends df.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.d f37692b;

    public f(df.d dVar) {
        this.f37692b = dVar;
    }

    @Override // df.b
    public final void d(FlowableSubscriber flowableSubscriber) {
        this.f37692b.subscribe(new e(flowableSubscriber));
    }
}
