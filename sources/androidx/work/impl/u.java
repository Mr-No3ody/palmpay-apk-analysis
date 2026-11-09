package androidx.work.impl;

import V0.C0684c;
import V0.N;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final s a(Context context, C0684c configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        androidx.work.impl.utils.taskexecutor.a workTaskExecutor = new androidx.work.impl.utils.taskexecutor.a(configuration.f9922c);
        WorkDatabase.a aVar = WorkDatabase.f18387a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        androidx.work.impl.utils.k kVar = workTaskExecutor.f18727a;
        Intrinsics.checkNotNullExpressionValue(kVar, "workTaskExecutor.serialTaskExecutor");
        WorkDatabase workDatabase = aVar.create(applicationContext, kVar, configuration.f9923d, context.getResources().getBoolean(N.workmanager_test_configuration));
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "context.applicationContext");
        androidx.work.impl.constraints.trackers.k trackers = new androidx.work.impl.constraints.trackers.k(applicationContext2, workTaskExecutor);
        C1271d processor = new C1271d(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase);
        t schedulersCreator = t.f18685a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(schedulersCreator, "schedulersCreator");
        return new s(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, (List) schedulersCreator.invoke(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }
}
