package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BuyEarlyRefundDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BuyEarlyRefundDetailActivity buyEarlyRefundDetailActivity = (BuyEarlyRefundDetailActivity) obj;
        buyEarlyRefundDetailActivity.f34672c = buyEarlyRefundDetailActivity.getIntent().getExtras() == null ? buyEarlyRefundDetailActivity.f34672c : buyEarlyRefundDetailActivity.getIntent().getExtras().getString("orderId", buyEarlyRefundDetailActivity.f34672c);
    }
}
