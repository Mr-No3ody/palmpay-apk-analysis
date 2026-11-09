package com.transsnet.palmpay.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PendingVoucherListActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PendingVoucherListActivity pendingVoucherListActivity = (PendingVoucherListActivity) obj;
        pendingVoucherListActivity.f34551a = pendingVoucherListActivity.getIntent().getIntExtra("extra_data_1", pendingVoucherListActivity.f34551a);
        pendingVoucherListActivity.f34552b = pendingVoucherListActivity.getIntent().getIntExtra("extra_data_2", pendingVoucherListActivity.f34552b);
    }
}
