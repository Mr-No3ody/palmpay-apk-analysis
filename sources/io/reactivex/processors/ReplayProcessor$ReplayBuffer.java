package io.reactivex.processors;

import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
interface ReplayProcessor$ReplayBuffer<T> {
    void complete();

    void error(Throwable th);

    Throwable getError();

    @Nullable
    T getValue();

    T[] getValues(T[] tArr);

    boolean isDone();

    void next(T t);

    void replay(a aVar);

    int size();

    void trimHead();
}
