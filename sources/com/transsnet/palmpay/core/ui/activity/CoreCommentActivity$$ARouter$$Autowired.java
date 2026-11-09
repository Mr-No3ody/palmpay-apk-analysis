package com.transsnet.palmpay.core.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class CoreCommentActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        CoreCommentActivity coreCommentActivity = (CoreCommentActivity) obj;
        coreCommentActivity.f27535f = coreCommentActivity.getIntent().getExtras() == null ? coreCommentActivity.f27535f : coreCommentActivity.getIntent().getExtras().getString("orderNo", coreCommentActivity.f27535f);
        coreCommentActivity.f27536g = coreCommentActivity.getIntent().getExtras() == null ? coreCommentActivity.f27536g : coreCommentActivity.getIntent().getExtras().getString("COMMENT_TYPE", coreCommentActivity.f27536g);
    }
}
