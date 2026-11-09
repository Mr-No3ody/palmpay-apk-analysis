package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class ChangeMobileActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ChangeMobileActivity changeMobileActivity = (ChangeMobileActivity) obj;
        changeMobileActivity.f25840a = changeMobileActivity.getIntent().getExtras() == null ? changeMobileActivity.f25840a : changeMobileActivity.getIntent().getExtras().getString("oldNumber", changeMobileActivity.f25840a);
        changeMobileActivity.f25841b = changeMobileActivity.getIntent().getExtras() == null ? changeMobileActivity.f25841b : changeMobileActivity.getIntent().getExtras().getString("_token", changeMobileActivity.f25841b);
        changeMobileActivity.f25842c = changeMobileActivity.getIntent().getBooleanExtra("skipSecurity", changeMobileActivity.f25842c);
        changeMobileActivity.f25843d = (GetSecurityFlowRsp) changeMobileActivity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
