package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayTier3PendingActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmPayTier3PendingActivity palmPayTier3PendingActivity = (PalmPayTier3PendingActivity) obj;
        palmPayTier3PendingActivity.f25940b = palmPayTier3PendingActivity.getIntent().getExtras() == null ? palmPayTier3PendingActivity.f25940b : palmPayTier3PendingActivity.getIntent().getExtras().getString("extra_data", palmPayTier3PendingActivity.f25940b);
        palmPayTier3PendingActivity.f25941c = palmPayTier3PendingActivity.getIntent().getExtras() == null ? palmPayTier3PendingActivity.f25941c : palmPayTier3PendingActivity.getIntent().getExtras().getString("extra_data_1", palmPayTier3PendingActivity.f25941c);
        palmPayTier3PendingActivity.f25942d = palmPayTier3PendingActivity.getIntent().getExtras() == null ? palmPayTier3PendingActivity.f25942d : palmPayTier3PendingActivity.getIntent().getExtras().getString("extra_data_2", palmPayTier3PendingActivity.f25942d);
    }
}
