package p042cg;

import Pa.a0;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18983j = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f18984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f18985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f18986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18988e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18989f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18990g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f18991i;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i7) {
        super("\u200bkotlinx.coroutines.scheduling.CoroutineScheduler$Worker");
        this.f18991i = dVar;
        setDaemon(true);
        setContextClassLoader(dVar.getClass().getClassLoader());
        this.f18984a = new n();
        this.f18985b = new F();
        this.f18986c = c.f18995d;
        this.nextParkedWorker = d.f19001p;
        int iNanoTime = (int) System.nanoTime();
        this.f18989f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i7);
    }

    public final j a(boolean z3) {
        j jVarE;
        j jVarE2;
        d dVar;
        long j6;
        c cVar = this.f18986c;
        c cVar2 = c.f18992a;
        j jVar = null;
        n nVar = this.f18984a;
        d dVar2 = this.f18991i;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f18999j;
            do {
                dVar = this.f18991i;
                j6 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j6) >> 42)) == 0) {
                    nVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f19024b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 == null || !jVar2.f19015b) {
                            int i7 = n.f19026d.get(nVar);
                            int i10 = n.f19025c.get(nVar);
                            while (i7 != i10 && n.f19027e.get(nVar) != 0) {
                                i10--;
                                j jVarC = nVar.c(i10, true);
                                if (jVarC != null) {
                                    jVar = jVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                jVar = jVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(nVar) == jVar2);
                    }
                    if (jVar != null) {
                        return jVar;
                    }
                    j jVar3 = (j) dVar2.f19007f.d();
                    return jVar3 == null ? i(1) : jVar3;
                }
            } while (!d.f18999j.compareAndSet(dVar, j6, j6 - 4398046511104L));
            this.f18986c = c.f18992a;
        }
        if (z3) {
            boolean z8 = d(dVar2.f19002a * 2) == 0;
            if (z8 && (jVarE2 = e()) != null) {
                return jVarE2;
            }
            nVar.getClass();
            j jVarB = (j) n.f19024b.getAndSet(nVar, null);
            if (jVarB == null) {
                jVarB = nVar.b();
            }
            if (jVarB != null) {
                return jVarB;
            }
            if (!z8 && (jVarE = e()) != null) {
                return jVarE;
            }
        } else {
            j jVarE3 = e();
            if (jVarE3 != null) {
                return jVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i10 = this.f18989f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f18989f = i13;
        int i14 = i7 - 1;
        return (i14 & i7) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i7;
    }

    public final j e() {
        int iD = d(2);
        d dVar = this.f18991i;
        if (iD == 0) {
            j jVar = (j) dVar.f19006e.d();
            return jVar != null ? jVar : (j) dVar.f19007f.d();
        }
        j jVar2 = (j) dVar.f19007f.d();
        return jVar2 != null ? jVar2 : (j) dVar.f19006e.d();
    }

    public final void f(int i7) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18991i.f19005d);
        sb2.append("-worker-");
        sb2.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(ShadowThread.makeThreadName(sb2.toString(), "\u200bkotlinx.coroutines.scheduling.CoroutineScheduler$Worker"));
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        c cVar2 = this.f18986c;
        boolean z3 = cVar2 == c.f18992a;
        if (z3) {
            d.f18999j.addAndGet(this.f18991i, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f18986c = cVar;
        }
        return z3;
    }

    public final j i(int i7) {
        int i10;
        long j6;
        j jVarC;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f18999j;
        d dVar = this.f18991i;
        int i11 = (int) (atomicLongFieldUpdater.get(dVar) & 2097151);
        j jVar = null;
        if (i11 < 2) {
            return null;
        }
        int iD = d(i11);
        int i12 = 0;
        long jMin = Long.MAX_VALUE;
        while (i12 < i11) {
            int i13 = iD + 1;
            if (i13 > i11) {
                i13 = 1;
            }
            b bVar = (b) dVar.f19008g.b(i13);
            if (bVar == null || bVar == this) {
                i10 = i13;
            } else {
                n nVar = bVar.f18984a;
                if (i7 != 3) {
                    nVar.getClass();
                    int i14 = n.f19026d.get(nVar);
                    int i15 = n.f19025c.get(nVar);
                    boolean z3 = i7 == 1;
                    while (true) {
                        if (i14 != i15) {
                            j6 = 0;
                            if (!z3 || n.f19027e.get(nVar) != 0) {
                                int i16 = i14 + 1;
                                jVarC = nVar.c(i14, z3);
                                if (jVarC != null) {
                                    break;
                                }
                                i14 = i16;
                            }
                        } else {
                            j6 = 0;
                        }
                        jVarC = jVar;
                        break;
                    }
                } else {
                    jVarC = nVar.b();
                    j6 = 0;
                }
                F f10 = this.f18985b;
                if (jVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f19024b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(nVar);
                        if (jVar2 == null) {
                            j10 = -1;
                        } else {
                            j10 = -1;
                            if (((jVar2.f19015b ? 1 : 2) & i7) != 0) {
                                l.f19022f.getClass();
                                i10 = i13;
                                long jNanoTime = System.nanoTime() - jVar2.f19014a;
                                long j12 = l.f19018b;
                                if (jNanoTime < j12) {
                                    j11 = j12 - jNanoTime;
                                    jVar = null;
                                    break;
                                }
                                do {
                                    jVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(nVar, jVar2, null)) {
                                        f10.f38951a = jVar2;
                                        j11 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(nVar) == jVar2);
                                i13 = i10;
                                jVar = null;
                            }
                        }
                        j11 = -2;
                        i10 = i13;
                        break;
                    }
                } else {
                    f10.f38951a = jVarC;
                    i10 = i13;
                    j11 = -1;
                    j10 = -1;
                }
                if (j11 == j10) {
                    j jVar3 = (j) f10.f38951a;
                    f10.f38951a = jVar;
                    return jVar3;
                }
                if (j11 > j6) {
                    jMin = Math.min(jMin, j11);
                }
            }
            i12++;
            iD = i10;
            jVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f18988e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        int i7;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                d dVar = this.f18991i;
                dVar.getClass();
                if (d.f19000o.get(dVar) != 1) {
                    c cVar = this.f18986c;
                    c cVar2 = c.f18996e;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j jVarA = a(this.f18990g);
                    if (jVarA == null) {
                        this.f18990g = false;
                        if (this.f18988e == 0) {
                            Object obj = this.nextParkedWorker;
                            a0 a0Var = d.f19001p;
                            long j10 = 2097151;
                            if (obj != a0Var) {
                                f18983j.set(this, -1);
                                while (this.nextParkedWorker != d.f19001p) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f18983j;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    d dVar2 = this.f18991i;
                                    dVar2.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = d.f19000o;
                                    if (atomicIntegerFieldUpdater2.get(dVar2) == 1) {
                                        break;
                                    }
                                    c cVar3 = this.f18986c;
                                    c cVar4 = c.f18996e;
                                    if (cVar3 == cVar4) {
                                        break;
                                    }
                                    h(c.f18994c);
                                    Thread.interrupted();
                                    if (this.f18987d == 0) {
                                        this.f18987d = System.nanoTime() + this.f18991i.f19004c;
                                    }
                                    LockSupport.parkNanos(this.f18991i.f19004c);
                                    if (System.nanoTime() - this.f18987d >= 0) {
                                        this.f18987d = 0L;
                                        d dVar3 = this.f18991i;
                                        synchronized (dVar3.f19008g) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(dVar3) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = d.f18999j;
                                                    if (((int) (atomicLongFieldUpdater2.get(dVar3) & j10)) > dVar3.f19002a) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i10 = this.indexInArray;
                                                            f(0);
                                                            dVar3.d(this, i10, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(dVar3) & j10);
                                                            if (andDecrement != i10) {
                                                                Object objB = dVar3.f19008g.b(andDecrement);
                                                                Intrinsics.e(objB);
                                                                b bVar = (b) objB;
                                                                dVar3.f19008g.c(i10, bVar);
                                                                bVar.f(i10);
                                                                dVar3.d(bVar, andDecrement, i10);
                                                            }
                                                            dVar3.f19008g.c(andDecrement, null);
                                                            Unit unit = Unit.f38893a;
                                                            this.f18986c = cVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    j10 = j10;
                                }
                            } else {
                                d dVar4 = this.f18991i;
                                dVar4.getClass();
                                if (this.nextParkedWorker == a0Var) {
                                    do {
                                        atomicLongFieldUpdater = d.f18998i;
                                        j6 = atomicLongFieldUpdater.get(dVar4);
                                        i7 = this.indexInArray;
                                        this.nextParkedWorker = dVar4.f19008g.b((int) (j6 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(dVar4, j6, ((2097152 + j6) & (-2097152)) | ((long) i7)));
                                }
                            }
                        } else {
                            if (z3) {
                                h(c.f18994c);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f18988e);
                                this.f18988e = 0L;
                                break;
                            }
                            z3 = true;
                        }
                    } else {
                        this.f18988e = 0L;
                        this.f18987d = 0L;
                        if (this.f18986c == c.f18994c) {
                            this.f18986c = c.f18993b;
                        }
                        boolean z8 = jVarA.f19015b;
                        d dVar5 = this.f18991i;
                        if (!z8) {
                            dVar5.getClass();
                            try {
                                jVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(c.f18993b) && !dVar5.f() && !dVar5.e(d.f18999j.get(dVar5))) {
                            dVar5.f();
                        }
                        dVar5.getClass();
                        try {
                            jVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        d.f18999j.addAndGet(dVar5, -2097152L);
                        if (this.f18986c == cVar2) {
                            break;
                        }
                        this.f18986c = c.f18995d;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(c.f18996e);
    }
}
