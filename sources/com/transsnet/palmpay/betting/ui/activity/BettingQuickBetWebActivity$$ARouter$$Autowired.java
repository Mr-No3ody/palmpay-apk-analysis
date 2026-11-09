package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class BettingQuickBetWebActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingQuickBetWebActivity bettingQuickBetWebActivity = (BettingQuickBetWebActivity) target;
        bettingQuickBetWebActivity.f26694d = bettingQuickBetWebActivity.getIntent().getExtras() == null ? bettingQuickBetWebActivity.f26694d : bettingQuickBetWebActivity.getIntent().getExtras().getString("linkUrl", bettingQuickBetWebActivity.f26694d);
        bettingQuickBetWebActivity.f26695e = bettingQuickBetWebActivity.getIntent().getExtras() == null ? bettingQuickBetWebActivity.f26695e : bettingQuickBetWebActivity.getIntent().getExtras().getString("BillerIcon", bettingQuickBetWebActivity.f26695e);
        bettingQuickBetWebActivity.f26696f = bettingQuickBetWebActivity.getIntent().getExtras() == null ? bettingQuickBetWebActivity.f26696f : bettingQuickBetWebActivity.getIntent().getExtras().getString("BillerName", bettingQuickBetWebActivity.f26696f);
    }
}
