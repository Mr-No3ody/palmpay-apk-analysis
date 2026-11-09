package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1293j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStorePurchase f19380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f19381d;

    public /* synthetic */ RunnableC1293j(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i7) {
        this.f19378a = i7;
        this.f19379b = activityHandler;
        this.f19380c = adjustPlayStorePurchase;
        this.f19381d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19378a) {
            case 0:
                this.f19379b.lambda$verifyPlayStorePurchase$44(this.f19380c, this.f19381d);
                break;
            default:
                this.f19379b.lambda$verifyPlayStorePurchase$45(this.f19380c, this.f19381d);
                break;
        }
    }
}
