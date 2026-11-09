package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferOrderDetailActivity scheduleTransferOrderDetailActivity = (ScheduleTransferOrderDetailActivity) obj;
        scheduleTransferOrderDetailActivity.f33410d = scheduleTransferOrderDetailActivity.getIntent().getExtras() == null ? scheduleTransferOrderDetailActivity.f33410d : scheduleTransferOrderDetailActivity.getIntent().getExtras().getString("orderId", scheduleTransferOrderDetailActivity.f33410d);
    }
}
