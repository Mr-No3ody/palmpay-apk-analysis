package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OcSelectContactsActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OcSelectContactsActivity ocSelectContactsActivity = (OcSelectContactsActivity) obj;
        ocSelectContactsActivity.f29859a = ocSelectContactsActivity.getIntent().getBooleanExtra("CLICK_ITEM_TO_FOR_RESULT", ocSelectContactsActivity.f29859a);
        ocSelectContactsActivity.f29860b = ocSelectContactsActivity.getIntent().getBooleanExtra("key_select_phone", ocSelectContactsActivity.f29860b);
    }
}
