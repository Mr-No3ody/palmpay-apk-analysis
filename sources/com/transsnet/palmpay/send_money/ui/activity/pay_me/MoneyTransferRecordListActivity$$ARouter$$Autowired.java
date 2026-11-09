package com.transsnet.palmpay.send_money.ui.activity.pay_me;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class MoneyTransferRecordListActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        MoneyTransferRecordListActivity moneyTransferRecordListActivity = (MoneyTransferRecordListActivity) obj;
        moneyTransferRecordListActivity.f33303c = moneyTransferRecordListActivity.getIntent().getIntExtra("core_bill_status", moneyTransferRecordListActivity.f33303c);
        moneyTransferRecordListActivity.f33304d = moneyTransferRecordListActivity.getIntent().getIntExtra("core_bill_in_out", moneyTransferRecordListActivity.f33304d);
        moneyTransferRecordListActivity.f33305e = moneyTransferRecordListActivity.getIntent().getExtras() == null ? moneyTransferRecordListActivity.f33305e : moneyTransferRecordListActivity.getIntent().getExtras().getString("core_bill_type", moneyTransferRecordListActivity.f33305e);
    }
}
