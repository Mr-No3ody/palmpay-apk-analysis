package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferCreateV2Activity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = (ScheduleTransferCreateV2Activity) obj;
        scheduleTransferCreateV2Activity.f33386d = scheduleTransferCreateV2Activity.getIntent().getIntExtra("extra_type", scheduleTransferCreateV2Activity.f33386d);
        scheduleTransferCreateV2Activity.f33387e = Double.valueOf(scheduleTransferCreateV2Activity.getIntent().getDoubleExtra("extra_amount", scheduleTransferCreateV2Activity.f33387e.doubleValue()));
        scheduleTransferCreateV2Activity.f33388f = scheduleTransferCreateV2Activity.getIntent().getExtras() == null ? scheduleTransferCreateV2Activity.f33388f : scheduleTransferCreateV2Activity.getIntent().getExtras().getString("extra_note", scheduleTransferCreateV2Activity.f33388f);
        scheduleTransferCreateV2Activity.f33389g = scheduleTransferCreateV2Activity.getIntent().getExtras() == null ? scheduleTransferCreateV2Activity.f33389g : scheduleTransferCreateV2Activity.getIntent().getExtras().getString("extra_data", scheduleTransferCreateV2Activity.f33389g);
        scheduleTransferCreateV2Activity.f33390i = scheduleTransferCreateV2Activity.getIntent().getExtras() == null ? scheduleTransferCreateV2Activity.f33390i : scheduleTransferCreateV2Activity.getIntent().getExtras().getString("BANK_ACCOUNT_NUMBER", scheduleTransferCreateV2Activity.f33390i);
        scheduleTransferCreateV2Activity.f33391j = scheduleTransferCreateV2Activity.getIntent().getExtras() == null ? scheduleTransferCreateV2Activity.f33391j : scheduleTransferCreateV2Activity.getIntent().getExtras().getString("contact_name", scheduleTransferCreateV2Activity.f33391j);
    }
}
