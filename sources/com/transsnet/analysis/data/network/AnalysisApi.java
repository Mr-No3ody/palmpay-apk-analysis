package com.transsnet.analysis.data.network;

import p307u8.a;

/* JADX INFO: loaded from: classes3.dex */
public class AnalysisApi {
    private AnalysisApiService mAnalysisApiService;

    public /* synthetic */ AnalysisApi(int i7) {
        this();
    }

    public static AnalysisApi getInstance() {
        return a.f42713a;
    }

    public AnalysisApiService getService() {
        return this.mAnalysisApiService;
    }

    private AnalysisApi() {
        this.mAnalysisApiService = (AnalysisApiService) AnalysisRetrofitClient.getInstance().create(AnalysisApiService.class);
    }
}
