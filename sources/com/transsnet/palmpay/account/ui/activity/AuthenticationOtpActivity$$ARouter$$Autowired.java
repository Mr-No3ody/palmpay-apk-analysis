package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AuthenticationOtpActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AuthenticationOtpActivity authenticationOtpActivity = (AuthenticationOtpActivity) obj;
        authenticationOtpActivity.f25836c = authenticationOtpActivity.getIntent().getIntExtra("scene", authenticationOtpActivity.f25836c);
        authenticationOtpActivity.f25837d = authenticationOtpActivity.getIntent().getIntExtra("business_type", authenticationOtpActivity.f25837d);
    }
}
