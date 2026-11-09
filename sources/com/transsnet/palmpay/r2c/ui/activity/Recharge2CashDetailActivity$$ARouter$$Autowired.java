package com.transsnet.palmpay.r2c.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class Recharge2CashDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        Recharge2CashDetailActivity recharge2CashDetailActivity = (Recharge2CashDetailActivity) target;
        recharge2CashDetailActivity.f33115d = recharge2CashDetailActivity.getIntent().getExtras() == null ? recharge2CashDetailActivity.f33115d : recharge2CashDetailActivity.getIntent().getExtras().getString("orderNo", recharge2CashDetailActivity.f33115d);
    }
}
