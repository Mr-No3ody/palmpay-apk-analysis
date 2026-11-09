package p015ag;

import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.C0771o;
import Wf.G;
import Wf.S;
import Wf.w0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends G implements CoroutineStackFrame, Continuation {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11935i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0774s f11936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Continuation f11937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f11938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11939g;

    public f(AbstractC0774s abstractC0774s, Continuation continuation) {
        super(-1);
        this.f11936d = abstractC0774s;
        this.f11937e = continuation;
        this.f11938f = a.f11928b;
        this.f11939g = v.b(continuation.getContext());
    }

    @Override // Wf.G
    public final Object f() {
        Object obj = this.f11938f;
        this.f11938f = a.f11928b;
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f11937e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f11937e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = q.a(obj);
        Object c0771o = thA == null ? obj : new C0771o(thA, false);
        Continuation continuation = this.f11937e;
        CoroutineContext context = continuation.getContext();
        AbstractC0774s abstractC0774s = this.f11936d;
        if (a.i(abstractC0774s, context)) {
            this.f11938f = c0771o;
            this.f10808c = 0;
            a.h(abstractC0774s, continuation.getContext(), this);
            return;
        }
        S sA = w0.a();
        if (sA.f10824c >= 4294967296L) {
            this.f11938f = c0771o;
            this.f10808c = 0;
            sA.f(this);
            return;
        }
        sA.h(true);
        try {
            CoroutineContext context2 = continuation.getContext();
            Object objC = v.c(context2, this.f11939g);
            try {
                continuation.resumeWith(obj);
                Unit unit = Unit.f38893a;
                v.a(context2, objC);
                while (sA.j()) {
                }
            } catch (Throwable th) {
                v.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                e(th2);
            } finally {
                sA.e(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f11936d + ", " + AbstractC0780y.q(this.f11937e) + ']';
    }

    @Override // Wf.G
    public final Continuation b() {
        return this;
    }
}
