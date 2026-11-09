package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes4.dex */
public class BillPaymentHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillPaymentHomeActivity billPaymentHomeActivity = (BillPaymentHomeActivity) target;
        billPaymentHomeActivity.f34158i = billPaymentHomeActivity.getIntent().getExtras() == null ? billPaymentHomeActivity.f34158i : billPaymentHomeActivity.getIntent().getExtras().getString("extra_type", billPaymentHomeActivity.f34158i);
        billPaymentHomeActivity.f34159j = billPaymentHomeActivity.getIntent().getExtras() == null ? billPaymentHomeActivity.f34159j : billPaymentHomeActivity.getIntent().getExtras().getString("billerId", billPaymentHomeActivity.f34159j);
        billPaymentHomeActivity.f34160o = billPaymentHomeActivity.getIntent().getExtras() == null ? billPaymentHomeActivity.f34160o : billPaymentHomeActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, billPaymentHomeActivity.f34160o);
    }
}
