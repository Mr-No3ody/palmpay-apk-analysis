package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BillPaymentOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillPaymentOrderDetailActivity billPaymentOrderDetailActivity = (BillPaymentOrderDetailActivity) target;
        billPaymentOrderDetailActivity.f34163d = billPaymentOrderDetailActivity.getIntent().getExtras() == null ? billPaymentOrderDetailActivity.f34163d : billPaymentOrderDetailActivity.getIntent().getExtras().getString("orderNo", billPaymentOrderDetailActivity.f34163d);
        billPaymentOrderDetailActivity.f34164e = billPaymentOrderDetailActivity.getIntent().getExtras() == null ? billPaymentOrderDetailActivity.f34164e : billPaymentOrderDetailActivity.getIntent().getExtras().getString("extra_type", billPaymentOrderDetailActivity.f34164e);
    }
}
