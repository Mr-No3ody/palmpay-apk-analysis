package com.transsnet.palmpay.teller.ui.fragment;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes4.dex */
public class BillPaymentElectricityHomeFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = (BillPaymentElectricityHomeFragment) target;
        billPaymentElectricityHomeFragment.f34259H = billPaymentElectricityHomeFragment.getArguments().getString("billerId", billPaymentElectricityHomeFragment.f34259H);
        billPaymentElectricityHomeFragment.f34261M = billPaymentElectricityHomeFragment.getArguments().getString(AppsFlyerProperties.CHANNEL, billPaymentElectricityHomeFragment.f34261M);
    }
}
