package Wf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: Wf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0752a extends n0 implements Continuation, CoroutineScope {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f10835c;

    public AbstractC0752a(CoroutineContext coroutineContext, boolean z3) {
        super(z3);
        s((Job) coroutineContext.get(C0753a0.f10836a));
        this.f10835c = coroutineContext.plus(this);
    }

    @Override // Wf.n0
    public final void A(Object obj) {
        if (!(obj instanceof C0771o)) {
            K(obj);
        } else {
            C0771o c0771o = (C0771o) obj;
            J(c0771o.f10891a, C0771o.f10890b.get(c0771o) == 1);
        }
    }

    public final void L(EnumC0778w enumC0778w, AbstractC0752a abstractC0752a, Function2 function2) {
        Object objInvoke;
        int iOrdinal = enumC0778w.ordinal();
        if (iOrdinal == 0) {
            p264r5.a.H(function2, abstractC0752a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                Continuation continuationB = Ef.f.b(Ef.f.a(abstractC0752a, this, function2));
                p355xf.o oVar = p355xf.q.f43977a;
                continuationB.resumeWith(Unit.f38893a);
                return;
            }
            if (iOrdinal != 3) {
                throw new p355xf.l();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f10835c;
                Object objC = p015ag.v.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    if (function2 instanceof Ff.a) {
                        kotlin.jvm.internal.K.d(2, function2);
                        objInvoke = function2.invoke(abstractC0752a, this);
                    } else {
                        objInvoke = Ef.f.c(function2, abstractC0752a, this);
                    }
                    p015ag.v.a(coroutineContext, objC);
                    if (objInvoke != Ef.a.f2423a) {
                        p355xf.o oVar2 = p355xf.q.f43977a;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    p015ag.v.a(coroutineContext, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof E) {
                    th = ((E) th).f10804a;
                }
                p355xf.o oVar3 = p355xf.q.f43977a;
                resumeWith(androidx.camera.core.impl.utils.executor.g.f(th));
            }
        }
    }

    @Override // Wf.n0
    public final String g() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f10835c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f10835c;
    }

    @Override // Wf.n0
    public final void r(P0.c cVar) {
        AbstractC0776u.a(this.f10835c, cVar);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = p355xf.q.a(obj);
        if (thA != null) {
            obj = new C0771o(thA, false);
        }
        Object objW = w(obj);
        if (objW == AbstractC0780y.f10913e) {
            return;
        }
        b(objW);
    }

    public void K(Object obj) {
    }

    public void J(Throwable th, boolean z3) {
    }
}
