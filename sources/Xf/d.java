package Xf;

import Ad.C0058e;
import B6.RunnableC0085g;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.I;
import Wf.p0;
import Wf.s0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import p015ag.o;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends p0 implements Delay {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f11222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f11224e;

    public d(Handler handler, boolean z3) {
        this.f11222c = handler;
        this.f11223d = z3;
        this.f11224e = z3 ? this : new d(handler, true);
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f11222c.post(runnable)) {
            return;
        }
        e(coroutineContext, runnable);
    }

    @Override // Wf.AbstractC0774s
    public final boolean c(CoroutineContext coroutineContext) {
        return (this.f11223d && Intrinsics.c(Looper.myLooper(), this.f11222c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.Delay
    public final Object delay(long j6, Continuation continuation) {
        return AbstractC0780y.f(this, j6, continuation);
    }

    public final void e(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        Job job = (Job) coroutineContext.get(C0753a0.f10836a);
        if (job != null) {
            job.cancel(cancellationException);
        }
        f fVar = I.f10809a;
        p042cg.e.f19009c.a(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f11222c == this.f11222c && dVar.f11223d == this.f11223d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f11222c) ^ (this.f11223d ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f11222c.postDelayed(runnable, j6)) {
            return new c(0, this, runnable);
        }
        e(coroutineContext, runnable);
        return s0.f10897a;
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j6, CancellableContinuation cancellableContinuation) {
        RunnableC0085g runnableC0085g = new RunnableC0085g(25, cancellableContinuation, this);
        if (j6 > 4611686018427387903L) {
            j6 = 4611686018427387903L;
        }
        if (this.f11222c.postDelayed(runnableC0085g, j6)) {
            cancellableContinuation.invokeOnCancellation(new C0058e(19, this, runnableC0085g));
        } else {
            e(cancellableContinuation.getContext(), runnableC0085g);
        }
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        d dVar;
        String str;
        f fVar = I.f10809a;
        p0 p0Var = o.f11960a;
        if (this == p0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = ((d) p0Var).f11224e;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            str = this == dVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f11222c.toString();
        return this.f11223d ? q0.j(string, ".immediate") : string;
    }
}
