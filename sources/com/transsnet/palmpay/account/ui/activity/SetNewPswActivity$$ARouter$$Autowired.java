package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class SetNewPswActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SetNewPswActivity setNewPswActivity = (SetNewPswActivity) obj;
        setNewPswActivity.f25988b = setNewPswActivity.getIntent().getExtras() == null ? setNewPswActivity.f25988b : setNewPswActivity.getIntent().getExtras().getString("_security_token", setNewPswActivity.f25988b);
        setNewPswActivity.f25989c = setNewPswActivity.getIntent().getIntExtra("mode", setNewPswActivity.f25989c);
        setNewPswActivity.f25990d = setNewPswActivity.getIntent().getExtras() == null ? setNewPswActivity.f25990d : setNewPswActivity.getIntent().getExtras().getString("extra_data_2", setNewPswActivity.f25990d);
    }
}
