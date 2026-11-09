package com.transsnet.palmpay.credit.ui.activity.okcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class OcRepayResultActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        OcRepayResultActivity ocRepayResultActivity = (OcRepayResultActivity) obj;
        ocRepayResultActivity.f29846k0 = ocRepayResultActivity.getIntent().getExtras() == null ? ocRepayResultActivity.f29846k0 : ocRepayResultActivity.getIntent().getExtras().getString("key_pending_message", ocRepayResultActivity.f29846k0);
        ocRepayResultActivity.f29849p0 = ocRepayResultActivity.getIntent().getLongExtra("key_pending_time", ocRepayResultActivity.f29849p0);
        ocRepayResultActivity.f29850q0 = ocRepayResultActivity.getIntent().getExtras() == null ? ocRepayResultActivity.f29850q0 : ocRepayResultActivity.getIntent().getExtras().getString("key_pending_count_down_message", ocRepayResultActivity.f29850q0);
    }
}
