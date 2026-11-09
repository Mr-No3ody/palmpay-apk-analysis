package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* JADX INFO: renamed from: androidx.core.app.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class JobServiceEngineC1047p extends JobServiceEngine implements JobIntentService$CompatJobEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f15992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JobParameters f15994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobServiceEngineC1047p(O o10, int i7) {
        super(o10);
        this.f15991a = i7;
        switch (i7) {
            case 1:
                super(o10);
                this.f15993c = new Object();
                this.f15992b = o10;
                break;
            default:
                this.f15993c = new Object();
                this.f15992b = o10;
                break;
        }
    }

    @Override // androidx.core.app.JobIntentService$CompatJobEngine
    public final IBinder compatGetBinder() {
        switch (this.f15991a) {
            case 0:
                break;
        }
        return getBinder();
    }

    @Override // androidx.core.app.JobIntentService$CompatJobEngine
    public final JobIntentService$GenericWorkItem dequeueWork() {
        JobWorkItem jobWorkItemDequeueWork;
        switch (this.f15991a) {
            case 0:
                synchronized (this.f15993c) {
                    try {
                        JobParameters jobParameters = this.f15994d;
                        if (jobParameters == null) {
                            return null;
                        }
                        JobWorkItem jobWorkItemDequeueWork2 = jobParameters.dequeueWork();
                        if (jobWorkItemDequeueWork2 == null) {
                            return null;
                        }
                        jobWorkItemDequeueWork2.getIntent().setExtrasClassLoader(this.f15992b.getClassLoader());
                        return new C1046o(this, jobWorkItemDequeueWork2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                synchronized (this.f15993c) {
                    JobParameters jobParameters2 = this.f15994d;
                    if (jobParameters2 == null) {
                        return null;
                    }
                    try {
                        jobWorkItemDequeueWork = jobParameters2.dequeueWork();
                        break;
                    } catch (SecurityException e10) {
                        e10.printStackTrace();
                        jobWorkItemDequeueWork = null;
                    }
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f15992b.getClassLoader());
                    return new C1046o(this, jobWorkItemDequeueWork, (byte) 0);
                }
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        switch (this.f15991a) {
            case 0:
                this.f15994d = jobParameters;
                this.f15992b.b(false);
                break;
            default:
                this.f15994d = jobParameters;
                this.f15992b.b(false);
                break;
        }
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        switch (this.f15991a) {
            case 0:
                AsyncTaskC1043l asyncTaskC1043l = this.f15992b.f15949c;
                if (asyncTaskC1043l != null) {
                    asyncTaskC1043l.cancel(false);
                }
                synchronized (this.f15993c) {
                    this.f15994d = null;
                    break;
                }
                return true;
            default:
                AsyncTaskC1043l asyncTaskC1043l2 = this.f15992b.f15949c;
                if (asyncTaskC1043l2 != null) {
                    asyncTaskC1043l2.cancel(false);
                }
                synchronized (this.f15993c) {
                    this.f15994d = null;
                    break;
                }
                return true;
        }
    }
}
