package com.transsnet.palmpay.credit.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayShopTransReceiptActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayShopTransReceiptActivity payShopTransReceiptActivity = (PayShopTransReceiptActivity) obj;
        payShopTransReceiptActivity.f28769Y = payShopTransReceiptActivity.getIntent().getExtras() == null ? payShopTransReceiptActivity.f28769Y : payShopTransReceiptActivity.getIntent().getExtras().getString("orderId", payShopTransReceiptActivity.f28769Y);
    }
}
