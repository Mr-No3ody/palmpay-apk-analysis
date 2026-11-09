package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class CoreTransactionReceiptActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CoreTransactionReceiptActivity coreTransactionReceiptActivity = (CoreTransactionReceiptActivity) obj;
        coreTransactionReceiptActivity.f27603j = coreTransactionReceiptActivity.getIntent().getExtras() == null ? coreTransactionReceiptActivity.f27603j : coreTransactionReceiptActivity.getIntent().getExtras().getString("extra_title", coreTransactionReceiptActivity.f27603j);
        coreTransactionReceiptActivity.f27604o = coreTransactionReceiptActivity.getIntent().getLongExtra("extra_amount", coreTransactionReceiptActivity.f27604o);
        coreTransactionReceiptActivity.f27605p = coreTransactionReceiptActivity.getIntent().getExtras() == null ? coreTransactionReceiptActivity.f27605p : coreTransactionReceiptActivity.getIntent().getExtras().getString("extra_title_icon", coreTransactionReceiptActivity.f27605p);
        coreTransactionReceiptActivity.t = coreTransactionReceiptActivity.getIntent().getLongExtra("extra_data", coreTransactionReceiptActivity.t);
        coreTransactionReceiptActivity.f27606v = (ArrayList) coreTransactionReceiptActivity.getIntent().getSerializableExtra("extra_data_1");
        coreTransactionReceiptActivity.f27607w = (ArrayList) coreTransactionReceiptActivity.getIntent().getSerializableExtra("extra_data_2");
        coreTransactionReceiptActivity.f27594A = coreTransactionReceiptActivity.getIntent().getExtras() == null ? coreTransactionReceiptActivity.f27594A : coreTransactionReceiptActivity.getIntent().getExtras().getString("extra_message", coreTransactionReceiptActivity.f27594A);
    }
}
