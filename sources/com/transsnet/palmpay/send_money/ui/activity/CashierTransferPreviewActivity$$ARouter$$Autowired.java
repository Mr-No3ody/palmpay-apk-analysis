package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class CashierTransferPreviewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CashierTransferPreviewActivity cashierTransferPreviewActivity = (CashierTransferPreviewActivity) obj;
        cashierTransferPreviewActivity.f33149a1 = cashierTransferPreviewActivity.getIntent().getIntExtra("business_type", cashierTransferPreviewActivity.f33149a1);
        cashierTransferPreviewActivity.f33150b1 = cashierTransferPreviewActivity.getIntent().getBooleanExtra("quick_pay", cashierTransferPreviewActivity.f33150b1);
        cashierTransferPreviewActivity.f33151c1 = cashierTransferPreviewActivity.getIntent().getExtras() == null ? cashierTransferPreviewActivity.f33151c1 : cashierTransferPreviewActivity.getIntent().getExtras().getString("payee_account_type", cashierTransferPreviewActivity.f33151c1);
        cashierTransferPreviewActivity.d1 = cashierTransferPreviewActivity.getIntent().getExtras() == null ? cashierTransferPreviewActivity.d1 : cashierTransferPreviewActivity.getIntent().getExtras().getString("accountNo", cashierTransferPreviewActivity.d1);
    }
}
