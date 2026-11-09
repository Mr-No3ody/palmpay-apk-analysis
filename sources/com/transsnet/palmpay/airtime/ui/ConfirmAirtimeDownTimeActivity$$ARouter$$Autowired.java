package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.AirtimeDownTimeOrderBean;

/* JADX INFO: loaded from: classes3.dex */
public class ConfirmAirtimeDownTimeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ConfirmAirtimeDownTimeActivity confirmAirtimeDownTimeActivity = (ConfirmAirtimeDownTimeActivity) target;
        confirmAirtimeDownTimeActivity.f26468e = (AirtimeDownTimeOrderBean) confirmAirtimeDownTimeActivity.getIntent().getSerializableExtra("extra_data");
    }
}
