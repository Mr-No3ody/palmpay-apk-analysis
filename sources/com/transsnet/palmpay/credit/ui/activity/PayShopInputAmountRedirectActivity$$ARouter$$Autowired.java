package com.transsnet.palmpay.credit.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayShopInputAmountRedirectActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayShopInputAmountRedirectActivity payShopInputAmountRedirectActivity = (PayShopInputAmountRedirectActivity) obj;
        payShopInputAmountRedirectActivity.f28725a = payShopInputAmountRedirectActivity.getIntent().getExtras() == null ? payShopInputAmountRedirectActivity.f28725a : payShopInputAmountRedirectActivity.getIntent().getExtras().getString("sn_no", payShopInputAmountRedirectActivity.f28725a);
        payShopInputAmountRedirectActivity.f28726b = payShopInputAmountRedirectActivity.getIntent().getExtras() == null ? payShopInputAmountRedirectActivity.f28726b : payShopInputAmountRedirectActivity.getIntent().getExtras().getString("core_order_source_type", payShopInputAmountRedirectActivity.f28726b);
    }
}
