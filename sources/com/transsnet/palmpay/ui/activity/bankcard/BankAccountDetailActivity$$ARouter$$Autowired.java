package com.transsnet.palmpay.ui.activity.bankcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;

/* JADX INFO: loaded from: classes4.dex */
public class BankAccountDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BankAccountDetailActivity bankAccountDetailActivity = (BankAccountDetailActivity) obj;
        bankAccountDetailActivity.f34632b = (LinkBankAccountResp.LinkBankAccount) bankAccountDetailActivity.getIntent().getParcelableExtra("core_extra_bank_account_data");
    }
}
