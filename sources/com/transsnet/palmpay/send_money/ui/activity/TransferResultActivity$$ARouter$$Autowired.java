package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes4.dex */
public class TransferResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransferResultActivity transferResultActivity = (TransferResultActivity) obj;
        transferResultActivity.f33248d = (PayByOrderResp.DataBean) transferResultActivity.getIntent().getParcelableExtra("extra_data");
    }
}
