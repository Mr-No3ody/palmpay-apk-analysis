package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class InsuranceHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        InsuranceHomeActivity insuranceHomeActivity = (InsuranceHomeActivity) target;
        insuranceHomeActivity.f34219b = insuranceHomeActivity.getIntent().getExtras() == null ? insuranceHomeActivity.f34219b : insuranceHomeActivity.getIntent().getExtras().getString("billerId", insuranceHomeActivity.f34219b);
    }
}
