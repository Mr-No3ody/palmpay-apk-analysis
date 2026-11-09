package com.alibaba.android.alpha;

/* JADX INFO: loaded from: classes.dex */
public final class b implements OnProjectExecuteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlphaManager f20332a;

    public b(AlphaManager alphaManager) {
        this.f20332a = alphaManager;
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public final void onProjectFinish() {
        synchronized (AlphaManager.sExtraTaskListLock) {
            try {
                if (!this.f20332a.mExtraTaskList.isEmpty()) {
                    this.f20332a.executeProjectBindRunnables();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (AlphaManager.sExtraTaskMapLock) {
            this.f20332a.mFinishedTask.clear();
        }
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public final void onProjectStart() {
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public final void onTaskFinish(String str) {
        synchronized (AlphaManager.sExtraTaskMapLock) {
            try {
                this.f20332a.mFinishedTask.add(str);
                if (this.f20332a.mExtraTaskMap.containsKey(str)) {
                    this.f20332a.executeTaskBindRunnable(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
