package androidx.core.app;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: androidx.core.app.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048q extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobInfo f15995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JobScheduler f15996e;

    public C1048q(Context context, ComponentName componentName, int i7) {
        super(componentName);
        b(i7);
        this.f15995d = new JobInfo.Builder(i7, componentName).setOverrideDeadline(0L).build();
        this.f15996e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // androidx.core.app.r
    public final void a(Intent intent) {
        this.f15996e.enqueue(this.f15995d, p004a1.a.d(intent));
    }
}
