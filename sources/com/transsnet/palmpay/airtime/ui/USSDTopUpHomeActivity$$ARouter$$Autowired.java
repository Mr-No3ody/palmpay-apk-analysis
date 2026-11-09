package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class USSDTopUpHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        USSDTopUpHomeActivity uSSDTopUpHomeActivity = (USSDTopUpHomeActivity) target;
        uSSDTopUpHomeActivity.f26546g = uSSDTopUpHomeActivity.getIntent().getExtras() == null ? uSSDTopUpHomeActivity.f26546g : uSSDTopUpHomeActivity.getIntent().getExtras().getString("transType", uSSDTopUpHomeActivity.f26546g);
    }
}
