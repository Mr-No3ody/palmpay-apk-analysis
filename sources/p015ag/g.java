package p015ag;

import N8.q0;
import Wf.A;
import Wf.AbstractC0774s;
import androidx.camera.core.impl.utils.futures.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC0774s implements Delay {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11940i = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Delay f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0774s f11942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f11944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11945g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0774s abstractC0774s, int i7) {
        Delay delay = abstractC0774s instanceof Delay ? (Delay) abstractC0774s : null;
        this.f11941c = delay == null ? A.f10798a : delay;
        this.f11942d = abstractC0774s;
        this.f11943e = i7;
        this.f11944f = new k();
        this.f11945g = new Object();
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableE;
        this.f11944f.a(runnable);
        if (f11940i.get(this) >= this.f11943e || !f() || (runnableE = e()) == null) {
            return;
        }
        a.h(this.f11942d, this, new i(this, 27, runnableE, false));
    }

    @Override // Wf.AbstractC0774s
    public final void b(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableE;
        this.f11944f.a(runnable);
        if (f11940i.get(this) >= this.f11943e || !f() || (runnableE = e()) == null) {
            return;
        }
        this.f11942d.b(this, new i(this, 27, runnableE, false));
    }

    @Override // kotlinx.coroutines.Delay
    public final Object delay(long j6, Continuation continuation) {
        return this.f11941c.delay(j6, continuation);
    }

    public final Runnable e() {
        while (true) {
            Runnable runnable = (Runnable) this.f11944f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f11945g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11940i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f11944f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean f() {
        synchronized (this.f11945g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11940i;
            if (atomicIntegerFieldUpdater.get(this) >= this.f11943e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f11941c.invokeOnTimeout(j6, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j6, CancellableContinuation cancellableContinuation) {
        this.f11941c.scheduleResumeAfterDelay(j6, cancellableContinuation);
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11942d);
        sb2.append(".limitedParallelism(");
        return q0.m(sb2, this.f11943e, ')');
    }
}
