package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;

/* JADX INFO: loaded from: classes3.dex */
public class SetNewPinV2Activity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SetNewPinV2Activity setNewPinV2Activity = (SetNewPinV2Activity) obj;
        setNewPinV2Activity.f25977b = setNewPinV2Activity.getIntent().getExtras() == null ? setNewPinV2Activity.f25977b : setNewPinV2Activity.getIntent().getExtras().getString("_token", setNewPinV2Activity.f25977b);
        setNewPinV2Activity.f25978c = setNewPinV2Activity.getIntent().getExtras() == null ? setNewPinV2Activity.f25978c : setNewPinV2Activity.getIntent().getExtras().getString("_security_token", setNewPinV2Activity.f25978c);
        setNewPinV2Activity.f25979d = setNewPinV2Activity.getIntent().getExtras() == null ? setNewPinV2Activity.f25979d : setNewPinV2Activity.getIntent().getExtras().getString("_temp_token", setNewPinV2Activity.f25979d);
        setNewPinV2Activity.f25980e = setNewPinV2Activity.getIntent().getExtras() == null ? setNewPinV2Activity.f25980e : setNewPinV2Activity.getIntent().getExtras().getString("old_pin", setNewPinV2Activity.f25980e);
        setNewPinV2Activity.f25981f = setNewPinV2Activity.getIntent().getIntExtra("mode", setNewPinV2Activity.f25981f);
        setNewPinV2Activity.f25982g = setNewPinV2Activity.getIntent().getExtras() == null ? setNewPinV2Activity.f25982g : setNewPinV2Activity.getIntent().getExtras().getString("extra_data_2", setNewPinV2Activity.f25982g);
        setNewPinV2Activity.f25983i = (GetSecurityFlowRsp) setNewPinV2Activity.getIntent().getParcelableExtra("_security_flow_info");
    }
}
