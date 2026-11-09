package com.transsnet.adsdk.data.network;

import p184m8.a;

/* JADX INFO: loaded from: classes3.dex */
public class AdApi {
    private final AdApiService mAdApiService;

    public /* synthetic */ AdApi(int i7) {
        this();
    }

    public static AdApi getInstance() {
        return a.f39549a;
    }

    public AdApiService getService() {
        return this.mAdApiService;
    }

    private AdApi() {
        this.mAdApiService = (AdApiService) AdRetrofitClient.get().create(AdApiService.class);
    }
}
