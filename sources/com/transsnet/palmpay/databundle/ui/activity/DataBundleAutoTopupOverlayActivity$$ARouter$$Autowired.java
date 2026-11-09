package com.transsnet.palmpay.databundle.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.teller.bean.AutoRenewalOrderBean;

/* JADX INFO: loaded from: classes4.dex */
public class DataBundleAutoTopupOverlayActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = (DataBundleAutoTopupOverlayActivity) target;
        dataBundleAutoTopupOverlayActivity.f31769d = dataBundleAutoTopupOverlayActivity.getIntent().getExtras() == null ? dataBundleAutoTopupOverlayActivity.f31769d : dataBundleAutoTopupOverlayActivity.getIntent().getExtras().getString("orderNo", dataBundleAutoTopupOverlayActivity.f31769d);
        dataBundleAutoTopupOverlayActivity.f31770e = (AutoRenewalOrderBean) dataBundleAutoTopupOverlayActivity.getIntent().getParcelableExtra("order_detail_type");
    }
}
