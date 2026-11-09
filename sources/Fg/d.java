package Fg;

import C0.G;
import com.didiglobal.booster.instrument.ShadowThread;
import face.security.device.api.FaceSecCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f2845h = new c(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f2846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Logger f2847j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f2852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f2853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B5.c f2854g;

    static {
        String name = Dg.c.f1885g + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f2846i = new d(new f(new Dg.b(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f2847j = logger;
    }

    public d(f backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f2848a = backend;
        this.f2849b = FaceSecCode.SC_SUCCESS;
        this.f2852e = new ArrayList();
        this.f2853f = new ArrayList();
        this.f2854g = new B5.c(this, 6);
    }

    public static final void a(d dVar, a aVar) {
        dVar.getClass();
        byte[] bArr = Dg.c.f1879a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(ShadowThread.makeThreadName(aVar.f2835a, "\u200bokhttp3.internal.concurrent.TaskRunner"));
        try {
            long jA = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, jA);
                Unit unit = Unit.f38893a;
            }
        } finally {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                Unit unit2 = Unit.f38893a;
                threadCurrentThread.setName(ShadowThread.makeThreadName(name, "\u200bokhttp3.internal.concurrent.TaskRunner"));
            }
        }
    }

    public final void b(a aVar, long j6) {
        byte[] bArr = Dg.c.f1879a;
        b bVar = aVar.f2837c;
        Intrinsics.e(bVar);
        if (bVar.f2842d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = bVar.f2844f;
        bVar.f2844f = false;
        bVar.f2842d = null;
        this.f2852e.remove(bVar);
        if (j6 != -1 && !z3 && !bVar.f2841c) {
            bVar.e(aVar, j6, true);
        }
        if (bVar.f2843e.isEmpty()) {
            return;
        }
        this.f2853f.add(bVar);
    }

    public final a c() {
        long j6;
        a aVar;
        boolean z3;
        byte[] bArr = Dg.c.f1879a;
        while (true) {
            ArrayList arrayList = this.f2853f;
            if (arrayList.isEmpty()) {
                return null;
            }
            f fVar = this.f2848a;
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar2 = null;
            while (true) {
                if (!it.hasNext()) {
                    j6 = jNanoTime;
                    aVar = null;
                    z3 = false;
                    break;
                }
                a aVar3 = (a) ((b) it.next()).f2843e.get(0);
                j6 = jNanoTime;
                aVar = null;
                long jMax = Math.max(0L, aVar3.f2838d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar2 != null) {
                        z3 = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                jNanoTime = j6;
            }
            ArrayList arrayList2 = this.f2852e;
            if (aVar2 != null) {
                byte[] bArr2 = Dg.c.f1879a;
                aVar2.f2838d = -1L;
                b bVar = aVar2.f2837c;
                Intrinsics.e(bVar);
                bVar.f2843e.remove(aVar2);
                arrayList.remove(bVar);
                bVar.f2842d = aVar2;
                arrayList2.add(bVar);
                if (z3 || (!this.f2850c && !arrayList.isEmpty())) {
                    fVar.execute(this.f2854g);
                }
                return aVar2;
            }
            if (this.f2850c) {
                if (jMin >= this.f2851d - j6) {
                    return aVar;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                return aVar;
            }
            this.f2850c = true;
            this.f2851d = j6 + jMin;
            try {
                try {
                    fVar.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((b) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        b bVar2 = (b) arrayList.get(size2);
                        bVar2.b();
                        if (bVar2.f2843e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.f2850c = false;
            } catch (Throwable th) {
                this.f2850c = false;
                throw th;
            }
        }
    }

    public final void d(b taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = Dg.c.f1879a;
        if (taskQueue.f2842d == null) {
            boolean zIsEmpty = taskQueue.f2843e.isEmpty();
            ArrayList arrayList = this.f2853f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        boolean z3 = this.f2850c;
        f fVar = this.f2848a;
        if (!z3) {
            fVar.execute(this.f2854g);
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    public final b e() {
        int i7;
        synchronized (this) {
            i7 = this.f2849b;
            this.f2849b = i7 + 1;
        }
        return new b(this, G.m(i7, "Q"));
    }
}
