package com.transsnet.palmpay.airtime.ui;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes3.dex */
public class TopupResultActivityV2$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TopupResultActivityV2 topupResultActivityV2 = (TopupResultActivityV2) target;
        topupResultActivityV2.f26532d = topupResultActivityV2.getIntent().getBooleanExtra("pay_with_ussd", topupResultActivityV2.f26532d);
        topupResultActivityV2.f26533e = topupResultActivityV2.getIntent().getExtras() == null ? topupResultActivityV2.f26533e : topupResultActivityV2.getIntent().getExtras().getString("mobile_channel", topupResultActivityV2.f26533e);
        topupResultActivityV2.f26534f = (PayByOrderResp.DataBean) topupResultActivityV2.getIntent().getParcelableExtra("pay_result_data");
    }
}
