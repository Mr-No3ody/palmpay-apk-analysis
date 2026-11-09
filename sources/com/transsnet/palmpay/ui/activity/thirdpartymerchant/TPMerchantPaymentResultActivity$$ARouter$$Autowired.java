package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TPMerchantPaymentResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TPMerchantPaymentResultActivity tPMerchantPaymentResultActivity = (TPMerchantPaymentResultActivity) obj;
        tPMerchantPaymentResultActivity.f34988i = tPMerchantPaymentResultActivity.getIntent().getExtras() == null ? tPMerchantPaymentResultActivity.f34988i : tPMerchantPaymentResultActivity.getIntent().getExtras().getString("/main/merchant_result_info", tPMerchantPaymentResultActivity.f34988i);
        tPMerchantPaymentResultActivity.f34989j = tPMerchantPaymentResultActivity.getIntent().getExtras() == null ? tPMerchantPaymentResultActivity.f34989j : tPMerchantPaymentResultActivity.getIntent().getExtras().getString("pay_result_data", tPMerchantPaymentResultActivity.f34989j);
    }
}
