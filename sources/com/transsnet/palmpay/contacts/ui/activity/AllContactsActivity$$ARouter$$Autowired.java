package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AllContactsActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AllContactsActivity allContactsActivity = (AllContactsActivity) target;
        allContactsActivity.f27150e = allContactsActivity.getIntent().getExtras() == null ? allContactsActivity.f27150e : allContactsActivity.getIntent().getExtras().getString("orderType", allContactsActivity.f27150e);
        allContactsActivity.f27151f = allContactsActivity.getIntent().getExtras() == null ? allContactsActivity.f27151f : allContactsActivity.getIntent().getExtras().getString("transType", allContactsActivity.f27151f);
        allContactsActivity.f27152g = allContactsActivity.getIntent().getBooleanExtra("CLICK_ITEM_TO_FOR_RESULT", allContactsActivity.f27152g);
        allContactsActivity.f27153i = allContactsActivity.getIntent().getBooleanExtra("key_select_phone", allContactsActivity.f27153i);
    }
}
