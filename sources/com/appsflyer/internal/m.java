package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1rSDK f20428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f20429c;

    public /* synthetic */ m(AFj1rSDK aFj1rSDK, Runnable runnable, int i7) {
        this.f20427a = i7;
        this.f20428b = aFj1rSDK;
        this.f20429c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20427a) {
            case 0:
                this.f20428b.getRevenue(this.f20429c);
                break;
            case 1:
                this.f20428b.AFAdRevenueData(this.f20429c);
                break;
            case 2:
                this.f20428b.getCurrencyIso4217Code(this.f20429c);
                break;
            default:
                this.f20428b.component1(this.f20429c);
                break;
        }
    }
}
