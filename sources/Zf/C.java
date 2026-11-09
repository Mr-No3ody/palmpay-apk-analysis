package Zf;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Continuation f11726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f11727b;

    public C(Continuation continuation, CoroutineContext coroutineContext) {
        this.f11726a = continuation;
        this.f11727b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f11726a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f11727b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f11726a.resumeWith(obj);
    }
}
