package com.transsnet.palmpay.ui.activity.palmsafe;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class PalmSafeScanFaceActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PalmSafeScanFaceActivity palmSafeScanFaceActivity = (PalmSafeScanFaceActivity) obj;
        palmSafeScanFaceActivity.f34781c = palmSafeScanFaceActivity.getIntent().getIntExtra("extra_type", palmSafeScanFaceActivity.f34781c);
        palmSafeScanFaceActivity.f34782d = palmSafeScanFaceActivity.getIntent().getExtras() == null ? palmSafeScanFaceActivity.f34782d : palmSafeScanFaceActivity.getIntent().getExtras().getString("business_data", palmSafeScanFaceActivity.f34782d);
        palmSafeScanFaceActivity.f34783e = palmSafeScanFaceActivity.getIntent().getExtras() == null ? palmSafeScanFaceActivity.f34783e : palmSafeScanFaceActivity.getIntent().getExtras().getString("extra_flag", palmSafeScanFaceActivity.f34783e);
        palmSafeScanFaceActivity.f34784f = palmSafeScanFaceActivity.getIntent().getBooleanExtra("extra_data", palmSafeScanFaceActivity.f34784f);
    }
}
