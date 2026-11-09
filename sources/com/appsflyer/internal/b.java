package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements AFf1tSDK, AFd1ySDK.AFa1vSDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFa1uSDK f20405a;

    public /* synthetic */ b(AFa1uSDK aFa1uSDK) {
        this.f20405a = aFa1uSDK;
    }

    @Override // com.appsflyer.internal.AFd1ySDK.AFa1vSDK
    public void onConfigurationChanged(boolean z3) {
        this.f20405a.getRevenue(z3);
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public void onRemoteConfigUpdateFinished(AFf1mSDK aFf1mSDK) {
        this.f20405a.AFAdRevenueData(aFf1mSDK);
    }
}
