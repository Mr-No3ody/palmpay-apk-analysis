package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToMobileActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToMobileActivity transferToMobileActivity = (TransferToMobileActivity) obj;
        transferToMobileActivity.f33285Z = transferToMobileActivity.getIntent().getExtras() == null ? transferToMobileActivity.f33285Z : transferToMobileActivity.getIntent().getExtras().getString("MEMBER_ID", transferToMobileActivity.f33285Z);
        transferToMobileActivity.f33286k0 = transferToMobileActivity.getIntent().getExtras() == null ? transferToMobileActivity.f33286k0 : transferToMobileActivity.getIntent().getExtras().getString("phone_number", transferToMobileActivity.f33286k0);
        transferToMobileActivity.f33287p0 = transferToMobileActivity.getIntent().getExtras() == null ? transferToMobileActivity.f33287p0 : transferToMobileActivity.getIntent().getExtras().getString("extra_data", transferToMobileActivity.f33287p0);
        transferToMobileActivity.f33288q0 = transferToMobileActivity.getIntent().getIntExtra("extra_type", transferToMobileActivity.f33288q0);
        transferToMobileActivity.f33289r0 = transferToMobileActivity.getIntent().getBooleanExtra("isHideInfo", transferToMobileActivity.f33289r0);
        transferToMobileActivity.f33290s0 = transferToMobileActivity.getIntent().getBooleanExtra("is_send", transferToMobileActivity.f33290s0);
        transferToMobileActivity.f33291t0 = transferToMobileActivity.getIntent().getExtras() == null ? transferToMobileActivity.f33291t0 : transferToMobileActivity.getIntent().getExtras().getString("core_order_source_type", transferToMobileActivity.f33291t0);
    }
}
