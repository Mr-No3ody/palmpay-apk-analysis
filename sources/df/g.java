package df;

import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f35928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p103gf.b f35929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f35931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f35932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f35933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f35934g;

    public g(h hVar, long j6, Runnable runnable, long j10, p103gf.b bVar, long j11) {
        this.f35934g = hVar;
        this.f35928a = runnable;
        this.f35929b = bVar;
        this.f35930c = j11;
        this.f35932e = j10;
        this.f35933f = j6;
    }

    @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.f35928a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6;
        this.f35928a.run();
        p103gf.b bVar = this.f35929b;
        if (bVar.isDisposed()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        h hVar = this.f35934g;
        hVar.getClass();
        long jA = h.a(timeUnit);
        long j10 = i.f35936b;
        long j11 = jA + j10;
        long j12 = this.f35932e;
        long j13 = this.f35930c;
        if (j11 < j12 || jA >= j12 + j13 + j10) {
            j6 = jA + j13;
            long j14 = this.f35931d + 1;
            this.f35931d = j14;
            this.f35933f = j6 - (j13 * j14);
        } else {
            long j15 = this.f35933f;
            long j16 = this.f35931d + 1;
            this.f35931d = j16;
            j6 = (j16 * j13) + j15;
        }
        this.f35932e = jA;
        p001if.a.b(bVar, hVar.b(this, j6 - jA, timeUnit));
    }
}
