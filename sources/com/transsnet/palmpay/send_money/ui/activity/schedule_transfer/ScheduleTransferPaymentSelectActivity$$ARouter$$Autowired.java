package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferPaymentSelectActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferPaymentSelectActivity scheduleTransferPaymentSelectActivity = (ScheduleTransferPaymentSelectActivity) obj;
        scheduleTransferPaymentSelectActivity.f33417c = Integer.valueOf(scheduleTransferPaymentSelectActivity.getIntent().getIntExtra("extra_flag", scheduleTransferPaymentSelectActivity.f33417c.intValue()));
    }
}
