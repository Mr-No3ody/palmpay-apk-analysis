package io.reactivex.internal.schedulers;

import df.h;
import df.i;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p190mf.c;
import p190mf.d;
import p190mf.k;
import p190mf.l;
import p190mf.m;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements SchedulerMultiWorkerSupport {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f37890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f37891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f37892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f37893g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f37894c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f37892f = iAvailableProcessors;
        c cVar = new c(new k("RxComputationShutdown"));
        f37893g = cVar;
        cVar.dispose();
        k kVar = new k("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f37891e = kVar;
        a aVar = new a(0, kVar);
        f37890d = aVar;
        for (c cVar2 : aVar.f37888b) {
            cVar2.dispose();
        }
    }

    public b() {
        AtomicReference atomicReference;
        k kVar = f37891e;
        a aVar = f37890d;
        this.f37894c = new AtomicReference(aVar);
        a aVar2 = new a(f37892f, kVar);
        do {
            atomicReference = this.f37894c;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        for (c cVar : aVar2.f37888b) {
            cVar.dispose();
        }
    }

    @Override // df.i
    public final h a() {
        return new p190mf.b(((a) this.f37894c.get()).a());
    }

    @Override // df.i
    public final Disposable c(Runnable runnable, long j6, TimeUnit timeUnit) {
        c cVarA = ((a) this.f37894c.get()).a();
        cVarA.getClass();
        m mVar = new m(runnable);
        ScheduledExecutorService scheduledExecutorService = cVarA.f39690a;
        try {
            mVar.a(j6 <= 0 ? scheduledExecutorService.submit(mVar) : scheduledExecutorService.schedule(mVar, j6, timeUnit));
            return mVar;
        } catch (RejectedExecutionException e10) {
            org.chromium.support_lib_boundary.util.b.V(e10);
            return p001if.b.f37587a;
        }
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public final void createWorkers(int i7, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        p147jf.a.b(i7, "number > 0 required");
        ((a) this.f37894c.get()).createWorkers(i7, workerCallback);
    }

    @Override // df.i
    public final Disposable d(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        c cVarA = ((a) this.f37894c.get()).a();
        cVarA.getClass();
        p001if.b bVar = p001if.b.f37587a;
        if (j10 <= 0) {
            ScheduledExecutorService scheduledExecutorService = cVarA.f39690a;
            d dVar = new d(runnable, scheduledExecutorService);
            try {
                dVar.a(j6 <= 0 ? scheduledExecutorService.submit(dVar) : scheduledExecutorService.schedule(dVar, j6, timeUnit));
                return dVar;
            } catch (RejectedExecutionException e10) {
                org.chromium.support_lib_boundary.util.b.V(e10);
            }
        } else {
            l lVar = new l(runnable);
            try {
                lVar.a(cVarA.f39690a.scheduleAtFixedRate(lVar, j6, j10, timeUnit));
                return lVar;
            } catch (RejectedExecutionException e11) {
                org.chromium.support_lib_boundary.util.b.V(e11);
            }
        }
        return bVar;
    }
}
