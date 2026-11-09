package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeScheduleTopUpBean;

/* JADX INFO: loaded from: classes3.dex */
public class AutoTopupOverlayActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AutoTopupOverlayActivity autoTopupOverlayActivity = (AutoTopupOverlayActivity) target;
        autoTopupOverlayActivity.f26464d = autoTopupOverlayActivity.getIntent().getExtras() == null ? autoTopupOverlayActivity.f26464d : autoTopupOverlayActivity.getIntent().getExtras().getString("orderNo", autoTopupOverlayActivity.f26464d);
        autoTopupOverlayActivity.f26465e = (AirtimeScheduleTopUpBean) autoTopupOverlayActivity.getIntent().getParcelableExtra("KEY_DATA");
    }
}
