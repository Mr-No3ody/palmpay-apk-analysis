package Zf;

import Wf.AbstractC0780y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Ff.c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowCollector f11802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f11803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CoroutineContext f11805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Continuation f11806e;

    public y(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(w.f11799a, kotlin.coroutines.f.f38943a);
        this.f11802a = flowCollector;
        this.f11803b = coroutineContext;
        this.f11804c = ((Number) coroutineContext.fold(0, new Ab.y(10))).intValue();
    }

    public final Object a(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        AbstractC0780y.g(context);
        CoroutineContext coroutineContext = this.f11805d;
        if (coroutineContext != context) {
            if (coroutineContext instanceof u) {
                throw new IllegalStateException(kotlin.text.s.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((u) coroutineContext).f11794b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Ba.a(this, 24))).intValue() != this.f11804c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f11803b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f11805d = context;
        }
        this.f11806e = continuation;
        z zVar = A.f11724a;
        FlowCollector flowCollector = this.f11802a;
        Intrinsics.f(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        zVar.getClass();
        Object objEmit = flowCollector.emit(obj, this);
        if (!Intrinsics.c(objEmit, Ef.a.f2423a)) {
            this.f11806e = null;
        }
        return objEmit;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation frame) {
        try {
            Object objA = a(frame, obj);
            Ef.a aVar = Ef.a.f2423a;
            if (objA == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return objA == aVar ? objA : Unit.f38893a;
        } catch (Throwable th) {
            this.f11805d = new u(frame.getContext(), th);
            throw th;
        }
    }

    @Override // Ff.a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f11806e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // Ff.c, kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f11805d;
        return coroutineContext == null ? kotlin.coroutines.f.f38943a : coroutineContext;
    }

    @Override // Ff.a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = p355xf.q.a(obj);
        if (thA != null) {
            this.f11805d = new u(getContext(), thA);
        }
        Continuation continuation = this.f11806e;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return Ef.a.f2423a;
    }
}
