package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class CloseContactsActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CloseContactsActivity closeContactsActivity = (CloseContactsActivity) target;
        closeContactsActivity.f27162a = closeContactsActivity.getIntent().getBooleanExtra("key_select_phone", closeContactsActivity.f27162a);
    }
}
