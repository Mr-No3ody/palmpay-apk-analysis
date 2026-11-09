package androidx.work.impl;

import N8.q0;
import V0.C0684c;
import V0.M;
import V0.Q;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18744a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f18745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f18746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(M m7, s sVar) {
        super(0);
        this.f18746c = m7;
        this.f18745b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18744a) {
            case 0:
                androidx.work.impl.utils.c.a(new n(this.f18745b, "PeriodWakeUpWorker", V0.r.f9965b, C1849p.c(this.f18746c)));
                return Unit.f38893a;
            default:
                M m7 = this.f18746c;
                s sVar = this.f18745b;
                x xVar = new x(m7, sVar);
                WorkSpecDao workSpecDaoH = sVar.f18677d.h();
                List<androidx.work.impl.model.i> workSpecIdAndStatesForName = workSpecDaoH.getWorkSpecIdAndStatesForName("PeriodWakeUpWorker");
                if (workSpecIdAndStatesForName.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                androidx.work.impl.model.i iVar = (androidx.work.impl.model.i) CollectionsKt.firstOrNull(workSpecIdAndStatesForName);
                if (iVar == null) {
                    xVar.invoke();
                } else {
                    String str = iVar.f18591a;
                    androidx.work.impl.model.k workSpec = workSpecDaoH.getWorkSpec(str);
                    if (workSpec == null) {
                        throw new IllegalStateException(q0.k("WorkSpec with ", str, ", that matches a name \"PeriodWakeUpWorker\", wasn't found"));
                    }
                    if (!workSpec.d()) {
                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    }
                    if (iVar.f18592b == Q.f9890f) {
                        workSpecDaoH.delete(str);
                        xVar.invoke();
                    } else {
                        final androidx.work.impl.model.k spec = androidx.work.impl.model.k.b(m7.f9910b, iVar.f18591a, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                        C1271d processor = sVar.f18680g;
                        Intrinsics.checkNotNullExpressionValue(processor, "processor");
                        final WorkDatabase workDatabase = sVar.f18677d;
                        Intrinsics.checkNotNullExpressionValue(workDatabase, "workDatabase");
                        C0684c configuration = sVar.f18676c;
                        Intrinsics.checkNotNullExpressionValue(configuration, "configuration");
                        final List schedulers = sVar.f18679f;
                        Intrinsics.checkNotNullExpressionValue(schedulers, "schedulers");
                        WorkSpecDao workSpecDaoH2 = workDatabase.h();
                        final String str2 = spec.f18612a;
                        final androidx.work.impl.model.k spec2 = workSpecDaoH2.getWorkSpec(str2);
                        if (spec2 == null) {
                            throw new IllegalArgumentException(q0.k("Worker with ", str2, " doesn't exist"));
                        }
                        if (!spec2.f18613b.a()) {
                            if (spec2.d() ^ spec.d()) {
                                StringBuilder sb2 = new StringBuilder("Can't update ");
                                Intrinsics.checkNotNullParameter(spec2, "spec");
                                sb2.append(spec2.d() ? "Periodic" : "OneTime");
                                sb2.append(" Worker to ");
                                Intrinsics.checkNotNullParameter(spec, "spec");
                                throw new UnsupportedOperationException(C0.G.r(sb2, spec.d() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            final boolean zE = processor.e(str2);
                            if (!zE) {
                                Iterator it = schedulers.iterator();
                                while (it.hasNext()) {
                                    ((Scheduler) it.next()).cancel(str2);
                                }
                            }
                            final Set set = m7.f9911c;
                            workDatabase.runInTransaction(new Runnable() { // from class: androidx.work.impl.w
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WorkDatabase workDatabase2 = workDatabase;
                                    WorkSpecDao workSpecDaoH3 = workDatabase2.h();
                                    WorkTagDao workTagDaoI = workDatabase2.i();
                                    androidx.work.impl.model.k kVar = spec2;
                                    Q q10 = kVar.f18613b;
                                    long j6 = kVar.f18625n;
                                    int i7 = kVar.t + 1;
                                    long j10 = kVar.f18631u;
                                    int i10 = kVar.f18632v;
                                    androidx.work.impl.model.k kVar2 = spec;
                                    androidx.work.impl.model.k kVarB = androidx.work.impl.model.k.b(kVar2, null, q10, null, null, kVar.f18622k, j6, kVar.f18630s, i7, j10, i10, 12835837);
                                    if (kVar2.f18632v == 1) {
                                        kVarB.f18631u = kVar2.f18631u;
                                        kVarB.f18632v++;
                                    }
                                    workSpecDaoH3.updateWorkSpec(androidx.work.impl.utils.h.f(schedulers, kVarB));
                                    String str3 = str2;
                                    workTagDaoI.deleteByWorkSpecId(str3);
                                    workTagDaoI.insertTags(str3, set);
                                    if (zE) {
                                        return;
                                    }
                                    workSpecDaoH3.markWorkSpecScheduled(str3, -1L);
                                    workDatabase2.g().delete(str3);
                                }
                            });
                            if (!zE) {
                                AbstractC1274g.b(configuration, workDatabase, schedulers);
                            }
                        }
                    }
                }
                return Unit.f38893a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, M m7) {
        super(0);
        this.f18745b = sVar;
        this.f18746c = m7;
    }
}
