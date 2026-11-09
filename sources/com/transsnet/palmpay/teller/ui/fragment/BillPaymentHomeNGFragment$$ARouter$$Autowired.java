package com.transsnet.palmpay.teller.ui.fragment;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BillPaymentHomeNGFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillPaymentHomeNGFragment billPaymentHomeNGFragment = (BillPaymentHomeNGFragment) target;
        billPaymentHomeNGFragment.f34294w = billPaymentHomeNGFragment.getArguments().getString("extra_type", billPaymentHomeNGFragment.f34294w);
        billPaymentHomeNGFragment.f34280A = billPaymentHomeNGFragment.getArguments().getString("billerId", billPaymentHomeNGFragment.f34280A);
    }
}
