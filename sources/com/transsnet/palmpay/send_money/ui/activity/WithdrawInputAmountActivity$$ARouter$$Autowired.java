package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class WithdrawInputAmountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WithdrawInputAmountActivity withdrawInputAmountActivity = (WithdrawInputAmountActivity) obj;
        withdrawInputAmountActivity.f33295e = withdrawInputAmountActivity.getIntent().getExtras() == null ? withdrawInputAmountActivity.f33295e : withdrawInputAmountActivity.getIntent().getExtras().getString("sn_no", withdrawInputAmountActivity.f33295e);
        withdrawInputAmountActivity.f33296f = withdrawInputAmountActivity.getIntent().getExtras() == null ? withdrawInputAmountActivity.f33296f : withdrawInputAmountActivity.getIntent().getExtras().getString("core_order_source_type", withdrawInputAmountActivity.f33296f);
    }
}
