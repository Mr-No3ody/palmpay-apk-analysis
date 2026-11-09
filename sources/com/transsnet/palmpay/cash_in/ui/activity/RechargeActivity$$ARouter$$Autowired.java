package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class RechargeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        RechargeActivity rechargeActivity = (RechargeActivity) obj;
        rechargeActivity.f26864H = rechargeActivity.getIntent().getExtras() == null ? rechargeActivity.f26864H : rechargeActivity.getIntent().getExtras().getString("extra_type", rechargeActivity.f26864H);
        rechargeActivity.f26865L = rechargeActivity.getIntent().getExtras() == null ? rechargeActivity.f26865L : rechargeActivity.getIntent().getExtras().getString("extra_title", rechargeActivity.f26865L);
    }
}
