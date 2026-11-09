package com.transsnet.palmpay.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayMerchantResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayMerchantResultActivity payMerchantResultActivity = (PayMerchantResultActivity) obj;
        payMerchantResultActivity.f34528C = payMerchantResultActivity.getIntent().getIntExtra("orderState", payMerchantResultActivity.f34528C);
        payMerchantResultActivity.f34529H = payMerchantResultActivity.getIntent().getBooleanExtra("pay_with_ussd", payMerchantResultActivity.f34529H);
        payMerchantResultActivity.f34530L = payMerchantResultActivity.getIntent().getExtras() == null ? payMerchantResultActivity.f34530L : payMerchantResultActivity.getIntent().getExtras().getString("mobile_channel", payMerchantResultActivity.f34530L);
        payMerchantResultActivity.f34531M = payMerchantResultActivity.getIntent().getExtras() == null ? payMerchantResultActivity.f34531M : payMerchantResultActivity.getIntent().getExtras().getString("orderDesc", payMerchantResultActivity.f34531M);
        payMerchantResultActivity.f34532Q = payMerchantResultActivity.getIntent().getExtras() == null ? payMerchantResultActivity.f34532Q : payMerchantResultActivity.getIntent().getExtras().getString("pay_result_data", payMerchantResultActivity.f34532Q);
    }
}
