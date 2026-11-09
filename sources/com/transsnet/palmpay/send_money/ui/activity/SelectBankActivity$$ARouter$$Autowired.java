package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class SelectBankActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SelectBankActivity selectBankActivity = (SelectBankActivity) obj;
        selectBankActivity.f33197v = selectBankActivity.getIntent().getIntExtra("bank_list_type", selectBankActivity.f33197v);
        selectBankActivity.f33198w = selectBankActivity.getIntent().getIntExtra("extra_type", selectBankActivity.f33198w);
    }
}
