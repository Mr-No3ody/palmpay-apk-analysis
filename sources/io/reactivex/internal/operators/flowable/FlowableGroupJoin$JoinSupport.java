package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes4.dex */
interface FlowableGroupJoin$JoinSupport {
    void innerClose(boolean z3, g gVar);

    void innerCloseError(Throwable th);

    void innerComplete(h hVar);

    void innerError(Throwable th);

    void innerValue(boolean z3, Object obj);
}
