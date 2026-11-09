package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class HandleResultPayWithUSSDByPushActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        HandleResultPayWithUSSDByPushActivity handleResultPayWithUSSDByPushActivity = (HandleResultPayWithUSSDByPushActivity) target;
        handleResultPayWithUSSDByPushActivity.f27649d = handleResultPayWithUSSDByPushActivity.getIntent().getExtras() == null ? handleResultPayWithUSSDByPushActivity.f27649d : handleResultPayWithUSSDByPushActivity.getIntent().getExtras().getString("mobile_channel", handleResultPayWithUSSDByPushActivity.f27649d);
        handleResultPayWithUSSDByPushActivity.f27650e = handleResultPayWithUSSDByPushActivity.getIntent().getExtras() == null ? handleResultPayWithUSSDByPushActivity.f27650e : handleResultPayWithUSSDByPushActivity.getIntent().getExtras().getString("business_data", handleResultPayWithUSSDByPushActivity.f27650e);
    }
}
