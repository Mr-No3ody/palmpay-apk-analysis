package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class ScheduleTopUpTaskStatusActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTopUpTaskStatusActivity scheduleTopUpTaskStatusActivity = (ScheduleTopUpTaskStatusActivity) target;
        scheduleTopUpTaskStatusActivity.f26484d = scheduleTopUpTaskStatusActivity.getIntent().getExtras() == null ? scheduleTopUpTaskStatusActivity.f26484d : scheduleTopUpTaskStatusActivity.getIntent().getExtras().getString("extra_data", scheduleTopUpTaskStatusActivity.f26484d);
        scheduleTopUpTaskStatusActivity.f26485e = scheduleTopUpTaskStatusActivity.getIntent().getExtras() == null ? scheduleTopUpTaskStatusActivity.f26485e : scheduleTopUpTaskStatusActivity.getIntent().getExtras().getString("extra_data_1", scheduleTopUpTaskStatusActivity.f26485e);
    }
}
