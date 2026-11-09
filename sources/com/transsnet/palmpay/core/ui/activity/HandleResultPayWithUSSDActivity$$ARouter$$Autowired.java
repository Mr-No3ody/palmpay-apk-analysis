package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class HandleResultPayWithUSSDActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        HandleResultPayWithUSSDActivity handleResultPayWithUSSDActivity = (HandleResultPayWithUSSDActivity) target;
        handleResultPayWithUSSDActivity.f27642e = handleResultPayWithUSSDActivity.getIntent().getExtras() == null ? handleResultPayWithUSSDActivity.f27642e : handleResultPayWithUSSDActivity.getIntent().getExtras().getString("mobile_channel", handleResultPayWithUSSDActivity.f27642e);
        handleResultPayWithUSSDActivity.f27643f = handleResultPayWithUSSDActivity.getIntent().getExtras() == null ? handleResultPayWithUSSDActivity.f27643f : handleResultPayWithUSSDActivity.getIntent().getExtras().getString("business_data", handleResultPayWithUSSDActivity.f27643f);
    }
}
