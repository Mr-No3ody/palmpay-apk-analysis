package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AddGuardianActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddGuardianActivity addGuardianActivity = (AddGuardianActivity) obj;
        addGuardianActivity.f25813b = addGuardianActivity.getIntent().getExtras() == null ? addGuardianActivity.f25813b : addGuardianActivity.getIntent().getExtras().getString("_token", addGuardianActivity.f25813b);
        addGuardianActivity.f25814c = addGuardianActivity.getIntent().getIntExtra("extra_type", addGuardianActivity.f25814c);
        addGuardianActivity.f25815d = addGuardianActivity.getIntent().getExtras() == null ? addGuardianActivity.f25815d : addGuardianActivity.getIntent().getExtras().getString("extra_title", addGuardianActivity.f25815d);
        addGuardianActivity.f25816e = addGuardianActivity.getIntent().getExtras() == null ? addGuardianActivity.f25816e : addGuardianActivity.getIntent().getExtras().getString("extra_message", addGuardianActivity.f25816e);
    }
}
