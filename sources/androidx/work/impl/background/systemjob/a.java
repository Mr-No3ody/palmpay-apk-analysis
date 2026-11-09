package androidx.work.impl.background.systemjob;

import V0.C;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18456a;

    static {
        String strD = C.d("SystemJobScheduler");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"SystemJobScheduler\")");
        f18456a = strD;
    }

    public static final List a(JobScheduler jobScheduler) {
        Intrinsics.checkNotNullParameter(jobScheduler, "<this>");
        try {
            Intrinsics.checkNotNullParameter(jobScheduler, "jobScheduler");
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            Intrinsics.checkNotNullExpressionValue(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            C.c().b(f18456a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        Intrinsics.checkNotNullParameter(jobScheduler, "jobScheduler");
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        Intrinsics.checkNotNullExpressionValue(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
