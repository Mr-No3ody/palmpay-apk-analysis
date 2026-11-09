package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;

/* JADX INFO: loaded from: classes3.dex */
public class BettingWithdrawHomeActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingWithdrawHomeActivity bettingWithdrawHomeActivity = (BettingWithdrawHomeActivity) target;
        bettingWithdrawHomeActivity.f26723i = bettingWithdrawHomeActivity.getIntent().getExtras() == null ? bettingWithdrawHomeActivity.f26723i : bettingWithdrawHomeActivity.getIntent().getExtras().getString("billerId", bettingWithdrawHomeActivity.f26723i);
        bettingWithdrawHomeActivity.f26724j = bettingWithdrawHomeActivity.getIntent().getExtras() == null ? bettingWithdrawHomeActivity.f26724j : bettingWithdrawHomeActivity.getIntent().getExtras().getString("customerId", bettingWithdrawHomeActivity.f26724j);
        bettingWithdrawHomeActivity.f26725o = (ChannelDataItemBean) bettingWithdrawHomeActivity.getIntent().getParcelableExtra("billpayment_data");
        bettingWithdrawHomeActivity.f26726p = bettingWithdrawHomeActivity.getIntent().getExtras() == null ? bettingWithdrawHomeActivity.f26726p : bettingWithdrawHomeActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, bettingWithdrawHomeActivity.f26726p);
    }
}
