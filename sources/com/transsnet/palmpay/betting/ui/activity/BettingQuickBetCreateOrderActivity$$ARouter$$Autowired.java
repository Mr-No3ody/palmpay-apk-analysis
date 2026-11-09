package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class BettingQuickBetCreateOrderActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingQuickBetCreateOrderActivity bettingQuickBetCreateOrderActivity = (BettingQuickBetCreateOrderActivity) target;
        bettingQuickBetCreateOrderActivity.f26687d = bettingQuickBetCreateOrderActivity.getIntent().getExtras() == null ? bettingQuickBetCreateOrderActivity.f26687d : bettingQuickBetCreateOrderActivity.getIntent().getExtras().getString("billerId", bettingQuickBetCreateOrderActivity.f26687d);
        bettingQuickBetCreateOrderActivity.f26688e = bettingQuickBetCreateOrderActivity.getIntent().getExtras() == null ? bettingQuickBetCreateOrderActivity.f26688e : bettingQuickBetCreateOrderActivity.getIntent().getExtras().getString("customerId", bettingQuickBetCreateOrderActivity.f26688e);
        bettingQuickBetCreateOrderActivity.f26689f = Long.valueOf(bettingQuickBetCreateOrderActivity.getIntent().getLongExtra("businessAmount", bettingQuickBetCreateOrderActivity.f26689f.longValue()));
    }
}
