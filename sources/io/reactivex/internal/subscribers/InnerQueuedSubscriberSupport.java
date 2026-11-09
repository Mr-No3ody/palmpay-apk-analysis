package io.reactivex.internal.subscribers;

import p208nf.c;

/* JADX INFO: loaded from: classes4.dex */
public interface InnerQueuedSubscriberSupport<T> {
    void drain();

    void innerComplete(c cVar);

    void innerError(c cVar, Throwable th);

    void innerNext(c cVar, T t);
}
