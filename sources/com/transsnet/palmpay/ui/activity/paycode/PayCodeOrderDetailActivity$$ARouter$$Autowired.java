package com.transsnet.palmpay.ui.activity.paycode;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayCodeOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayCodeOrderDetailActivity payCodeOrderDetailActivity = (PayCodeOrderDetailActivity) obj;
        payCodeOrderDetailActivity.f34788c = payCodeOrderDetailActivity.getIntent().getExtras() == null ? payCodeOrderDetailActivity.f34788c : payCodeOrderDetailActivity.getIntent().getExtras().getString("orderNo", payCodeOrderDetailActivity.f34788c);
        payCodeOrderDetailActivity.f34789d = payCodeOrderDetailActivity.getIntent().getExtras() == null ? payCodeOrderDetailActivity.f34789d : payCodeOrderDetailActivity.getIntent().getExtras().getString("extra_type", payCodeOrderDetailActivity.f34789d);
    }
}
