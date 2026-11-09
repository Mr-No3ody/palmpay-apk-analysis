package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class WithdrawHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WithdrawHomeActivity withdrawHomeActivity = (WithdrawHomeActivity) obj;
        withdrawHomeActivity.f26941o = withdrawHomeActivity.getIntent().getIntExtra("extra_type", withdrawHomeActivity.f26941o);
    }
}
