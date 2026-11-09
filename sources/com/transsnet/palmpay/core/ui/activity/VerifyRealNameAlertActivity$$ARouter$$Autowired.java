package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class VerifyRealNameAlertActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        VerifyRealNameAlertActivity verifyRealNameAlertActivity = (VerifyRealNameAlertActivity) obj;
        verifyRealNameAlertActivity.f27726a = verifyRealNameAlertActivity.getIntent().getExtras() == null ? verifyRealNameAlertActivity.f27726a : verifyRealNameAlertActivity.getIntent().getExtras().getString("extra_message", verifyRealNameAlertActivity.f27726a);
        verifyRealNameAlertActivity.f27727b = verifyRealNameAlertActivity.getIntent().getIntExtra("extra_type", verifyRealNameAlertActivity.f27727b);
        verifyRealNameAlertActivity.f27728c = verifyRealNameAlertActivity.getIntent().getExtras() == null ? verifyRealNameAlertActivity.f27728c : verifyRealNameAlertActivity.getIntent().getExtras().getString("extra_data", verifyRealNameAlertActivity.f27728c);
    }
}
