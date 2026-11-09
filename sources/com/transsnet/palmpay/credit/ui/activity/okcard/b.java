package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.transsnet.palmpay.credit.bean.resp.OcSkipOneLoopResp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements OcApplyBaseActivity.VerifyAllOperateOneLoopCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcStartApplyActivity f29914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29915b;

    public b(OcStartApplyActivity ocStartApplyActivity, String str) {
        this.f29914a = ocStartApplyActivity;
        this.f29915b = str;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyAllOperateOneLoopCallback
    public final void onFailed(String str) {
        ToastUtils.showShort(str, new Object[0]);
        this.f29914a.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyAllOperateOneLoopCallback
    public final void onSuccess(OcSkipOneLoopResp ocSkipOneLoopResp) {
        boolean zC = ocSkipOneLoopResp != null ? Intrinsics.c(ocSkipOneLoopResp.getData(), Boolean.FALSE) : false;
        OcStartApplyActivity ocStartApplyActivity = this.f29914a;
        if (!zC) {
            ocStartApplyActivity.r();
        } else {
            int i7 = OcStartApplyActivity.f29877Z;
            ocStartApplyActivity.y(this.f29915b);
        }
    }
}
