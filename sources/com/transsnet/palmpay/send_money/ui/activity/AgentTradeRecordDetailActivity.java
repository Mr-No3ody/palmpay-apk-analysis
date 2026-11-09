package com.transsnet.palmpay.send_money.ui.activity;

import Ea.a;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/smorder/agent_detail")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/AgentTradeRecordDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AgentTradeRecordDetailActivity extends BaseActivity {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String stringExtra = getIntent().getStringExtra("orderId");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getQueryParameter("orderId");
        }
        a.e(TransType.TRANS_TYPE_AGENT_SEND_MONEY_TO_PALMPAY, stringExtra, "");
        finish();
    }
}
