package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OcInstallmentBillDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OcInstallmentBillDetailActivity ocInstallmentBillDetailActivity = (OcInstallmentBillDetailActivity) obj;
        ocInstallmentBillDetailActivity.f29515d = ocInstallmentBillDetailActivity.getIntent().getExtras() == null ? ocInstallmentBillDetailActivity.f29515d : ocInstallmentBillDetailActivity.getIntent().getExtras().getString("orderNo", ocInstallmentBillDetailActivity.f29515d);
    }
}
