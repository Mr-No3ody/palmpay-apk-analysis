package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class CommonTransactionResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CommonTransactionResultActivity commonTransactionResultActivity = (CommonTransactionResultActivity) target;
        commonTransactionResultActivity.f27483d = commonTransactionResultActivity.getIntent().getExtras() == null ? commonTransactionResultActivity.f27483d : commonTransactionResultActivity.getIntent().getExtras().getString("pay_result_data", commonTransactionResultActivity.f27483d);
        commonTransactionResultActivity.f27484e = Long.valueOf(commonTransactionResultActivity.getIntent().getLongExtra("orderAmount", commonTransactionResultActivity.f27484e.longValue()));
        commonTransactionResultActivity.f27485f = commonTransactionResultActivity.getIntent().getExtras() == null ? commonTransactionResultActivity.f27485f : commonTransactionResultActivity.getIntent().getExtras().getString("transType", commonTransactionResultActivity.f27485f);
    }
}
