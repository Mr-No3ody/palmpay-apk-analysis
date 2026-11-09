package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AddNewBankAccountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddNewBankAccountActivity addNewBankAccountActivity = (AddNewBankAccountActivity) obj;
        addNewBankAccountActivity.f27420c = addNewBankAccountActivity.getIntent().getExtras() == null ? addNewBankAccountActivity.f27420c : addNewBankAccountActivity.getIntent().getExtras().getString("extra_data_1", addNewBankAccountActivity.f27420c);
    }
}
