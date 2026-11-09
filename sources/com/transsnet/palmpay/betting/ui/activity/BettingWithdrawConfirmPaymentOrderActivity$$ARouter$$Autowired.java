package com.transsnet.palmpay.betting.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;

/* JADX INFO: loaded from: classes3.dex */
public class BettingWithdrawConfirmPaymentOrderActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BettingWithdrawConfirmPaymentOrderActivity bettingWithdrawConfirmPaymentOrderActivity = (BettingWithdrawConfirmPaymentOrderActivity) target;
        bettingWithdrawConfirmPaymentOrderActivity.f26708Y = (PaymentItemBean) bettingWithdrawConfirmPaymentOrderActivity.getIntent().getSerializableExtra("payment_item");
        bettingWithdrawConfirmPaymentOrderActivity.f26709Z = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getLongExtra("amount", bettingWithdrawConfirmPaymentOrderActivity.f26709Z);
        bettingWithdrawConfirmPaymentOrderActivity.f26710k0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26710k0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("customerId", bettingWithdrawConfirmPaymentOrderActivity.f26710k0);
        bettingWithdrawConfirmPaymentOrderActivity.f26711p0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26711p0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("fullName", bettingWithdrawConfirmPaymentOrderActivity.f26711p0);
        bettingWithdrawConfirmPaymentOrderActivity.f26712q0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26712q0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("bundle_biller_name", bettingWithdrawConfirmPaymentOrderActivity.f26712q0);
        bettingWithdrawConfirmPaymentOrderActivity.f26713r0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26713r0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("reference_id", bettingWithdrawConfirmPaymentOrderActivity.f26713r0);
        bettingWithdrawConfirmPaymentOrderActivity.f26714s0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26714s0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("key_address", bettingWithdrawConfirmPaymentOrderActivity.f26714s0);
        bettingWithdrawConfirmPaymentOrderActivity.f26715t0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras() == null ? bettingWithdrawConfirmPaymentOrderActivity.f26715t0 : bettingWithdrawConfirmPaymentOrderActivity.getIntent().getExtras().getString("security_code_order_no", bettingWithdrawConfirmPaymentOrderActivity.f26715t0);
        bettingWithdrawConfirmPaymentOrderActivity.f26716u0 = bettingWithdrawConfirmPaymentOrderActivity.getIntent().getBooleanExtra("is_security_code", bettingWithdrawConfirmPaymentOrderActivity.f26716u0);
    }
}
