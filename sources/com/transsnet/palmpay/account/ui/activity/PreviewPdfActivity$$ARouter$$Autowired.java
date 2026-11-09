package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewPdfActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        PreviewPdfActivity previewPdfActivity = (PreviewPdfActivity) obj;
        previewPdfActivity.f25956d = previewPdfActivity.getIntent().getBooleanExtra("private_photo", previewPdfActivity.f25956d);
        previewPdfActivity.f25957e = previewPdfActivity.getIntent().getBooleanExtra("pdf_snap_only", previewPdfActivity.f25957e);
    }
}
