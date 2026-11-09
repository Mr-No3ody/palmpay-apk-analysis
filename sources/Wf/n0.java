package Wf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ParentJob;
import kotlinx.coroutines.selects.SelectClause0;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes4.dex */
public class n0 implements Job, ChildJob, ParentJob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10888a = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10889b = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public n0(boolean z3) {
        this._state$volatile = z3 ? AbstractC0780y.f10918j : AbstractC0780y.f10917i;
    }

    public static String F(Object obj) {
        if (!(obj instanceof h0)) {
            if (obj instanceof Incomplete) {
                return ((Incomplete) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C0771o ? "Cancelled" : "Completed";
        }
        h0 h0Var = (h0) obj;
        if (h0Var.c()) {
            return "Cancelling";
        }
        return h0.f10859b.get(h0Var) == 1 ? "Completing" : "Active";
    }

    public static CancellationException G(n0 n0Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C0755b0(n0Var.g(), th, n0Var) : cancellationException;
    }

    public static C0768l y(p015ag.j jVar) {
        while (jVar.e()) {
            p015ag.j jVarB = jVar.b();
            if (jVarB == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p015ag.j.f11948b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (p015ag.j) obj;
                    if (!jVar.e()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarB;
            }
        }
        while (true) {
            jVar = jVar.d();
            if (!jVar.e()) {
                if (jVar instanceof C0768l) {
                    return (C0768l) jVar;
                }
                if (jVar instanceof q0) {
                    return null;
                }
            }
        }
    }

    public final void C(L l5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q0 q0Var = new q0();
        Object w3 = q0Var;
        if (!l5.f10813a) {
            w3 = new W(q0Var);
        }
        do {
            atomicReferenceFieldUpdater = f10888a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, l5, w3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == l5);
    }

    public final void D(AbstractC0761e0 abstractC0761e0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        q0 q0Var = new q0();
        abstractC0761e0.getClass();
        p015ag.j.f11948b.set(q0Var, abstractC0761e0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p015ag.j.f11947a;
        atomicReferenceFieldUpdater2.set(q0Var, abstractC0761e0);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC0761e0) == abstractC0761e0) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0761e0, abstractC0761e0, q0Var)) {
                    q0Var.c(abstractC0761e0);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0761e0) == abstractC0761e0);
        }
        p015ag.j jVarD = abstractC0761e0.d();
        do {
            atomicReferenceFieldUpdater = f10888a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0761e0, jVarD)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0761e0);
    }

    public final int E(Object obj) {
        boolean z3 = obj instanceof L;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10888a;
        if (z3) {
            if (((L) obj).f10813a) {
                return 0;
            }
            L l5 = AbstractC0780y.f10918j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            B();
            return 1;
        }
        if (!(obj instanceof W)) {
            return 0;
        }
        q0 q0Var = ((W) obj).f10829a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        B();
        return 1;
    }

    public final Object H(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof Incomplete)) {
            return AbstractC0780y.f10912d;
        }
        if (((obj instanceof L) || (obj instanceof AbstractC0761e0)) && !(obj instanceof C0768l) && !(obj2 instanceof C0771o)) {
            Incomplete incomplete = (Incomplete) obj;
            Object x3 = obj2 instanceof Incomplete ? new X((Incomplete) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f10888a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, x3)) {
                    A(obj2);
                    i(incomplete, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == incomplete);
            return AbstractC0780y.f10914f;
        }
        Incomplete incomplete2 = (Incomplete) obj;
        q0 q0VarP = p(incomplete2);
        if (q0VarP == null) {
            return AbstractC0780y.f10914f;
        }
        h0 h0Var = incomplete2 instanceof h0 ? (h0) incomplete2 : null;
        if (h0Var == null) {
            h0Var = new h0(q0VarP, null);
        }
        synchronized (h0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.f10859b;
                if (atomicIntegerFieldUpdater.get(h0Var) == 1) {
                    return AbstractC0780y.f10912d;
                }
                atomicIntegerFieldUpdater.set(h0Var, 1);
                if (h0Var != incomplete2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10888a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, incomplete2, h0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != incomplete2) {
                            return AbstractC0780y.f10914f;
                        }
                    }
                }
                boolean zC = h0Var.c();
                C0771o c0771o = obj2 instanceof C0771o ? (C0771o) obj2 : null;
                if (c0771o != null) {
                    h0Var.a(c0771o.f10891a);
                }
                Throwable thB = zC ? null : h0Var.b();
                Unit unit = Unit.f38893a;
                if (thB != null) {
                    z(q0VarP, thB);
                }
                C0768l c0768lY = y(q0VarP);
                if (c0768lY != null && I(h0Var, c0768lY, obj2)) {
                    return AbstractC0780y.f10913e;
                }
                q0VarP.a(new p015ag.h(2), 2);
                C0768l c0768lY2 = y(q0VarP);
                return (c0768lY2 == null || !I(h0Var, c0768lY2, obj2)) ? k(h0Var, obj2) : AbstractC0780y.f10913e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean I(h0 h0Var, C0768l c0768l, Object obj) {
        while (AbstractC0780y.l(c0768l.f10880e, false, new g0(this, h0Var, c0768l, obj)) == s0.f10897a) {
            c0768l = y(c0768l);
            if (c0768l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(ChildJob childJob) {
        C0768l c0768l = new C0768l(childJob);
        c0768l.f10848d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10888a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof L) {
                L l5 = (L) obj;
                if (l5.f10813a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0768l)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                C(l5);
            } else {
                boolean z3 = obj instanceof Incomplete;
                s0 s0Var = s0.f10897a;
                Throwable thB = null;
                if (!z3) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0771o c0771o = obj2 instanceof C0771o ? (C0771o) obj2 : null;
                    c0768l.h(c0771o != null ? c0771o.f10891a : null);
                    return s0Var;
                }
                q0 list = ((Incomplete) obj).getList();
                if (list != null) {
                    if (list.a(c0768l, 7)) {
                        break;
                    }
                    boolean zA = list.a(c0768l, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof h0) {
                        thB = ((h0) obj3).b();
                    } else {
                        C0771o c0771o2 = obj3 instanceof C0771o ? (C0771o) obj3 : null;
                        if (c0771o2 != null) {
                            thB = c0771o2.f10891a;
                        }
                    }
                    c0768l.h(thB);
                    if (zA) {
                        break;
                    }
                    return s0Var;
                }
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                D((AbstractC0761e0) obj);
            }
        }
        return c0768l;
    }

    public void b(Object obj) {
        a(obj);
    }

    public final Object c(Continuation frame) throws Throwable {
        Object obj;
        do {
            obj = f10888a.get(this);
            if (!(obj instanceof Incomplete)) {
                if (obj instanceof C0771o) {
                    throw ((C0771o) obj).f10891a;
                }
                return AbstractC0780y.r(obj);
            }
        } while (E(obj) < 0);
        f0 f0Var = new f0(this, Ef.f.b(frame));
        f0Var.initCancellability();
        AbstractC0780y.k(f0Var, new C0764h(AbstractC0780y.l(this, true, new K(f0Var, 2)), 2));
        Object objM = f0Var.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }

    @Override // kotlinx.coroutines.Job
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public boolean complete(Object obj) {
        return v(obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00bf->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0113  */
    /* JADX WARN: Code duplicated, block: B:84:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    public final boolean d(Object obj) {
        Throwable thJ;
        Object obj2;
        h0 h0Var;
        boolean z3;
        Throwable thB;
        Pa.a0 a0Var;
        Incomplete incomplete;
        q0 q0VarP;
        h0 h0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objH;
        Object objH2 = AbstractC0780y.f10912d;
        if (o()) {
            do {
                Object obj3 = f10888a.get(this);
                if (obj3 instanceof Incomplete) {
                    if (obj3 instanceof h0) {
                        h0 h0Var3 = (h0) obj3;
                        h0Var3.getClass();
                        if (h0.f10859b.get(h0Var3) == 1) {
                        }
                    }
                    objH2 = H(obj3, new C0771o(j(obj), false));
                }
                objH2 = AbstractC0780y.f10912d;
                break;
            } while (objH2 == AbstractC0780y.f10914f);
            if (objH2 != AbstractC0780y.f10913e) {
                if (objH2 == AbstractC0780y.f10912d) {
                    thJ = null;
                    loop1: while (true) {
                        obj2 = f10888a.get(this);
                        if (obj2 instanceof h0) {
                            synchronized (obj2) {
                                try {
                                    h0Var = (h0) obj2;
                                    h0Var.getClass();
                                    if (h0.f10861d.get(h0Var) == AbstractC0780y.f10916h) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        a0Var = AbstractC0780y.f10915g;
                                    } else {
                                        boolean zC = ((h0) obj2).c();
                                        if (obj == null || !zC) {
                                            if (thJ == null) {
                                                thJ = j(obj);
                                            }
                                            ((h0) obj2).a(thJ);
                                        }
                                        thB = zC ? null : ((h0) obj2).b();
                                        if (thB != null) {
                                            z(((h0) obj2).f10862a, thB);
                                        }
                                        a0Var = AbstractC0780y.f10912d;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (obj2 instanceof Incomplete) {
                            if (thJ == null) {
                                thJ = j(obj);
                            }
                            incomplete = (Incomplete) obj2;
                            if (incomplete.isActive()) {
                                q0VarP = p(incomplete);
                                if (q0VarP == null) {
                                    continue;
                                } else {
                                    h0Var2 = new h0(q0VarP, thJ);
                                    while (true) {
                                        atomicReferenceFieldUpdater = f10888a;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, h0Var2)) {
                                            z(q0VarP, thJ);
                                            a0Var = AbstractC0780y.f10912d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                        }
                                    }
                                }
                            } else {
                                objH = H(obj2, new C0771o(thJ, false));
                                if (objH != AbstractC0780y.f10912d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objH != AbstractC0780y.f10914f) {
                                    objH2 = objH;
                                    break;
                                }
                            }
                        } else {
                            a0Var = AbstractC0780y.f10915g;
                        }
                        objH2 = a0Var;
                        break;
                    }
                }
                if (objH2 != AbstractC0780y.f10912d && objH2 != AbstractC0780y.f10913e) {
                    if (objH2 == AbstractC0780y.f10915g) {
                        return false;
                    }
                    a(objH2);
                    return true;
                }
            }
        } else {
            if (objH2 == AbstractC0780y.f10912d) {
                thJ = null;
                loop1: while (true) {
                    obj2 = f10888a.get(this);
                    if (obj2 instanceof h0) {
                        synchronized (obj2) {
                            h0Var = (h0) obj2;
                            h0Var.getClass();
                            if (h0.f10861d.get(h0Var) == AbstractC0780y.f10916h) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                a0Var = AbstractC0780y.f10915g;
                            } else {
                                boolean zC2 = ((h0) obj2).c();
                                if (obj == null) {
                                    if (thJ == null) {
                                        thJ = j(obj);
                                    }
                                    ((h0) obj2).a(thJ);
                                } else {
                                    if (thJ == null) {
                                        thJ = j(obj);
                                    }
                                    ((h0) obj2).a(thJ);
                                }
                                if (zC2) {
                                }
                                if (thB != null) {
                                    z(((h0) obj2).f10862a, thB);
                                }
                                a0Var = AbstractC0780y.f10912d;
                            }
                        }
                    } else if (obj2 instanceof Incomplete) {
                        if (thJ == null) {
                            thJ = j(obj);
                        }
                        incomplete = (Incomplete) obj2;
                        if (incomplete.isActive()) {
                            q0VarP = p(incomplete);
                            if (q0VarP == null) {
                                continue;
                            } else {
                                h0Var2 = new h0(q0VarP, thJ);
                                while (true) {
                                    atomicReferenceFieldUpdater = f10888a;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, h0Var2)) {
                                        z(q0VarP, thJ);
                                        a0Var = AbstractC0780y.f10912d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                    }
                                }
                            }
                        } else {
                            objH = H(obj2, new C0771o(thJ, false));
                            if (objH != AbstractC0780y.f10912d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objH != AbstractC0780y.f10914f) {
                                objH2 = objH;
                                break;
                            }
                        }
                    } else {
                        a0Var = AbstractC0780y.f10915g;
                    }
                    objH2 = a0Var;
                    break;
                }
            }
            if (objH2 != AbstractC0780y.f10912d) {
                if (objH2 == AbstractC0780y.f10915g) {
                    return false;
                }
                a(objH2);
                return true;
            }
        }
        return true;
    }

    public void e(CancellationException cancellationException) {
        d(cancellationException);
    }

    public final boolean f(Throwable th) {
        if (!u()) {
            boolean z3 = th instanceof CancellationException;
            ChildHandle childHandle = (ChildHandle) f10889b.get(this);
            if (childHandle == null || childHandle == s0.f10897a) {
                return z3;
            }
            return childHandle.childCancelled(th) || z3;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    public String g() {
        return "Job was cancelled";
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return kotlin.coroutines.e.a(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        Object obj = f10888a.get(this);
        if (!(obj instanceof h0)) {
            if (!(obj instanceof Incomplete)) {
                return obj instanceof C0771o ? G(this, ((C0771o) obj).f10891a) : new C0755b0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thB = ((h0) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException c0755b0 = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (c0755b0 == null) {
            if (strConcat == null) {
                strConcat = g();
            }
            c0755b0 = new C0755b0(strConcat, thB, this);
        }
        return c0755b0;
    }

    @Override // kotlinx.coroutines.ParentJob
    public final CancellationException getChildJobCancellationCause() {
        Throwable thB;
        Object obj = f10888a.get(this);
        if (obj instanceof h0) {
            thB = ((h0) obj).b();
        } else if (obj instanceof C0771o) {
            thB = ((C0771o) obj).f10891a;
        } else {
            if (obj instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new C0755b0("Parent job is ".concat(F(obj)), thB, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        j0 block = new j0(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return new Kf.q(block);
    }

    public Object getCompleted() {
        return l();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object obj = f10888a.get(this);
        if (obj instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        C0771o c0771o = obj instanceof C0771o ? (C0771o) obj : null;
        if (c0771o != null) {
            return c0771o.f10891a;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return C0753a0.f10836a;
    }

    @Override // kotlinx.coroutines.Job
    public final SelectClause0 getOnJoin() {
        m0 m0Var = m0.f10882a;
        kotlin.jvm.internal.K.d(3, m0Var);
        return new androidx.camera.video.internal.c(this, m0Var);
    }

    @Override // kotlinx.coroutines.Job
    public final Job getParent() {
        ChildHandle childHandle = (ChildHandle) f10889b.get(this);
        if (childHandle != null) {
            return childHandle.getParent();
        }
        return null;
    }

    public boolean h(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return d(th) && n();
    }

    public final void i(Incomplete incomplete, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10889b;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        if (childHandle != null) {
            childHandle.dispose();
            atomicReferenceFieldUpdater.set(this, s0.f10897a);
        }
        P0.c cVar = null;
        C0771o c0771o = obj instanceof C0771o ? (C0771o) obj : null;
        Throwable th = c0771o != null ? c0771o.f10891a : null;
        if (incomplete instanceof AbstractC0761e0) {
            try {
                ((AbstractC0761e0) incomplete).h(th);
                return;
            } catch (Throwable th2) {
                r(new P0.c(1, "Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        q0 list = incomplete.getList();
        if (list != null) {
            list.a(new p015ag.h(1), 1);
            Object obj2 = p015ag.j.f11947a.get(list);
            Intrinsics.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (p015ag.j jVarD = (p015ag.j) obj2; !jVarD.equals(list); jVarD = jVarD.d()) {
                if (jVarD instanceof AbstractC0761e0) {
                    try {
                        ((AbstractC0761e0) jVarD).h(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            C2126e.a(cVar, th3);
                        } else {
                            cVar = new P0.c(1, "Exception in completion handler " + jVarD + " for " + this, th3);
                            Unit unit = Unit.f38893a;
                        }
                    }
                }
            }
            if (cVar != null) {
                r(cVar);
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return t(true, new K(function1, 1));
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object obj = f10888a.get(this);
        return (obj instanceof Incomplete) && ((Incomplete) obj).isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object obj = f10888a.get(this);
        if (obj instanceof C0771o) {
            return true;
        }
        return (obj instanceof h0) && ((h0) obj).c();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(f10888a.get(this) instanceof Incomplete);
    }

    public final Throwable j(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0755b0(g(), null, this) : th;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).getChildJobCancellationCause();
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation frame) {
        Object obj;
        do {
            obj = f10888a.get(this);
            if (!(obj instanceof Incomplete)) {
                AbstractC0780y.g(frame.getContext());
                return Unit.f38893a;
            }
        } while (E(obj) < 0);
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        AbstractC0780y.k(c0765i, new C0764h(AbstractC0780y.l(this, true, new C0767k(c0765i, 1)), 2));
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objM != aVar) {
            objM = Unit.f38893a;
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    public final Object k(h0 h0Var, Object obj) {
        Throwable thM;
        C0771o c0771o = obj instanceof C0771o ? (C0771o) obj : null;
        Throwable th = c0771o != null ? c0771o.f10891a : null;
        synchronized (h0Var) {
            h0Var.c();
            ArrayList<Throwable> arrayListD = h0Var.d(th);
            thM = m(h0Var, arrayListD);
            if (thM != null && arrayListD.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListD.size()));
                for (Throwable th2 : arrayListD) {
                    if (th2 != thM && th2 != thM && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        C2126e.a(thM, th2);
                    }
                }
            }
        }
        if (thM != null && thM != th) {
            obj = new C0771o(thM, false);
        }
        if (thM != null && (f(thM) || q(thM))) {
            Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0771o.f10890b.compareAndSet((C0771o) obj, 0, 1);
        }
        A(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10888a;
        Object x3 = obj instanceof Incomplete ? new X((Incomplete) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, h0Var, x3) && atomicReferenceFieldUpdater.get(this) == h0Var) {
        }
        i(h0Var, obj);
        return obj;
    }

    public final Object l() throws Throwable {
        Object obj = f10888a.get(this);
        if (obj instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0771o) {
            throw ((C0771o) obj).f10891a;
        }
        return AbstractC0780y.r(obj);
    }

    public final Throwable m(h0 h0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (h0Var.c()) {
                return new C0755b0(g(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof y0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof y0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return kotlin.coroutines.e.b(this, key);
    }

    public boolean n() {
        return true;
    }

    public boolean o() {
        return this instanceof C0769m;
    }

    public final q0 p(Incomplete incomplete) {
        q0 list = incomplete.getList();
        if (list != null) {
            return list;
        }
        if (incomplete instanceof L) {
            return new q0();
        }
        if (incomplete instanceof AbstractC0761e0) {
            D((AbstractC0761e0) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    @Override // kotlinx.coroutines.ChildJob
    public final void parentCancelled(ParentJob parentJob) {
        d(parentJob);
    }

    @Override // kotlinx.coroutines.Job
    public final Job plus(Job job) {
        return job;
    }

    public boolean q(Throwable th) {
        return false;
    }

    public final void s(Job job) {
        s0 s0Var = s0.f10897a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10889b;
        if (job == null) {
            atomicReferenceFieldUpdater.set(this, s0Var);
            return;
        }
        job.start();
        ChildHandle childHandleAttachChild = job.attachChild(this);
        atomicReferenceFieldUpdater.set(this, childHandleAttachChild);
        if (isCompleted()) {
            childHandleAttachChild.dispose();
            atomicReferenceFieldUpdater.set(this, s0Var);
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iE;
        do {
            iE = E(f10888a.get(this));
            if (iE == 0) {
                return false;
            }
        } while (iE != 1);
        return true;
    }

    public final DisposableHandle t(boolean z3, AbstractC0761e0 abstractC0761e0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z8;
        boolean zA;
        abstractC0761e0.f10848d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f10888a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof L;
            s0 s0Var = s0.f10897a;
            z8 = true;
            if (!z10) {
                if (!(obj instanceof Incomplete)) {
                    z8 = false;
                    break;
                }
                Incomplete incomplete = (Incomplete) obj;
                q0 list = incomplete.getList();
                if (list == null) {
                    Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    D((AbstractC0761e0) obj);
                } else {
                    if (abstractC0761e0.g()) {
                        h0 h0Var = incomplete instanceof h0 ? (h0) incomplete : null;
                        Throwable thB = h0Var != null ? h0Var.b() : null;
                        if (thB == null) {
                            zA = list.a(abstractC0761e0, 5);
                        } else if (z3) {
                            abstractC0761e0.h(thB);
                            return s0Var;
                        }
                    } else {
                        zA = list.a(abstractC0761e0, 1);
                    }
                    if (zA) {
                        break;
                    }
                }
            } else {
                L l5 = (L) obj;
                if (l5.f10813a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0761e0)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    C(l5);
                }
            }
            return s0Var;
        }
        if (z8) {
            return abstractC0761e0;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0771o c0771o = obj2 instanceof C0771o ? (C0771o) obj2 : null;
            abstractC0761e0.h(c0771o != null ? c0771o.f10891a : null);
        }
        return s0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(x() + '{' + F(f10888a.get(this)) + '}');
        sb2.append('@');
        sb2.append(AbstractC0780y.i(this));
        return sb2.toString();
    }

    public boolean u() {
        return this instanceof C0762f;
    }

    public final boolean v(Object obj) {
        Object objH;
        do {
            objH = H(f10888a.get(this), obj);
            if (objH == AbstractC0780y.f10912d) {
                return false;
            }
            if (objH == AbstractC0780y.f10913e) {
                return true;
            }
        } while (objH == AbstractC0780y.f10914f);
        a(objH);
        return true;
    }

    public final Object w(Object obj) {
        Object objH;
        do {
            objH = H(f10888a.get(this), obj);
            if (objH == AbstractC0780y.f10912d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0771o c0771o = obj instanceof C0771o ? (C0771o) obj : null;
                throw new IllegalStateException(str, c0771o != null ? c0771o.f10891a : null);
            }
        } while (objH == AbstractC0780y.f10914f);
        return objH;
    }

    public String x() {
        return getClass().getSimpleName();
    }

    public final void z(q0 q0Var, Throwable th) {
        q0Var.a(new p015ag.h(4), 4);
        Object obj = p015ag.j.f11947a.get(q0Var);
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        P0.c cVar = null;
        for (p015ag.j jVarD = (p015ag.j) obj; !jVarD.equals(q0Var); jVarD = jVarD.d()) {
            if ((jVarD instanceof AbstractC0761e0) && ((AbstractC0761e0) jVarD).g()) {
                try {
                    ((AbstractC0761e0) jVarD).h(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        C2126e.a(cVar, th2);
                    } else {
                        cVar = new P0.c(1, "Exception in completion handler " + jVarD + " for " + this, th2);
                        Unit unit = Unit.f38893a;
                    }
                }
            }
        }
        if (cVar != null) {
            r(cVar);
        }
        f(th);
    }

    @Override // kotlinx.coroutines.Job
    public /* synthetic */ boolean cancel(Throwable th) {
        e(th != null ? G(this, th) : new C0755b0(g(), null, this));
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z3, boolean z8, Function1 function1) {
        AbstractC0761e0 k2;
        if (z3) {
            k2 = new Z(function1);
        } else {
            k2 = new K(function1, 1);
        }
        return t(z8, k2);
    }

    @Override // kotlinx.coroutines.Job
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0755b0(g(), null, this);
        }
        e(cancellationException);
    }

    public void B() {
    }

    public void A(Object obj) {
    }

    public void a(Object obj) {
    }

    public void r(P0.c cVar) {
        throw cVar;
    }
}
