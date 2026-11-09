package com.transsnet.palmpay.send_money.ui.activity.topp;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PersonalHomePageActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PersonalHomePageActivity personalHomePageActivity = (PersonalHomePageActivity) obj;
        personalHomePageActivity.f33571v = personalHomePageActivity.getIntent().getExtras() == null ? personalHomePageActivity.f33571v : personalHomePageActivity.getIntent().getExtras().getString("MEMBER_ID", personalHomePageActivity.f33571v);
        personalHomePageActivity.f33572w = personalHomePageActivity.getIntent().getExtras() == null ? personalHomePageActivity.f33572w : personalHomePageActivity.getIntent().getExtras().getString("phone_number", personalHomePageActivity.f33572w);
        personalHomePageActivity.f33558A = personalHomePageActivity.getIntent().getBooleanExtra("isHideInfo", personalHomePageActivity.f33558A);
        personalHomePageActivity.f33559B = personalHomePageActivity.getIntent().getIntExtra("extra_type", personalHomePageActivity.f33559B);
        personalHomePageActivity.f33560C = personalHomePageActivity.getIntent().getExtras() == null ? personalHomePageActivity.f33560C : personalHomePageActivity.getIntent().getExtras().getString("extra_data", personalHomePageActivity.f33560C);
    }
}
