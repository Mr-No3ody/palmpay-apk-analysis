package com.transsnet.palmpay.send_money.ui.activity.topp;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToPalmPayHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToPalmPayHomeActivity transferToPalmPayHomeActivity = (TransferToPalmPayHomeActivity) obj;
        transferToPalmPayHomeActivity.f33599a = transferToPalmPayHomeActivity.getIntent().getExtras() == null ? transferToPalmPayHomeActivity.f33599a : transferToPalmPayHomeActivity.getIntent().getExtras().getString("core_order_source_type", transferToPalmPayHomeActivity.f33599a);
        transferToPalmPayHomeActivity.f33600b = transferToPalmPayHomeActivity.getIntent().getExtras() == null ? transferToPalmPayHomeActivity.f33600b : transferToPalmPayHomeActivity.getIntent().getExtras().getString("accountNo", transferToPalmPayHomeActivity.f33600b);
    }
}
