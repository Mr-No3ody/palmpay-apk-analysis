package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes3.dex */
public class WithdrawAgentPaymentResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = (WithdrawAgentPaymentResultActivity) obj;
        withdrawAgentPaymentResultActivity.f26921p = (PayByOrderResp.DataBean) withdrawAgentPaymentResultActivity.getIntent().getParcelableExtra("extra_data");
    }
}
