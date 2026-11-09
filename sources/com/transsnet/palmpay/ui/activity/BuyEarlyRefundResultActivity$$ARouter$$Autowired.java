package com.transsnet.palmpay.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BuyEarlyRefundResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BuyEarlyRefundResultActivity buyEarlyRefundResultActivity = (BuyEarlyRefundResultActivity) obj;
        buyEarlyRefundResultActivity.f34447a = buyEarlyRefundResultActivity.getIntent().getExtras() == null ? buyEarlyRefundResultActivity.f34447a : buyEarlyRefundResultActivity.getIntent().getExtras().getString("extra_data", buyEarlyRefundResultActivity.f34447a);
    }
}
