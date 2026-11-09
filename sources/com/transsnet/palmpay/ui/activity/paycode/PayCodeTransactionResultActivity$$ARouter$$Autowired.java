package com.transsnet.palmpay.ui.activity.paycode;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayCodeTransactionResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayCodeTransactionResultActivity payCodeTransactionResultActivity = (PayCodeTransactionResultActivity) obj;
        payCodeTransactionResultActivity.f34793c = payCodeTransactionResultActivity.getIntent().getExtras() == null ? payCodeTransactionResultActivity.f34793c : payCodeTransactionResultActivity.getIntent().getExtras().getString("pay_result_data", payCodeTransactionResultActivity.f34793c);
        payCodeTransactionResultActivity.f34794d = payCodeTransactionResultActivity.getIntent().getExtras() == null ? payCodeTransactionResultActivity.f34794d : payCodeTransactionResultActivity.getIntent().getExtras().getString("orderType", payCodeTransactionResultActivity.f34794d);
        payCodeTransactionResultActivity.f34795e = payCodeTransactionResultActivity.getIntent().getExtras() == null ? payCodeTransactionResultActivity.f34795e : payCodeTransactionResultActivity.getIntent().getExtras().getString("linkUrl", payCodeTransactionResultActivity.f34795e);
    }
}
