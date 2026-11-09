package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class InterBankCashInOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        InterBankCashInOrderDetailActivity interBankCashInOrderDetailActivity = (InterBankCashInOrderDetailActivity) obj;
        interBankCashInOrderDetailActivity.f34700c = interBankCashInOrderDetailActivity.getIntent().getExtras() == null ? interBankCashInOrderDetailActivity.f34700c : interBankCashInOrderDetailActivity.getIntent().getExtras().getString("orderId", interBankCashInOrderDetailActivity.f34700c);
        interBankCashInOrderDetailActivity.f34701d = interBankCashInOrderDetailActivity.getIntent().getExtras() == null ? interBankCashInOrderDetailActivity.f34701d : interBankCashInOrderDetailActivity.getIntent().getExtras().getString("transfer_type", interBankCashInOrderDetailActivity.f34701d);
    }
}
