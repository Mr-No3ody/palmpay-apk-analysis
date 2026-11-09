package io.reactivex.internal.operators.observable;

/* JADX INFO: loaded from: classes4.dex */
interface ObservableGroupJoin$JoinSupport {
    void innerClose(boolean z3, AbstractC1766s abstractC1766s);

    void innerCloseError(Throwable th);

    void innerComplete(t tVar);

    void innerError(Throwable th);

    void innerValue(boolean z3, Object obj);
}
