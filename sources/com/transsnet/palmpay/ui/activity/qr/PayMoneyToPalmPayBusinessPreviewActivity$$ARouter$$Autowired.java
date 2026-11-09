package com.transsnet.palmpay.ui.activity.qr;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayMoneyToPalmPayBusinessPreviewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayMoneyToPalmPayBusinessPreviewActivity payMoneyToPalmPayBusinessPreviewActivity = (PayMoneyToPalmPayBusinessPreviewActivity) obj;
        payMoneyToPalmPayBusinessPreviewActivity.f34830x0 = payMoneyToPalmPayBusinessPreviewActivity.getIntent().getLongExtra("extra_amount", payMoneyToPalmPayBusinessPreviewActivity.f34830x0);
        payMoneyToPalmPayBusinessPreviewActivity.f34831y0 = payMoneyToPalmPayBusinessPreviewActivity.getIntent().getExtras() == null ? payMoneyToPalmPayBusinessPreviewActivity.f34831y0 : payMoneyToPalmPayBusinessPreviewActivity.getIntent().getExtras().getString("QRCODE_STRING", payMoneyToPalmPayBusinessPreviewActivity.f34831y0);
        payMoneyToPalmPayBusinessPreviewActivity.f34832z0 = payMoneyToPalmPayBusinessPreviewActivity.getIntent().getExtras() == null ? payMoneyToPalmPayBusinessPreviewActivity.f34832z0 : payMoneyToPalmPayBusinessPreviewActivity.getIntent().getExtras().getString("receiver_info", payMoneyToPalmPayBusinessPreviewActivity.f34832z0);
    }
}
