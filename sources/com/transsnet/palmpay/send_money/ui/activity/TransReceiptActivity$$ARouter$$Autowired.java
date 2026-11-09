package com.transsnet.palmpay.send_money.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class TransReceiptActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TransReceiptActivity transReceiptActivity = (TransReceiptActivity) obj;
        transReceiptActivity.f33231i = transReceiptActivity.getIntent().getExtras() == null ? transReceiptActivity.f33231i : transReceiptActivity.getIntent().getExtras().getString("extra_id", transReceiptActivity.f33231i);
    }
}
