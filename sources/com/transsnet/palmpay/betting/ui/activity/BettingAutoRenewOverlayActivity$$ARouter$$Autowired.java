package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class BettingAutoRenewOverlayActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = (BettingAutoRenewOverlayActivity) target;
        bettingAutoRenewOverlayActivity.f26655d = bettingAutoRenewOverlayActivity.getIntent().getExtras() == null ? bettingAutoRenewOverlayActivity.f26655d : bettingAutoRenewOverlayActivity.getIntent().getExtras().getString("orderNo", bettingAutoRenewOverlayActivity.f26655d);
        bettingAutoRenewOverlayActivity.f26656e = bettingAutoRenewOverlayActivity.getIntent().getExtras() == null ? bettingAutoRenewOverlayActivity.f26656e : bettingAutoRenewOverlayActivity.getIntent().getExtras().getString("extra_data", bettingAutoRenewOverlayActivity.f26656e);
    }
}
