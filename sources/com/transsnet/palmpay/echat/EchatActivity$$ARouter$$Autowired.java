package com.transsnet.palmpay.echat;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class EchatActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        EchatActivity echatActivity = (EchatActivity) obj;
        echatActivity.f31832e = echatActivity.getIntent().getExtras() == null ? echatActivity.f31832e : echatActivity.getIntent().getExtras().getString("orderNo", echatActivity.f31832e);
        echatActivity.f31833f = echatActivity.getIntent().getExtras() == null ? echatActivity.f31833f : echatActivity.getIntent().getExtras().getString("extra_type", echatActivity.f31833f);
        echatActivity.f31834g = echatActivity.getIntent().getExtras() == null ? echatActivity.f31834g : echatActivity.getIntent().getExtras().getString("linkUrl", echatActivity.f31834g);
    }
}
