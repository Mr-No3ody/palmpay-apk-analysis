package com.transsnet.palmpay.ui.activity.qr;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PayMoneyToPalmPayBusinessResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PayMoneyToPalmPayBusinessResultActivity payMoneyToPalmPayBusinessResultActivity = (PayMoneyToPalmPayBusinessResultActivity) obj;
        payMoneyToPalmPayBusinessResultActivity.f34851w = payMoneyToPalmPayBusinessResultActivity.getIntent().getExtras() == null ? payMoneyToPalmPayBusinessResultActivity.f34851w : payMoneyToPalmPayBusinessResultActivity.getIntent().getExtras().getString("key_pending_message", payMoneyToPalmPayBusinessResultActivity.f34851w);
        payMoneyToPalmPayBusinessResultActivity.f34833A = payMoneyToPalmPayBusinessResultActivity.getIntent().getLongExtra("key_pending_time", payMoneyToPalmPayBusinessResultActivity.f34833A);
        payMoneyToPalmPayBusinessResultActivity.f34834B = payMoneyToPalmPayBusinessResultActivity.getIntent().getIntExtra("orderState", payMoneyToPalmPayBusinessResultActivity.f34834B);
        payMoneyToPalmPayBusinessResultActivity.f34835C = payMoneyToPalmPayBusinessResultActivity.getIntent().getExtras() == null ? payMoneyToPalmPayBusinessResultActivity.f34835C : payMoneyToPalmPayBusinessResultActivity.getIntent().getExtras().getString("pay_result_data", payMoneyToPalmPayBusinessResultActivity.f34835C);
    }
}
