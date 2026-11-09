package Wf;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends p015ag.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f10800e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public B0(Continuation continuation, CoroutineContext coroutineContext) {
        C0 c0 = C0.f10803a;
        super(continuation, coroutineContext.get(c0) == null ? coroutineContext.plus(c0) : coroutineContext);
        this.f10800e = new ThreadLocal();
        if (continuation.getContext().get(ContinuationInterceptor.f38936l0) instanceof AbstractC0774s) {
            return;
        }
        Object objC = p015ag.v.c(coroutineContext, null);
        p015ag.v.a(coroutineContext, objC);
        P(coroutineContext, objC);
    }

    @Override // p015ag.r
    public final void M() {
        O();
    }

    public final boolean N() {
        boolean z3 = this.threadLocalIsSet && this.f10800e.get() == null;
        this.f10800e.remove();
        return !z3;
    }

    public final void O() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f10800e.get();
            if (pair != null) {
                p015ag.v.a((CoroutineContext) pair.f38891a, pair.f38892b);
            }
            this.f10800e.remove();
        }
    }

    public final void P(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f10800e.set(new Pair(coroutineContext, obj));
    }

    @Override // p015ag.r, Wf.n0
    public final void b(Object obj) {
        O();
        Object objN = AbstractC0780y.n(obj);
        Continuation continuation = this.f11962d;
        CoroutineContext context = continuation.getContext();
        Object objC = p015ag.v.c(context, null);
        B0 b0C = objC != p015ag.v.f11967a ? AbstractC0773q.c(continuation, context, objC) : null;
        try {
            continuation.resumeWith(objN);
            Unit unit = Unit.f38893a;
        } finally {
            if (b0C == null || b0C.N()) {
                p015ag.v.a(context, objC);
            }
        }
    }
}
