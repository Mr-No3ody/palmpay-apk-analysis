package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class DisbursementOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        DisbursementOrderDetailActivity disbursementOrderDetailActivity = (DisbursementOrderDetailActivity) obj;
        disbursementOrderDetailActivity.f34689a = disbursementOrderDetailActivity.getIntent().getExtras() == null ? disbursementOrderDetailActivity.f34689a : disbursementOrderDetailActivity.getIntent().getExtras().getString("orderId", disbursementOrderDetailActivity.f34689a);
        disbursementOrderDetailActivity.f34690b = disbursementOrderDetailActivity.getIntent().getExtras() == null ? disbursementOrderDetailActivity.f34690b : disbursementOrderDetailActivity.getIntent().getExtras().getString("extra_data", disbursementOrderDetailActivity.f34690b);
    }
}
