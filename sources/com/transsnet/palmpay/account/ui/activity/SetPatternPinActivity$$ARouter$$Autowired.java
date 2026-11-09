package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class SetPatternPinActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SetPatternPinActivity setPatternPinActivity = (SetPatternPinActivity) obj;
        setPatternPinActivity.f26007w = Boolean.valueOf(setPatternPinActivity.getIntent().getBooleanExtra("fromSignUp", setPatternPinActivity.f26007w.booleanValue()));
        setPatternPinActivity.f25992A = Boolean.valueOf(setPatternPinActivity.getIntent().getBooleanExtra("IS_FORCE_SETTING_MODE", setPatternPinActivity.f25992A.booleanValue()));
        setPatternPinActivity.f25993B = setPatternPinActivity.getIntent().getIntExtra("jump_source", setPatternPinActivity.f25993B);
    }
}
