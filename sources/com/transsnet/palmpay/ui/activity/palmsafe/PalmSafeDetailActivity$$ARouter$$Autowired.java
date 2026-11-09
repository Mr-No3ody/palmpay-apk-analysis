package com.transsnet.palmpay.ui.activity.palmsafe;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PalmSafeDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmSafeDetailActivity palmSafeDetailActivity = (PalmSafeDetailActivity) obj;
        palmSafeDetailActivity.f34777c = palmSafeDetailActivity.getIntent().getExtras() == null ? palmSafeDetailActivity.f34777c : palmSafeDetailActivity.getIntent().getExtras().getString("orderId", palmSafeDetailActivity.f34777c);
    }
}
