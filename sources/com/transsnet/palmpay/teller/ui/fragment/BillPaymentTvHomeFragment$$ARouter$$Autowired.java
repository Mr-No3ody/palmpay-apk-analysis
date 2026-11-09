package com.transsnet.palmpay.teller.ui.fragment;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes4.dex */
public class BillPaymentTvHomeFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillPaymentTvHomeFragment billPaymentTvHomeFragment = (BillPaymentTvHomeFragment) target;
        billPaymentTvHomeFragment.f34301M = billPaymentTvHomeFragment.getArguments().getString("billerId", billPaymentTvHomeFragment.f34301M);
        billPaymentTvHomeFragment.f34303X = billPaymentTvHomeFragment.getArguments().getString(AppsFlyerProperties.CHANNEL, billPaymentTvHomeFragment.f34303X);
    }
}
