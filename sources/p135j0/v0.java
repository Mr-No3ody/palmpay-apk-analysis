package p135j0;

import Ef.a;
import Pa.C0525w;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InterProcessCoordinator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.sync.Mutex;
import p072eg.e;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements InterProcessCoordinator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f38154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0525w f38155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f38156c;

    public v0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f38154a = new e();
        this.f38155b = new C0525w(23);
        this.f38156c = new T(new u0(2, null));
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Flow getUpdateNotifications() {
        return this.f38156c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object getVersion(Continuation continuation) {
        return new Integer(((AtomicInteger) this.f38155b.f7166b).get());
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object incrementAndGetVersion(Continuation continuation) {
        return new Integer(((AtomicInteger) this.f38155b.f7166b).incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object lock(Function1 function1, Continuation continuation) throws Throwable {
        s0 s0Var;
        e eVar;
        Throwable th;
        Mutex mutex;
        if (continuation instanceof s0) {
            s0Var = (s0) continuation;
            int i7 = s0Var.f38137e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                s0Var.f38137e = i7 - Integer.MIN_VALUE;
            } else {
                s0Var = new s0(this, continuation);
            }
        } else {
            s0Var = new s0(this, continuation);
        }
        Object obj = s0Var.f38135c;
        a aVar = a.f2423a;
        int i10 = s0Var.f38137e;
        try {
            if (i10 == 0) {
                g.M(obj);
                s0Var.f38133a = function1;
                eVar = this.f38154a;
                s0Var.f38134b = eVar;
                s0Var.f38137e = 1;
                if (eVar.lock(null, s0Var) != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) s0Var.f38133a;
                try {
                    g.M(obj);
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            e eVar2 = s0Var.f38134b;
            Function1 function2 = (Function1) s0Var.f38133a;
            g.M(obj);
            eVar = eVar2;
            function1 = function2;
            s0Var.f38133a = eVar;
            s0Var.f38134b = null;
            s0Var.f38137e = 2;
            Object objInvoke = function1.invoke(s0Var);
            if (objInvoke != aVar) {
                e eVar3 = eVar;
                obj = objInvoke;
                mutex = eVar3;
                mutex.unlock(null);
                return obj;
            }
            return aVar;
        } catch (Throwable th3) {
            e eVar4 = eVar;
            th = th3;
            mutex = eVar4;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object tryLock(Function2 function2, Continuation continuation) throws Throwable {
        t0 t0Var;
        e eVar;
        Throwable th;
        boolean z3;
        if (continuation instanceof t0) {
            t0Var = (t0) continuation;
            int i7 = t0Var.f38146e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                t0Var.f38146e = i7 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(this, continuation);
            }
        } else {
            t0Var = new t0(this, continuation);
        }
        Object obj = t0Var.f38144c;
        a aVar = a.f2423a;
        int i10 = t0Var.f38146e;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = t0Var.f38143b;
            eVar = t0Var.f38142a;
            try {
                g.M(obj);
                if (z3) {
                    eVar.unlock(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z3) {
                    eVar.unlock(null);
                }
                throw th;
            }
        }
        g.M(obj);
        e eVar2 = this.f38154a;
        boolean zTryLock = eVar2.tryLock(null);
        try {
            Boolean boolValueOf = Boolean.valueOf(zTryLock);
            t0Var.f38142a = eVar2;
            t0Var.f38143b = zTryLock;
            t0Var.f38146e = 1;
            Object objInvoke = function2.invoke(boolValueOf, t0Var);
            if (objInvoke == aVar) {
                return aVar;
            }
            eVar = eVar2;
            obj = objInvoke;
            z3 = zTryLock;
            if (z3) {
                eVar.unlock(null);
            }
            return obj;
        } catch (Throwable th3) {
            eVar = eVar2;
            th = th3;
            z3 = zTryLock;
            if (z3) {
                eVar.unlock(null);
            }
            throw th;
        }
    }
}
