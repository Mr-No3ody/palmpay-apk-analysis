package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AuthenticationActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AuthenticationActivity authenticationActivity = (AuthenticationActivity) obj;
        authenticationActivity.f25830a = authenticationActivity.getIntent().getIntExtra("extra_mode", authenticationActivity.f25830a);
        authenticationActivity.f25831b = authenticationActivity.getIntent().getExtras() == null ? authenticationActivity.f25831b : authenticationActivity.getIntent().getExtras().getString("orderId", authenticationActivity.f25831b);
        authenticationActivity.f25832c = authenticationActivity.getIntent().getBooleanExtra("_encrypt", authenticationActivity.f25832c);
        authenticationActivity.f25833d = authenticationActivity.getIntent().getBooleanExtra("need_pin", authenticationActivity.f25833d);
        authenticationActivity.f25834e = authenticationActivity.getIntent().getIntExtra("extra_type", authenticationActivity.f25834e);
    }
}
