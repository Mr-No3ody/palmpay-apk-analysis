package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class LinkFavePersonalInfoActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        LinkFavePersonalInfoActivity linkFavePersonalInfoActivity = (LinkFavePersonalInfoActivity) target;
        linkFavePersonalInfoActivity.f27224d = linkFavePersonalInfoActivity.getIntent().getExtras() == null ? linkFavePersonalInfoActivity.f27224d : linkFavePersonalInfoActivity.getIntent().getExtras().getString("key_binding_memberid", linkFavePersonalInfoActivity.f27224d);
        linkFavePersonalInfoActivity.f27225e = linkFavePersonalInfoActivity.getIntent().getExtras() == null ? linkFavePersonalInfoActivity.f27225e : linkFavePersonalInfoActivity.getIntent().getExtras().getString("key_phone", linkFavePersonalInfoActivity.f27225e);
    }
}
