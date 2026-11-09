package com.transsnet.palmpay.teller.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class BillerRelayPageActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        BillerRelayPageActivity billerRelayPageActivity = (BillerRelayPageActivity) target;
        billerRelayPageActivity.f34169e = billerRelayPageActivity.getIntent().getExtras() == null ? billerRelayPageActivity.f34169e : billerRelayPageActivity.getIntent().getExtras().getString("BillerIcon", billerRelayPageActivity.f34169e);
        billerRelayPageActivity.f34170f = billerRelayPageActivity.getIntent().getExtras() == null ? billerRelayPageActivity.f34170f : billerRelayPageActivity.getIntent().getExtras().getString("BillerName", billerRelayPageActivity.f34170f);
        billerRelayPageActivity.f34171g = billerRelayPageActivity.getIntent().getExtras() == null ? billerRelayPageActivity.f34171g : billerRelayPageActivity.getIntent().getExtras().getString("OpenLink", billerRelayPageActivity.f34171g);
        billerRelayPageActivity.f34172i = billerRelayPageActivity.getIntent().getExtras() == null ? billerRelayPageActivity.f34172i : billerRelayPageActivity.getIntent().getExtras().getString("Browser", billerRelayPageActivity.f34172i);
    }
}
