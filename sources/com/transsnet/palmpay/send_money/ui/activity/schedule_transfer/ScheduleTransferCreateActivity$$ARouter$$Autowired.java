package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferCreateActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = (ScheduleTransferCreateActivity) obj;
        scheduleTransferCreateActivity.f33325B = scheduleTransferCreateActivity.getIntent().getIntExtra("extra_type", scheduleTransferCreateActivity.f33325B);
        scheduleTransferCreateActivity.f33327C = Double.valueOf(scheduleTransferCreateActivity.getIntent().getDoubleExtra("extra_amount", scheduleTransferCreateActivity.f33327C.doubleValue()));
        scheduleTransferCreateActivity.f33333H = scheduleTransferCreateActivity.getIntent().getExtras() == null ? scheduleTransferCreateActivity.f33333H : scheduleTransferCreateActivity.getIntent().getExtras().getString("extra_note", scheduleTransferCreateActivity.f33333H);
        scheduleTransferCreateActivity.f33338L = scheduleTransferCreateActivity.getIntent().getExtras() == null ? scheduleTransferCreateActivity.f33338L : scheduleTransferCreateActivity.getIntent().getExtras().getString("extra_data", scheduleTransferCreateActivity.f33338L);
        scheduleTransferCreateActivity.f33340M = scheduleTransferCreateActivity.getIntent().getExtras() == null ? scheduleTransferCreateActivity.f33340M : scheduleTransferCreateActivity.getIntent().getExtras().getString("BANK_ACCOUNT_NUMBER", scheduleTransferCreateActivity.f33340M);
        scheduleTransferCreateActivity.f33343Q = scheduleTransferCreateActivity.getIntent().getExtras() == null ? scheduleTransferCreateActivity.f33343Q : scheduleTransferCreateActivity.getIntent().getExtras().getString("contact_name", scheduleTransferCreateActivity.f33343Q);
    }
}
