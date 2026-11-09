package com.transsnet.palmpay.ui.activity.bankcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;

/* JADX INFO: loaded from: classes4.dex */
public class BankCardDetailActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BankCardDetailActivity bankCardDetailActivity = (BankCardDetailActivity) obj;
        bankCardDetailActivity.f34642b = (LinkBankCardResp.LinkBankCard) bankCardDetailActivity.getIntent().getParcelableExtra("extra_data");
    }
}
