package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class AskApplyBalanceActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AskApplyBalanceActivity askApplyBalanceActivity = (AskApplyBalanceActivity) obj;
        askApplyBalanceActivity.f25824a = askApplyBalanceActivity.getIntent().getBooleanExtra("extra_show_result_dialog", askApplyBalanceActivity.f25824a);
        askApplyBalanceActivity.f25825b = askApplyBalanceActivity.getIntent().getExtras() == null ? askApplyBalanceActivity.f25825b : askApplyBalanceActivity.getIntent().getExtras().getString("extra_data_1", askApplyBalanceActivity.f25825b);
        askApplyBalanceActivity.f25826c = askApplyBalanceActivity.getIntent().getExtras() == null ? askApplyBalanceActivity.f25826c : askApplyBalanceActivity.getIntent().getExtras().getString("extra_data_2", askApplyBalanceActivity.f25826c);
        askApplyBalanceActivity.f25827d = askApplyBalanceActivity.getIntent().getExtras() == null ? askApplyBalanceActivity.f25827d : askApplyBalanceActivity.getIntent().getExtras().getString("extra_data", askApplyBalanceActivity.f25827d);
    }
}
