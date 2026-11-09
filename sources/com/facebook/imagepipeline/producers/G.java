package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.didiglobal.booster.instrument.ShadowExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f21477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler$JobRunnable f21478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f21479c = new F(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f21480d = new F(this, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p109h3.e f21481e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21482f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21483g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f21484h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21485i = 0;

    public G(Executor executor, JobScheduler$JobRunnable jobScheduler$JobRunnable) {
        this.f21477a = executor;
        this.f21478b = jobScheduler$JobRunnable;
    }

    public static boolean d(p109h3.e eVar, int i7) {
        return AbstractC1338c.a(i7) || AbstractC1338c.h(i7, 4) || p109h3.e.j(eVar);
    }

    public final void a(long j6) {
        F f10 = this.f21480d;
        if (j6 <= 0) {
            f10.run();
            return;
        }
        if (p059e1.a.f35990c == null) {
            p059e1.a.f35990c = ShadowExecutors.newOptimizedSingleThreadScheduledExecutor("\u200bcom.facebook.imagepipeline.producers.JobScheduler$JobStartExecutorSupplier");
        }
        p059e1.a.f35990c.schedule(f10, j6, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        boolean z3;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z3 = true;
                if (this.f21483g == 4) {
                    jMax = Math.max(this.f21485i + ((long) 100), jUptimeMillis);
                    this.f21484h = jUptimeMillis;
                    this.f21483g = 2;
                } else {
                    this.f21483g = 1;
                    jMax = 0;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        boolean z3;
        long j6;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.f21481e, this.f21482f)) {
                    int i7 = androidx.camera.camera2.internal.F.i(this.f21483g);
                    if (i7 != 0) {
                        if (i7 == 2) {
                            this.f21483g = 4;
                        }
                        z3 = false;
                        j6 = 0;
                    } else {
                        long jMax = Math.max(this.f21485i + ((long) 100), jUptimeMillis);
                        this.f21484h = jUptimeMillis;
                        this.f21483g = 2;
                        z3 = true;
                        j6 = jMax;
                    }
                    if (z3) {
                        a(j6 - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(p109h3.e eVar, int i7) {
        p109h3.e eVar2;
        if (!d(eVar, i7)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f21481e;
            this.f21481e = p109h3.e.a(eVar);
            this.f21482f = i7;
        }
        p109h3.e.b(eVar2);
        return true;
    }
}
