package com.transsnet.palmpay.send_money.ui.activity.topp;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class InputMobileActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        InputMobileActivity inputMobileActivity = (InputMobileActivity) obj;
        inputMobileActivity.f33544Y = inputMobileActivity.getIntent().getIntExtra("extra_type", inputMobileActivity.f33544Y);
    }
}
