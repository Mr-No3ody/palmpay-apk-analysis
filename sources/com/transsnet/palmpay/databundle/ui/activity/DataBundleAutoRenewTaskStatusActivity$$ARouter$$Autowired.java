package com.transsnet.palmpay.databundle.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class DataBundleAutoRenewTaskStatusActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        DataBundleAutoRenewTaskStatusActivity dataBundleAutoRenewTaskStatusActivity = (DataBundleAutoRenewTaskStatusActivity) target;
        dataBundleAutoRenewTaskStatusActivity.f31767d = dataBundleAutoRenewTaskStatusActivity.getIntent().getExtras() == null ? dataBundleAutoRenewTaskStatusActivity.f31767d : dataBundleAutoRenewTaskStatusActivity.getIntent().getExtras().getString("extra_sub_id", dataBundleAutoRenewTaskStatusActivity.f31767d);
    }
}
