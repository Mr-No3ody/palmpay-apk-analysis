package com.transsnet.palmpay.r2c.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class Recharge2CashResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        Recharge2CashResultActivity recharge2CashResultActivity = (Recharge2CashResultActivity) target;
        recharge2CashResultActivity.f33132d = recharge2CashResultActivity.getIntent().getExtras() == null ? recharge2CashResultActivity.f33132d : recharge2CashResultActivity.getIntent().getExtras().getString("orderNo", recharge2CashResultActivity.f33132d);
        recharge2CashResultActivity.f33133e = recharge2CashResultActivity.getIntent().getExtras() == null ? recharge2CashResultActivity.f33133e : recharge2CashResultActivity.getIntent().getExtras().getString("key_fail_message", recharge2CashResultActivity.f33133e);
    }
}
