package p015ag;

import C0.G;
import Pa.a0;
import Wf.AbstractC0773q;
import Wf.AbstractC0774s;
import Wf.B0;
import Wf.C0753a0;
import Wf.C0771o;
import Wf.E;
import Wf.S;
import Wf.w0;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import p355xf.C2126e;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f11927a = new a0("CLOSED", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a0 f11928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f11929c;

    static {
        int i7 = 1;
        f11928b = new a0("UNDEFINED", i7);
        f11929c = new a0("REUSABLE_CLAIMED", i7);
    }

    public static final void a(int i7) {
        if (i7 < 1) {
            throw new IllegalArgumentException(G.m(i7, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j6, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (sVar.f11964c >= j6 && !sVar.c()) {
                return sVar;
            }
            Object obj = b.f11930a.get(sVar);
            a0 a0Var = f11927a;
            if (obj == a0Var) {
                return a0Var;
            }
            s sVar2 = (s) ((b) obj);
            if (sVar2 == null) {
                sVar2 = (s) function2.invoke(Long.valueOf(sVar.f11964c + 1), sVar);
                do {
                    atomicReferenceFieldUpdater = b.f11930a;
                    if (atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                        if (sVar.c()) {
                            sVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(sVar) == null);
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != f11927a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(CoroutineContext coroutineContext, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f11933a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).handleException(coroutineContext, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    C2126e.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            C2126e.a(th, new e(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f11927a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(Object obj, Continuation continuation) {
        if (!(continuation instanceof f)) {
            continuation.resumeWith(obj);
            return;
        }
        f fVar = (f) continuation;
        Throwable thA = q.a(obj);
        Object c0771o = thA == null ? obj : new C0771o(thA, false);
        AbstractC0774s abstractC0774s = fVar.f11936d;
        Continuation continuation2 = fVar.f11937e;
        if (i(abstractC0774s, continuation2.getContext())) {
            fVar.f11938f = c0771o;
            fVar.f10808c = 1;
            h(fVar.f11936d, continuation2.getContext(), fVar);
            return;
        }
        S sA = w0.a();
        if (sA.f10824c >= 4294967296L) {
            fVar.f11938f = c0771o;
            fVar.f10808c = 1;
            sA.f(fVar);
            return;
        }
        sA.h(true);
        try {
            Job job = (Job) continuation2.getContext().get(C0753a0.f10836a);
            if (job == null || job.isActive()) {
                Object obj2 = fVar.f11939g;
                CoroutineContext context = continuation2.getContext();
                Object objC = v.c(context, obj2);
                B0 b0C = objC != v.f11967a ? AbstractC0773q.c(continuation2, context, objC) : null;
                try {
                    continuation2.resumeWith(obj);
                    Unit unit = Unit.f38893a;
                    if (b0C == null || b0C.N()) {
                        v.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (b0C == null || b0C.N()) {
                        v.a(context, objC);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(g.f(job.getCancellationException()));
            }
            while (sA.j()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.e(th2);
            } finally {
                sA.e(true);
            }
        }
    }

    public static final void h(AbstractC0774s abstractC0774s, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            abstractC0774s.a(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new E(th, abstractC0774s, coroutineContext);
        }
    }

    public static final boolean i(AbstractC0774s abstractC0774s, CoroutineContext coroutineContext) throws E {
        try {
            return abstractC0774s.c(coroutineContext);
        } catch (Throwable th) {
            throw new E(th, abstractC0774s, coroutineContext);
        }
    }

    public static final long j(String str, long j6, long j10, long j11) {
        String property;
        int i7 = u.f11966a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j6;
        }
        Long lU = StringsKt.U(property);
        if (lU == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lU.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' should be in range ");
        sb2.append(j10);
        u.v(sb2, "..", j11, ", but is '");
        sb2.append(jLongValue);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int k(int i7, int i10, String str) {
        return (int) j(str, i7, 1, (i10 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
