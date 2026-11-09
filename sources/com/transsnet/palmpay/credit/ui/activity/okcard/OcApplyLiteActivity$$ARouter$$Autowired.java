package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OcApplyLiteActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OcApplyLiteActivity ocApplyLiteActivity = (OcApplyLiteActivity) obj;
        ocApplyLiteActivity.f29274v = ocApplyLiteActivity.getIntent().getLongExtra("extra_data_1", ocApplyLiteActivity.f29274v);
        ocApplyLiteActivity.f29275w = ocApplyLiteActivity.getIntent().getLongExtra("extra_data_2", ocApplyLiteActivity.f29275w);
        ocApplyLiteActivity.f29263A = ocApplyLiteActivity.getIntent().getExtras() == null ? ocApplyLiteActivity.f29263A : ocApplyLiteActivity.getIntent().getExtras().getString("extra_data", ocApplyLiteActivity.f29263A);
    }
}
