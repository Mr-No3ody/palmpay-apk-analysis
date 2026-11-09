package com.transsnet.palmpay.ui.activity.detail;

import android.util.Log;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class CommissionDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CommissionDetailActivity commissionDetailActivity = (CommissionDetailActivity) obj;
        String string = commissionDetailActivity.getIntent().getExtras() == null ? commissionDetailActivity.f34676a : commissionDetailActivity.getIntent().getExtras().getString("orderId", commissionDetailActivity.f34676a);
        commissionDetailActivity.f34676a = string;
        if (string == null) {
            Log.e("ARouter::", "The field 'mOrderNo' is null, in class '" + CommissionDetailActivity.class.getName() + "!");
        }
    }
}
