package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ThirdPartyMerchantOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ThirdPartyMerchantOrderDetailActivity thirdPartyMerchantOrderDetailActivity = (ThirdPartyMerchantOrderDetailActivity) obj;
        thirdPartyMerchantOrderDetailActivity.f35007a = thirdPartyMerchantOrderDetailActivity.getIntent().getExtras() == null ? thirdPartyMerchantOrderDetailActivity.f35007a : thirdPartyMerchantOrderDetailActivity.getIntent().getExtras().getString("orderId", thirdPartyMerchantOrderDetailActivity.f35007a);
    }
}
