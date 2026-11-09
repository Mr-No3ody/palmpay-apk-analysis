package com.transsnet.palmpay.ui.activity.qr;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class QrcodePayMoneyOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        QrcodePayMoneyOrderDetailActivity qrcodePayMoneyOrderDetailActivity = (QrcodePayMoneyOrderDetailActivity) obj;
        qrcodePayMoneyOrderDetailActivity.f34907a = qrcodePayMoneyOrderDetailActivity.getIntent().getExtras() == null ? qrcodePayMoneyOrderDetailActivity.f34907a : qrcodePayMoneyOrderDetailActivity.getIntent().getExtras().getString("orderId", qrcodePayMoneyOrderDetailActivity.f34907a);
    }
}
