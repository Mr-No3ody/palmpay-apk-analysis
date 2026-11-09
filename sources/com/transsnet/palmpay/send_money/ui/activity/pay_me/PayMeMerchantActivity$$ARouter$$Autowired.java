package com.transsnet.palmpay.send_money.ui.activity.pay_me;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;

/* JADX INFO: loaded from: classes4.dex */
public class PayMeMerchantActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayMeMerchantActivity payMeMerchantActivity = (PayMeMerchantActivity) obj;
        payMeMerchantActivity.f33321i = (PosterAccountBean) payMeMerchantActivity.getIntent().getSerializableExtra("extra_data");
    }
}
