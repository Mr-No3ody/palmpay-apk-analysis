package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: renamed from: androidx.core.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1046o implements JobIntentService$GenericWorkItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15988a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobWorkItem f15989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15990c;

    public C1046o(JobServiceEngineC1047p jobServiceEngineC1047p, JobWorkItem jobWorkItem, byte b7) {
        this.f15990c = jobServiceEngineC1047p;
        this.f15989b = jobWorkItem;
    }

    @Override // androidx.core.app.JobIntentService$GenericWorkItem
    public final void complete() {
        switch (this.f15988a) {
            case 0:
                synchronized (((JobServiceEngineC1047p) this.f15990c).f15993c) {
                    try {
                        JobParameters jobParameters = ((JobServiceEngineC1047p) this.f15990c).f15994d;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f15989b);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (((JobServiceEngineC1047p) this.f15990c).f15993c) {
                    JobParameters jobParameters2 = ((JobServiceEngineC1047p) this.f15990c).f15994d;
                    if (jobParameters2 != null) {
                        try {
                            jobParameters2.completeWork(this.f15989b);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    break;
                }
                return;
        }
    }

    @Override // androidx.core.app.JobIntentService$GenericWorkItem
    public final Intent getIntent() {
        switch (this.f15988a) {
            case 0:
                break;
        }
        return this.f15989b.getIntent();
    }

    public C1046o(JobServiceEngineC1047p jobServiceEngineC1047p, JobWorkItem jobWorkItem) {
        this.f15990c = jobServiceEngineC1047p;
        this.f15989b = jobWorkItem;
    }
}
