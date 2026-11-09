package com.transsnet.palmpay.ui.activity.detail;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class RefundStatementDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        RefundStatementDetailActivity refundStatementDetailActivity = (RefundStatementDetailActivity) obj;
        refundStatementDetailActivity.f34734c = refundStatementDetailActivity.getIntent().getExtras() == null ? refundStatementDetailActivity.f34734c : refundStatementDetailActivity.getIntent().getExtras().getString("orderNo", refundStatementDetailActivity.f34734c);
        refundStatementDetailActivity.f34735d = refundStatementDetailActivity.getIntent().getExtras() == null ? refundStatementDetailActivity.f34735d : refundStatementDetailActivity.getIntent().getExtras().getString("extra_data", refundStatementDetailActivity.f34735d);
    }
}
