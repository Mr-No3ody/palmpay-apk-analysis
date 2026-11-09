package com.transsnet.palmpay.jara_packet.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes4.dex */
public class ReferEarnCommentListActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object target) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        ReferEarnCommentListActivity referEarnCommentListActivity = (ReferEarnCommentListActivity) target;
        referEarnCommentListActivity.f31862f = referEarnCommentListActivity.getIntent().getExtras() == null ? referEarnCommentListActivity.f31862f : referEarnCommentListActivity.getIntent().getExtras().getString("extra_data", referEarnCommentListActivity.f31862f);
        referEarnCommentListActivity.f31863g = referEarnCommentListActivity.getIntent().getExtras() == null ? referEarnCommentListActivity.f31863g : referEarnCommentListActivity.getIntent().getExtras().getString("extra_data_2", referEarnCommentListActivity.f31863g);
    }
}
