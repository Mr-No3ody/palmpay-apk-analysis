package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class RecordDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        RecordDetailActivity recordDetailActivity = (RecordDetailActivity) obj;
        recordDetailActivity.f26896a = recordDetailActivity.getIntent().getExtras() == null ? recordDetailActivity.f26896a : recordDetailActivity.getIntent().getExtras().getString("orderNo", recordDetailActivity.f26896a);
        recordDetailActivity.f26897b = recordDetailActivity.getIntent().getExtras() == null ? recordDetailActivity.f26897b : recordDetailActivity.getIntent().getExtras().getString("extra_type", recordDetailActivity.f26897b);
        recordDetailActivity.f26898c = recordDetailActivity.getIntent().getIntExtra("orderType", recordDetailActivity.f26898c);
    }
}
