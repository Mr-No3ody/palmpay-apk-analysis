package com.transsnet.palmpay.credit.ui.activity.cashloan;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class CLRecordActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CLRecordActivity cLRecordActivity = (CLRecordActivity) obj;
        cLRecordActivity.f29019f = cLRecordActivity.getIntent().getIntExtra("tab", cLRecordActivity.f29019f);
    }
}
