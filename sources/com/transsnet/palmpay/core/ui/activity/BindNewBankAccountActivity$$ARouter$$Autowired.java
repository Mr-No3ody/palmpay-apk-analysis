package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.LinkBankAccountResp;

/* JADX INFO: loaded from: classes3.dex */
public class BindNewBankAccountActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BindNewBankAccountActivity bindNewBankAccountActivity = (BindNewBankAccountActivity) obj;
        bindNewBankAccountActivity.f27468b = bindNewBankAccountActivity.getIntent().getIntExtra("extra_type", bindNewBankAccountActivity.f27468b);
        bindNewBankAccountActivity.f27469c = bindNewBankAccountActivity.getIntent().getBooleanExtra("real_name_auth", bindNewBankAccountActivity.f27469c);
        bindNewBankAccountActivity.f27470d = (LinkBankAccountResp.LinkBankAccount) bindNewBankAccountActivity.getIntent().getParcelableExtra("extra_data");
        bindNewBankAccountActivity.f27471e = bindNewBankAccountActivity.getIntent().getExtras() == null ? bindNewBankAccountActivity.f27471e : bindNewBankAccountActivity.getIntent().getExtras().getString("businessType", bindNewBankAccountActivity.f27471e);
    }
}
