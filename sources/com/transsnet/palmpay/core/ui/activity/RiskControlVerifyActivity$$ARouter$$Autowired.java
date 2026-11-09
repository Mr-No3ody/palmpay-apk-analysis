package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.RiskControlResult;

/* JADX INFO: loaded from: classes3.dex */
public class RiskControlVerifyActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        RiskControlVerifyActivity riskControlVerifyActivity = (RiskControlVerifyActivity) obj;
        riskControlVerifyActivity.f27707a = (RiskControlResult) riskControlVerifyActivity.getIntent().getParcelableExtra("extra_data");
    }
}
