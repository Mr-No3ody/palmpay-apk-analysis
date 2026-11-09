package com.transsnet.palmpay.ui.activity.points;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PointStatementDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PointStatementDetailActivity pointStatementDetailActivity = (PointStatementDetailActivity) obj;
        pointStatementDetailActivity.f34805a = pointStatementDetailActivity.getIntent().getExtras() == null ? pointStatementDetailActivity.f34805a : pointStatementDetailActivity.getIntent().getExtras().getString("LOYALTY_ORDER_ID", pointStatementDetailActivity.f34805a);
    }
}
