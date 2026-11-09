package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class ResetPinActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ResetPinActivity resetPinActivity = (ResetPinActivity) obj;
        resetPinActivity.f25971e = resetPinActivity.getIntent().getExtras() == null ? resetPinActivity.f25971e : resetPinActivity.getIntent().getExtras().getString("extra_data", resetPinActivity.f25971e);
        resetPinActivity.f25972f = resetPinActivity.getIntent().getExtras() == null ? resetPinActivity.f25972f : resetPinActivity.getIntent().getExtras().getString("extra_title", resetPinActivity.f25972f);
        resetPinActivity.f25973g = (GetSecurityFlowRsp) resetPinActivity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
