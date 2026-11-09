package com.transsnet.palmpay.ui.activity.welcome;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class WelcomeNewUserActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WelcomeNewUserActivity welcomeNewUserActivity = (WelcomeNewUserActivity) obj;
        welcomeNewUserActivity.f35041a = welcomeNewUserActivity.getIntent().getExtras() == null ? welcomeNewUserActivity.f35041a : welcomeNewUserActivity.getIntent().getExtras().getString("extra_title", welcomeNewUserActivity.f35041a);
        welcomeNewUserActivity.f35042b = welcomeNewUserActivity.getIntent().getExtras() == null ? welcomeNewUserActivity.f35042b : welcomeNewUserActivity.getIntent().getExtras().getString("business_path", welcomeNewUserActivity.f35042b);
        welcomeNewUserActivity.f35043c = welcomeNewUserActivity.getIntent().getExtras() == null ? welcomeNewUserActivity.f35043c : welcomeNewUserActivity.getIntent().getExtras().getString("imageUrl", welcomeNewUserActivity.f35043c);
        welcomeNewUserActivity.f35044d = welcomeNewUserActivity.getIntent().getExtras() == null ? welcomeNewUserActivity.f35044d : welcomeNewUserActivity.getIntent().getExtras().getString("darkImageUrl", welcomeNewUserActivity.f35044d);
    }
}
