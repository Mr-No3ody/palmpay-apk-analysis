package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferForBankUnstableDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = (ScheduleTransferForBankUnstableDetailActivity) obj;
        scheduleTransferForBankUnstableDetailActivity.f33439i = scheduleTransferForBankUnstableDetailActivity.getIntent().getExtras() == null ? scheduleTransferForBankUnstableDetailActivity.f33439i : scheduleTransferForBankUnstableDetailActivity.getIntent().getExtras().getString("orderId", scheduleTransferForBankUnstableDetailActivity.f33439i);
    }
}
