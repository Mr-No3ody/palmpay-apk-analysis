package com.transsnet.palmpay.ui.activity.bankcard;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class AddCardCompleteActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        AddCardCompleteActivity addCardCompleteActivity = (AddCardCompleteActivity) obj;
        addCardCompleteActivity.f34629d = addCardCompleteActivity.getIntent().getExtras() == null ? addCardCompleteActivity.f34629d : addCardCompleteActivity.getIntent().getExtras().getString("payStatus", addCardCompleteActivity.f34629d);
        addCardCompleteActivity.f34630e = addCardCompleteActivity.getIntent().getExtras() == null ? addCardCompleteActivity.f34630e : addCardCompleteActivity.getIntent().getExtras().getString("errorMsg", addCardCompleteActivity.f34630e);
    }
}
