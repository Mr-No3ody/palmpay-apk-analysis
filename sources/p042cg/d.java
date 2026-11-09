package p042cg;

import C0.G;
import Pa.a0;
import Wf.AbstractC0780y;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.didiglobal.booster.instrument.ShadowThread;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import p015ag.q;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f18998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f18999j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a0 f19001p;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19004c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f19006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f19007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f19008g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        new a(null);
        f18998i = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack$volatile");
        f18999j = AtomicLongFieldUpdater.newUpdater(d.class, "controlState$volatile");
        f19000o = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated$volatile");
        f19001p = new a0("NOT_IN_STACK", 1);
    }

    public d(long j6, String str, int i7, int i10) {
        this.f19002a = i7;
        this.f19003b = i10;
        this.f19004c = j6;
        this.f19005d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(F.c(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(u.h(i10, "Max pool size ", i7, " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(F.c(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f19006e = new g();
        this.f19007f = new g();
        this.f19008g = new q((i7 + 1) * 2);
        this.controlState$volatile = ((long) i7) << 42;
    }

    public static /* synthetic */ void c(d dVar, Runnable runnable, int i7) {
        dVar.b(runnable, false, (i7 & 4) == 0);
    }

    public final int a() {
        synchronized (this.f19008g) {
            try {
                if (f19000o.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f18999j;
                long j6 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j6 & 2097151);
                int i10 = i7 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f19002a) {
                    return 0;
                }
                if (i7 >= this.f19003b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f19008g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                b bVar = new b(this, i11);
                this.f19008g.c(i11, bVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                ShadowThread.setThreadName(bVar, "\u200bkotlinx.coroutines.scheduling.CoroutineScheduler").start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z3, boolean z8) {
        j kVar;
        c cVar;
        l.f19022f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof j) {
            kVar = (j) runnable;
            kVar.f19014a = jNanoTime;
            kVar.f19015b = z3;
        } else {
            kVar = new k(runnable, jNanoTime, z3);
        }
        boolean z10 = kVar.f19015b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f18999j;
        long jAddAndGet = z10 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
        if (bVar == null || !Intrinsics.c(bVar.f18991i, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f18986c) != c.f18996e && (kVar.f19015b || cVar != c.f18993b)) {
            bVar.f18990g = true;
            n nVar = bVar.f18984a;
            if (z8) {
                kVar = nVar.a(kVar);
            } else {
                nVar.getClass();
                j jVar = (j) n.f19024b.getAndSet(nVar, kVar);
                kVar = jVar == null ? null : nVar.a(jVar);
            }
        }
        if (kVar != null) {
            if (!(kVar.f19015b ? this.f19007f.a(kVar) : this.f19006e.a(kVar))) {
                throw new RejectedExecutionException(G.r(new StringBuilder(), this.f19005d, " was terminated"));
            }
        }
        if (z10) {
            if (f() || e(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (f() || e(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i7;
        j jVarA;
        if (f19000o.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            b bVar = threadCurrentThread instanceof b ? (b) threadCurrentThread : null;
            if (bVar == null || !Intrinsics.c(bVar.f18991i, this)) {
                bVar = null;
            }
            synchronized (this.f19008g) {
                i7 = (int) (f18999j.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i10 = 1;
                while (true) {
                    Object objB = this.f19008g.b(i10);
                    Intrinsics.e(objB);
                    b bVar2 = (b) objB;
                    if (bVar2 != bVar) {
                        while (bVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                        }
                        n nVar = bVar2.f18984a;
                        g gVar = this.f19007f;
                        nVar.getClass();
                        j jVar = (j) n.f19024b.getAndSet(nVar, null);
                        if (jVar != null) {
                            gVar.a(jVar);
                        }
                        while (true) {
                            j jVarB = nVar.b();
                            if (jVarB == null) {
                                break;
                            } else {
                                gVar.a(jVarB);
                            }
                        }
                    }
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f19007f.b();
            this.f19006e.b();
            while (true) {
                if (bVar != null) {
                    jVarA = bVar.a(true);
                    if (jVarA == null) {
                        jVarA = (j) this.f19006e.d();
                        if (jVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    jVarA = (j) this.f19006e.d();
                    if (jVarA == null && (jVarA = (j) this.f19007f.d()) == null) {
                        break;
                    }
                }
                try {
                    jVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (bVar != null) {
                bVar.h(c.f18996e);
            }
            f18998i.set(this, 0L);
            f18999j.set(this, 0L);
        }
    }

    public final void d(b bVar, int i7, int i10) {
        while (true) {
            long j6 = f18998i.get(this);
            int i11 = (int) (2097151 & j6);
            long j10 = (2097152 + j6) & (-2097152);
            if (i11 == i7) {
                if (i10 == 0) {
                    Object objC = bVar.c();
                    while (true) {
                        if (objC == f19001p) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        b bVar2 = (b) objC;
                        int iB = bVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = bVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f18998i.compareAndSet(this, j6, ((long) i11) | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean e(long j6) {
        int i7 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.f19002a;
        if (i7 < i10) {
            int iA = a();
            if (iA == 1 && i10 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, 6);
    }

    public final boolean f() {
        a0 a0Var;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18998i;
            long j6 = atomicLongFieldUpdater.get(this);
            b bVar = (b) this.f19008g.b((int) (2097151 & j6));
            if (bVar == null) {
                bVar = null;
            } else {
                long j10 = (2097152 + j6) & (-2097152);
                Object objC = bVar.c();
                while (true) {
                    a0Var = f19001p;
                    if (objC == a0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    b bVar2 = (b) objC;
                    iB = bVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = bVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j6, j10 | ((long) iB))) {
                    bVar.g(a0Var);
                }
            }
            if (bVar == null) {
                return false;
            }
            if (b.f18983j.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.f19008g;
        int iA = qVar.a();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            b bVar = (b) qVar.b(i14);
            if (bVar != null) {
                n nVar = bVar.f18984a;
                nVar.getClass();
                int i15 = n.f19024b.get(nVar) != null ? (n.f19025c.get(nVar) - n.f19026d.get(nVar)) + 1 : n.f19025c.get(nVar) - n.f19026d.get(nVar);
                int iOrdinal = bVar.f18986c.ordinal();
                if (iOrdinal == 0) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new l();
                    }
                    i13++;
                }
            }
        }
        long j6 = f18999j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f19005d);
        sb5.append('@');
        sb5.append(AbstractC0780y.i(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f19002a;
        sb5.append(i16);
        sb5.append(", max = ");
        u.u(sb5, this.f19003b, "}, Worker States {CPU = ", i7, ", blocking = ");
        u.u(sb5, i10, ", parked = ", i11, ", dormant = ");
        u.u(sb5, i12, ", terminated = ", i13, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f19006e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f19007f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j6));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j6) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
