package com.transsnet.palmpay.credit.ui.activity.okcard;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.rsp.AllAuthInfoRsp;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements OcApplyBaseActivity.VerifyInfoCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcStartApplyActivity f29916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29917b;

    public c(OcStartApplyActivity ocStartApplyActivity, String str) {
        this.f29916a = ocStartApplyActivity;
        this.f29917b = str;
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyInfoCallback
    public final void verifyFailed(String str) {
        ToastUtils.showShort(str, new Object[0]);
        this.f29916a.finish();
    }

    @Override // com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyBaseActivity.VerifyInfoCallback
    public final void verifySuccess(AllAuthInfoRsp.DataBean dataBean) {
        boolean zIsEmpty = TextUtils.isEmpty(dataBean != null ? dataBean.bvn : null);
        OcStartApplyActivity ocStartApplyActivity = this.f29916a;
        if (zIsEmpty) {
            if (TextUtils.isEmpty(dataBean != null ? dataBean.bankCard : null)) {
                if (TextUtils.isEmpty(dataBean != null ? dataBean.bankAccount : null)) {
                    int i7 = OcStartApplyActivity.f29877Z;
                    ocStartApplyActivity.y(this.f29917b);
                    return;
                }
            }
        }
        ocStartApplyActivity.r();
    }
}
