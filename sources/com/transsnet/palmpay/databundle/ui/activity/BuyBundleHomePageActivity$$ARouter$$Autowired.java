package com.transsnet.palmpay.databundle.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes4.dex */
public class BuyBundleHomePageActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) target;
        buyBundleHomePageActivity.f31761w = buyBundleHomePageActivity.getIntent().getExtras() == null ? buyBundleHomePageActivity.f31761w : buyBundleHomePageActivity.getIntent().getExtras().getString("phone_number", buyBundleHomePageActivity.f31761w);
        buyBundleHomePageActivity.f31741A = buyBundleHomePageActivity.getIntent().getExtras() == null ? buyBundleHomePageActivity.f31741A : buyBundleHomePageActivity.getIntent().getExtras().getString("couponCode", buyBundleHomePageActivity.f31741A);
        buyBundleHomePageActivity.f31742B = buyBundleHomePageActivity.getIntent().getExtras() == null ? buyBundleHomePageActivity.f31742B : buyBundleHomePageActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, buyBundleHomePageActivity.f31742B);
    }
}
