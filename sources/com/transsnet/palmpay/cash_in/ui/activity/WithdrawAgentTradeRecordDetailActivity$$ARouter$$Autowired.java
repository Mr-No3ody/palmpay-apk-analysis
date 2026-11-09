package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class WithdrawAgentTradeRecordDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = (WithdrawAgentTradeRecordDetailActivity) obj;
        withdrawAgentTradeRecordDetailActivity.f26931j = withdrawAgentTradeRecordDetailActivity.getIntent().getExtras() == null ? withdrawAgentTradeRecordDetailActivity.f26931j : withdrawAgentTradeRecordDetailActivity.getIntent().getExtras().getString("orderId", withdrawAgentTradeRecordDetailActivity.f26931j);
    }
}
