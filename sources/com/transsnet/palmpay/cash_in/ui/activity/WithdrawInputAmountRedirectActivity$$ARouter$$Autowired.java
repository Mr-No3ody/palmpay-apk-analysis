package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class WithdrawInputAmountRedirectActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WithdrawInputAmountRedirectActivity withdrawInputAmountRedirectActivity = (WithdrawInputAmountRedirectActivity) obj;
        withdrawInputAmountRedirectActivity.f26943a = withdrawInputAmountRedirectActivity.getIntent().getExtras() == null ? withdrawInputAmountRedirectActivity.f26943a : withdrawInputAmountRedirectActivity.getIntent().getExtras().getString("sn_no", withdrawInputAmountRedirectActivity.f26943a);
        withdrawInputAmountRedirectActivity.f26944b = withdrawInputAmountRedirectActivity.getIntent().getExtras() == null ? withdrawInputAmountRedirectActivity.f26944b : withdrawInputAmountRedirectActivity.getIntent().getExtras().getString("core_order_source_type", withdrawInputAmountRedirectActivity.f26944b);
    }
}
