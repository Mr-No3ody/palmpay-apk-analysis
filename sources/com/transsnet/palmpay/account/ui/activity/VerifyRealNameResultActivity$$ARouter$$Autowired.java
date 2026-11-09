package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class VerifyRealNameResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        VerifyRealNameResultActivity verifyRealNameResultActivity = (VerifyRealNameResultActivity) obj;
        verifyRealNameResultActivity.f26085a = verifyRealNameResultActivity.getIntent().getIntExtra("extra_type", verifyRealNameResultActivity.f26085a);
        verifyRealNameResultActivity.f26086b = verifyRealNameResultActivity.getIntent().getIntExtra("extra_result", verifyRealNameResultActivity.f26086b);
        verifyRealNameResultActivity.f26087c = verifyRealNameResultActivity.getIntent().getExtras() == null ? verifyRealNameResultActivity.f26087c : verifyRealNameResultActivity.getIntent().getExtras().getString("extra_message", verifyRealNameResultActivity.f26087c);
    }
}
