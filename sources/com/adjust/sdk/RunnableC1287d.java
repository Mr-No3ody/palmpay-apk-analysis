package com.adjust.sdk;

/* JADX INFO: renamed from: com.adjust.sdk.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1287d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivityHandler f19362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdjustAdRevenue f19363c;

    public /* synthetic */ RunnableC1287d(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i7) {
        this.f19361a = i7;
        this.f19362b = activityHandler;
        this.f19363c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19361a) {
            case 0:
                this.f19362b.lambda$trackAdRevenue$41(this.f19363c);
                break;
            default:
                this.f19362b.lambda$trackAdRevenue$40(this.f19363c);
                break;
        }
    }
}
