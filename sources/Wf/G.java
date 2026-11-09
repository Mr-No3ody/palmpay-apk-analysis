package Wf;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G extends p042cg.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10808c;

    public G(int i7) {
        super(0L, false);
        this.f10808c = i7;
    }

    public abstract Continuation b();

    public Throwable c(Object obj) {
        C0771o c0771o = obj instanceof C0771o ? (C0771o) obj : null;
        if (c0771o != null) {
            return c0771o.f10891a;
        }
        return null;
    }

    public final void e(Throwable th) {
        AbstractC0776u.a(b().getContext(), new C0779x("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object f();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuationB = b();
            Intrinsics.f(continuationB, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            p015ag.f fVar = (p015ag.f) continuationB;
            Continuation continuation = fVar.f11937e;
            Object obj = fVar.f11939g;
            CoroutineContext context = continuation.getContext();
            Object objC = p015ag.v.c(context, obj);
            Job job = null;
            B0 b0C = objC != p015ag.v.f11967a ? AbstractC0773q.c(continuation, context, objC) : null;
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objF = f();
                Throwable thC = c(objF);
                if (thC == null) {
                    int i7 = this.f10808c;
                    boolean z3 = true;
                    if (i7 != 1 && i7 != 2) {
                        z3 = false;
                    }
                    if (z3) {
                        job = (Job) context2.get(C0753a0.f10836a);
                    }
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    a(cancellationException);
                    p355xf.o oVar = p355xf.q.f43977a;
                    continuation.resumeWith(androidx.camera.core.impl.utils.executor.g.f(cancellationException));
                } else if (thC != null) {
                    p355xf.o oVar2 = p355xf.q.f43977a;
                    continuation.resumeWith(androidx.camera.core.impl.utils.executor.g.f(thC));
                } else {
                    p355xf.o oVar3 = p355xf.q.f43977a;
                    continuation.resumeWith(d(objF));
                }
                Unit unit = Unit.f38893a;
            } finally {
                if (b0C == null || b0C.N()) {
                    p015ag.v.a(context, objC);
                }
            }
        } catch (E e10) {
            AbstractC0776u.a(b().getContext(), e10.f10804a);
        } catch (Throwable th) {
            e(th);
        }
    }

    public void a(CancellationException cancellationException) {
    }

    public Object d(Object obj) {
        return obj;
    }
}
