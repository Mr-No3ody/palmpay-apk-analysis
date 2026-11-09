package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f39180a;

    public i0(Throwable th) {
        this.f39180a = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        throw this.f39180a;
    }
}
