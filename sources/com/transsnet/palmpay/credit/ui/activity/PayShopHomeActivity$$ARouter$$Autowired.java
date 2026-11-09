package com.transsnet.palmpay.credit.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayShopHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayShopHomeActivity payShopHomeActivity = (PayShopHomeActivity) obj;
        payShopHomeActivity.f28715Z = Integer.valueOf(payShopHomeActivity.getIntent().getIntExtra("extra_type", payShopHomeActivity.f28715Z.intValue()));
    }
}
