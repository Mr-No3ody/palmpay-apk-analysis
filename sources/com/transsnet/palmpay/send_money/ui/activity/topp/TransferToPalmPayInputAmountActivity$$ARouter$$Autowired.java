package com.transsnet.palmpay.send_money.ui.activity.topp;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransferToPalmPayInputAmountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
        transferToPalmPayInputAmountActivity.f33611d = transferToPalmPayInputAmountActivity.getIntent().getExtras() == null ? transferToPalmPayInputAmountActivity.f33611d : transferToPalmPayInputAmountActivity.getIntent().getExtras().getString("MEMBER_ID", transferToPalmPayInputAmountActivity.f33611d);
        transferToPalmPayInputAmountActivity.f33612e = transferToPalmPayInputAmountActivity.getIntent().getExtras() == null ? transferToPalmPayInputAmountActivity.f33612e : transferToPalmPayInputAmountActivity.getIntent().getExtras().getString("phone_number", transferToPalmPayInputAmountActivity.f33612e);
        transferToPalmPayInputAmountActivity.f33613f = transferToPalmPayInputAmountActivity.getIntent().getExtras() == null ? transferToPalmPayInputAmountActivity.f33613f : transferToPalmPayInputAmountActivity.getIntent().getExtras().getString("extra_data", transferToPalmPayInputAmountActivity.f33613f);
        transferToPalmPayInputAmountActivity.f33614g = transferToPalmPayInputAmountActivity.getIntent().getIntExtra("extra_type", transferToPalmPayInputAmountActivity.f33614g);
        transferToPalmPayInputAmountActivity.f33615i = transferToPalmPayInputAmountActivity.getIntent().getBooleanExtra("isHideInfo", transferToPalmPayInputAmountActivity.f33615i);
        transferToPalmPayInputAmountActivity.f33616j = transferToPalmPayInputAmountActivity.getIntent().getExtras() == null ? transferToPalmPayInputAmountActivity.f33616j : transferToPalmPayInputAmountActivity.getIntent().getExtras().getString("core_order_source_type", transferToPalmPayInputAmountActivity.f33616j);
    }
}
