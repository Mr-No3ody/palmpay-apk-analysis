package com.transsnet.palmpay.ui.activity.qr;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayMoneyToPartnerPreviewActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayMoneyToPartnerPreviewActivity payMoneyToPartnerPreviewActivity = (PayMoneyToPartnerPreviewActivity) obj;
        payMoneyToPartnerPreviewActivity.f34865x0 = payMoneyToPartnerPreviewActivity.getIntent().getLongExtra("extra_amount", payMoneyToPartnerPreviewActivity.f34865x0);
        payMoneyToPartnerPreviewActivity.f34866y0 = payMoneyToPartnerPreviewActivity.getIntent().getExtras() == null ? payMoneyToPartnerPreviewActivity.f34866y0 : payMoneyToPartnerPreviewActivity.getIntent().getExtras().getString("QRCODE_STRING", payMoneyToPartnerPreviewActivity.f34866y0);
    }
}
