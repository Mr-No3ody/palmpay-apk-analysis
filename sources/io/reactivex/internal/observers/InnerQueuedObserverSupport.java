package io.reactivex.internal.observers;

import p161kf.d;

/* JADX INFO: loaded from: classes4.dex */
public interface InnerQueuedObserverSupport<T> {
    void drain();

    void innerComplete(d dVar);

    void innerError(d dVar, Throwable th);

    void innerNext(d dVar, T t);
}
