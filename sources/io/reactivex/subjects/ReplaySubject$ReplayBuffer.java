package io.reactivex.subjects;

import io.reactivex.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
interface ReplaySubject$ReplayBuffer<T> {
    void add(T t);

    void addFinal(Object obj);

    boolean compareAndSet(Object obj, Object obj2);

    Object get();

    @Nullable
    T getValue();

    T[] getValues(T[] tArr);

    void replay(a aVar);

    int size();

    void trimHead();
}
