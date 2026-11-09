package p190mf;

import com.didiglobal.booster.instrument.ShadowExecutors;
import df.h;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001if.b;

/* JADX INFO: loaded from: classes4.dex */
public class j extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f39690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f39691b;

    public j(k kVar) {
        boolean z3 = o.f39700a;
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(1, kVar, "\u200bio.reactivex.internal.schedulers.SchedulerPoolFactory");
        if (o.f39700a && (scheduledExecutorServiceNewOptimizedScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f39703d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewOptimizedScheduledThreadPool, scheduledExecutorServiceNewOptimizedScheduledThreadPool);
        }
        this.f39690a = scheduledExecutorServiceNewOptimizedScheduledThreadPool;
    }

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        return this.f39691b ? b.f37587a : e(runnable, j6, timeUnit, null);
    }

    @Override // df.h
    public final void c(Runnable runnable) {
        b(runnable, 0L, null);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f39691b) {
            return;
        }
        this.f39691b = true;
        this.f39690a.shutdownNow();
    }

    public final n e(Runnable runnable, long j6, TimeUnit timeUnit, DisposableContainer disposableContainer) {
        n nVar = new n(runnable, disposableContainer);
        if (disposableContainer == null || disposableContainer.add(nVar)) {
            ScheduledExecutorService scheduledExecutorService = this.f39690a;
            try {
                nVar.a(j6 <= 0 ? scheduledExecutorService.submit((Callable) nVar) : scheduledExecutorService.schedule((Callable) nVar, j6, timeUnit));
                return nVar;
            } catch (RejectedExecutionException e10) {
                if (disposableContainer != null) {
                    disposableContainer.remove(nVar);
                }
                org.chromium.support_lib_boundary.util.b.V(e10);
            }
        }
        return nVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39691b;
    }
}
