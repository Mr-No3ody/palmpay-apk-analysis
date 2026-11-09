package com.transsnet.palmpay.jara_packet.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class JaraCommissionDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        JaraCommissionDetailActivity jaraCommissionDetailActivity = (JaraCommissionDetailActivity) target;
        jaraCommissionDetailActivity.f31848a = jaraCommissionDetailActivity.getIntent().getExtras() == null ? jaraCommissionDetailActivity.f31848a : jaraCommissionDetailActivity.getIntent().getExtras().getString("orderId", jaraCommissionDetailActivity.f31848a);
    }
}
