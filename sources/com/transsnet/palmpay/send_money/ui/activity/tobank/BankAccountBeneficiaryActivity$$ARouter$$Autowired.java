package com.transsnet.palmpay.send_money.ui.activity.tobank;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BankAccountBeneficiaryActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BankAccountBeneficiaryActivity bankAccountBeneficiaryActivity = (BankAccountBeneficiaryActivity) obj;
        bankAccountBeneficiaryActivity.f33495a = bankAccountBeneficiaryActivity.getIntent().getBooleanExtra("extra_data", bankAccountBeneficiaryActivity.f33495a);
        bankAccountBeneficiaryActivity.f33496b = bankAccountBeneficiaryActivity.getIntent().getExtras() == null ? bankAccountBeneficiaryActivity.f33496b : bankAccountBeneficiaryActivity.getIntent().getExtras().getString("core_order_source_type", bankAccountBeneficiaryActivity.f33496b);
    }
}
