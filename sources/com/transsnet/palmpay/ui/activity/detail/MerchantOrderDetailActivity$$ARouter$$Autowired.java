package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class MerchantOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        MerchantOrderDetailActivity merchantOrderDetailActivity = (MerchantOrderDetailActivity) obj;
        merchantOrderDetailActivity.f34710a = merchantOrderDetailActivity.getIntent().getExtras() == null ? merchantOrderDetailActivity.f34710a : merchantOrderDetailActivity.getIntent().getExtras().getString("orderId", merchantOrderDetailActivity.f34710a);
    }
}
