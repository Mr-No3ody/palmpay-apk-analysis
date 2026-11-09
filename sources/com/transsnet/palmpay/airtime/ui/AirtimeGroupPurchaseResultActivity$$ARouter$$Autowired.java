package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AirtimeGroupPurchaseResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AirtimeGroupPurchaseResultActivity airtimeGroupPurchaseResultActivity = (AirtimeGroupPurchaseResultActivity) target;
        airtimeGroupPurchaseResultActivity.f26460d = airtimeGroupPurchaseResultActivity.getIntent().getExtras() == null ? airtimeGroupPurchaseResultActivity.f26460d : airtimeGroupPurchaseResultActivity.getIntent().getExtras().getString("orderNo", airtimeGroupPurchaseResultActivity.f26460d);
    }
}
