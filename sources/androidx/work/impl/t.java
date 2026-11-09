package androidx.work.impl;

import V0.C0684c;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.m implements Function6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f18685a = new t(6, u.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context p3 = (Context) obj;
        C0684c p10 = (C0684c) obj2;
        TaskExecutor p11 = (TaskExecutor) obj3;
        WorkDatabase p12 = (WorkDatabase) obj4;
        androidx.work.impl.constraints.trackers.k p13 = (androidx.work.impl.constraints.trackers.k) obj5;
        C1271d p14 = (C1271d) obj6;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        Intrinsics.checkNotNullParameter(p11, "p2");
        Intrinsics.checkNotNullParameter(p12, "p3");
        Intrinsics.checkNotNullParameter(p13, "p4");
        Intrinsics.checkNotNullParameter(p14, "p5");
        int i7 = AbstractC1274g.f18562a;
        androidx.work.impl.background.systemjob.d dVar = new androidx.work.impl.background.systemjob.d(p3, p12, p10);
        androidx.work.impl.utils.i.a(p3, SystemJobService.class, true);
        V0.C.c().getClass();
        Intrinsics.checkNotNullExpressionValue(dVar, "createBestAvailableBackg…kDatabase, configuration)");
        return C1850q.h(dVar, new W0.c(p3, p10, p13, p14, new p279s5.d(p14, p11), p11));
    }
}
