package com.transsnet.palmpay.credit.ui.activity.okcard;

import android.content.Context;
import com.transsnet.mtn.sdk.MTN;
import com.transsnet.mtn.sdk.config.Configuration;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.bean.resp.OcOneLoopData;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements OcApplyBaseActivity.VerifyOneLoopCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcStartApplyActivity f29926a;

    public h(OcStartApplyActivity ocStartApplyActivity) {
        this.f29926a = ocStartApplyActivity;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyOneLoopCallback
    public final void onFailed(String str) {
        ToastUtils.showShort(str, new Object[0]);
        this.f29926a.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyOneLoopCallback
    public final void onSuccess(OcOneLoopData ocOneLoopData) {
        OcStartApplyActivity ocStartApplyActivity = this.f29926a;
        ocStartApplyActivity.f29260v = true;
        Context context = BaseApplication.getContext();
        String string = ocStartApplyActivity.getString(k.core_one_loop_secret_key);
        String string2 = ocStartApplyActivity.getString(k.core_one_loop_env);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        MTN.init(context, string, Integer.parseInt(string2));
        Configuration configuration = new Configuration();
        configuration.auth_id = ocOneLoopData != null ? ocOneLoopData.getId() : null;
        configuration.mtn_id = MTN.MTN_NG;
        configuration.phone = "";
        configuration.agreeUrl = "";
        MTN.start(configuration, new p045d3.k(ocStartApplyActivity, 27));
    }
}
