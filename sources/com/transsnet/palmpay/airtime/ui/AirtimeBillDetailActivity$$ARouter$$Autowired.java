package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AirtimeBillDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AirtimeBillDetailActivity airtimeBillDetailActivity = (AirtimeBillDetailActivity) target;
        airtimeBillDetailActivity.f26456e = airtimeBillDetailActivity.getIntent().getExtras() == null ? airtimeBillDetailActivity.f26456e : airtimeBillDetailActivity.getIntent().getExtras().getString("orderNo", airtimeBillDetailActivity.f26456e);
    }
}
