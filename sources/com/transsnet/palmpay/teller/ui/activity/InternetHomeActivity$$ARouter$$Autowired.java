package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class InternetHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        InternetHomeActivity internetHomeActivity = (InternetHomeActivity) target;
        internetHomeActivity.f34221b = internetHomeActivity.getIntent().getExtras() == null ? internetHomeActivity.f34221b : internetHomeActivity.getIntent().getExtras().getString("billerId", internetHomeActivity.f34221b);
    }
}
