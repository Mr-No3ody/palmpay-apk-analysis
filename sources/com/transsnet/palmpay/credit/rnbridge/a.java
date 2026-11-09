package com.transsnet.palmpay.credit.rnbridge;

import com.google.gson.Gson;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.liveness.LiveID$ILiveIDListener;
import com.palmpay.lib.liveness.model.CheckResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements LiveID$ILiveIDListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CreditFaceBridge f28649a;

    public a(CreditFaceBridge creditFaceBridge) {
        this.f28649a = creditFaceBridge;
    }

    @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
    public final void onCompleted(CheckResponse response, String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        BaseBridge.handleSuccess$default(this.f28649a, new CreditFaceBridge.FaceResult(response.getData().getToken(), response.getData().getBizId(), response.getData().getMemberId(), response.getData().getS3Url(), str), null, 2, null);
    }

    @Override // com.palmpay.lib.liveness.LiveID$ILiveIDListener
    public final void onInterrupted(String str, String str2, String str3) {
        boolean zC = Intrinsics.c(str, "5");
        CreditFaceBridge creditFaceBridge = this.f28649a;
        if (zC) {
            BaseBridge.handleCancel$default(creditFaceBridge, null, 1, null);
            return;
        }
        String json = new Gson().toJson(new CreditFaceBridge.LivenessData(str, str2));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        creditFaceBridge.handleResult(json);
    }
}
