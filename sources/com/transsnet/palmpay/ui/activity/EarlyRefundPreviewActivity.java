package com.transsnet.palmpay.ui.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/early_refund_preview")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/EarlyRefundPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CorePaymentPreviewActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EarlyRefundPreviewActivity extends CorePaymentPreviewActivity {
    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        super.initData();
        this.f27552C0 = TransType.TRANS_TYPE_AUTO_DEDUCT;
    }
}
