package com.transsnet.palmpay.cash_in.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;

/* JADX INFO: loaded from: classes3.dex */
public class BindBankCardResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BindBankCardResultActivity bindBankCardResultActivity = (BindBankCardResultActivity) obj;
        bindBankCardResultActivity.f26795g = (PayByOrderResp.DataBean) bindBankCardResultActivity.getIntent().getParcelableExtra("extra_data");
        bindBankCardResultActivity.f26796i = Long.valueOf(bindBankCardResultActivity.getIntent().getLongExtra("extra_type", bindBankCardResultActivity.f26796i.longValue()));
        bindBankCardResultActivity.f26797j = Long.valueOf(bindBankCardResultActivity.getIntent().getLongExtra("extra_entry_type", bindBankCardResultActivity.f26797j.longValue()));
    }
}
