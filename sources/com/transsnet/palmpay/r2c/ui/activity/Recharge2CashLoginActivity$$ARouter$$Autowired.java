package com.transsnet.palmpay.r2c.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;

/* JADX INFO: loaded from: classes4.dex */
public class Recharge2CashLoginActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        Recharge2CashLoginActivity recharge2CashLoginActivity = (Recharge2CashLoginActivity) target;
        recharge2CashLoginActivity.f33123d = (Recharge2CashProviderV2Rsp) recharge2CashLoginActivity.getIntent().getParcelableExtra("extra_data");
        recharge2CashLoginActivity.f33124e = recharge2CashLoginActivity.getIntent().getExtras() == null ? recharge2CashLoginActivity.f33124e : recharge2CashLoginActivity.getIntent().getExtras().getString("PHONE_NUM", recharge2CashLoginActivity.f33124e);
    }
}
