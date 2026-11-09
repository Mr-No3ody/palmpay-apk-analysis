package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class AgentOrderDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AgentOrderDetailActivity agentOrderDetailActivity = (AgentOrderDetailActivity) target;
        agentOrderDetailActivity.f34140d = agentOrderDetailActivity.getIntent().getExtras() == null ? agentOrderDetailActivity.f34140d : agentOrderDetailActivity.getIntent().getExtras().getString("orderNo", agentOrderDetailActivity.f34140d);
        agentOrderDetailActivity.f34141e = agentOrderDetailActivity.getIntent().getExtras() == null ? agentOrderDetailActivity.f34141e : agentOrderDetailActivity.getIntent().getExtras().getString("extra_type", agentOrderDetailActivity.f34141e);
    }
}
