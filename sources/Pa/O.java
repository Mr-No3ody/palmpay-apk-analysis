package Pa;

import android.os.Build;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class O extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f7037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f7038b;

    public O(int i7, int i10, long j6, TimeUnit timeUnit, M m7, S s3) {
        super(i7, i10, j6, timeUnit, m7, s3);
        this.f7037a = new AtomicInteger();
        m7.f7033a = this;
        this.f7038b = m7;
    }

    public static O a(int i7) {
        if (i7 == -8) {
            int i10 = T.f7047d;
            return new O(i10 + 1, (i10 * 2) + 1, 30L, TimeUnit.SECONDS, new M(0), new S("cpu"));
        }
        if (i7 != -4) {
            if (i7 != -2) {
                return i7 != -1 ? new O(i7, i7, 0L, TimeUnit.MILLISECONDS, new M(), new S(androidx.camera.camera2.internal.F.c(i7, "fixed(", ")"))) : new O(1, 1, 0L, TimeUnit.MILLISECONDS, new M(), new S("single"));
            }
            return new O(0, 128, 60L, TimeUnit.SECONDS, new M(0), new S("cached"));
        }
        int i11 = T.f7047d;
        int i12 = (i11 <= 4 ? i11 * 3 : i11 * 2) + 1;
        boolean z3 = Build.VERSION.SDK_INT == 34;
        int iMin = z3 ? Math.min((i11 * 2) + 1, 8) : (i11 * 2) + 1;
        O o10 = new O(iMin, Math.max(iMin, i12), 30L, TimeUnit.SECONDS, new M(), new S("io"));
        if (z3) {
            o10.allowCoreThreadTimeOut(true);
        }
        return o10;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        this.f7037a.decrementAndGet();
        super.afterExecute(runnable, th);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (isShutdown()) {
            return;
        }
        AtomicInteger atomicInteger = this.f7037a;
        atomicInteger.incrementAndGet();
        try {
            super.execute(runnable);
        } catch (RejectedExecutionException unused) {
            F6.d.c("ThreadUtils", "This will not happen!");
            this.f7038b.offer(runnable);
        } catch (Throwable unused2) {
            atomicInteger.decrementAndGet();
        }
    }
}
