package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayTier3ApplicationDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmPayTier3ApplicationDetailActivity palmPayTier3ApplicationDetailActivity = (PalmPayTier3ApplicationDetailActivity) obj;
        palmPayTier3ApplicationDetailActivity.f25935a = palmPayTier3ApplicationDetailActivity.getIntent().getExtras() == null ? palmPayTier3ApplicationDetailActivity.f25935a : palmPayTier3ApplicationDetailActivity.getIntent().getExtras().getString("extra_data", palmPayTier3ApplicationDetailActivity.f25935a);
    }
}
