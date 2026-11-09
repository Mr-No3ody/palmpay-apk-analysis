package com.transsnet.palmpay.device.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;
import com.microsoft.codepush.react.CodePushConstants;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceDetail2Activity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        DeviceDetail2Activity deviceDetail2Activity = (DeviceDetail2Activity) obj;
        deviceDetail2Activity.f31809a = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31809a : deviceDetail2Activity.getIntent().getExtras().getString("name", deviceDetail2Activity.f31809a);
        deviceDetail2Activity.f31810b = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31810b : deviceDetail2Activity.getIntent().getExtras().getString("imei", deviceDetail2Activity.f31810b);
        deviceDetail2Activity.f31811c = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31811c : deviceDetail2Activity.getIntent().getExtras().getString(CodePushConstants.LATEST_ROLLBACK_TIME_KEY, deviceDetail2Activity.f31811c);
        deviceDetail2Activity.f31812d = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31812d : deviceDetail2Activity.getIntent().getExtras().getString("deviceModel", deviceDetail2Activity.f31812d);
        deviceDetail2Activity.f31813e = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31813e : deviceDetail2Activity.getIntent().getExtras().getString("type", deviceDetail2Activity.f31813e);
        deviceDetail2Activity.f31814f = deviceDetail2Activity.getIntent().getExtras() == null ? deviceDetail2Activity.f31814f : deviceDetail2Activity.getIntent().getExtras().getString("memberId", deviceDetail2Activity.f31814f);
        deviceDetail2Activity.f31815g = deviceDetail2Activity.getIntent().getBooleanExtra("isCurrent", deviceDetail2Activity.f31815g);
    }
}
