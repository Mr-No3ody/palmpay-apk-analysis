package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class ScheduleTopUpTaskManagerActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ScheduleTopUpTaskManagerActivity scheduleTopUpTaskManagerActivity = (ScheduleTopUpTaskManagerActivity) target;
        scheduleTopUpTaskManagerActivity.f26477d = Boolean.valueOf(scheduleTopUpTaskManagerActivity.getIntent().getBooleanExtra("extra_type", scheduleTopUpTaskManagerActivity.f26477d.booleanValue()));
        scheduleTopUpTaskManagerActivity.f26478e = Integer.valueOf(scheduleTopUpTaskManagerActivity.getIntent().getIntExtra("extra_data", scheduleTopUpTaskManagerActivity.f26478e.intValue()));
        scheduleTopUpTaskManagerActivity.f26479f = scheduleTopUpTaskManagerActivity.getIntent().getExtras() == null ? scheduleTopUpTaskManagerActivity.f26479f : scheduleTopUpTaskManagerActivity.getIntent().getExtras().getString("extra_data_1", scheduleTopUpTaskManagerActivity.f26479f);
        scheduleTopUpTaskManagerActivity.f26480g = scheduleTopUpTaskManagerActivity.getIntent().getExtras() == null ? scheduleTopUpTaskManagerActivity.f26480g : scheduleTopUpTaskManagerActivity.getIntent().getExtras().getString("key_phone", scheduleTopUpTaskManagerActivity.f26480g);
    }
}
