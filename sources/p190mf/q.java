package p190mf;

import com.didiglobal.booster.instrument.ShadowExecutors;
import df.h;
import df.i;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f39707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f39708e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f39709c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(0, "\u200bio.reactivex.internal.schedulers.SingleScheduler");
        f39708e = scheduledExecutorServiceNewOptimizedScheduledThreadPool;
        scheduledExecutorServiceNewOptimizedScheduledThreadPool.shutdown();
        f39707d = new k("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public q() {
        AtomicReference atomicReference = new AtomicReference();
        this.f39709c = atomicReference;
        boolean z3 = o.f39700a;
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(1, f39707d, "\u200bio.reactivex.internal.schedulers.SchedulerPoolFactory");
        if (o.f39700a && (scheduledExecutorServiceNewOptimizedScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            o.f39703d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewOptimizedScheduledThreadPool, scheduledExecutorServiceNewOptimizedScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewOptimizedScheduledThreadPool);
    }

    @Override // df.i
    public final h a() {
        return new p((ScheduledExecutorService) this.f39709c.get());
    }

    @Override // df.i
    public final Disposable c(Runnable runnable, long j6, TimeUnit timeUnit) {
        m mVar = new m(runnable);
        AtomicReference atomicReference = this.f39709c;
        try {
            mVar.a(j6 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(mVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(mVar, j6, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            b.V(e10);
            return p001if.b.f37587a;
        }
    }

    @Override // df.i
    public final Disposable d(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        p001if.b bVar = p001if.b.f37587a;
        AtomicReference atomicReference = this.f39709c;
        if (j10 > 0) {
            l lVar = new l(runnable);
            try {
                lVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(lVar, j6, j10, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e10) {
                b.V(e10);
                return bVar;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        d dVar = new d(runnable, scheduledExecutorService);
        try {
            dVar.a(j6 <= 0 ? scheduledExecutorService.submit(dVar) : scheduledExecutorService.schedule(dVar, j6, timeUnit));
            return dVar;
        } catch (RejectedExecutionException e11) {
            b.V(e11);
            return bVar;
        }
    }
}
