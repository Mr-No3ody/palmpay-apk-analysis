package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.C1843j;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q extends S implements Delay {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10820g = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10821i = AtomicReferenceFieldUpdater.newUpdater(Q.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10822j = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        l(runnable);
    }

    @Override // kotlinx.coroutines.Delay
    public final Object delay(long j6, Continuation continuation) {
        return AbstractC0780y.f(this, j6, continuation);
    }

    @Override // Wf.S
    public final long i() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Pa.a0 a0Var;
        Runnable runnable;
        ThreadSafeHeapNode threadSafeHeapNode;
        if (!j()) {
            m();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f10820g;
                Object obj = atomicReferenceFieldUpdater.get(this);
                a0Var = AbstractC0780y.f10911c;
                if (obj != null) {
                    if (obj instanceof p015ag.n) {
                        p015ag.n nVar = (p015ag.n) obj;
                        Object objD = nVar.d();
                        if (objD != p015ag.n.f11955h) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        p015ag.n nVarC = nVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != a0Var) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C1843j c1843j = this.f10826e;
            if (((c1843j == null || c1843j.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof p015ag.n) {
                        long j6 = p015ag.n.f11954g.get((p015ag.n) obj2);
                        if (((int) (1073741823 & j6)) != ((int) ((j6 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == a0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                P p3 = (P) f10821i.get(this);
                if (p3 != null) {
                    synchronized (p3) {
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr = p3.f11972a;
                        threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    }
                    O o10 = (O) threadSafeHeapNode;
                    if (o10 != null) {
                        long jNanoTime = o10.f10817a - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        return A.f10798a.invokeOnTimeout(j6, runnable, coroutineContext);
    }

    public void l(Runnable runnable) {
        m();
        if (!n(runnable)) {
            RunnableC0781z.f10920o.l(runnable);
            return;
        }
        Thread threadG = g();
        if (Thread.currentThread() != threadG) {
            LockSupport.unpark(threadG);
        }
    }

    public final void m() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        P p3 = (P) f10821i.get(this);
        if (p3 == null || p015ag.w.f11971b.get(p3) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (p3) {
                try {
                    ThreadSafeHeapNode[] threadSafeHeapNodeArr = p3.f11972a;
                    threadSafeHeapNodeB = null;
                    ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
                    if (threadSafeHeapNode != null) {
                        O o10 = (O) threadSafeHeapNode;
                        threadSafeHeapNodeB = ((jNanoTime - o10.f10817a) > 0L ? 1 : ((jNanoTime - o10.f10817a) == 0L ? 0 : -1)) >= 0 ? n(o10) : false ? p3.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (((O) threadSafeHeapNodeB) != null);
    }

    public final boolean n(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10820g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f10822j.get(this) == 1) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof p015ag.n)) {
                if (obj == AbstractC0780y.f10911c) {
                    break;
                }
                p015ag.n nVar = new p015ag.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            p015ag.n nVar2 = (p015ag.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                p015ag.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean o() {
        P p3;
        C1843j c1843j = this.f10826e;
        if (!(c1843j != null ? c1843j.isEmpty() : true) || ((p3 = (P) f10821i.get(this)) != null && p015ag.w.f11971b.get(p3) != 0)) {
            return false;
        }
        Object obj = f10820g.get(this);
        if (obj != null) {
            if (obj instanceof p015ag.n) {
                long j6 = p015ag.n.f11954g.get((p015ag.n) obj);
                return ((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30));
            }
            if (obj != AbstractC0780y.f10911c) {
                return false;
            }
        }
        return true;
    }

    public final void p(long j6, O o10) {
        int iA;
        Thread threadG;
        boolean z3 = f10822j.get(this) == 1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10821i;
        ThreadSafeHeapNode threadSafeHeapNode = null;
        if (z3) {
            iA = 1;
        } else {
            P p3 = (P) atomicReferenceFieldUpdater.get(this);
            if (p3 == null) {
                P p10 = new P();
                p10.f10819c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, p10) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                Intrinsics.e(obj);
                p3 = (P) obj;
            }
            iA = o10.a(j6, p3, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                k(j6, o10);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        P p11 = (P) atomicReferenceFieldUpdater.get(this);
        if (p11 != null) {
            synchronized (p11) {
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = p11.f11972a;
                threadSafeHeapNode = threadSafeHeapNodeArr != null ? threadSafeHeapNodeArr[0] : null;
            }
            threadSafeHeapNode = (O) threadSafeHeapNode;
        }
        if (threadSafeHeapNode != o10 || Thread.currentThread() == (threadG = g())) {
            return;
        }
        LockSupport.unpark(threadG);
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j6, CancellableContinuation cancellableContinuation) {
        long j10 = 0;
        if (j6 > 0) {
            j10 = j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6;
        }
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            M m7 = new M(this, j10 + jNanoTime, cancellableContinuation);
            p(jNanoTime, m7);
            AbstractC0780y.k(cancellableContinuation, new C0764h(m7, 2));
        }
    }

    @Override // Wf.S
    public void shutdown() {
        ThreadSafeHeapNode threadSafeHeapNodeB;
        w0.f10905a.set(null);
        f10822j.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10820g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Pa.a0 a0Var = AbstractC0780y.f10911c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, a0Var)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof p015ag.n) {
                ((p015ag.n) obj).b();
                break;
            } else {
                if (obj == a0Var) {
                    break;
                }
                p015ag.n nVar = new p015ag.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (i() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            P p3 = (P) f10821i.get(this);
            if (p3 == null) {
                return;
            }
            synchronized (p3) {
                threadSafeHeapNodeB = p015ag.w.f11971b.get(p3) > 0 ? p3.b(0) : null;
            }
            O o10 = (O) threadSafeHeapNodeB;
            if (o10 == null) {
                return;
            } else {
                k(jNanoTime, o10);
            }
        }
    }
}
