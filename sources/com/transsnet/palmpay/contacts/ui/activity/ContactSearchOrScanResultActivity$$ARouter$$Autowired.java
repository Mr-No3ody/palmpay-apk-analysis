package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class ContactSearchOrScanResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ContactSearchOrScanResultActivity contactSearchOrScanResultActivity = (ContactSearchOrScanResultActivity) target;
        contactSearchOrScanResultActivity.f27189f = contactSearchOrScanResultActivity.getIntent().getExtras() == null ? contactSearchOrScanResultActivity.f27189f : contactSearchOrScanResultActivity.getIntent().getExtras().getString("MEMBER_ID", contactSearchOrScanResultActivity.f27189f);
    }
}
