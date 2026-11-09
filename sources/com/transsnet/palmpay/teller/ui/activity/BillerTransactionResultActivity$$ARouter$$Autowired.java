package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes4.dex */
public class BillerTransactionResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillerTransactionResultActivity billerTransactionResultActivity = (BillerTransactionResultActivity) target;
        billerTransactionResultActivity.f34190d = (PayByOrderResp.DataBean) billerTransactionResultActivity.getIntent().getParcelableExtra("pay_result_data");
    }
}
