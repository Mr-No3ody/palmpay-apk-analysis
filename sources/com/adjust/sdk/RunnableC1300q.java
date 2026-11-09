package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1300q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustEvent f19407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f19408d;

    public /* synthetic */ RunnableC1300q(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i7) {
        this.f19405a = i7;
        this.f19406b = activityHandler;
        this.f19407c = adjustEvent;
        this.f19408d = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19405a) {
            case 0:
                this.f19406b.lambda$verifyAndTrackPlayStorePurchase$46(this.f19407c, this.f19408d);
                break;
            default:
                this.f19406b.lambda$verifyAndTrackPlayStorePurchase$47(this.f19407c, this.f19408d);
                break;
        }
    }
}
