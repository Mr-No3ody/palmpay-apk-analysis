package com.transsnet.palmpay.teller.ui.activity;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "博彩/账单详情", path = "/quick_teller/betting_bill_detail", remark = "ignore")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BettingBillDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingBillDetailActivity extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        BillPaymentOrderDetailActivity.f34162i.launch(this, getQueryParameter("orderNo"), TransType.TRANS_TYPE_BILLER_BETTING);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
    }
}
