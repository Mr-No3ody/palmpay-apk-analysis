package com.transsnet.palmpay.jara_packet.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ReferEarnRankActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ReferEarnRankActivity referEarnRankActivity = (ReferEarnRankActivity) target;
        referEarnRankActivity.f31915o = referEarnRankActivity.getIntent().getExtras() == null ? referEarnRankActivity.f31915o : referEarnRankActivity.getIntent().getExtras().getString("extra_data", referEarnRankActivity.f31915o);
    }
}
