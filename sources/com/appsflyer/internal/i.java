package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1uSDK f20418b;

    public /* synthetic */ i(AFd1uSDK aFd1uSDK, int i7) {
        this.f20417a = i7;
        this.f20418b = aFd1uSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20417a) {
            case 0:
                AFd1uSDK.getMonetizationNetwork(this.f20418b);
                break;
            case 1:
                AFd1uSDK.AFAdRevenueData(this.f20418b);
                break;
            default:
                AFd1uSDK.getCurrencyIso4217Code(this.f20418b);
                break;
        }
    }
}
