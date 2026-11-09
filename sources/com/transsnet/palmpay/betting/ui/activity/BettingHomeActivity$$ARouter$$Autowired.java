package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes3.dex */
public class BettingHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingHomeActivity bettingHomeActivity = (BettingHomeActivity) target;
        bettingHomeActivity.f26672i = bettingHomeActivity.getIntent().getExtras() == null ? bettingHomeActivity.f26672i : bettingHomeActivity.getIntent().getExtras().getString("billerId", bettingHomeActivity.f26672i);
        bettingHomeActivity.f26673j = bettingHomeActivity.getIntent().getExtras() == null ? bettingHomeActivity.f26673j : bettingHomeActivity.getIntent().getExtras().getString("customerId", bettingHomeActivity.f26673j);
        bettingHomeActivity.f26675o = bettingHomeActivity.getIntent().getExtras() == null ? bettingHomeActivity.f26675o : bettingHomeActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, bettingHomeActivity.f26675o);
    }
}
