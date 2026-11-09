package Wf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NotCompleted;
import kotlinx.coroutines.Waiter;

/* JADX INFO: renamed from: Wf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0765i extends G implements CancellableContinuation, CoroutineStackFrame, Waiter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10863f = AtomicIntegerFieldUpdater.newUpdater(C0765i.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10864g = AtomicReferenceFieldUpdater.newUpdater(C0765i.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10865i = AtomicReferenceFieldUpdater.newUpdater(C0765i.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Continuation f10866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f10867e;

    public C0765i(int i7, Continuation continuation) {
        super(i7);
        this.f10866d = continuation;
        this.f10867e = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0754b.f10837a;
    }

    public static void q(NotCompleted notCompleted, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + notCompleted + ", already has " + obj).toString());
    }

    public static Object u(NotCompleted notCompleted, Object obj, int i7, Function3 function3, Object obj2) {
        if (obj instanceof C0771o) {
            return obj;
        }
        if ((i7 == 1 || i7 == 2 || obj2 != null) && !(function3 == null && !(notCompleted instanceof CancelHandler) && obj2 == null)) {
            return new C0770n(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function3, obj2, null, 16);
        }
        return obj;
    }

    @Override // Wf.G
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof NotCompleted) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0771o) {
                return;
            }
            if (!(obj instanceof C0770n)) {
                cancellationException2 = cancellationException;
                C0770n c0770n = new C0770n(obj, null, null, null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0770n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0770n c0770n2 = (C0770n) obj;
            if (c0770n2.f10887e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0770n c0770nA = C0770n.a(c0770n2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0770nA)) {
                    CancelHandler cancelHandler = c0770n2.f10884b;
                    if (cancelHandler != null) {
                        g(cancelHandler, cancellationException);
                    }
                    Function3 function3 = c0770n2.f10885c;
                    if (function3 != null) {
                        h(function3, cancellationException, c0770n2.f10883a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // Wf.G
    public final Continuation b() {
        return this.f10866d;
    }

    @Override // Wf.G
    public final Throwable c(Object obj) {
        Throwable thC = super.c(obj);
        if (thC != null) {
            return thC;
        }
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean cancel(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            boolean z3 = (obj instanceof CancelHandler) || (obj instanceof p015ag.s);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0766j c0766j = new C0766j(cancellationException, z3);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0766j)) {
                    NotCompleted notCompleted = (NotCompleted) obj;
                    if (notCompleted instanceof CancelHandler) {
                        g((CancelHandler) obj, th);
                    } else if (notCompleted instanceof p015ag.s) {
                        i((p015ag.s) obj, th);
                    }
                    if (!p()) {
                        j();
                    }
                    k(this.f10808c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void completeResume(Object obj) {
        k(this.f10808c);
    }

    @Override // Wf.G
    public final Object d(Object obj) {
        return obj instanceof C0770n ? ((C0770n) obj).f10883a : obj;
    }

    @Override // Wf.G
    public final Object f() {
        return f10864g.get(this);
    }

    public final void g(CancelHandler cancelHandler, Throwable th) {
        try {
            cancelHandler.invoke(th);
        } catch (Throwable th2) {
            AbstractC0776u.a(this.f10867e, new P0.c(1, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f10866d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f10867e;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(Function3 function3, Throwable th, Object obj) {
        CoroutineContext coroutineContext = this.f10867e;
        try {
            function3.invoke(th, obj, coroutineContext);
        } catch (Throwable th2) {
            AbstractC0776u.a(coroutineContext, new P0.c(1, "Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void i(p015ag.s sVar, Throwable th) {
        CoroutineContext coroutineContext = this.f10867e;
        int i7 = f10863f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i7, coroutineContext);
        } catch (Throwable th2) {
            AbstractC0776u.a(coroutineContext, new P0.c(1, "Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void initCancellability() {
        DisposableHandle disposableHandleN = n();
        if (disposableHandleN != null && isCompleted()) {
            disposableHandleN.dispose();
            f10865i.set(this, s0.f10897a);
        }
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(p015ag.s sVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f10863f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i7));
        o(sVar);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isActive() {
        return f10864g.get(this) instanceof NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isCancelled() {
        return f10864g.get(this) instanceof C0766j;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean isCompleted() {
        return !(f10864g.get(this) instanceof NotCompleted);
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10865i;
        DisposableHandle disposableHandle = (DisposableHandle) atomicReferenceFieldUpdater.get(this);
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.dispose();
        atomicReferenceFieldUpdater.set(this, s0.f10897a);
    }

    public final void k(int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f10863f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i7 == 4;
                Continuation continuation = this.f10866d;
                if (!z3 && (continuation instanceof p015ag.f)) {
                    boolean z8 = i7 == 1 || i7 == 2;
                    int i12 = this.f10808c;
                    if (z8 == (i12 == 1 || i12 == 2)) {
                        p015ag.f fVar = (p015ag.f) continuation;
                        AbstractC0774s abstractC0774s = fVar.f11936d;
                        CoroutineContext context = fVar.f11937e.getContext();
                        if (p015ag.a.i(abstractC0774s, context)) {
                            p015ag.a.h(abstractC0774s, context, this);
                            return;
                        }
                        S sA = w0.a();
                        if (sA.f10824c >= 4294967296L) {
                            sA.f(this);
                            return;
                        }
                        sA.h(true);
                        try {
                            AbstractC0780y.o(this, continuation, true);
                            do {
                            } while (sA.j());
                        } catch (Throwable th) {
                            try {
                                e(th);
                            } finally {
                                sA.e(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0780y.o(this, continuation, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable l(n0 n0Var) {
        return n0Var.getCancellationException();
    }

    public final Object m() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean zP = p();
        do {
            atomicIntegerFieldUpdater = f10863f;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i10 = i7 >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zP) {
                    s();
                }
                Object obj = f10864g.get(this);
                if (obj instanceof C0771o) {
                    throw ((C0771o) obj).f10891a;
                }
                int i11 = this.f10808c;
                if (i11 == 1 || i11 == 2) {
                    Job job = (Job) this.f10867e.get(C0753a0.f10836a);
                    if (job != null && !job.isActive()) {
                        CancellationException cancellationException = job.getCancellationException();
                        a(cancellationException);
                        throw cancellationException;
                    }
                }
                return d(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((DisposableHandle) f10865i.get(this)) == null) {
            n();
        }
        if (zP) {
            s();
        }
        return Ef.a.f2423a;
    }

    public final DisposableHandle n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job = (Job) this.f10867e.get(C0753a0.f10836a);
        if (job == null) {
            return null;
        }
        DisposableHandle disposableHandleL = AbstractC0780y.l(job, true, new C0767k(this, 0));
        do {
            atomicReferenceFieldUpdater = f10865i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, disposableHandleL)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return disposableHandleL;
    }

    public final void o(NotCompleted notCompleted) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0754b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, notCompleted)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof CancelHandler) || (obj instanceof p015ag.s)) {
                q(notCompleted, obj);
                throw null;
            }
            if (obj instanceof C0771o) {
                C0771o c0771o = (C0771o) obj;
                c0771o.getClass();
                if (!C0771o.f10890b.compareAndSet(c0771o, 0, 1)) {
                    q(notCompleted, obj);
                    throw null;
                }
                if (obj instanceof C0766j) {
                    if (obj == null) {
                        c0771o = null;
                    }
                    Throwable th = c0771o != null ? c0771o.f10891a : null;
                    if (notCompleted instanceof CancelHandler) {
                        g((CancelHandler) notCompleted, th);
                        return;
                    } else {
                        Intrinsics.f(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        i((p015ag.s) notCompleted, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0770n)) {
                if (notCompleted instanceof p015ag.s) {
                    return;
                }
                Intrinsics.f(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0770n c0770n = new C0770n(obj, (CancelHandler) notCompleted, null, null, null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0770n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0770n c0770n2 = (C0770n) obj;
            if (c0770n2.f10884b != null) {
                q(notCompleted, obj);
                throw null;
            }
            if (notCompleted instanceof p015ag.s) {
                return;
            }
            Intrinsics.f(notCompleted, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            CancelHandler cancelHandler = (CancelHandler) notCompleted;
            Throwable th2 = c0770n2.f10887e;
            if (th2 != null) {
                g(cancelHandler, th2);
                return;
            }
            C0770n c0770nA = C0770n.a(c0770n2, cancelHandler, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0770nA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean p() {
        if (this.f10808c != 2) {
            return false;
        }
        Continuation continuation = this.f10866d;
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return p015ag.f.f11935i.get((p015ag.f) continuation) != null;
    }

    public String r() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object obj, Function1 function1) {
        t(obj, this.f10808c, function1 != null ? new Uc.t0(function1, 1) : null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatched(AbstractC0774s abstractC0774s, Object obj) {
        Continuation continuation = this.f10866d;
        p015ag.f fVar = continuation instanceof p015ag.f ? (p015ag.f) continuation : null;
        t(obj, (fVar != null ? fVar.f11936d : null) == abstractC0774s ? 4 : this.f10808c, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resumeUndispatchedWithException(AbstractC0774s abstractC0774s, Throwable th) {
        Continuation continuation = this.f10866d;
        p015ag.f fVar = continuation instanceof p015ag.f ? (p015ag.f) continuation : null;
        t(new C0771o(th, false), (fVar != null ? fVar.f11936d : null) == abstractC0774s ? 4 : this.f10808c, null);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = p355xf.q.a(obj);
        if (thA != null) {
            obj = new C0771o(thA, false);
        }
        t(obj, this.f10808c, null);
    }

    public final void s() {
        Continuation continuation = this.f10866d;
        Throwable th = null;
        p015ag.f fVar = continuation instanceof p015ag.f ? (p015ag.f) continuation : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p015ag.f.f11935i;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                Pa.a0 a0Var = p015ag.a.f11929c;
                if (obj != a0Var) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, a0Var, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == a0Var);
            }
            if (th == null) {
                return;
            }
            j();
            cancel(th);
        }
    }

    public final void t(Object obj, int i7, Function3 function3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof C0766j) {
                    C0766j c0766j = (C0766j) obj2;
                    c0766j.getClass();
                    if (C0766j.f10871c.compareAndSet(c0766j, 0, 1)) {
                        if (function3 != null) {
                            h(function3, c0766j.f10891a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objU = u((NotCompleted) obj2, obj, i7, function3, null);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objU)) {
                    if (!p()) {
                        j();
                    }
                    k(i7);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r());
        sb2.append('(');
        sb2.append(AbstractC0780y.q(this.f10866d));
        sb2.append("){");
        Object obj = f10864g.get(this);
        if (obj instanceof NotCompleted) {
            str = "Active";
        } else {
            str = obj instanceof C0766j ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(AbstractC0780y.i(this));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object obj, Object obj2) {
        return v(obj, obj2, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResumeWithException(Throwable th) {
        return v(new C0771o(th, false), null, null);
    }

    public final Pa.a0 v(Object obj, Object obj2, Function3 function3) {
        Pa.a0 a0Var;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj3 instanceof NotCompleted;
            a0Var = AbstractC0780y.f10909a;
            if (z3) {
                Object objU = u((NotCompleted) obj3, obj, this.f10808c, function3, obj2);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, objU)) {
                        if (p()) {
                            break loop0;
                        }
                        j();
                        return a0Var;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else if (!(obj3 instanceof C0770n) || obj2 == null || ((C0770n) obj3).f10886d != obj2) {
                return null;
            }
        }
        return a0Var;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void resume(Object obj, Function3 function3) {
        t(obj, this.f10808c, function3);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final Object tryResume(Object obj, Object obj2, Function3 function3) {
        return v(obj, obj2, function3);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void invokeOnCancellation(Function1 function1) {
        AbstractC0780y.k(this, new C0764h(function1, 1));
    }
}
