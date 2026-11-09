package com.transsnet.palmpay.account.kotlin.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class SelectResetPinVerifyTypeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SelectResetPinVerifyTypeActivity selectResetPinVerifyTypeActivity = (SelectResetPinVerifyTypeActivity) obj;
        selectResetPinVerifyTypeActivity.f25792a = selectResetPinVerifyTypeActivity.getIntent().getExtras() == null ? selectResetPinVerifyTypeActivity.f25792a : selectResetPinVerifyTypeActivity.getIntent().getExtras().getString("extra_data_1", selectResetPinVerifyTypeActivity.f25792a);
        selectResetPinVerifyTypeActivity.f25793b = selectResetPinVerifyTypeActivity.getIntent().getExtras() == null ? selectResetPinVerifyTypeActivity.f25793b : selectResetPinVerifyTypeActivity.getIntent().getExtras().getString("extra_data_2", selectResetPinVerifyTypeActivity.f25793b);
        selectResetPinVerifyTypeActivity.f25794c = (GetSecurityFlowRsp) selectResetPinVerifyTypeActivity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
