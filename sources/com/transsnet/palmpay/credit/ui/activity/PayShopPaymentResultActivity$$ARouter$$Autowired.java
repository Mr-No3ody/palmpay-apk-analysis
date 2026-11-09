package com.transsnet.palmpay.credit.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayShopPaymentResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayShopPaymentResultActivity payShopPaymentResultActivity = (PayShopPaymentResultActivity) obj;
        payShopPaymentResultActivity.f28751w = payShopPaymentResultActivity.getIntent().getExtras() == null ? payShopPaymentResultActivity.f28751w : payShopPaymentResultActivity.getIntent().getExtras().getString("extra_data", payShopPaymentResultActivity.f28751w);
    }
}
