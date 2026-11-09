package Wf;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: Wf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0777v {
    public static final p015ag.c a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(C0753a0.f10836a) == null) {
            coroutineContext = coroutineContext.plus(AbstractC0780y.b());
        }
        return new p015ag.c(coroutineContext);
    }

    public static final p015ag.c b() {
        v0 v0VarC = AbstractC0780y.c();
        p042cg.f fVar = I.f10809a;
        return new p015ag.c(kotlin.coroutines.e.c(v0VarC, p015ag.o.f11960a));
    }

    public static final void c(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getF17355b().get(C0753a0.f10836a);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static final Object d(Function2 function2, Continuation frame) throws Throwable {
        p015ag.r rVar = new p015ag.r(frame, frame.getContext());
        Object objJ = p377z5.l.J(rVar, rVar, function2);
        if (objJ == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objJ;
    }

    public static final boolean e(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getF17355b().get(C0753a0.f10836a);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }
}
