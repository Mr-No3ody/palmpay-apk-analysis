package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayShopInputAmountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayShopInputAmountActivity payShopInputAmountActivity = (PayShopInputAmountActivity) obj;
        payShopInputAmountActivity.f33181i = payShopInputAmountActivity.getIntent().getExtras() == null ? payShopInputAmountActivity.f33181i : payShopInputAmountActivity.getIntent().getExtras().getString("sn_no", payShopInputAmountActivity.f33181i);
        payShopInputAmountActivity.f33182j = payShopInputAmountActivity.getIntent().getExtras() == null ? payShopInputAmountActivity.f33182j : payShopInputAmountActivity.getIntent().getExtras().getString("core_order_source_type", payShopInputAmountActivity.f33182j);
    }
}
