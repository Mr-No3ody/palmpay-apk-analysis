package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CloseContactBeanV2;

/* JADX INFO: loaded from: classes3.dex */
public class EditCloseContactsActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        EditCloseContactsActivity editCloseContactsActivity = (EditCloseContactsActivity) target;
        editCloseContactsActivity.f27209p = editCloseContactsActivity.getIntent().getIntExtra("KEY_EDIT_MODEL", editCloseContactsActivity.f27209p);
        editCloseContactsActivity.t = (CloseContactBeanV2) editCloseContactsActivity.getIntent().getParcelableExtra("KEY_CONTACT_BEAN");
    }
}
