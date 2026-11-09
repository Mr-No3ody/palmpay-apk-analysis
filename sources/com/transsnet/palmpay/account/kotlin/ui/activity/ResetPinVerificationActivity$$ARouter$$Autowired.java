package com.transsnet.palmpay.account.kotlin.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class ResetPinVerificationActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ResetPinVerificationActivity resetPinVerificationActivity = (ResetPinVerificationActivity) obj;
        resetPinVerificationActivity.f25785b = resetPinVerificationActivity.getIntent().getExtras() == null ? resetPinVerificationActivity.f25785b : resetPinVerificationActivity.getIntent().getExtras().getString("extra_data", resetPinVerificationActivity.f25785b);
        resetPinVerificationActivity.f25786c = resetPinVerificationActivity.getIntent().getExtras() == null ? resetPinVerificationActivity.f25786c : resetPinVerificationActivity.getIntent().getExtras().getString("extra_data_1", resetPinVerificationActivity.f25786c);
        resetPinVerificationActivity.f25787d = resetPinVerificationActivity.getIntent().getExtras() == null ? resetPinVerificationActivity.f25787d : resetPinVerificationActivity.getIntent().getExtras().getString("extra_data_2", resetPinVerificationActivity.f25787d);
        resetPinVerificationActivity.f25788e = resetPinVerificationActivity.getIntent().getExtras() == null ? resetPinVerificationActivity.f25788e : resetPinVerificationActivity.getIntent().getExtras().getString("extra_type", resetPinVerificationActivity.f25788e);
        resetPinVerificationActivity.f25789f = (GetSecurityFlowRsp) resetPinVerificationActivity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
