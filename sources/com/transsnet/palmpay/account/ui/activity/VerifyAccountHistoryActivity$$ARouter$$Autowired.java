package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class VerifyAccountHistoryActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        VerifyAccountHistoryActivity verifyAccountHistoryActivity = (VerifyAccountHistoryActivity) obj;
        verifyAccountHistoryActivity.f26074c = (GetSecurityFlowRsp) verifyAccountHistoryActivity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
