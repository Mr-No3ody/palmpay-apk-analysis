package p190mf;

import df.i;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f39680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f39681e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f39684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f39685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f39686j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f39687c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f39683g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f39682f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        g gVar = new g(new k("RxCachedThreadSchedulerShutdown"));
        f39684h = gVar;
        gVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        k kVar = new k("RxCachedThreadScheduler", iMax, false);
        f39680d = kVar;
        f39681e = new k("RxCachedWorkerPoolEvictor", iMax, false);
        f39685i = Boolean.getBoolean("rx2.io-scheduled-release");
        e eVar = new e(0L, null, kVar);
        f39686j = eVar;
        eVar.f39671c.dispose();
        ScheduledFuture scheduledFuture = eVar.f39673e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar.f39672d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public h() {
        AtomicReference atomicReference;
        k kVar = f39680d;
        e eVar = f39686j;
        this.f39687c = new AtomicReference(eVar);
        e eVar2 = new e(f39682f, f39683g, kVar);
        do {
            atomicReference = this.f39687c;
            if (atomicReference.compareAndSet(eVar, eVar2)) {
                return;
            }
        } while (atomicReference.get() == eVar);
        eVar2.f39671c.dispose();
        ScheduledFuture scheduledFuture = eVar2.f39673e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar2.f39672d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // df.i
    public final df.h a() {
        return new f((e) this.f39687c.get());
    }
}
