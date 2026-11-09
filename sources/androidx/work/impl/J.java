package androidx.work.impl;

import E.AbstractC0198c;
import N8.q0;
import V0.AbstractC0700t;
import V0.C0684c;
import V0.C0695n;
import V0.C0697p;
import V0.C0704x;
import V0.Q;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import Wf.C0753a0;
import Wf.C0757c0;
import android.content.Context;
import androidx.appcompat.widget.m1;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.model.k f18372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0684c f18376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0697p f18377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1271d f18378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WorkDatabase f18379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WorkSpecDao f18380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DependencyDao f18381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f18382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f18383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0757c0 f18384m;

    public J(m1 builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) builder.f12976f;
        this.f18372a = kVar;
        this.f18373b = (Context) builder.f12971a;
        String str = kVar.f18612a;
        this.f18374c = str;
        this.f18375d = (androidx.work.impl.utils.taskexecutor.a) builder.f12973c;
        C0684c c0684c = (C0684c) builder.f12972b;
        this.f18376e = c0684c;
        this.f18377f = c0684c.f9923d;
        this.f18378g = (C1271d) builder.f12974d;
        WorkDatabase workDatabase = (WorkDatabase) builder.f12975e;
        this.f18379h = workDatabase;
        this.f18380i = workDatabase.h();
        this.f18381j = workDatabase.c();
        ArrayList arrayList = (ArrayList) builder.f12977g;
        this.f18382k = arrayList;
        this.f18383l = C0.G.r(q0.q("Work [ id=", str, ", tags={ "), CollectionsKt.J(arrayList, ",", null, null, null, 62), " } ]");
        this.f18384m = AbstractC0780y.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final Object a(J j6, Ff.c cVar) {
        G g7;
        OverwritingInputMerger overwritingInputMerger;
        C0695n c0695n;
        final J j10 = j6;
        final int i7 = 0;
        final int i10 = 1;
        if (cVar instanceof G) {
            g7 = (G) cVar;
            int i11 = g7.f18363d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g7.f18363d = i11 - Integer.MIN_VALUE;
            } else {
                g7 = new G(j10, cVar);
            }
        } else {
            g7 = new G(j10, cVar);
        }
        Object objS = g7.f18361b;
        Ef.a aVar = Ef.a.f2423a;
        int i12 = g7.f18363d;
        try {
            if (i12 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(objS);
                C0684c c0684c = j10.f18376e;
                c0684c.f9934o.getClass();
                boolean zJ = AbstractC0198c.J();
                androidx.work.impl.model.k kVar = j10.f18372a;
                String methodName = kVar.f18634x;
                String str = kVar.f18614c;
                if (zJ && methodName != null) {
                    int iHashCode = kVar.hashCode();
                    c0684c.f9934o.getClass();
                    Intrinsics.checkNotNullParameter(methodName, "methodName");
                    AbstractC0198c.c(methodName, iHashCode);
                }
                Callable callable = new Callable(j10) { // from class: androidx.work.impl.y

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ J f18748b;

                    {
                        this.f18748b = j10;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3;
                        Q q10 = Q.f9885a;
                        J j11 = this.f18748b;
                        switch (i7) {
                            case 0:
                                androidx.work.impl.model.k kVar2 = j11.f18372a;
                                if (kVar2.f18613b != q10) {
                                    String str2 = K.f18385a;
                                    V0.C.c().getClass();
                                    return Boolean.TRUE;
                                }
                                if (kVar2.d() || (kVar2.f18613b == q10 && kVar2.f18622k > 0)) {
                                    j11.f18377f.getClass();
                                    if (System.currentTimeMillis() < kVar2.a()) {
                                        V0.C c6 = V0.C.c();
                                        String str3 = K.f18385a;
                                        c6.getClass();
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                WorkSpecDao workSpecDao = j11.f18380i;
                                String str4 = j11.f18374c;
                                if (workSpecDao.getState(str4) == q10) {
                                    Q q11 = Q.f9886b;
                                    WorkSpecDao workSpecDao2 = j11.f18380i;
                                    workSpecDao2.setState(q11, str4);
                                    workSpecDao2.incrementWorkSpecRunAttemptCount(str4);
                                    workSpecDao2.setStopReason(str4, -256);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                return Boolean.valueOf(z3);
                        }
                    }
                };
                WorkDatabase workDatabase = j10.f18379h;
                Boolean shouldExit = (Boolean) workDatabase.runInTransaction(callable);
                Intrinsics.checkNotNullExpressionValue(shouldExit, "shouldExit");
                if (shouldExit.booleanValue()) {
                    return new B();
                }
                boolean zD = kVar.d();
                String str2 = j10.f18374c;
                if (zD) {
                    c0695n = kVar.f18616e;
                } else {
                    c0684c.f9925f.getClass();
                    String className = kVar.f18615d;
                    Intrinsics.checkNotNullParameter(className, "className");
                    Intrinsics.checkNotNullParameter(className, "className");
                    String str3 = AbstractC0700t.f9972a;
                    Intrinsics.checkNotNullParameter(className, "className");
                    try {
                        Object objNewInstance = Class.forName(className).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        Intrinsics.f(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                        overwritingInputMerger = (OverwritingInputMerger) objNewInstance;
                    } catch (Exception e10) {
                        V0.C.c().b(AbstractC0700t.f9972a, "Trouble instantiating ".concat(className), e10);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        String str4 = K.f18385a;
                        V0.C.c().a(str4, "Could not create Input Merger " + className);
                        return new z();
                    }
                    ArrayList inputs = CollectionsKt.P(C1849p.c(kVar.f18616e), j10.f18380i.getInputsFromPrerequisites(str2));
                    Intrinsics.checkNotNullParameter(inputs, "inputs");
                    C2085k0 c2085k0 = new C2085k0(9);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = inputs.iterator();
                    while (it.hasNext()) {
                        Map mapUnmodifiableMap = Collections.unmodifiableMap(((C0695n) it.next()).f9958a);
                        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(values)");
                        linkedHashMap.putAll(mapUnmodifiableMap);
                    }
                    c2085k0.e(linkedHashMap);
                    c0695n = new C0695n((LinkedHashMap) c2085k0.f42878b);
                    C0695n.f9956b.toByteArrayInternalV1(c0695n);
                }
                UUID uuidFromString = UUID.fromString(str2);
                ArrayList arrayList = j10.f18382k;
                C1271d c1271d = j10.f18378g;
                androidx.work.impl.utils.taskexecutor.a aVar2 = j10.f18375d;
                androidx.work.impl.utils.r rVar = new androidx.work.impl.utils.r(workDatabase, c1271d, aVar2);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f18345a = uuidFromString;
                workerParameters.f18346b = c0695n;
                new HashSet(arrayList);
                workerParameters.f18347c = c0684c.f9920a;
                workerParameters.f18348d = c0684c.f9921b;
                workerParameters.f18349e = aVar2;
                C0697p c0697p = c0684c.f9924e;
                workerParameters.f18350f = c0697p;
                try {
                    V0.B bA = c0697p.a(j10.f18373b, str, workerParameters);
                    bA.f9859d = true;
                    CoroutineContext.Element element = g7.getContext().get(C0753a0.f10836a);
                    Intrinsics.e(element);
                    Job job = (Job) element;
                    job.invokeOnCompletion(new H(bA, zJ, methodName, j10));
                    Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable(j10) { // from class: androidx.work.impl.y

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ J f18748b;

                        {
                            this.f18748b = j10;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z3;
                            Q q10 = Q.f9885a;
                            J j11 = this.f18748b;
                            switch (i10) {
                                case 0:
                                    androidx.work.impl.model.k kVar2 = j11.f18372a;
                                    if (kVar2.f18613b != q10) {
                                        String str5 = K.f18385a;
                                        V0.C.c().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if (kVar2.d() || (kVar2.f18613b == q10 && kVar2.f18622k > 0)) {
                                        j11.f18377f.getClass();
                                        if (System.currentTimeMillis() < kVar2.a()) {
                                            V0.C c6 = V0.C.c();
                                            String str6 = K.f18385a;
                                            c6.getClass();
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    WorkSpecDao workSpecDao = j11.f18380i;
                                    String str7 = j11.f18374c;
                                    if (workSpecDao.getState(str7) == q10) {
                                        Q q11 = Q.f9886b;
                                        WorkSpecDao workSpecDao2 = j11.f18380i;
                                        workSpecDao2.setState(q11, str7);
                                        workSpecDao2.incrementWorkSpecRunAttemptCount(str7);
                                        workSpecDao2.setStopReason(str7, -256);
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
                    if (!((Boolean) objRunInTransaction).booleanValue()) {
                        return new B();
                    }
                    if (job.isCancelled()) {
                        return new B();
                    }
                    Intrinsics.checkNotNullExpressionValue(rVar, "params.foregroundUpdater");
                    androidx.camera.core.impl.utils.executor.f fVar = aVar2.f18730d;
                    Intrinsics.checkNotNullExpressionValue(fVar, "workTaskExecutor.getMainThreadExecutor()");
                    AbstractC0774s abstractC0774sH = AbstractC0780y.h(fVar);
                    I i13 = new I(j10, bA, rVar, null);
                    g7.f18360a = j10;
                    g7.f18363d = 1;
                    objS = AbstractC0780y.s(abstractC0774sH, i13, g7);
                    if (objS == aVar) {
                        return aVar;
                    }
                } catch (Throwable unused) {
                    String str5 = K.f18385a;
                    V0.C.c().a(str5, "Could not create Worker " + str);
                    return new z();
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = g7.f18360a;
                androidx.camera.core.impl.utils.executor.g.M(objS);
            }
            V0.A result = (V0.A) objS;
            Intrinsics.checkNotNullExpressionValue(result, "result");
            return new A(result);
        } catch (CancellationException e11) {
            String str6 = K.f18385a;
            V0.C c6 = V0.C.c();
            String str7 = j10.f18383l;
            c6.getClass();
            throw e11;
        } catch (Throwable th) {
            V0.C.c().b(K.f18385a, C0.G.r(new StringBuilder(), j10.f18383l, " failed because it threw an exception/error"), th);
            j10.f18376e.getClass();
            return new z();
        }
    }

    public final void b(int i7) {
        Q q10 = Q.f9885a;
        WorkSpecDao workSpecDao = this.f18380i;
        String str = this.f18374c;
        workSpecDao.setState(q10, str);
        this.f18377f.getClass();
        workSpecDao.setLastEnqueueTime(str, System.currentTimeMillis());
        workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.f18372a.f18632v);
        workSpecDao.markWorkSpecScheduled(str, -1L);
        workSpecDao.setStopReason(str, i7);
    }

    public final void c() {
        this.f18377f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkSpecDao workSpecDao = this.f18380i;
        String str = this.f18374c;
        workSpecDao.setLastEnqueueTime(str, jCurrentTimeMillis);
        workSpecDao.setState(Q.f9885a, str);
        workSpecDao.resetWorkSpecRunAttemptCount(str);
        workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.f18372a.f18632v);
        workSpecDao.incrementPeriodCount(str);
        workSpecDao.markWorkSpecScheduled(str, -1L);
    }

    public final void d(V0.A result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String str = this.f18374c;
        ArrayList arrayListI = C1850q.i(str);
        while (true) {
            boolean zIsEmpty = arrayListI.isEmpty();
            WorkSpecDao workSpecDao = this.f18380i;
            if (zIsEmpty) {
                C0695n c0695n = ((C0704x) result).f9979a;
                Intrinsics.checkNotNullExpressionValue(c0695n, "failure.outputData");
                workSpecDao.resetWorkSpecNextScheduleTimeOverride(str, this.f18372a.f18632v);
                workSpecDao.setOutput(str, c0695n);
                return;
            }
            String str2 = (String) kotlin.collections.v.s(arrayListI);
            if (workSpecDao.getState(str2) != Q.f9890f) {
                workSpecDao.setState(Q.f9888d, str2);
            }
            arrayListI.addAll(this.f18381j.getDependentWorkIds(str2));
        }
    }
}
