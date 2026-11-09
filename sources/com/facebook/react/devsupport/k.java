package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f21734b;

    public /* synthetic */ k(DevSupportManagerBase devSupportManagerBase, int i7) {
        this.f21733a = i7;
        this.f21734b = devSupportManagerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21733a) {
            case 0:
                DevSupportManagerBase.toggleElementInspector$lambda$26(this.f21734b);
                break;
            case 1:
                DevSupportManagerBase.reloadSettings$lambda$20(this.f21734b);
                break;
            case 2:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(this.f21734b);
                break;
            case 3:
                DevSupportManagerBase.access$hideSplitBundleDevLoadingView(this.f21734b);
                break;
            case 4:
                DevSupportManagerBase.AnonymousClass1.onPackagerReloadCommand$lambda$0(this.f21734b);
                break;
            default:
                DevSupportManagerBase.AnonymousClass1.onPackagerDevMenuCommand$lambda$1(this.f21734b);
                break;
        }
    }
}
