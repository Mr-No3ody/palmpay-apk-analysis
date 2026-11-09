package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f21730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f21731c;

    public /* synthetic */ i(DevSupportManagerBase devSupportManagerBase, boolean z3, int i7) {
        this.f21729a = i7;
        this.f21730b = devSupportManagerBase;
        this.f21731c = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21729a) {
            case 0:
                DevSupportManagerBase.setFpsDebugEnabled$lambda$25(this.f21730b, this.f21731c);
                break;
            default:
                DevSupportManagerBase.setHotModuleReplacementEnabled$lambda$24(this.f21730b, this.f21731c);
                break;
        }
    }
}
