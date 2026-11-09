package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OfflineQrPaymenttDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OfflineQrPaymenttDetailActivity offlineQrPaymenttDetailActivity = (OfflineQrPaymenttDetailActivity) obj;
        offlineQrPaymenttDetailActivity.f34723a = offlineQrPaymenttDetailActivity.getIntent().getExtras() == null ? offlineQrPaymenttDetailActivity.f34723a : offlineQrPaymenttDetailActivity.getIntent().getExtras().getString("orderNo", offlineQrPaymenttDetailActivity.f34723a);
    }
}
