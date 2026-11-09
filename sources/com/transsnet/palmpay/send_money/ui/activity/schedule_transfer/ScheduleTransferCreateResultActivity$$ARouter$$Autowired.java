package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleTransferCreateResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTransferCreateResultActivity scheduleTransferCreateResultActivity = (ScheduleTransferCreateResultActivity) obj;
        scheduleTransferCreateResultActivity.f33372d = (ScheduleTransferCreateResp) scheduleTransferCreateResultActivity.getIntent().getParcelableExtra("extra_data");
    }
}
