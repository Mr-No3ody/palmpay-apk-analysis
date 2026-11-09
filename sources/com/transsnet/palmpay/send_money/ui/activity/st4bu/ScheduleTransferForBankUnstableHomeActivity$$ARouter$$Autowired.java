package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferForBankUnstableHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = (ScheduleTransferForBankUnstableHomeActivity) obj;
        scheduleTransferForBankUnstableHomeActivity.f33449X = scheduleTransferForBankUnstableHomeActivity.getIntent().getExtras() == null ? scheduleTransferForBankUnstableHomeActivity.f33449X : scheduleTransferForBankUnstableHomeActivity.getIntent().getExtras().getString("extra_data", scheduleTransferForBankUnstableHomeActivity.f33449X);
        scheduleTransferForBankUnstableHomeActivity.f33450Y = scheduleTransferForBankUnstableHomeActivity.getIntent().getExtras() == null ? scheduleTransferForBankUnstableHomeActivity.f33450Y : scheduleTransferForBankUnstableHomeActivity.getIntent().getExtras().getString("core_extra_bank_account_data", scheduleTransferForBankUnstableHomeActivity.f33450Y);
        scheduleTransferForBankUnstableHomeActivity.f33451Z = Long.valueOf(scheduleTransferForBankUnstableHomeActivity.getIntent().getLongExtra("extra_amount", scheduleTransferForBankUnstableHomeActivity.f33451Z.longValue()));
    }
}
