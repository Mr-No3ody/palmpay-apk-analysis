package com.transsnet.palmpay.ui.activity.coupon;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes4.dex */
public class CouponPackageResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CouponPackageResultActivity couponPackageResultActivity = (CouponPackageResultActivity) obj;
        couponPackageResultActivity.f34664c = (PayByOrderResp.DataBean) couponPackageResultActivity.getIntent().getParcelableExtra("extra_data");
    }
}
