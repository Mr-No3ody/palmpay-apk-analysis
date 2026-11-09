package com.transsnet.palmpay.send_money.ui.activity.tobank;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class SelectBankForToBankActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SelectBankForToBankActivity selectBankForToBankActivity = (SelectBankForToBankActivity) obj;
        selectBankForToBankActivity.f33507A = selectBankForToBankActivity.getIntent().getExtras() == null ? selectBankForToBankActivity.f33507A : selectBankForToBankActivity.getIntent().getExtras().getString("core_extra_bank_account_data", selectBankForToBankActivity.f33507A);
    }
}
