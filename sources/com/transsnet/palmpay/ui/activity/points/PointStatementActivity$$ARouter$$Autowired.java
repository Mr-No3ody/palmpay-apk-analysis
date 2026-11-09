package com.transsnet.palmpay.ui.activity.points;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PointStatementActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PointStatementActivity pointStatementActivity = (PointStatementActivity) obj;
        pointStatementActivity.f34804a = pointStatementActivity.getIntent().getExtras() == null ? pointStatementActivity.f34804a : pointStatementActivity.getIntent().getExtras().getString("extra_type", pointStatementActivity.f34804a);
    }
}
