package com.transsnet.palmpay.managemoney.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class CashBoxAutoSaveOperationActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CashBoxAutoSaveOperationActivity cashBoxAutoSaveOperationActivity = (CashBoxAutoSaveOperationActivity) obj;
        cashBoxAutoSaveOperationActivity.f32018c = cashBoxAutoSaveOperationActivity.getIntent().getExtras() == null ? cashBoxAutoSaveOperationActivity.f32018c : cashBoxAutoSaveOperationActivity.getIntent().getExtras().getString("extra_entry_type", cashBoxAutoSaveOperationActivity.f32018c);
    }
}
