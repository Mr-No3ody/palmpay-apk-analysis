package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayLevelUp3Activity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmPayLevelUp3Activity palmPayLevelUp3Activity = (PalmPayLevelUp3Activity) obj;
        palmPayLevelUp3Activity.f25902a = palmPayLevelUp3Activity.getIntent().getBooleanExtra("extra_show_result_dialog", palmPayLevelUp3Activity.f25902a);
        palmPayLevelUp3Activity.f25903b = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25903b : palmPayLevelUp3Activity.getIntent().getExtras().getString("extra_data_1", palmPayLevelUp3Activity.f25903b);
        palmPayLevelUp3Activity.f25904c = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25904c : palmPayLevelUp3Activity.getIntent().getExtras().getString("extra_data_2", palmPayLevelUp3Activity.f25904c);
        palmPayLevelUp3Activity.f25905d = palmPayLevelUp3Activity.getIntent().getBooleanExtra("real_name_auth", palmPayLevelUp3Activity.f25905d);
        palmPayLevelUp3Activity.f25906e = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25906e : palmPayLevelUp3Activity.getIntent().getExtras().getString("businessType", palmPayLevelUp3Activity.f25906e);
        palmPayLevelUp3Activity.f25907f = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25907f : palmPayLevelUp3Activity.getIntent().getExtras().getString("ext_business_data", palmPayLevelUp3Activity.f25907f);
        palmPayLevelUp3Activity.f25908g = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25908g : palmPayLevelUp3Activity.getIntent().getExtras().getString("extCheckXds", palmPayLevelUp3Activity.f25908g);
        palmPayLevelUp3Activity.f25909i = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25909i : palmPayLevelUp3Activity.getIntent().getExtras().getString("jump_source", palmPayLevelUp3Activity.f25909i);
        palmPayLevelUp3Activity.f25910j = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25910j : palmPayLevelUp3Activity.getIntent().getExtras().getString("jump_url", palmPayLevelUp3Activity.f25910j);
        palmPayLevelUp3Activity.f25911o = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25911o : palmPayLevelUp3Activity.getIntent().getExtras().getString("type", palmPayLevelUp3Activity.f25911o);
        palmPayLevelUp3Activity.f25912p = palmPayLevelUp3Activity.getIntent().getExtras() == null ? palmPayLevelUp3Activity.f25912p : palmPayLevelUp3Activity.getIntent().getExtras().getString("both", palmPayLevelUp3Activity.f25912p);
    }
}
