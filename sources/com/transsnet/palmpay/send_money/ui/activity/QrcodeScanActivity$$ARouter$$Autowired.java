package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class QrcodeScanActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        QrcodeScanActivity qrcodeScanActivity = (QrcodeScanActivity) obj;
        qrcodeScanActivity.f33185b = qrcodeScanActivity.getIntent().getExtras() == null ? qrcodeScanActivity.f33185b : qrcodeScanActivity.getIntent().getExtras().getString("core_order_source_type", qrcodeScanActivity.f33185b);
        qrcodeScanActivity.f33186c = Integer.valueOf(qrcodeScanActivity.getIntent().getIntExtra("SCAN_TRANS_TYPE", qrcodeScanActivity.f33186c.intValue()));
    }
}
