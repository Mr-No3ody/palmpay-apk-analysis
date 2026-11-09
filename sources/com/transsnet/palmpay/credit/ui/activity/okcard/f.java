package com.transsnet.palmpay.credit.ui.activity.okcard;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements OcApplyBaseActivity.VerifyInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcStartApplyActivity f29922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29923b;

    public f(OcStartApplyActivity ocStartApplyActivity, String str) {
        this.f29922a = ocStartApplyActivity;
        this.f29923b = str;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyInfoCallback
    public final void verifyFailed(String str) {
        ToastUtils.showShort(str, new Object[0]);
        this.f29922a.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyInfoCallback
    public final void verifySuccess(AllAuthInfoRsp.DataBean dataBean) {
        boolean zIsEmpty = TextUtils.isEmpty(dataBean != null ? dataBean.bankCard : null);
        OcStartApplyActivity ocStartApplyActivity = this.f29922a;
        if (!zIsEmpty) {
            ocStartApplyActivity.r();
            return;
        }
        ocStartApplyActivity.f29260v = true;
        int i7 = OcStartApplyActivity.f29877Z;
        ocStartApplyActivity.y(this.f29923b);
    }
}
