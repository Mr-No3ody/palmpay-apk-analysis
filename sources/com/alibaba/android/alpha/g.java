package com.alibaba.android.alpha;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Task.OnTaskFinishListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Task.OnTaskFinishListener f20345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Project f20346b;

    public g(Project project, Task.OnTaskFinishListener onTaskFinishListener) {
        this.f20346b = project;
        this.f20345a = onTaskFinishListener;
    }

    @Override // com.alibaba.android.alpha.Task.OnTaskFinishListener
    public final void onTaskFinish(String str) {
        this.f20345a.onTaskFinish(this.f20346b.mName);
    }
}
