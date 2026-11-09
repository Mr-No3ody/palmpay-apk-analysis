package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class CoreCommonResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CoreCommonResultActivity coreCommonResultActivity = (CoreCommonResultActivity) target;
        coreCommonResultActivity.f27538a = coreCommonResultActivity.getIntent().getIntExtra("extra_result", coreCommonResultActivity.f27538a);
        coreCommonResultActivity.f27539b = coreCommonResultActivity.getIntent().getIntExtra("extra_title_icon", coreCommonResultActivity.f27539b);
        coreCommonResultActivity.f27540c = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27540c : coreCommonResultActivity.getIntent().getExtras().getString("extra_title", coreCommonResultActivity.f27540c);
        coreCommonResultActivity.f27541d = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27541d : coreCommonResultActivity.getIntent().getExtras().getString("extra_message", coreCommonResultActivity.f27541d);
        coreCommonResultActivity.f27542e = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27542e : coreCommonResultActivity.getIntent().getExtras().getString("extra_Btn1Text", coreCommonResultActivity.f27542e);
        coreCommonResultActivity.f27543f = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27543f : coreCommonResultActivity.getIntent().getExtras().getString("extra_Btn2Text", coreCommonResultActivity.f27543f);
        coreCommonResultActivity.f27544g = coreCommonResultActivity.getIntent().getIntExtra("extra_Btn1Text_action", coreCommonResultActivity.f27544g);
        coreCommonResultActivity.f27545i = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27545i : coreCommonResultActivity.getIntent().getExtras().getString("extra_Btn1Text_page", coreCommonResultActivity.f27545i);
        coreCommonResultActivity.f27546j = coreCommonResultActivity.getIntent().getIntExtra("extra_Btn2Text_action", coreCommonResultActivity.f27546j);
        coreCommonResultActivity.f27547o = coreCommonResultActivity.getIntent().getExtras() == null ? coreCommonResultActivity.f27547o : coreCommonResultActivity.getIntent().getExtras().getString("extra_Btn2Text_page", coreCommonResultActivity.f27547o);
        coreCommonResultActivity.f27548p = coreCommonResultActivity.getIntent().getBooleanExtra("extra_flag", coreCommonResultActivity.f27548p);
    }
}
