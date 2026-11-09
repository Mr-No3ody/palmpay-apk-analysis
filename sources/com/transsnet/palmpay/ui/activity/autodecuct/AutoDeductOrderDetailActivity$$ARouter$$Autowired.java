package com.transsnet.palmpay.ui.activity.autodecuct;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class AutoDeductOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AutoDeductOrderDetailActivity autoDeductOrderDetailActivity = (AutoDeductOrderDetailActivity) obj;
        autoDeductOrderDetailActivity.f34612a = autoDeductOrderDetailActivity.getIntent().getExtras() == null ? autoDeductOrderDetailActivity.f34612a : autoDeductOrderDetailActivity.getIntent().getExtras().getString("orderId", autoDeductOrderDetailActivity.f34612a);
    }
}
