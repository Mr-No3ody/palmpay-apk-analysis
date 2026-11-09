package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToCommonAccountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToCommonAccountActivity transferToCommonAccountActivity = (TransferToCommonAccountActivity) obj;
        transferToCommonAccountActivity.f33279Z = transferToCommonAccountActivity.getIntent().getExtras() == null ? transferToCommonAccountActivity.f33279Z : transferToCommonAccountActivity.getIntent().getExtras().getString("extra_data", transferToCommonAccountActivity.f33279Z);
        transferToCommonAccountActivity.f33280k0 = transferToCommonAccountActivity.getIntent().getIntExtra("extra_type", transferToCommonAccountActivity.f33280k0);
        transferToCommonAccountActivity.f33281p0 = transferToCommonAccountActivity.getIntent().getExtras() == null ? transferToCommonAccountActivity.f33281p0 : transferToCommonAccountActivity.getIntent().getExtras().getString("core_order_source_type", transferToCommonAccountActivity.f33281p0);
    }
}
