package com.alibaba.android.alpha;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Task.OnTaskFinishListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlphaManager f20331a;

    public a(AlphaManager alphaManager) {
        this.f20331a = alphaManager;
    }

    @Override // com.alibaba.android.alpha.Task.OnTaskFinishListener
    public final void onTaskFinish(String str) {
        AlphaManager alphaManager = this.f20331a;
        alphaManager.mIsStartupFinished = true;
        alphaManager.recycle();
        alphaManager.releaseWaitFinishLock();
    }
}
