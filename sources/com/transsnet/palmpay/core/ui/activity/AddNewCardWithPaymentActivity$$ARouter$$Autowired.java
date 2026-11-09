package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AddNewCardWithPaymentActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = (AddNewCardWithPaymentActivity) obj;
        addNewCardWithPaymentActivity.f27440k0 = addNewCardWithPaymentActivity.getIntent().getExtras() == null ? addNewCardWithPaymentActivity.f27440k0 : addNewCardWithPaymentActivity.getIntent().getExtras().getString("titleLine1", addNewCardWithPaymentActivity.f27440k0);
        addNewCardWithPaymentActivity.f27443p0 = addNewCardWithPaymentActivity.getIntent().getExtras() == null ? addNewCardWithPaymentActivity.f27443p0 : addNewCardWithPaymentActivity.getIntent().getExtras().getString("titleLine2", addNewCardWithPaymentActivity.f27443p0);
        addNewCardWithPaymentActivity.f27444q0 = addNewCardWithPaymentActivity.getIntent().getExtras() == null ? addNewCardWithPaymentActivity.f27444q0 : addNewCardWithPaymentActivity.getIntent().getExtras().getString("businessType", addNewCardWithPaymentActivity.f27444q0);
    }
}
