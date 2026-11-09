package p190mf;

import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f39670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f39671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f39672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledFuture f39673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f39674f;

    public e(long j6, TimeUnit timeUnit, k kVar) {
        e eVar;
        ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j6) : 0L;
        this.f39669a = nanos;
        this.f39670b = new ConcurrentLinkedQueue();
        this.f39671c = new a();
        this.f39674f = kVar;
        if (timeUnit != null) {
            scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(1, h.f39681e, "\u200bio.reactivex.internal.schedulers.IoScheduler$CachedWorkerPool");
            eVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewOptimizedScheduledThreadPool.scheduleWithFixedDelay(eVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            eVar = this;
            scheduledExecutorServiceNewOptimizedScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        eVar.f39672d = scheduledExecutorServiceNewOptimizedScheduledThreadPool;
        eVar.f39673e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<g> concurrentLinkedQueue = this.f39670b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (g gVar : concurrentLinkedQueue) {
            if (gVar.f39679c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(gVar)) {
                this.f39671c.remove(gVar);
            }
        }
    }
}
