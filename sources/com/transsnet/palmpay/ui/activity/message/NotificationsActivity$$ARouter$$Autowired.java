package com.transsnet.palmpay.ui.activity.message;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationsActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        NotificationsActivity notificationsActivity = (NotificationsActivity) obj;
        notificationsActivity.f34756a = notificationsActivity.getIntent().getExtras() == null ? notificationsActivity.f34756a : notificationsActivity.getIntent().getExtras().getString("extra_data", notificationsActivity.f34756a);
        notificationsActivity.f34757b = notificationsActivity.getIntent().getExtras() == null ? notificationsActivity.f34757b : notificationsActivity.getIntent().getExtras().getString("extra_title", notificationsActivity.f34757b);
    }
}
