package df;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Disposable {
    public static long a(TimeUnit timeUnit) {
        return !i.f35935a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract Disposable b(Runnable runnable, long j6, TimeUnit timeUnit);

    public void c(Runnable runnable) {
        b(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final Disposable d(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        p103gf.b bVar = new p103gf.b();
        p103gf.b bVar2 = new p103gf.b();
        bVar2.lazySet(bVar);
        long nanos = timeUnit.toNanos(j10);
        long jA = a(TimeUnit.NANOSECONDS);
        Disposable disposableB = b(new g(this, timeUnit.toNanos(j6) + jA, runnable, jA, bVar2, nanos), j6, timeUnit);
        if (disposableB == p001if.b.f37587a) {
            return disposableB;
        }
        p001if.a.b(bVar, disposableB);
        return bVar2;
    }
}
