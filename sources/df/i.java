package df;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f35935a = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f35936b = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public abstract h a();

    public Disposable b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public Disposable c(Runnable runnable, long j6, TimeUnit timeUnit) {
        h hVarA = a();
        e eVar = new e(runnable, hVarA);
        hVarA.b(eVar, j6, timeUnit);
        return eVar;
    }

    public Disposable d(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        h hVarA = a();
        f fVar = new f(0, runnable, hVarA);
        Disposable disposableD = hVarA.d(fVar, j6, j10, timeUnit);
        return disposableD == p001if.b.f37587a ? disposableD : fVar;
    }
}
