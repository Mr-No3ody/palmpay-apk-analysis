package Wf;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: Wf.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0780y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pa.a0 f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pa.a0 f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pa.a0 f10912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pa.a0 f10913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pa.a0 f10914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pa.a0 f10915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pa.a0 f10916h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pa.a0 f10909a = new Pa.a0("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final L f10917i = new L(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final L f10918j = new L(true);

    static {
        int i7 = 1;
        f10910b = new Pa.a0("REMOVED_TASK", i7);
        f10911c = new Pa.a0("CLOSED_EMPTY", i7);
        int i10 = 1;
        f10912d = new Pa.a0("COMPLETING_ALREADY", i10);
        f10913e = new Pa.a0("COMPLETING_WAITING_CHILDREN", i10);
        f10914f = new Pa.a0("COMPLETING_RETRY", i10);
        f10915g = new Pa.a0("TOO_LATE_TO_CANCEL", i10);
        f10916h = new Pa.a0("SEALED", i10);
    }

    public static C0769m a() {
        C0769m c0769m = new C0769m(true);
        c0769m.s(null);
        return c0769m;
    }

    public static C0757c0 b() {
        return new C0757c0(null);
    }

    public static v0 c() {
        return new v0(null);
    }

    public static B d(CoroutineScope coroutineScope, p042cg.e eVar, Function2 function2, int i7) {
        CoroutineContext coroutineContext = eVar;
        if ((i7 & 1) != 0) {
            coroutineContext = kotlin.coroutines.f.f38943a;
        }
        EnumC0778w enumC0778w = EnumC0778w.f10900a;
        CoroutineContext coroutineContextB = AbstractC0773q.b(coroutineScope, coroutineContext);
        EnumC0778w enumC0778w2 = EnumC0778w.f10900a;
        B b7 = new B(coroutineContextB, true);
        b7.L(enumC0778w, b7, function2);
        return b7;
    }

    public static final Object e(ArrayList arrayList, Ff.h frame) {
        if (arrayList.isEmpty()) {
            return kotlin.collections.z.f38935a;
        }
        Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
        C0760e c0760e = new C0760e(deferredArr);
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        int length = deferredArr.length;
        C0756c[] c0756cArr = new C0756c[length];
        for (int i7 = 0; i7 < length; i7++) {
            Deferred deferred = deferredArr[i7];
            deferred.start();
            C0756c c0756c = new C0756c(c0760e, c0765i);
            c0756c.f10841f = l(deferred, true, c0756c);
            Unit unit = Unit.f38893a;
            c0756cArr[i7] = c0756c;
        }
        C0758d c0758d = new C0758d(c0756cArr);
        for (int i10 = 0; i10 < length; i10++) {
            C0756c c0756c2 = c0756cArr[i10];
            c0756c2.getClass();
            C0756c.f10839i.set(c0756c2, c0758d);
        }
        if (c0765i.isCompleted()) {
            c0758d.a();
        } else {
            k(c0765i, c0758d);
        }
        Object objM = c0765i.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }

    public static Object f(Delay delay, long j6, Continuation frame) {
        if (j6 <= 0) {
            return Unit.f38893a;
        }
        C0765i c0765i = new C0765i(1, Ef.f.b(frame));
        c0765i.initCancellability();
        delay.scheduleResumeAfterDelay(j6, c0765i);
        Object objM = c0765i.m();
        Ef.a aVar = Ef.a.f2423a;
        if (objM == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM == aVar ? objM : Unit.f38893a;
    }

    public static final void g(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(C0753a0.f10836a);
        if (job != null && !job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final AbstractC0774s h(Executor executor) {
        if (executor instanceof H) {
        }
        return new U(executor);
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0765i j(Continuation continuation) {
        C0765i c0765i;
        C0765i c0765i2;
        if (!(continuation instanceof p015ag.f)) {
            return new C0765i(1, continuation);
        }
        p015ag.f fVar = (p015ag.f) continuation;
        fVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p015ag.f.f11935i;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            Pa.a0 a0Var = p015ag.a.f11929c;
            c0765i = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, a0Var);
                c0765i2 = null;
                break;
            }
            if (obj instanceof C0765i) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, a0Var)) {
                        c0765i2 = (C0765i) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != a0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0765i2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0765i.f10864g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0765i2);
            if (!(obj2 instanceof C0770n) || ((C0770n) obj2).f10886d == null) {
                C0765i.f10863f.set(c0765i2, 536870911);
                atomicReferenceFieldUpdater2.set(c0765i2, C0754b.f10837a);
                c0765i = c0765i2;
            } else {
                c0765i2.j();
            }
            if (c0765i != null) {
                return c0765i;
            }
        }
        return new C0765i(2, continuation);
    }

    public static final void k(CancellableContinuation cancellableContinuation, CancelHandler cancelHandler) {
        if (!(cancellableContinuation instanceof C0765i)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C0765i) cancellableContinuation).o(cancelHandler);
    }

    public static final DisposableHandle l(Job job, boolean z3, AbstractC0761e0 abstractC0761e0) {
        if (job instanceof n0) {
            return ((n0) job).t(z3, abstractC0761e0);
        }
        return job.invokeOnCompletion(abstractC0761e0.g(), z3, new C0759d0(1, abstractC0761e0, AbstractC0761e0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static t0 m(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC0778w enumC0778w, Function2 function2, int i7) {
        if ((i7 & 1) != 0) {
            coroutineContext = kotlin.coroutines.f.f38943a;
        }
        if ((i7 & 2) != 0) {
            enumC0778w = EnumC0778w.f10900a;
        }
        CoroutineContext coroutineContextB = AbstractC0773q.b(coroutineScope, coroutineContext);
        t0 o0Var = enumC0778w == EnumC0778w.f10901b ? new o0(coroutineContextB, function2) : new t0(coroutineContextB, true);
        o0Var.L(enumC0778w, o0Var, function2);
        return o0Var;
    }

    public static final Object n(Object obj) {
        if (obj instanceof C0771o) {
            p355xf.o oVar = p355xf.q.f43977a;
            return androidx.camera.core.impl.utils.executor.g.f(((C0771o) obj).f10891a);
        }
        p355xf.o oVar2 = p355xf.q.f43977a;
        return obj;
    }

    public static final void o(C0765i c0765i, Continuation continuation, boolean z3) {
        Object objD;
        Object obj = C0765i.f10864g.get(c0765i);
        Throwable thC = c0765i.c(obj);
        if (thC != null) {
            p355xf.o oVar = p355xf.q.f43977a;
            objD = androidx.camera.core.impl.utils.executor.g.f(thC);
        } else {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objD = c0765i.d(obj);
        }
        if (!z3) {
            continuation.resumeWith(objD);
            return;
        }
        Intrinsics.f(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        p015ag.f fVar = (p015ag.f) continuation;
        Continuation continuation2 = fVar.f11937e;
        CoroutineContext context = continuation2.getContext();
        Object objC = p015ag.v.c(context, fVar.f11939g);
        B0 b0C = objC != p015ag.v.f11967a ? AbstractC0773q.c(continuation2, context, objC) : null;
        try {
            continuation2.resumeWith(objD);
            Unit unit = Unit.f38893a;
        } finally {
            if (b0C == null || b0C.N()) {
                p015ag.v.a(context, objC);
            }
        }
    }

    public static Object p(Function2 function2) throws Throwable {
        kotlin.coroutines.f fVar = kotlin.coroutines.f.f38943a;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = ContinuationInterceptor.f38936l0;
        fVar.get(dVar);
        S context = w0.a();
        Intrinsics.checkNotNullParameter(context, "context");
        CoroutineContext coroutineContextA = AbstractC0773q.a(fVar, context, true);
        p042cg.f fVar2 = I.f10809a;
        if (coroutineContextA != fVar2 && coroutineContextA.get(dVar) == null) {
            coroutineContextA = coroutineContextA.plus(fVar2);
        }
        C0762f c0762f = new C0762f(coroutineContextA, threadCurrentThread, context);
        c0762f.L(EnumC0778w.f10900a, c0762f, function2);
        S s3 = c0762f.f10850e;
        if (s3 != null) {
            int i7 = S.f10823f;
            s3.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jI = s3 != null ? s3.i() : Long.MAX_VALUE;
                if (c0762f.isCompleted()) {
                    if (s3 != null) {
                        int i10 = S.f10823f;
                        s3.e(false);
                    }
                    Object objR = r(n0.f10888a.get(c0762f));
                    C0771o c0771o = objR instanceof C0771o ? (C0771o) objR : null;
                    if (c0771o == null) {
                        return objR;
                    }
                    throw c0771o.f10891a;
                }
                LockSupport.parkNanos(c0762f, jI);
            } catch (Throwable th) {
                if (s3 != null) {
                    int i11 = S.f10823f;
                    s3.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0762f.d(interruptedException);
        throw interruptedException;
    }

    public static final String q(Continuation continuation) {
        Object objF;
        if (continuation instanceof p015ag.f) {
            return ((p015ag.f) continuation).toString();
        }
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            objF = continuation + '@' + i(continuation);
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        if (p355xf.q.a(objF) != null) {
            objF = continuation.getClass().getName() + '@' + i(continuation);
        }
        return (String) objF;
    }

    public static final Object r(Object obj) {
        Incomplete incomplete;
        X x3 = obj instanceof X ? (X) obj : null;
        return (x3 == null || (incomplete = x3.f10830a) == null) ? obj : incomplete;
    }

    public static final Object s(CoroutineContext coroutineContext, Function2 function2, Continuation frame) throws Throwable {
        Object objR;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new Ab.y(8))).booleanValue() ? context.plus(coroutineContext) : AbstractC0773q.a(context, coroutineContext, false);
        g(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            p015ag.r rVar = new p015ag.r(frame, coroutineContextPlus);
            objR = p377z5.l.J(rVar, rVar, function2);
        } else {
            kotlin.coroutines.d dVar = ContinuationInterceptor.f38936l0;
            if (Intrinsics.c(coroutineContextPlus.get(dVar), context.get(dVar))) {
                B0 b0 = new B0(frame, coroutineContextPlus);
                CoroutineContext coroutineContext2 = b0.f10835c;
                Object objC = p015ag.v.c(coroutineContext2, null);
                try {
                    Object objJ = p377z5.l.J(b0, b0, function2);
                    p015ag.v.a(coroutineContext2, objC);
                    objR = objJ;
                } catch (Throwable th) {
                    p015ag.v.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                F f10 = new F(frame, coroutineContextPlus);
                p264r5.a.H(function2, f10, f10);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F.f10807e;
                    int i7 = atomicIntegerFieldUpdater.get(f10);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objR = r(n0.f10888a.get(f10));
                        if (!(objR instanceof C0771o)) {
                            break;
                        }
                        throw ((C0771o) objR).f10891a;
                    }
                    if (atomicIntegerFieldUpdater.compareAndSet(f10, 0, 1)) {
                        objR = Ef.a.f2423a;
                        break;
                    }
                }
            }
        }
        if (objR == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    public static final Object t(long j6, Function2 function2, Ff.c frame) throws Throwable {
        Object c0771o;
        Object objW;
        if (j6 <= 0) {
            throw new y0("Timed out immediately", null);
        }
        z0 z0Var = new z0(j6, frame);
        l(z0Var, true, new K(D.c(z0Var.f11962d.getContext()).invokeOnTimeout(z0Var.f10922e, z0Var, z0Var.f10835c), 0));
        try {
            kotlin.jvm.internal.K.d(2, function2);
            c0771o = function2.invoke(z0Var, z0Var);
        } catch (Throwable th) {
            c0771o = new C0771o(th, false);
        }
        Ef.a aVar = Ef.a.f2423a;
        if (c0771o == aVar || (objW = z0Var.w(c0771o)) == f10913e) {
            c0771o = aVar;
        } else if (objW instanceof C0771o) {
            Throwable th2 = ((C0771o) objW).f10891a;
            if (!(th2 instanceof y0) || ((y0) th2).f10919a != z0Var) {
                throw th2;
            }
            if (c0771o instanceof C0771o) {
                throw ((C0771o) c0771o).f10891a;
            }
        } else {
            c0771o = r(objW);
        }
        if (c0771o == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return c0771o;
    }
}
