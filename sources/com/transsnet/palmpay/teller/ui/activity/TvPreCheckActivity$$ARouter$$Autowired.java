package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;

/* JADX INFO: loaded from: classes4.dex */
public class TvPreCheckActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        TvPreCheckActivity tvPreCheckActivity = (TvPreCheckActivity) target;
        tvPreCheckActivity.f34232d = (TvRenewDataInfoBean) tvPreCheckActivity.getIntent().getSerializableExtra("extra_renew_data");
        tvPreCheckActivity.f34233e = tvPreCheckActivity.getIntent().getExtras() == null ? tvPreCheckActivity.f34233e : tvPreCheckActivity.getIntent().getExtras().getString(AppsFlyerProperties.CHANNEL, tvPreCheckActivity.f34233e);
    }
}
