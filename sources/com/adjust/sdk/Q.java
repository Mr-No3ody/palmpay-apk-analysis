package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PackageHandler f19343b;

    public /* synthetic */ Q(PackageHandler packageHandler, int i7) {
        this.f19342a = i7;
        this.f19343b = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19342a) {
            case 0:
                this.f19343b.initI();
                break;
            case 1:
                this.f19343b.sendFirstI();
                break;
            case 2:
                PackageHandler packageHandler = this.f19343b;
                packageHandler.logger.verbose("Package handler can send", new Object[0]);
                packageHandler.isSending.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                this.f19343b.flushI();
                break;
            default:
                PackageHandler packageHandler2 = this.f19343b;
                packageHandler2.logger.verbose("Package handler finished waiting to continue", new Object[0]);
                packageHandler2.isSending.set(false);
                packageHandler2.sendFirstPackage();
                break;
        }
    }
}
