package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PurchaseVerificationHandler f19345b;

    public /* synthetic */ S(PurchaseVerificationHandler purchaseVerificationHandler, int i7) {
        this.f19344a = i7;
        this.f19345b = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19344a) {
            case 0:
                this.f19345b.sendNextPurchaseVerificationPackageI();
                break;
            default:
                PurchaseVerificationHandler purchaseVerificationHandler = this.f19345b;
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
