package androidx.work.impl.workers;

import V0.A;
import V0.C;
import V0.C0706z;
import X0.n;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.k;
import androidx.work.impl.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final A c() {
        s sVarG = s.g(this.f9856a);
        Intrinsics.checkNotNullExpressionValue(sVarG, "getInstance(applicationContext)");
        WorkDatabase workDatabase = sVarG.f18677d;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        WorkSpecDao workSpecDaoH = workDatabase.h();
        WorkNameDao workNameDaoF = workDatabase.f();
        WorkTagDao workTagDaoI = workDatabase.i();
        SystemIdInfoDao systemIdInfoDaoE = workDatabase.e();
        sVarG.f18676c.f9923d.getClass();
        List<k> recentlyCompletedWork = workSpecDaoH.getRecentlyCompletedWork(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<k> runningWork = workSpecDaoH.getRunningWork();
        List<k> allEligibleWorkSpecsForScheduling = workSpecDaoH.getAllEligibleWorkSpecsForScheduling(200);
        if (!recentlyCompletedWork.isEmpty()) {
            C c6 = C.c();
            int i7 = n.f10966a;
            c6.getClass();
            C c10 = C.c();
            n.a(workNameDaoF, workTagDaoI, systemIdInfoDaoE, recentlyCompletedWork);
            c10.getClass();
        }
        if (!runningWork.isEmpty()) {
            C c11 = C.c();
            int i10 = n.f10966a;
            c11.getClass();
            C c12 = C.c();
            n.a(workNameDaoF, workTagDaoI, systemIdInfoDaoE, runningWork);
            c12.getClass();
        }
        if (!allEligibleWorkSpecsForScheduling.isEmpty()) {
            C c13 = C.c();
            int i11 = n.f10966a;
            c13.getClass();
            C c14 = C.c();
            n.a(workNameDaoF, workTagDaoI, systemIdInfoDaoE, allEligibleWorkSpecsForScheduling);
            c14.getClass();
        }
        C0706z c0706z = new C0706z();
        Intrinsics.checkNotNullExpressionValue(c0706z, "success()");
        return c0706z;
    }
}
