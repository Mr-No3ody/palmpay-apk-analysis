package com.transsnet.palmpay.send_money.ui.activity.tobank;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToBankAccountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToBankAccountActivity transferToBankAccountActivity = (TransferToBankAccountActivity) obj;
        transferToBankAccountActivity.f33519a = transferToBankAccountActivity.getIntent().getExtras() == null ? transferToBankAccountActivity.f33519a : transferToBankAccountActivity.getIntent().getExtras().getString("core_order_source_type", transferToBankAccountActivity.f33519a);
        transferToBankAccountActivity.f33520b = transferToBankAccountActivity.getIntent().getExtras() == null ? transferToBankAccountActivity.f33520b : transferToBankAccountActivity.getIntent().getExtras().getString("accountNo", transferToBankAccountActivity.f33520b);
    }
}
