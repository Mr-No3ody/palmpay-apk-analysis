package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayLevelUpTier3V2Activity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity = (PalmPayLevelUpTier3V2Activity) obj;
        palmPayLevelUpTier3V2Activity.f25918c = palmPayLevelUpTier3V2Activity.getIntent().getExtras() == null ? palmPayLevelUpTier3V2Activity.f25918c : palmPayLevelUpTier3V2Activity.getIntent().getExtras().getString("orderNo", palmPayLevelUpTier3V2Activity.f25918c);
        palmPayLevelUpTier3V2Activity.f25919d = palmPayLevelUpTier3V2Activity.getIntent().getBooleanExtra("extra_flag", palmPayLevelUpTier3V2Activity.f25919d);
    }
}
