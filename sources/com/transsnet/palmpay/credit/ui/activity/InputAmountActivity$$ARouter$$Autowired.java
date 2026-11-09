package com.transsnet.palmpay.credit.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class InputAmountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        InputAmountActivity inputAmountActivity = (InputAmountActivity) obj;
        inputAmountActivity.f28674C = inputAmountActivity.getIntent().getExtras() == null ? inputAmountActivity.f28674C : inputAmountActivity.getIntent().getExtras().getString("sn_no", inputAmountActivity.f28674C);
    }
}
