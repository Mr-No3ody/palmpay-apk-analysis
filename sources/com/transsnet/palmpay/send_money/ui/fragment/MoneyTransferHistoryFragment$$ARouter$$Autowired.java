package com.transsnet.palmpay.send_money.ui.fragment;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class MoneyTransferHistoryFragment$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        MoneyTransferHistoryFragment moneyTransferHistoryFragment = (MoneyTransferHistoryFragment) obj;
        moneyTransferHistoryFragment.f33671B = moneyTransferHistoryFragment.getArguments().getInt("core_bill_status", moneyTransferHistoryFragment.f33671B);
        moneyTransferHistoryFragment.f33672C = moneyTransferHistoryFragment.getArguments().getInt("core_bill_in_out", moneyTransferHistoryFragment.f33672C);
        moneyTransferHistoryFragment.f33673H = moneyTransferHistoryFragment.getArguments().getString("core_bill_type", moneyTransferHistoryFragment.f33673H);
    }
}
