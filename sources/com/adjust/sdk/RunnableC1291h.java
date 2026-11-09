package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1291h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustPlayStoreSubscription f19374c;

    public /* synthetic */ RunnableC1291h(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i7) {
        this.f19372a = i7;
        this.f19373b = activityHandler;
        this.f19374c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19372a) {
            case 0:
                this.f19373b.lambda$trackPlayStoreSubscription$42(this.f19374c);
                break;
            default:
                this.f19373b.lambda$trackPlayStoreSubscription$43(this.f19374c);
                break;
        }
    }
}
