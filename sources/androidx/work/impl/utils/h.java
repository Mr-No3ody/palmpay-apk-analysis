package androidx.work.impl.utils;

import C0.G;
import N8.q0;
import V0.C;
import V0.C0684c;
import V0.C0689h;
import V0.C0695n;
import V0.Q;
import V0.X;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.impl.C1271d;
import androidx.work.impl.J;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v;
import kotlin.jvm.internal.Intrinsics;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f18700a = {13, 15, 14};

    public static final void a(androidx.work.impl.s sVar, String str) {
        J jB;
        WorkDatabase workDatabase = sVar.f18677d;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        WorkSpecDao workSpecDaoH = workDatabase.h();
        DependencyDao dependencyDaoC = workDatabase.c();
        ArrayList arrayListI = C1850q.i(str);
        while (!arrayListI.isEmpty()) {
            String str2 = (String) v.s(arrayListI);
            Q state = workSpecDaoH.getState(str2);
            if (state != Q.f9887c && state != Q.f9888d) {
                workSpecDaoH.setCancelledState(str2);
            }
            arrayListI.addAll(dependencyDaoC.getDependentWorkIds(str2));
        }
        C1271d c1271d = sVar.f18680g;
        Intrinsics.checkNotNullExpressionValue(c1271d, "workManagerImpl.processor");
        synchronized (c1271d.f18540k) {
            C.c().getClass();
            c1271d.f18538i.add(str);
            jB = c1271d.b(str);
        }
        C1271d.d(jB, 1);
        Iterator it = sVar.f18679f.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).cancel(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, C0684c configuration, androidx.work.impl.n continuation) {
        int i7;
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        ArrayList arrayListI = C1850q.i(continuation);
        int i10 = 0;
        while (!arrayListI.isEmpty()) {
            List list = ((androidx.work.impl.n) v.s(arrayListI)).f18663r;
            Intrinsics.checkNotNullExpressionValue(list, "current.work");
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i7 = 0;
            } else {
                Iterator it = list2.iterator();
                i7 = 0;
                while (it.hasNext()) {
                    if (!((X) it.next()).f9910b.f18621j.f9948i.isEmpty() && (i7 = i7 + 1) < 0) {
                        C1850q.j();
                        throw null;
                    }
                }
            }
            i10 += i7;
        }
        if (i10 == 0) {
            return;
        }
        int iCountNonFinishedContentUriTriggerWorkers = workDatabase.h().countNonFinishedContentUriTriggerWorkers();
        int i11 = configuration.f9931l;
        if (iCountNonFinishedContentUriTriggerWorkers + i10 > i11) {
            throw new IllegalArgumentException(G.n(i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", q0.p(i11, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", iCountNonFinishedContentUriTriggerWorkers, ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    public static g c(int[] capabilities, int[] transports) {
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        Intrinsics.checkNotNullParameter(capabilities, "capabilities");
        Intrinsics.checkNotNullParameter(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i7 : capabilities) {
            try {
                builder.addCapability(i7);
            } catch (IllegalArgumentException unused) {
                C c6 = C.c();
                g.f18697b.getTAG();
                c6.getClass();
            }
        }
        int[] iArr = f18700a;
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            if (!C1847n.n(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException unused2) {
                    C c10 = C.c();
                    g.f18697b.getTAG();
                    c10.getClass();
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "networkRequest.build()");
        return new g(networkRequestBuild);
    }

    public static final int[] d(NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(request, "request");
            int[] capabilities = request.getCapabilities();
            Intrinsics.checkNotNullExpressionValue(capabilities, "request.capabilities");
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 30; i7++) {
            int i10 = iArr[i7];
            Intrinsics.checkNotNullParameter(request, "request");
            if (request.hasCapability(i10)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return CollectionsKt.X(arrayList);
    }

    public static final int[] e(NetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            Intrinsics.checkNotNullParameter(request, "request");
            int[] transportTypes = request.getTransportTypes();
            Intrinsics.checkNotNullExpressionValue(transportTypes, "request.transportTypes");
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 10; i7++) {
            int i10 = iArr[i7];
            Intrinsics.checkNotNullParameter(request, "request");
            if (request.hasTransport(i10)) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        return CollectionsKt.X(arrayList);
    }

    public static final androidx.work.impl.model.k f(List schedulers, androidx.work.impl.model.k workSpec) {
        String str;
        androidx.work.impl.model.k workSpec2;
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        boolean zB = workSpec.f18616e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zB2 = workSpec.f18616e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zB3 = workSpec.f18616e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (!zB && zB2 && zB3) {
            C2085k0 c2085k0 = new C2085k0(9);
            C0695n data = workSpec.f18616e;
            Intrinsics.checkNotNullParameter(data, "data");
            c2085k0.e(data.f9958a);
            String str2 = workSpec.f18614c;
            Intrinsics.checkNotNullParameter("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", "key");
            LinkedHashMap linkedHashMap = (LinkedHashMap) c2085k0.f42878b;
            linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
            C0695n c0695n = new C0695n(linkedHashMap);
            C0695n.f9956b.toByteArrayInternalV1(c0695n);
            str = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            workSpec2 = androidx.work.impl.model.k.b(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c0695n, 0, 0L, 0, 0, 0L, 0, 16777195);
        } else {
            str = Constants.ScionAnalytics.MessageType.DATA_MESSAGE;
            workSpec2 = workSpec;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return workSpec2;
        }
        Intrinsics.checkNotNullParameter(workSpec2, "workSpec");
        C0689h c0689h = workSpec2.f18621j;
        String name = ConstraintTrackingWorker.class.getName();
        String str3 = workSpec2.f18614c;
        if (Intrinsics.c(str3, name)) {
            return workSpec2;
        }
        if (!c0689h.f9944e && !c0689h.f9945f) {
            return workSpec2;
        }
        C2085k0 c2085k1 = new C2085k0(9);
        C0695n c0695n2 = workSpec2.f18616e;
        Intrinsics.checkNotNullParameter(c0695n2, str);
        c2085k1.e(c0695n2.f9958a);
        Intrinsics.checkNotNullParameter("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", "key");
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c2085k1.f42878b;
        linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
        C0695n c0695n3 = new C0695n(linkedHashMap2);
        C0695n.f9956b.toByteArrayInternalV1(c0695n3);
        String name2 = ConstraintTrackingWorker.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "name");
        return androidx.work.impl.model.k.b(workSpec2, null, null, name2, c0695n3, 0, 0L, 0, 0, 0L, 0, 16777195);
    }
}
