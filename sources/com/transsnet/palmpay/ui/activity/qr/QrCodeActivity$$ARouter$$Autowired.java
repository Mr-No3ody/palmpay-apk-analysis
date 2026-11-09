package com.transsnet.palmpay.ui.activity.qr;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class QrCodeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        QrCodeActivity qrCodeActivity = (QrCodeActivity) obj;
        qrCodeActivity.f34878o = qrCodeActivity.getIntent().getExtras() == null ? qrCodeActivity.f34878o : qrCodeActivity.getIntent().getExtras().getString("KEY_POSITION", qrCodeActivity.f34878o);
    }
}
