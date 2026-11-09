package com.transsnet.palmpay.send_money.ui.activity.topp;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToPalmPayContactActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToPalmPayContactActivity transferToPalmPayContactActivity = (TransferToPalmPayContactActivity) obj;
        transferToPalmPayContactActivity.f33595f = transferToPalmPayContactActivity.getIntent().getExtras() == null ? transferToPalmPayContactActivity.f33595f : transferToPalmPayContactActivity.getIntent().getExtras().getString("core_order_source_type", transferToPalmPayContactActivity.f33595f);
        transferToPalmPayContactActivity.f33596g = transferToPalmPayContactActivity.getIntent().getExtras() == null ? transferToPalmPayContactActivity.f33596g : transferToPalmPayContactActivity.getIntent().getExtras().getString("MEMBER_ID", transferToPalmPayContactActivity.f33596g);
    }
}
