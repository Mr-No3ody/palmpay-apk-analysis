package io.reactivex.internal.operators.flowable;

/* JADX INFO: loaded from: classes4.dex */
interface FlowableReplay$ReplayBuffer<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(u uVar);
}
