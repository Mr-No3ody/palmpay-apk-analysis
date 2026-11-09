package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class LogInActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        LogInActivity logInActivity = (LogInActivity) obj;
        logInActivity.f25900w = logInActivity.getIntent().getExtras() == null ? logInActivity.f25900w : logInActivity.getIntent().getExtras().getString("android.intent.extra.TEXT", logInActivity.f25900w);
        logInActivity.f25878A = logInActivity.getIntent().getExtras() == null ? logInActivity.f25878A : logInActivity.getIntent().getExtras().getString("source", logInActivity.f25878A);
        logInActivity.f25879B = logInActivity.getIntent().getExtras() == null ? logInActivity.f25879B : logInActivity.getIntent().getExtras().getString("_number", logInActivity.f25879B);
        logInActivity.f25880C = logInActivity.getIntent().getExtras() == null ? logInActivity.f25880C : logInActivity.getIntent().getExtras().getString("_input_number", logInActivity.f25880C);
        logInActivity.f25881H = logInActivity.getIntent().getExtras() == null ? logInActivity.f25881H : logInActivity.getIntent().getExtras().getString("extra_data", logInActivity.f25881H);
        logInActivity.f25882L = logInActivity.getIntent().getBooleanExtra("extra_flag", logInActivity.f25882L);
        logInActivity.f25883M = logInActivity.getIntent().getExtras() == null ? logInActivity.f25883M : logInActivity.getIntent().getExtras().getString("extra_type", logInActivity.f25883M);
        logInActivity.f25884Q = logInActivity.getIntent().getExtras() == null ? logInActivity.f25884Q : logInActivity.getIntent().getExtras().getString("core_extra_bank_account_data", logInActivity.f25884Q);
        logInActivity.f25885X = logInActivity.getIntent().getExtras() == null ? logInActivity.f25885X : logInActivity.getIntent().getExtras().getString("extra_note", logInActivity.f25885X);
    }
}
