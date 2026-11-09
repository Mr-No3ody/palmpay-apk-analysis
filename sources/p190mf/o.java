package p190mf;

import L7.a;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f39700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f39701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f39702c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f39703d = new ConcurrentHashMap();

    static {
        boolean zEquals;
        int i7;
        try {
            String property = System.getProperty("rx2.purge-enabled");
            zEquals = property == null ? true : "true".equals(property);
        } catch (Throwable unused) {
        }
        f39700a = zEquals;
        if (zEquals) {
            try {
                String property2 = System.getProperty("rx2.purge-period-seconds");
                i7 = property2 == null ? 1 : Integer.parseInt(property2);
            } catch (Throwable unused2) {
            }
        }
        f39701b = i7;
        if (!f39700a) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f39702c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewOptimizedScheduledThreadPool = ShadowExecutors.newOptimizedScheduledThreadPool(1, new k("RxSchedulerPurge"), "\u200bio.reactivex.internal.schedulers.SchedulerPoolFactory");
            do {
                if (atomicReference.compareAndSet(scheduledExecutorService, scheduledExecutorServiceNewOptimizedScheduledThreadPool)) {
                    a aVar = new a(4);
                    long j6 = f39701b;
                    scheduledExecutorServiceNewOptimizedScheduledThreadPool.scheduleAtFixedRate(aVar, j6, j6, TimeUnit.SECONDS);
                    return;
                }
            } while (atomicReference.get() == scheduledExecutorService);
            scheduledExecutorServiceNewOptimizedScheduledThreadPool.shutdownNow();
        }
    }
}
