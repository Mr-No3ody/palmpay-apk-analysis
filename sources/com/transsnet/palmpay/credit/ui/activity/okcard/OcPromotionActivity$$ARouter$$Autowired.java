package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OcPromotionActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OcPromotionActivity ocPromotionActivity = (OcPromotionActivity) obj;
        ocPromotionActivity.f29646i = ocPromotionActivity.getIntent().getExtras() == null ? ocPromotionActivity.f29646i : ocPromotionActivity.getIntent().getExtras().getString("extra_data", ocPromotionActivity.f29646i);
    }
}
