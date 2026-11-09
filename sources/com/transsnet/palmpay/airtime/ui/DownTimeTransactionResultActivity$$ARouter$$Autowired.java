package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeDownTimeOrderUpdateRsp;

/* JADX INFO: loaded from: classes3.dex */
public class DownTimeTransactionResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        DownTimeTransactionResultActivity downTimeTransactionResultActivity = (DownTimeTransactionResultActivity) target;
        downTimeTransactionResultActivity.f26470d = (AirtimeDownTimeOrderUpdateRsp.AirtimeDownTimeOrderUpdate) downTimeTransactionResultActivity.getIntent().getSerializableExtra("bundle_data_downtime_order_result");
    }
}
