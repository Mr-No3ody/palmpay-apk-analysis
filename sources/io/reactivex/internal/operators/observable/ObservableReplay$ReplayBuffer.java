package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes4.dex */
interface ObservableReplay$ReplayBuffer<T> {
    void complete();

    void error(Throwable th);

    void next(T t);

    void replay(D d2);
}
