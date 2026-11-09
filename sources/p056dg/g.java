package p056dg;

import Ef.a;
import Ef.f;
import Ff.c;
import Pa.a0;
import Wf.AbstractC0780y;
import Wf.C0765i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.selects.SelectBuilder;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import p015ag.s;

/* JADX INFO: loaded from: classes4.dex */
public class g implements CancelHandler, SelectBuilder, SelectInstanceInternal {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35955f = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f35956a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f35958c;
    private volatile /* synthetic */ Object state$volatile = i.f35962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f35957b = new ArrayList(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35959d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f35960e = i.f35965d;

    public g(CoroutineContext coroutineContext) {
        this.f35956a = coroutineContext;
    }

    public final Object a(c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35955f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        e eVar = (e) obj;
        Object obj2 = this.f35960e;
        ArrayList<e> arrayList = this.f35957b;
        if (arrayList != null) {
            for (e eVar2 : arrayList) {
                if (eVar2 != eVar) {
                    eVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, i.f35963b);
            this.f35960e = i.f35965d;
            this.f35957b = null;
        }
        Object objInvoke = eVar.f35944c.invoke(eVar.f35942a, eVar.f35945d, obj2);
        a0 a0Var = i.f35966e;
        Object obj3 = eVar.f35945d;
        Function function = eVar.f35946e;
        if (obj3 == a0Var) {
            Intrinsics.f(function, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function1) function).invoke(cVar);
        }
        Intrinsics.f(function, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((Function2) function).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(c cVar) {
        f frame;
        g gVar;
        if (cVar instanceof f) {
            frame = (f) cVar;
            int i7 = frame.f35954d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f35954d = i7 - Integer.MIN_VALUE;
            } else {
                frame = new f(this, cVar);
            }
        } else {
            frame = new f(this, cVar);
        }
        Object obj = frame.f35952b;
        a aVar = a.f2423a;
        int i10 = frame.f35954d;
        if (i10 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            frame.f35951a = this;
            frame.f35954d = 1;
            C0765i c0765i = new C0765i(1, f.b(frame));
            c0765i.initCancellability();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35955f;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                a0 a0Var = i.f35962a;
                if (obj2 == a0Var) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0765i)) {
                            AbstractC0780y.k(c0765i, this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                } else {
                    if (!(obj2 instanceof List)) {
                        if (!(obj2 instanceof e)) {
                            throw new IllegalStateException(("unexpected state: " + obj2).toString());
                        }
                        Unit unit = Unit.f38893a;
                        e eVar = (e) obj2;
                        Object obj3 = this.f35960e;
                        Function3 function3 = eVar.f35947f;
                        c0765i.resume(unit, function3 != null ? (Function3) function3.invoke(this, eVar.f35945d, obj3) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a0Var)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                e eVarC = c(it.next());
                                Intrinsics.e(eVarC);
                                eVarC.f35948g = null;
                                eVarC.f35949h = -1;
                                d(eVarC, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                }
            }
            Object objM = c0765i.m();
            a aVar2 = a.f2423a;
            if (objM == aVar2) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objM != aVar2) {
                objM = Unit.f38893a;
            }
            if (objM != aVar) {
                gVar = this;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        gVar = frame.f35951a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        frame.f35951a = null;
        frame.f35954d = 2;
        Object objA = gVar.a(frame);
        return objA == aVar ? aVar : objA;
    }

    public final e c(Object obj) {
        ArrayList arrayList = this.f35957b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((e) obj3).f35942a == obj) {
                obj2 = obj3;
                break;
            }
        }
        e eVar = (e) obj2;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void d(e eVar, boolean z3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35955f;
        if (atomicReferenceFieldUpdater.get(this) instanceof e) {
            return;
        }
        Object obj = eVar.f35942a;
        if (!z3) {
            ArrayList arrayList = this.f35957b;
            Intrinsics.e(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).f35942a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        eVar.f35943b.invoke(obj, this, eVar.f35945d);
        if (this.f35960e != i.f35965d) {
            atomicReferenceFieldUpdater.set(this, eVar);
            return;
        }
        if (!z3) {
            ArrayList arrayList2 = this.f35957b;
            Intrinsics.e(arrayList2);
            arrayList2.add(eVar);
        }
        eVar.f35948g = this.f35958c;
        eVar.f35949h = this.f35959d;
        this.f35958c = null;
        this.f35959d = -1;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void disposeOnCompletion(DisposableHandle disposableHandle) {
        this.f35958c = disposableHandle;
    }

    public final int e(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35955f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (Intrinsics.c(obj3, i.f35963b) || (obj3 instanceof e)) {
                    return 3;
                }
                if (Intrinsics.c(obj3, i.f35964c)) {
                    return 2;
                }
                if (Intrinsics.c(obj3, i.f35962a)) {
                    List listC = C1849p.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListQ = CollectionsKt.Q((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListQ)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            e eVarC = c(obj);
            if (eVarC != null) {
                Function3 function3 = eVarC.f35947f;
                Function3 function4 = function3 != null ? (Function3) function3.invoke(this, eVarC.f35945d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, eVarC)) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj3;
                        this.f35960e = obj2;
                        Object objTryResume = cancellableContinuation.tryResume(Unit.f38893a, null, function4);
                        if (objTryResume == null) {
                            this.f35960e = i.f35965d;
                            return 2;
                        }
                        cancellableContinuation.completeResume(objTryResume);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final CoroutineContext getContext() {
        return this.f35956a;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public final void invoke(SelectClause2 selectClause2, Function2 function2) {
        invoke(selectClause2, null, function2);
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(s sVar, int i7) {
        this.f35958c = sVar;
        this.f35959d = i7;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public final void onTimeout(long j6, Function1 function1) {
        b bVar = new b(j6);
        a aVar = a.f35937a;
        K.d(3, aVar);
        invoke(new androidx.camera.video.internal.c(bVar, aVar), function1);
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void selectInRegistrationPhase(Object obj) {
        this.f35960e = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final boolean trySelect(Object obj, Object obj2) {
        return e(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public final void invoke(SelectClause0 selectClause0, Function1 function1) {
        d(new e(this, selectClause0.getClauseObject(), selectClause0.getRegFunc(), selectClause0.getProcessResFunc(), i.f35966e, function1, selectClause0.getOnCancellationConstructor()), false);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public final void invoke(SelectClause1 selectClause1, Function2 function2) {
        d(new e(this, selectClause1.getClauseObject(), selectClause1.getRegFunc(), selectClause1.getProcessResFunc(), null, function2, selectClause1.getOnCancellationConstructor()), false);
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public final void invoke(SelectClause2 selectClause2, Object obj, Function2 function2) {
        d(new e(this, selectClause2.getClauseObject(), selectClause2.getRegFunc(), selectClause2.getProcessResFunc(), obj, function2, selectClause2.getOnCancellationConstructor()), false);
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void invoke(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35955f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == i.f35963b) {
                return;
            }
            a0 a0Var = i.f35964c;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
                    ArrayList arrayList = this.f35957b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).a();
                    }
                    this.f35960e = i.f35965d;
                    this.f35957b = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }
}
