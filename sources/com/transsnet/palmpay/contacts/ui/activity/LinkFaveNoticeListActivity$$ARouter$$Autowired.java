package com.transsnet.palmpay.contacts.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class LinkFaveNoticeListActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        LinkFaveNoticeListActivity linkFaveNoticeListActivity = (LinkFaveNoticeListActivity) target;
        linkFaveNoticeListActivity.f27221e = linkFaveNoticeListActivity.getIntent().getExtras() == null ? linkFaveNoticeListActivity.f27221e : linkFaveNoticeListActivity.getIntent().getExtras().getString("memberId", linkFaveNoticeListActivity.f27221e);
    }
}
