package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class ExpressageInfoActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ExpressageInfoActivity expressageInfoActivity = (ExpressageInfoActivity) obj;
        expressageInfoActivity.f27627o = expressageInfoActivity.getIntent().getExtras() == null ? expressageInfoActivity.f27627o : expressageInfoActivity.getIntent().getExtras().getString("orderNo", expressageInfoActivity.f27627o);
        expressageInfoActivity.f27628p = expressageInfoActivity.getIntent().getIntExtra("orderType", expressageInfoActivity.f27628p);
    }
}
