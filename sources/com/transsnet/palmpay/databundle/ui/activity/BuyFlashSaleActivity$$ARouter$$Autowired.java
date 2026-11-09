package com.transsnet.palmpay.databundle.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BuyFlashSaleActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) target;
        buyFlashSaleActivity.f31763c = buyFlashSaleActivity.getIntent().getExtras() == null ? buyFlashSaleActivity.f31763c : buyFlashSaleActivity.getIntent().getExtras().getString("extra_data", buyFlashSaleActivity.f31763c);
    }
}
