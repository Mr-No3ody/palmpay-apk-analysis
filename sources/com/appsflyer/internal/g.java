package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20415b;

    public /* synthetic */ g(Object obj, int i7) {
        this.f20414a = i7;
        this.f20415b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20414a) {
            case 0:
                AFb1kSDK.getMediationNetwork((AFb1kSDK) this.f20415b);
                break;
            case 1:
                AFa1uSDK.getCurrencyIso4217Code((AFd1zSDK) this.f20415b);
                break;
            default:
                ((AFd1nSDK) this.f20415b).AFAdRevenueData();
                break;
        }
    }
}
