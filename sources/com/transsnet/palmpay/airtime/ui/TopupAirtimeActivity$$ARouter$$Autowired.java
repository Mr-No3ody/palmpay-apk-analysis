package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes3.dex */
public class TopupAirtimeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) target;
        topupAirtimeActivity.f26503X = topupAirtimeActivity.getIntent().getExtras() == null ? topupAirtimeActivity.f26503X : topupAirtimeActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, topupAirtimeActivity.f26503X);
        topupAirtimeActivity.f26511p0 = topupAirtimeActivity.getIntent().getExtras() == null ? topupAirtimeActivity.f26511p0 : topupAirtimeActivity.getIntent().getExtras().getString("phone_number", topupAirtimeActivity.f26511p0);
        topupAirtimeActivity.f26512q0 = topupAirtimeActivity.getIntent().getExtras() == null ? topupAirtimeActivity.f26512q0 : topupAirtimeActivity.getIntent().getExtras().getString("couponCode", topupAirtimeActivity.f26512q0);
        topupAirtimeActivity.f26513r0 = topupAirtimeActivity.getIntent().getExtras() == null ? topupAirtimeActivity.f26513r0 : topupAirtimeActivity.getIntent().getExtras().getString("code", topupAirtimeActivity.f26513r0);
    }
}
