package Yf;

import Pa.a0;
import Wf.AbstractC0780y;
import Wf.C0765i;
import com.google.common.primitives.Longs;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public class n implements Channel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11411b = AtomicLongFieldUpdater.newUpdater(n.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11412c = AtomicLongFieldUpdater.newUpdater(n.class, "receivers$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11413d = AtomicLongFieldUpdater.newUpdater(n.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11414e = AtomicLongFieldUpdater.newUpdater(n.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11415f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11416g = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11417i = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11418j = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11419o = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11420a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public n(int i7) {
        this.f11420a = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        w wVar = p.f11422a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f11413d.get(this);
        w wVar2 = new w(0L, null, this, 3);
        this.sendSegment$volatile = wVar2;
        this.receiveSegment$volatile = wVar2;
        if (s()) {
            wVar2 = p.f11422a;
            Intrinsics.f(wVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = wVar2;
        this._closeCause$volatile = p.f11440s;
    }

    public static final w a(n nVar, long j6, w wVar) {
        Object objB;
        n nVar2;
        w wVar2 = p.f11422a;
        o oVar = o.f11421a;
        loop0: while (true) {
            objB = p015ag.a.b(wVar, j6, oVar);
            if (!p015ag.a.e(objB)) {
                p015ag.s sVarC = p015ag.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11415f;
                    p015ag.s sVar = (p015ag.s) atomicReferenceFieldUpdater.get(nVar);
                    if (sVar.f11964c >= sVarC.f11964c) {
                        break loop0;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(nVar, sVar, sVarC)) {
                            if (!sVar.e()) {
                                break loop0;
                            }
                            sVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(nVar) == sVar);
                    if (sVarC.e()) {
                        sVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = p015ag.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
        if (zE) {
            nVar.isClosedForSend();
            if (wVar.f11964c * ((long) p.f11423b) < atomicLongFieldUpdater.get(nVar)) {
                wVar.a();
                return null;
            }
        } else {
            w wVar3 = (w) p015ag.a.c(objB);
            long j10 = wVar3.f11964c;
            if (j10 <= j6) {
                return wVar3;
            }
            long j11 = ((long) p.f11423b) * j10;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11411b;
                long j12 = atomicLongFieldUpdater2.get(nVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    nVar2 = nVar;
                    break;
                }
                nVar2 = nVar;
                if (atomicLongFieldUpdater2.compareAndSet(nVar2, j12, j13 + (((long) ((int) (j12 >> 60))) << 60))) {
                    break;
                }
                nVar = nVar2;
            }
            if (j10 * ((long) p.f11423b) < atomicLongFieldUpdater.get(nVar2)) {
                wVar3.a();
            }
        }
        return null;
    }

    public static final void b(n nVar, Object obj, C0765i c0765i) {
        Throwable thM = nVar.m();
        p355xf.o oVar = p355xf.q.f43977a;
        c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(thM));
    }

    public static final void c(n nVar, SelectInstance selectInstance) {
        w wVar;
        Object obj;
        nVar.getClass();
        w wVar2 = (w) f11416g.get(nVar);
        while (!nVar.isClosedForReceive()) {
            long andIncrement = f11412c.getAndIncrement(nVar);
            long j6 = p.f11423b;
            long j10 = andIncrement / j6;
            int i7 = (int) (andIncrement % j6);
            if (wVar2.f11964c != j10) {
                w wVarJ = nVar.j(j10, wVar2);
                if (wVarJ == null) {
                    continue;
                } else {
                    wVar = wVarJ;
                }
            } else {
                wVar = wVar2;
            }
            Object objB = nVar.B(wVar, i7, andIncrement, selectInstance);
            wVar2 = wVar;
            if (objB == p.f11434m) {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) obj : null;
                if (waiter == null) {
                    obj = selectInstance;
                    return;
                } else {
                    obj = selectInstance;
                    waiter.invokeOnCancellation(wVar2, i7);
                    return;
                }
            }
            if (objB != p.f11436o) {
                if (objB == p.f11435n) {
                    throw new IllegalStateException("unexpected");
                }
                wVar2.a();
                selectInstance.selectInRegistrationPhase(objB);
                return;
            }
            if (andIncrement < nVar.n()) {
                wVar2.a();
            }
            nVar = nVar;
            selectInstance = selectInstance;
        }
        selectInstance.selectInRegistrationPhase(p.f11433l);
    }

    public static final int d(n nVar, w wVar, int i7, Object obj, long j6, Object obj2, boolean z3) {
        wVar.m(i7, obj);
        if (z3) {
            return nVar.C(wVar, i7, obj, j6, obj2, z3);
        }
        Object objK = wVar.k(i7);
        if (objK == null) {
            if (nVar.e(j6)) {
                if (wVar.j(i7, null, p.f11425d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (wVar.j(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof Waiter) {
            wVar.m(i7, null);
            if (nVar.z(objK, obj)) {
                wVar.n(i7, p.f11430i);
                return 0;
            }
            a0 a0Var = p.f11432k;
            if (wVar.f11451f.getAndSet((i7 * 2) + 1, a0Var) == a0Var) {
                return 5;
            }
            wVar.l(i7, true);
            return 5;
        }
        return nVar.C(wVar, i7, obj, j6, obj2, z3);
    }

    public static void p(n nVar) {
        nVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11414e;
        if ((atomicLongFieldUpdater.addAndGet(nVar, 1L) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((atomicLongFieldUpdater.get(nVar) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object v(n nVar, Continuation continuation) {
        l lVar;
        w wVar;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i7 = lVar.f11407c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                lVar.f11407c = i7 - Integer.MIN_VALUE;
            } else {
                lVar = new l(nVar, continuation);
            }
        } else {
            lVar = new l(nVar, continuation);
        }
        l lVar2 = lVar;
        Object obj = lVar2.f11405a;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = lVar2.f11407c;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return ((v) obj).f11449a;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        w wVar2 = (w) f11416g.get(nVar);
        while (!nVar.isClosedForReceive()) {
            long andIncrement = f11412c.getAndIncrement(nVar);
            long j6 = p.f11423b;
            long j10 = andIncrement / j6;
            int i11 = (int) (andIncrement % j6);
            if (wVar2.f11964c != j10) {
                w wVarJ = nVar.j(j10, wVar2);
                if (wVarJ == null) {
                    continue;
                } else {
                    wVar = wVarJ;
                }
            } else {
                wVar = wVar2;
            }
            n nVar2 = nVar;
            Object objB = nVar2.B(wVar, i11, andIncrement, null);
            if (objB == p.f11434m) {
                throw new IllegalStateException("unexpected");
            }
            if (objB != p.f11436o) {
                if (objB != p.f11435n) {
                    wVar.a();
                    return v.f11447b.m69successJP2dKIU(objB);
                }
                lVar2.f11407c = 1;
                Object objW = nVar2.w(wVar, i11, andIncrement, lVar2);
                return objW == aVar ? aVar : objW;
            }
            if (andIncrement < nVar2.n()) {
                wVar.a();
            }
            nVar = nVar2;
            wVar2 = wVar;
        }
        return v.f11447b.m67closedJP2dKIU(nVar.k());
    }

    public final boolean A(Object obj, w wVar, int i7) {
        p056dg.j jVar;
        if (obj instanceof CancellableContinuation) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return p.a((CancellableContinuation) obj, Unit.f38893a, null);
        }
        if (!(obj instanceof SelectInstance)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iE = ((p056dg.g) obj).e(this, Unit.f38893a);
        if (iE == 0) {
            jVar = p056dg.j.f35967a;
        } else if (iE == 1) {
            jVar = p056dg.j.f35968b;
        } else if (iE == 2) {
            jVar = p056dg.j.f35969c;
        } else {
            if (iE != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iE).toString());
            }
            jVar = p056dg.j.f35970d;
        }
        if (jVar == p056dg.j.f35968b) {
            wVar.m(i7, null);
        }
        return jVar == p056dg.j.f35967a;
    }

    public final Object B(w wVar, int i7, long j6, Object obj) {
        Object objK = wVar.k(i7);
        AtomicReferenceArray atomicReferenceArray = wVar.f11451f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11411b;
        if (objK == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return p.f11435n;
                }
                if (wVar.j(i7, objK, obj)) {
                    i();
                    return p.f11434m;
                }
            }
        } else if (objK == p.f11425d && wVar.j(i7, objK, p.f11430i)) {
            i();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            wVar.m(i7, null);
            return obj2;
        }
        while (true) {
            Object objK2 = wVar.k(i7);
            if (objK2 == null || objK2 == p.f11426e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (wVar.j(i7, objK2, p.f11429h)) {
                        i();
                        return p.f11436o;
                    }
                } else {
                    if (obj == null) {
                        return p.f11435n;
                    }
                    if (wVar.j(i7, objK2, obj)) {
                        i();
                        return p.f11434m;
                    }
                }
            } else if (objK2 != p.f11425d) {
                a0 a0Var = p.f11431j;
                if (objK2 == a0Var) {
                    return p.f11436o;
                }
                if (objK2 == p.f11429h) {
                    return p.f11436o;
                }
                if (objK2 == p.f11433l) {
                    i();
                    return p.f11436o;
                }
                if (objK2 != p.f11428g && wVar.j(i7, objK2, p.f11427f)) {
                    boolean z3 = objK2 instanceof G;
                    if (z3) {
                        objK2 = ((G) objK2).f11389a;
                    }
                    if (A(objK2, wVar, i7)) {
                        wVar.n(i7, p.f11430i);
                        i();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        wVar.m(i7, null);
                        return obj3;
                    }
                    wVar.n(i7, a0Var);
                    wVar.h();
                    if (z3) {
                        i();
                    }
                    return p.f11436o;
                }
            } else if (wVar.j(i7, objK2, p.f11430i)) {
                i();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                wVar.m(i7, null);
                return obj4;
            }
        }
    }

    public final int C(w wVar, int i7, Object obj, long j6, Object obj2, boolean z3) {
        while (true) {
            Object objK = wVar.k(i7);
            if (objK == null) {
                if (!e(j6) || z3) {
                    if (z3) {
                        if (wVar.j(i7, null, p.f11431j)) {
                            wVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (wVar.j(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (wVar.j(i7, null, p.f11425d)) {
                    break;
                }
            } else {
                if (objK != p.f11426e) {
                    a0 a0Var = p.f11432k;
                    if (objK == a0Var) {
                        wVar.m(i7, null);
                        return 5;
                    }
                    if (objK == p.f11429h) {
                        wVar.m(i7, null);
                        return 5;
                    }
                    if (objK == p.f11433l) {
                        wVar.m(i7, null);
                        isClosedForSend();
                        return 4;
                    }
                    wVar.m(i7, null);
                    if (objK instanceof G) {
                        objK = ((G) objK).f11389a;
                    }
                    if (z(objK, obj)) {
                        wVar.n(i7, p.f11430i);
                        return 0;
                    }
                    if (wVar.f11451f.getAndSet((i7 * 2) + 1, a0Var) != a0Var) {
                        wVar.l(i7, true);
                    }
                    return 5;
                }
                if (wVar.j(i7, objK, p.f11425d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void D(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        n nVar = this;
        if (nVar.s()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f11413d;
            if (atomicLongFieldUpdater.get(nVar) > j6) {
                break;
            } else {
                nVar = this;
            }
        }
        int i7 = p.f11424c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11414e;
            if (i10 < i7) {
                long j10 = atomicLongFieldUpdater.get(nVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(nVar)) && j10 == atomicLongFieldUpdater.get(nVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(nVar);
                    if (atomicLongFieldUpdater2.compareAndSet(nVar, j11, (j11 & 4611686018427387903L) + Longs.MAX_POWER_OF_TWO)) {
                        break;
                    } else {
                        nVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(nVar);
                    long j13 = atomicLongFieldUpdater2.get(nVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z3 = (j13 & Longs.MAX_POWER_OF_TWO) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(nVar)) {
                        break;
                    }
                    if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j13, Longs.MAX_POWER_OF_TWO + j14);
                    }
                    nVar = this;
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(nVar);
                    if (atomicLongFieldUpdater2.compareAndSet(nVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        nVar = this;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        f(new CancellationException("Channel was cancelled"), true);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean close(Throwable th) {
        return f(th, false);
    }

    public final boolean e(long j6) {
        return j6 < f11413d.get(this) || j6 < f11412c.get(this) + ((long) this.f11420a);
    }

    public final boolean f(Throwable th, boolean z3) {
        n nVar;
        boolean z8;
        long j6;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11411b;
        if (!z3) {
            nVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                nVar = this;
                break;
            }
            w wVar = p.f11422a;
            nVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(nVar, j13, (j13 & 1152921504606846975L) + (((long) 1) << 60)));
        a0 a0Var = p.f11440s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11418j;
            if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, th)) {
                z8 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                z8 = false;
                break;
            }
        }
        if (z3) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(nVar, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j6 >> 60);
                if (i7 == 0) {
                    j10 = j6 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j10 = j6 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(nVar, j6, (j11 << 60) + j10));
        }
        isClosedForSend();
        if (z8) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11419o;
                obj = atomicReferenceFieldUpdater2.get(this);
                a0 a0Var2 = obj == null ? p.f11438q : p.f11439r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, a0Var2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                K.d(1, obj);
                ((Function1) obj).invoke(k());
                return z8;
            }
        }
        return z8;
    }

    public final w g(long j6) {
        Object objF;
        long j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f11417i.get(this);
        w wVar = (w) f11415f.get(this);
        if (wVar.f11964c > ((w) obj).f11964c) {
            obj = wVar;
        }
        w wVar2 = (w) f11416g.get(this);
        if (wVar2.f11964c > ((w) obj).f11964c) {
            obj = wVar2;
        }
        p015ag.b bVar = (p015ag.b) obj;
        loop0: while (true) {
            bVar.getClass();
            Object obj2 = p015ag.b.f11930a.get(bVar);
            a0 a0Var = p015ag.a.f11927a;
            objF = null;
            if (obj2 == a0Var) {
                break;
            }
            p015ag.b bVar2 = (p015ag.b) obj2;
            if (bVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = p015ag.b.f11930a;
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, a0Var)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        w wVar3 = (w) bVar;
        if (r()) {
            w wVar4 = wVar3;
            loop2: while (true) {
                int i7 = p.f11423b - 1;
                while (true) {
                    if (-1 < i7) {
                        j10 = (wVar4.f11964c * ((long) p.f11423b)) + ((long) i7);
                        if (j10 >= f11412c.get(this)) {
                            while (true) {
                                Object objK = wVar4.k(i7);
                                if (objK != null && objK != p.f11426e) {
                                    if (objK != p.f11425d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (wVar4.j(i7, objK, p.f11433l)) {
                                    wVar4.h();
                                    break;
                                }
                            }
                            i7--;
                        }
                    } else {
                        wVar4 = (w) ((p015ag.b) p015ag.b.f11931b.get(wVar4));
                        if (wVar4 == null) {
                        }
                    }
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                h(j10);
            }
        }
        loop5: for (w wVar5 = wVar3; wVar5 != null; wVar5 = (w) ((p015ag.b) p015ag.b.f11931b.get(wVar5))) {
            for (int i10 = p.f11423b - 1; -1 < i10; i10--) {
                if ((wVar5.f11964c * ((long) p.f11423b)) + ((long) i10) < j6) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = wVar5.k(i10);
                    if (objK2 != null && objK2 != p.f11426e) {
                        if (!(objK2 instanceof G)) {
                            if (!(objK2 instanceof Waiter)) {
                                break;
                            }
                            if (wVar5.j(i10, objK2, p.f11433l)) {
                                objF = p015ag.a.f(objF, objK2);
                                wVar5.l(i10, true);
                                break;
                            }
                        } else {
                            if (wVar5.j(i10, objK2, p.f11433l)) {
                                objF = p015ag.a.f(objF, ((G) objK2).f11389a);
                                wVar5.l(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (wVar5.j(i10, objK2, p.f11433l)) {
                            wVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                y((Waiter) objF, true);
                return wVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y((Waiter) arrayList.get(size), true);
            }
        }
        return wVar3;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceive() {
        C0792d c0792d = C0792d.f11397a;
        K.d(3, c0792d);
        C0793e c0793e = C0793e.f11398a;
        K.d(3, c0793e);
        return new androidx.camera.video.internal.c(this, c0792d, c0793e, (AbstractC0790b) null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceiveCatching() {
        C0794f c0794f = C0794f.f11399a;
        K.d(3, c0794f);
        C0795g c0795g = C0795g.f11400a;
        K.d(3, c0795g);
        return new androidx.camera.video.internal.c(this, c0794f, c0795g, (AbstractC0790b) null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 getOnReceiveOrNull() {
        h hVar = h.f11401a;
        K.d(3, hVar);
        i iVar = i.f11402a;
        K.d(3, iVar);
        return new androidx.camera.video.internal.c(this, hVar, iVar, (AbstractC0790b) null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final SelectClause2 getOnSend() {
        j jVar = j.f11403a;
        K.d(3, jVar);
        k kVar = k.f11404a;
        K.d(3, kVar);
        return new O2.a(this, jVar, kVar, null);
    }

    public final void h(long j6) {
        w wVar = (w) f11416g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(((long) this.f11420a) + j10, f11413d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = p.f11423b;
                long j12 = j10 / j11;
                int i7 = (int) (j10 % j11);
                if (wVar.f11964c != j12) {
                    w wVarJ = j(j12, wVar);
                    if (wVarJ != null) {
                        wVar = wVarJ;
                    }
                }
                w wVar2 = wVar;
                if (B(wVar2, i7, j10, null) != p.f11436o || j10 < n()) {
                    wVar2.a();
                }
                wVar = wVar2;
            }
        }
    }

    public final void i() {
        Object objB;
        if (s()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11417i;
        w wVar = (w) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f11413d.getAndIncrement(this);
            long j6 = andIncrement / ((long) p.f11423b);
            if (n() <= andIncrement) {
                if (wVar.f11964c < j6 && wVar.b() != null) {
                    t(j6, wVar);
                }
                p(this);
                return;
            }
            if (wVar.f11964c != j6) {
                o oVar = o.f11421a;
                while (true) {
                    objB = p015ag.a.b(wVar, j6, oVar);
                    if (!p015ag.a.e(objB)) {
                        p015ag.s sVarC = p015ag.a.c(objB);
                        while (true) {
                            p015ag.s sVar = (p015ag.s) atomicReferenceFieldUpdater.get(this);
                            if (sVar.f11964c >= sVarC.f11964c) {
                                break;
                            }
                            if (!sVarC.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                                    if (!sVar.e()) {
                                        break;
                                    }
                                    sVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == sVar);
                            if (sVarC.e()) {
                                sVarC.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                w wVar2 = null;
                if (p015ag.a.e(objB)) {
                    isClosedForSend();
                    t(j6, wVar);
                    p(this);
                } else {
                    w wVar3 = (w) p015ag.a.c(objB);
                    long j10 = wVar3.f11964c;
                    if (j10 > j6) {
                        long j11 = j10 * ((long) p.f11423b);
                        if (f11413d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f11414e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & Longs.MAX_POWER_OF_TWO) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
                                }
                            }
                        } else {
                            p(this);
                        }
                    } else {
                        wVar2 = wVar3;
                    }
                }
                if (wVar2 == null) {
                    continue;
                } else {
                    wVar = wVar2;
                }
            }
            int i7 = (int) (andIncrement % ((long) p.f11423b));
            Object objK = wVar.k(i7);
            boolean z3 = objK instanceof Waiter;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11412c;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !wVar.j(i7, objK, p.f11428g)) {
                while (true) {
                    Object objK2 = wVar.k(i7);
                    if (objK2 instanceof Waiter) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (wVar.j(i7, objK2, new G((Waiter) objK2))) {
                                p(this);
                                return;
                            }
                        } else if (wVar.j(i7, objK2, p.f11428g)) {
                            if (!A(objK2, wVar, i7)) {
                                wVar.n(i7, p.f11431j);
                                wVar.h();
                                break;
                            } else {
                                wVar.n(i7, p.f11425d);
                                p(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == p.f11431j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (wVar.j(i7, objK2, p.f11426e)) {
                                p(this);
                                return;
                            }
                        } else if (objK2 == p.f11425d || objK2 == p.f11429h || objK2 == p.f11430i || objK2 == p.f11432k || objK2 == p.f11433l) {
                            p(this);
                            return;
                        } else if (objK2 != p.f11427f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                p(this);
            } else if (A(objK, wVar, i7)) {
                wVar.n(i7, p.f11425d);
                p(this);
                return;
            } else {
                wVar.n(i7, p.f11431j);
                wVar.h();
                p(this);
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void invokeOnClose(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f11419o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            a0 a0Var = p.f11438q;
            if (obj != a0Var) {
                if (obj == p.f11439r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            a0 a0Var2 = p.f11439r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, a0Var2)) {
                    function1.invoke(k());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == a0Var);
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isClosedForReceive() {
        return q(f11411b.get(this), true);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return q(f11411b.get(this), false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean isEmpty() {
        if (isClosedForReceive() || o()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        return new C0791c(this);
    }

    public final w j(long j6, w wVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        w wVar2 = p.f11422a;
        o oVar = o.f11421a;
        loop0: while (true) {
            objB = p015ag.a.b(wVar, j6, oVar);
            if (!p015ag.a.e(objB)) {
                p015ag.s sVarC = p015ag.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11416g;
                    p015ag.s sVar = (p015ag.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f11964c >= sVarC.f11964c) {
                        break loop0;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                            if (!sVar.e()) {
                                break loop0;
                            }
                            sVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (sVarC.e()) {
                        sVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        if (p015ag.a.e(objB)) {
            isClosedForSend();
            if (wVar.f11964c * ((long) p.f11423b) < n()) {
                wVar.a();
                return null;
            }
        } else {
            w wVar3 = (w) p015ag.a.c(objB);
            boolean zS = s();
            long j11 = wVar3.f11964c;
            if (!zS && j6 <= f11413d.get(this) / ((long) p.f11423b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11417i;
                    p015ag.s sVar2 = (p015ag.s) atomicReferenceFieldUpdater2.get(this);
                    if (sVar2.f11964c >= j11 || !wVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, wVar3)) {
                            if (!sVar2.e()) {
                                break loop3;
                            }
                            sVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == sVar2);
                    if (wVar3.e()) {
                        wVar3.d();
                    }
                }
            }
            if (j11 <= j6) {
                return wVar3;
            }
            long j12 = j11 * ((long) p.f11423b);
            do {
                atomicLongFieldUpdater = f11412c;
                j10 = atomicLongFieldUpdater.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j12));
            if (j11 * ((long) p.f11423b) < n()) {
                wVar3.a();
            }
        }
        return null;
    }

    public final Throwable k() {
        return (Throwable) f11418j.get(this);
    }

    public final Throwable l() {
        Throwable thK = k();
        return thK == null ? new y("Channel was closed") : thK;
    }

    public final Throwable m() {
        Throwable thK = k();
        return thK == null ? new z("Channel was closed") : thK;
    }

    public final long n() {
        return f11411b.get(this) & 1152921504606846975L;
    }

    public final boolean o() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11416g;
            w wVarJ = (w) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
            long j6 = atomicLongFieldUpdater.get(this);
            if (n() <= j6) {
                return false;
            }
            int i7 = p.f11423b;
            long j10 = j6 / ((long) i7);
            if (wVarJ.f11964c == j10 || (wVarJ = j(j10, wVarJ)) != null) {
                wVarJ.a();
                int i10 = (int) (j6 % ((long) i7));
                while (true) {
                    Object objK = wVarJ.k(i10);
                    if (objK != null && objK != p.f11426e) {
                        if (objK != p.f11425d) {
                            if (objK != p.f11431j && objK != p.f11433l && objK != p.f11430i && objK != p.f11429h) {
                                if (objK != p.f11428g) {
                                    if (objK == p.f11427f || j6 != atomicLongFieldUpdater.get(this)) {
                                        break;
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            }
                            break;
                            break;
                            break;
                            break;
                        }
                        return true;
                    }
                    if (wVarJ.j(i10, objK, p.f11429h)) {
                        i();
                        break;
                    }
                }
                f11412c.compareAndSet(this, j6, j6 + 1);
            } else if (((w) atomicReferenceFieldUpdater.get(this)).f11964c < j10) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) throws Throwable {
        Object objMo64trySendJP2dKIU = mo64trySendJP2dKIU(obj);
        t tVar = v.f11447b;
        if (!(objMo64trySendJP2dKIU instanceof u)) {
            return true;
        }
        Throwable thA = v.a(objMo64trySendJP2dKIU);
        if (thA == null) {
            return false;
        }
        int i7 = p015ag.t.f11965a;
        throw thA;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object poll() throws Throwable {
        Object objMo66tryReceivePtdJZtk = mo66tryReceivePtdJZtk();
        t tVar = v.f11447b;
        boolean z3 = objMo66tryReceivePtdJZtk instanceof u;
        if (z3) {
            Throwable thA = v.a(objMo66tryReceivePtdJZtk);
            if (thA == null) {
                return null;
            }
            int i7 = p015ag.t.f11965a;
            throw thA;
        }
        if (!z3) {
            return objMo66tryReceivePtdJZtk;
        }
        if (!(objMo66tryReceivePtdJZtk instanceof s)) {
            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
        }
        Throwable th = ((s) objMo66tryReceivePtdJZtk).f11446a;
        if (th != null) {
            throw th;
        }
        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
    }

    public final boolean q(long j6, boolean z3) {
        int i7 = (int) (j6 >> 60);
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                g(j6 & 1152921504606846975L);
                if (!z3 || !o()) {
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(C0.G.m(i7, "unexpected close status: ").toString());
                }
                w wVarG = g(j6 & 1152921504606846975L);
                Object objF = null;
                loop0: do {
                    for (int i10 = p.f11423b - 1; -1 < i10; i10--) {
                        long j10 = (wVarG.f11964c * ((long) p.f11423b)) + ((long) i10);
                        while (true) {
                            Object objK = wVarG.k(i10);
                            if (objK == p.f11430i) {
                                break loop0;
                            }
                            a0 a0Var = p.f11425d;
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
                            if (objK != a0Var) {
                                if (objK != p.f11426e && objK != null) {
                                    if (!(objK instanceof Waiter) && !(objK instanceof G)) {
                                        a0 a0Var2 = p.f11428g;
                                        if (objK == a0Var2 || objK == p.f11427f) {
                                            break loop0;
                                        }
                                        if (objK != a0Var2) {
                                            break;
                                        }
                                    } else {
                                        if (j10 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        Waiter waiter = objK instanceof G ? ((G) objK).f11389a : (Waiter) objK;
                                        if (wVarG.j(i10, objK, p.f11433l)) {
                                            objF = p015ag.a.f(objF, waiter);
                                            wVarG.m(i10, null);
                                            wVarG.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (wVarG.j(i10, objK, p.f11433l)) {
                                        wVarG.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j10 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (wVarG.j(i10, objK, p.f11433l)) {
                                    wVarG.m(i10, null);
                                    wVarG.h();
                                    break;
                                }
                            }
                        }
                    }
                    wVarG = (w) ((p015ag.b) p015ag.b.f11931b.get(wVarG));
                } while (wVarG != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            y((Waiter) arrayList.get(size), false);
                        }
                    } else {
                        y((Waiter) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean r() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receive(Continuation frame) throws Throwable {
        w wVar;
        Throwable th;
        w wVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11416g;
        w wVar3 = (w) atomicReferenceFieldUpdater.get(this);
        while (!isClosedForReceive()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j6 = p.f11423b;
            long j10 = andIncrement / j6;
            int i7 = (int) (andIncrement % j6);
            if (wVar3.f11964c != j10) {
                w wVarJ = j(j10, wVar3);
                if (wVarJ == null) {
                    continue;
                } else {
                    wVar = wVarJ;
                }
            } else {
                wVar = wVar3;
            }
            Object objB = B(wVar, i7, andIncrement, null);
            a0 a0Var = p.f11434m;
            if (objB == a0Var) {
                throw new IllegalStateException("unexpected");
            }
            a0 a0Var2 = p.f11436o;
            if (objB == a0Var2) {
                if (andIncrement < n()) {
                    wVar.a();
                }
                wVar3 = wVar;
            } else {
                if (objB != p.f11435n) {
                    wVar.a();
                    return objB;
                }
                C0765i c0765iJ = AbstractC0780y.j(Ef.f.b(frame));
                n nVar = this;
                try {
                    Object objB2 = nVar.B(wVar, i7, andIncrement, c0765iJ);
                    if (objB2 == a0Var) {
                        c0765iJ.invokeOnCancellation(wVar, i7);
                    } else if (objB2 == a0Var2) {
                        if (andIncrement < n()) {
                            wVar.a();
                        }
                        w wVar4 = (w) atomicReferenceFieldUpdater.get(this);
                        while (true) {
                            if (isClosedForReceive()) {
                                p355xf.o oVar = p355xf.q.f43977a;
                                c0765iJ.resumeWith(androidx.camera.core.impl.utils.executor.g.f(l()));
                                break;
                            }
                            C0765i c0765i = c0765iJ;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                long j11 = p.f11423b;
                                long j12 = andIncrement2 / j11;
                                int i10 = (int) (andIncrement2 % j11);
                                if (wVar4.f11964c != j12) {
                                    try {
                                        w wVarJ2 = j(j12, wVar4);
                                        if (wVarJ2 == null) {
                                            c0765iJ = c0765i;
                                        } else {
                                            wVar2 = wVarJ2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c0765iJ = c0765i;
                                        c0765iJ.s();
                                        throw th;
                                    }
                                } else {
                                    wVar2 = wVar4;
                                }
                                Object objB3 = nVar.B(wVar2, i10, andIncrement2, c0765i);
                                w wVar5 = wVar2;
                                c0765iJ = c0765i;
                                if (objB3 == p.f11434m) {
                                    c0765iJ.invokeOnCancellation(wVar5, i10);
                                    break;
                                }
                                if (objB3 != p.f11436o) {
                                    if (objB3 == p.f11435n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    wVar5.a();
                                    c0765iJ.resume(objB3, (Function3) null);
                                    break;
                                }
                                if (andIncrement2 < n()) {
                                    wVar5.a();
                                }
                                nVar = this;
                                wVar4 = wVar5;
                            } catch (Throwable th3) {
                                th = th3;
                                c0765iJ = c0765i;
                                th = th;
                                c0765iJ.s();
                                throw th;
                            }
                        }
                    } else {
                        wVar.a();
                        c0765iJ.resume(objB2, (Function3) null);
                    }
                    Object objM = c0765iJ.m();
                    if (objM == Ef.a.f2423a) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return objM;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thL = l();
        int i11 = p015ag.t.f11965a;
        throw thL;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public final Object mo65receiveCatchingJP2dKIU(Continuation continuation) {
        return v(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object receiveOrNull(Continuation continuation) {
        return p140j8.f.z(this, continuation);
    }

    public final boolean s() {
        long j6 = f11413d.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0182 A[RETURN] */
    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(Object obj, Continuation frame) throws Throwable {
        Unit unit;
        Object objM;
        Ef.a aVar;
        Object obj2;
        n nVar;
        w wVar;
        boolean z3;
        n nVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11415f;
        w wVar2 = (w) atomicReferenceFieldUpdater.get(nVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11411b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(nVar2);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zQ = nVar2.q(andIncrement, false);
            int i7 = p.f11423b;
            long j10 = i7;
            long j11 = j6 / j10;
            int i10 = (int) (j6 % j10);
            if (wVar2.f11964c != j11) {
                w wVarA = a(nVar2, j11, wVar2);
                if (wVarA != null) {
                    wVar2 = wVarA;
                } else if (zQ) {
                    Object objU = u(obj, frame);
                    if (objU != Ef.a.f2423a) {
                        break;
                    }
                    return objU;
                }
            }
            int iD = d(nVar2, wVar2, i10, obj, j6, null, zQ);
            if (iD == 0) {
                wVar2.a();
            } else {
                if (iD == 1) {
                    break;
                }
                if (iD != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11412c;
                    if (iD == 3) {
                        C0765i c0765iJ = AbstractC0780y.j(Ef.f.b(frame));
                        Object obj3 = obj;
                        try {
                            int iD2 = d(nVar2, wVar2, i10, obj3, j6, c0765iJ, false);
                            try {
                                if (iD2 == 0) {
                                    wVar2.a();
                                    p355xf.o oVar = p355xf.q.f43977a;
                                    unit = Unit.f38893a;
                                } else if (iD2 != 1) {
                                    if (iD2 != 2) {
                                        if (iD2 != 4) {
                                            String str = "unexpected";
                                            if (iD2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            wVar2.a();
                                            w wVar3 = (w) atomicReferenceFieldUpdater.get(nVar2);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(nVar2);
                                                long j12 = andIncrement2 & 1152921504606846975L;
                                                boolean zQ2 = nVar2.q(andIncrement2, false);
                                                int i11 = p.f11423b;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                long j13 = i11;
                                                str = str;
                                                long j14 = j12 / j13;
                                                int i12 = (int) (j12 % j13);
                                                if (wVar3.f11964c != j14) {
                                                    w wVarA2 = a(nVar2, j14, wVar3);
                                                    if (wVarA2 != null) {
                                                        z3 = zQ2;
                                                        wVar = wVarA2;
                                                    } else if (zQ2) {
                                                        b(nVar2, obj3, c0765iJ);
                                                        break;
                                                    }
                                                } else {
                                                    wVar = wVar3;
                                                    z3 = zQ2;
                                                }
                                                int iD3 = d(nVar2, wVar, i12, obj3, j12, c0765iJ, z3);
                                                Object obj4 = obj3;
                                                nVar = nVar2;
                                                w wVar4 = wVar;
                                                obj2 = obj4;
                                                if (iD3 == 0) {
                                                    wVar4.a();
                                                    p355xf.o oVar2 = p355xf.q.f43977a;
                                                    unit = Unit.f38893a;
                                                } else if (iD3 == 1) {
                                                    p355xf.o oVar3 = p355xf.q.f43977a;
                                                    unit = Unit.f38893a;
                                                } else if (iD3 == 2) {
                                                    if (!z3) {
                                                        c0765iJ.invokeOnCancellation(wVar4, i12 + i11);
                                                        break;
                                                    }
                                                    wVar4.h();
                                                } else {
                                                    if (iD3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iD3 != 4) {
                                                        if (iD3 == 5) {
                                                            wVar4.a();
                                                        }
                                                        wVar3 = wVar4;
                                                        nVar2 = nVar;
                                                        obj3 = obj2;
                                                    } else if (j12 < atomicLongFieldUpdater2.get(nVar)) {
                                                        wVar4.a();
                                                    }
                                                }
                                            }
                                            c0765iJ.s();
                                            throw th;
                                        }
                                        obj2 = obj3;
                                        nVar = nVar2;
                                        if (j6 < atomicLongFieldUpdater2.get(nVar)) {
                                            wVar2.a();
                                        }
                                        b(nVar, obj2, c0765iJ);
                                        break;
                                    } else {
                                        c0765iJ.invokeOnCancellation(wVar2, i10 + i7);
                                    }
                                    objM = c0765iJ.m();
                                    aVar = Ef.a.f2423a;
                                    if (objM == aVar) {
                                        Intrinsics.checkNotNullParameter(frame, "frame");
                                    }
                                    if (objM != aVar) {
                                        objM = Unit.f38893a;
                                    }
                                    if (objM == aVar) {
                                        return objM;
                                    }
                                } else {
                                    p355xf.o oVar4 = p355xf.q.f43977a;
                                    unit = Unit.f38893a;
                                }
                                c0765iJ.resumeWith(unit);
                                objM = c0765iJ.m();
                                aVar = Ef.a.f2423a;
                                if (objM == aVar) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                if (objM != aVar) {
                                    objM = Unit.f38893a;
                                }
                                if (objM == aVar) {
                                    return objM;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        if (iD == 4) {
                            if (j6 < atomicLongFieldUpdater2.get(nVar2)) {
                                wVar2.a();
                            }
                            Object objU2 = u(obj, frame);
                            if (objU2 != Ef.a.f2423a) {
                                break;
                            }
                            return objU2;
                        }
                        if (iD == 5) {
                            wVar2.a();
                        }
                    }
                } else if (zQ) {
                    wVar2.h();
                    Object objU3 = u(obj, frame);
                    if (objU3 == Ef.a.f2423a) {
                        return objU3;
                    }
                }
            }
            return Unit.f38893a;
        }
        return Unit.f38893a;
    }

    public final void t(long j6, w wVar) {
        w wVar2;
        w wVar3;
        while (wVar.f11964c < j6 && (wVar3 = (w) wVar.b()) != null) {
            wVar = wVar3;
        }
        while (true) {
            if (!wVar.c() || (wVar2 = (w) wVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11417i;
                    p015ag.s sVar = (p015ag.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f11964c >= wVar.f11964c) {
                        return;
                    }
                    if (!wVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, wVar)) {
                            if (sVar.e()) {
                                sVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (wVar.e()) {
                        wVar.d();
                    }
                }
            } else {
                wVar = wVar2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i7 = (int) (f11411b.get(this) >> 60);
        if (i7 == 2) {
            sb2.append("closed,");
        } else if (i7 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f11420a + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z3 = true;
        List listH = C1850q.h(f11416g.get(this), f11415f.get(this), f11417i.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((w) obj) != p.f11422a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j6 = ((w) next).f11964c;
            do {
                Object next2 = it.next();
                long j10 = ((w) next2).f11964c;
                if (j6 > j10) {
                    next = next2;
                    j6 = j10;
                }
            } while (it.hasNext());
        }
        w wVar = (w) next;
        long j11 = f11412c.get(this);
        long jN = n();
        loop2: while (true) {
            int i11 = p.f11423b;
            int i12 = i10;
            while (i12 < i11) {
                long j12 = (wVar.f11964c * ((long) p.f11423b)) + ((long) i12);
                if (j12 >= jN && j12 >= j11) {
                    break loop2;
                }
                Object objK = wVar.k(i12);
                boolean z8 = z3;
                Object obj2 = wVar.f11451f.get(i12 * 2);
                if (objK instanceof CancellableContinuation) {
                    string = (j12 >= j11 || j12 < jN) ? (j12 >= jN || j12 < j11) ? "cont" : "send" : "receive";
                } else if (objK instanceof SelectInstance) {
                    string = (j12 >= j11 || j12 < jN) ? (j12 >= jN || j12 < j11) ? "select" : "onSend" : "onReceive";
                } else if (objK instanceof E) {
                    string = "receiveCatching";
                } else if (objK instanceof G) {
                    string = "EB(" + objK + ')';
                } else if (Intrinsics.c(objK, p.f11427f) || Intrinsics.c(objK, p.f11428g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(p.f11426e) && !objK.equals(p.f11430i) && !objK.equals(p.f11429h) && !objK.equals(p.f11432k) && !objK.equals(p.f11431j) && !objK.equals(p.f11433l)) {
                        string = objK.toString();
                    }
                    i12++;
                    z3 = z8;
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
                i12++;
                z3 = z8;
            }
            boolean z10 = z3;
            wVar = (w) wVar.b();
            if (wVar == null) {
                break;
            }
            z3 = z10;
            i10 = 0;
        }
        if (kotlin.text.F.y(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    public final Object mo66tryReceivePtdJZtk() {
        w wVarJ;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11412c;
        long j6 = atomicLongFieldUpdater.get(this);
        long j10 = f11411b.get(this);
        if (q(j10, true)) {
            return v.f11447b.m67closedJP2dKIU(k());
        }
        if (j6 >= (j10 & 1152921504606846975L)) {
            return v.f11447b.m68failurePtdJZtk();
        }
        Object obj = p.f11432k;
        w wVar = (w) f11416g.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            int i7 = p.f11423b;
            long j11 = andIncrement / ((long) i7);
            int i10 = (int) (andIncrement % ((long) i7));
            if (wVar.f11964c != j11) {
                wVarJ = j(j11, wVar);
                if (wVarJ == null) {
                    continue;
                }
            } else {
                wVarJ = wVar;
            }
            Object objB = B(wVarJ, i10, andIncrement, obj);
            wVar = wVarJ;
            if (objB == p.f11434m) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(wVar, i10);
                }
                D(andIncrement);
                wVar.h();
                return v.f11447b.m68failurePtdJZtk();
            }
            if (objB != p.f11436o) {
                if (objB == p.f11435n) {
                    throw new IllegalStateException("unexpected");
                }
                wVar.a();
                return v.f11447b.m69successJP2dKIU(objB);
            }
            if (andIncrement < n()) {
                wVar.a();
            }
        }
        return v.f11447b.m67closedJP2dKIU(k());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x005a A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo64trySendJP2dKIU(Object obj) {
        int iD;
        Waiter waiter;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f11411b;
        long j6 = atomicLongFieldUpdater.get(this);
        long j10 = 1152921504606846975L;
        if (q(j6, false) ? false : !e(j6 & 1152921504606846975L)) {
            return v.f11447b.m68failurePtdJZtk();
        }
        ObjectConstructor objectConstructor = p.f11431j;
        w wVar = (w) f11415f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zQ = q(andIncrement, false);
            int i7 = p.f11423b;
            long j12 = j11 / ((long) i7);
            int i10 = (int) (j11 % ((long) i7));
            if (wVar.f11964c == j12) {
                iD = d(this, wVar, i10, obj, j11, objectConstructor, zQ);
                if (iD != 0) {
                    wVar.a();
                    return v.f11447b.m69successJP2dKIU(Unit.f38893a);
                }
                if (iD != 1) {
                    return v.f11447b.m69successJP2dKIU(Unit.f38893a);
                }
                if (iD != 2) {
                    if (zQ) {
                        wVar.h();
                        return v.f11447b.m67closedJP2dKIU(m());
                    }
                    if (objectConstructor instanceof Waiter) {
                        waiter = (Waiter) objectConstructor;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        waiter.invokeOnCancellation(wVar, i10 + p.f11423b);
                    }
                    wVar.h();
                    return v.f11447b.m68failurePtdJZtk();
                }
                if (iD != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iD != 4) {
                    if (j11 < f11412c.get(this)) {
                        wVar.a();
                    }
                    return v.f11447b.m67closedJP2dKIU(m());
                }
                if (iD != 5) {
                    wVar.a();
                }
            } else {
                w wVarA = a(this, j12, wVar);
                if (wVarA != null) {
                    wVar = wVarA;
                    iD = d(this, wVar, i10, obj, j11, objectConstructor, zQ);
                    if (iD != 0) {
                        wVar.a();
                        return v.f11447b.m69successJP2dKIU(Unit.f38893a);
                    }
                    if (iD != 1) {
                        return v.f11447b.m69successJP2dKIU(Unit.f38893a);
                    }
                    if (iD != 2) {
                        if (zQ) {
                            wVar.h();
                            return v.f11447b.m67closedJP2dKIU(m());
                        }
                        if (objectConstructor instanceof Waiter) {
                            waiter = (Waiter) objectConstructor;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            waiter.invokeOnCancellation(wVar, i10 + p.f11423b);
                        }
                        wVar.h();
                        return v.f11447b.m68failurePtdJZtk();
                    }
                    if (iD != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iD != 4) {
                        if (j11 < f11412c.get(this)) {
                            wVar.a();
                        }
                        return v.f11447b.m67closedJP2dKIU(m());
                    }
                    if (iD != 5) {
                        wVar.a();
                    }
                } else if (zQ) {
                    return v.f11447b.m67closedJP2dKIU(m());
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    public final Object u(Object obj, Continuation frame) {
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        Throwable thM = m();
        p355xf.o oVar = p355xf.q.f43977a;
        c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(thM));
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object w(w wVar, int i7, long j6, Ff.c cVar) {
        m frame;
        v vVar;
        w wVarJ;
        if (cVar instanceof m) {
            frame = (m) cVar;
            int i10 = frame.f11410c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f11410c = i10 - Integer.MIN_VALUE;
            } else {
                frame = new m(this, cVar);
            }
        } else {
            frame = new m(this, cVar);
        }
        Object objM = frame.f11408a;
        Ef.a aVar = Ef.a.f2423a;
        int i11 = frame.f11410c;
        if (i11 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(objM);
            frame.f11410c = 1;
            C0765i c0765iJ = AbstractC0780y.j(Ef.f.b(frame));
            try {
                E e10 = new E(c0765iJ);
                Object objB = B(wVar, i7, j6, e10);
                if (objB != p.f11434m) {
                    if (objB == p.f11436o) {
                        if (j6 < n()) {
                            wVar.a();
                        }
                        w wVar2 = (w) f11416g.get(this);
                        while (true) {
                            if (isClosedForReceive()) {
                                p355xf.o oVar = p355xf.q.f43977a;
                                c0765iJ.resumeWith(new v(v.f11447b.m67closedJP2dKIU(k())));
                                break;
                            }
                            long andIncrement = f11412c.getAndIncrement(this);
                            long j10 = p.f11423b;
                            long j11 = andIncrement / j10;
                            int i12 = (int) (andIncrement % j10);
                            if (wVar2.f11964c != j11) {
                                wVarJ = j(j11, wVar2);
                                if (wVarJ == null) {
                                }
                            } else {
                                wVarJ = wVar2;
                            }
                            Object objB2 = B(wVarJ, i12, andIncrement, e10);
                            if (objB2 == p.f11434m) {
                                e10.invokeOnCancellation(wVarJ, i12);
                                break;
                            }
                            if (objB2 == p.f11436o) {
                                if (andIncrement < n()) {
                                    wVarJ.a();
                                }
                                wVar2 = wVarJ;
                            } else {
                                if (objB2 == p.f11435n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                wVarJ.a();
                                vVar = new v(v.f11447b.m69successJP2dKIU(objB2));
                            }
                        }
                    } else {
                        wVar.a();
                        vVar = new v(v.f11447b.m69successJP2dKIU(objB));
                    }
                    c0765iJ.resume(vVar, (Function3) null);
                    break;
                }
                e10.invokeOnCancellation(wVar, i7);
                objM = c0765iJ.m();
                if (objM == Ef.a.f2423a) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objM == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                c0765iJ.s();
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(objM);
        }
        return ((v) objM).f11449a;
    }

    public void x(SelectInstance selectInstance, Object obj) {
        w wVar;
        w wVar2 = (w) f11415f.get(this);
        while (true) {
            long andIncrement = f11411b.getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zQ = q(andIncrement, false);
            int i7 = p.f11423b;
            long j10 = i7;
            long j11 = j6 / j10;
            int i10 = (int) (j6 % j10);
            if (wVar2.f11964c != j11) {
                w wVarA = a(this, j11, wVar2);
                if (wVarA != null) {
                    wVar = wVarA;
                } else if (zQ) {
                    selectInstance.selectInRegistrationPhase(p.f11433l);
                    return;
                }
            } else {
                wVar = wVar2;
            }
            SelectInstance selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iD = d(this, wVar, i10, obj2, j6, selectInstance2, zQ);
            wVar2 = wVar;
            if (iD == 0) {
                wVar2.a();
                selectInstance2.selectInRegistrationPhase(Unit.f38893a);
                return;
            }
            if (iD == 1) {
                selectInstance2.selectInRegistrationPhase(Unit.f38893a);
                return;
            }
            if (iD == 2) {
                if (zQ) {
                    wVar2.h();
                    selectInstance2.selectInRegistrationPhase(p.f11433l);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        waiter.invokeOnCancellation(wVar2, i10 + i7);
                        return;
                    }
                    return;
                }
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iD == 4) {
                if (j6 < f11412c.get(this)) {
                    wVar2.a();
                }
                selectInstance2.selectInRegistrationPhase(p.f11433l);
                return;
            } else {
                if (iD == 5) {
                    wVar2.a();
                }
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    public final void y(Waiter waiter, boolean z3) {
        if (waiter instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) waiter;
            p355xf.o oVar = p355xf.q.f43977a;
            continuation.resumeWith(androidx.camera.core.impl.utils.executor.g.f(z3 ? l() : m()));
            return;
        }
        if (waiter instanceof E) {
            C0765i c0765i = ((E) waiter).f11386a;
            p355xf.o oVar2 = p355xf.q.f43977a;
            c0765i.resumeWith(new v(v.f11447b.m67closedJP2dKIU(k())));
            return;
        }
        if (!(waiter instanceof C0791c)) {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).trySelect(this, p.f11433l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
            }
        }
        C0791c c0791c = (C0791c) waiter;
        C0765i c0765i2 = c0791c.f11395b;
        Intrinsics.e(c0765i2);
        c0791c.f11395b = null;
        c0791c.f11394a = p.f11433l;
        Throwable thK = c0791c.f11396c.k();
        if (thK == null) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            c0765i2.resumeWith(Boolean.FALSE);
        } else {
            p355xf.o oVar4 = p355xf.q.f43977a;
            c0765i2.resumeWith(androidx.camera.core.impl.utils.executor.g.f(thK));
        }
    }

    public final boolean z(Object obj, Object obj2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, obj2);
        }
        if (obj instanceof E) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return p.a(((E) obj).f11386a, new v(v.f11447b.m69successJP2dKIU(obj2)), null);
        }
        if (!(obj instanceof C0791c)) {
            if (obj instanceof CancellableContinuation) {
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return p.a((CancellableContinuation) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C0791c c0791c = (C0791c) obj;
        C0765i c0765i = c0791c.f11395b;
        Intrinsics.e(c0765i);
        c0791c.f11395b = null;
        c0791c.f11394a = obj2;
        return p.a(c0765i, Boolean.TRUE, null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return f(th, true);
    }
}
