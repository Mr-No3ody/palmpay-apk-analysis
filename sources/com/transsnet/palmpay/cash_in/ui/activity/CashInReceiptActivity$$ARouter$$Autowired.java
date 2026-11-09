package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class CashInReceiptActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CashInReceiptActivity cashInReceiptActivity = (CashInReceiptActivity) obj;
        cashInReceiptActivity.f26826u0 = cashInReceiptActivity.getIntent().getExtras() == null ? cashInReceiptActivity.f26826u0 : cashInReceiptActivity.getIntent().getExtras().getString("orderId", cashInReceiptActivity.f26826u0);
        cashInReceiptActivity.f26828v0 = cashInReceiptActivity.getIntent().getExtras() == null ? cashInReceiptActivity.f26828v0 : cashInReceiptActivity.getIntent().getExtras().getString("transType", cashInReceiptActivity.f26828v0);
    }
}
