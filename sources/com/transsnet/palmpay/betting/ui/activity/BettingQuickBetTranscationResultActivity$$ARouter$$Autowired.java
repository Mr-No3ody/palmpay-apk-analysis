package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes3.dex */
public class BettingQuickBetTranscationResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity = (BettingQuickBetTranscationResultActivity) target;
        bettingQuickBetTranscationResultActivity.f26692e = (PayByOrderResp.DataBean) bettingQuickBetTranscationResultActivity.getIntent().getParcelableExtra("pay_result_data");
    }
}
