package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AddNewFaveActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddNewFaveActivity addNewFaveActivity = (AddNewFaveActivity) target;
        addNewFaveActivity.f27141e = addNewFaveActivity.getIntent().getExtras() == null ? addNewFaveActivity.f27141e : addNewFaveActivity.getIntent().getExtras().getString("key_binding_memberid", addNewFaveActivity.f27141e);
        addNewFaveActivity.f27142f = addNewFaveActivity.getIntent().getExtras() == null ? addNewFaveActivity.f27142f : addNewFaveActivity.getIntent().getExtras().getString("key_phone", addNewFaveActivity.f27142f);
        addNewFaveActivity.f27143g = addNewFaveActivity.getIntent().getExtras() == null ? addNewFaveActivity.f27143g : addNewFaveActivity.getIntent().getExtras().getString("key_final_source", addNewFaveActivity.f27143g);
    }
}
