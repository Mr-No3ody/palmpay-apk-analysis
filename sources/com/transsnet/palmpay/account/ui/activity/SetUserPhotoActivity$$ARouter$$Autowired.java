package com.transsnet.palmpay.account.ui.activity;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.alibaba.android.arouter.launcher.ARouter;

/* JADX INFO: loaded from: classes3.dex */
public class SetUserPhotoActivity$$ARouter$$Autowired implements ISyringe {
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(Object obj) {
        this.serializationService = (SerializationService) ARouter.getInstance().navigation(SerializationService.class);
        SetUserPhotoActivity setUserPhotoActivity = (SetUserPhotoActivity) obj;
        setUserPhotoActivity.mPhotoType = setUserPhotoActivity.getIntent().getExtras() == null ? setUserPhotoActivity.mPhotoType : setUserPhotoActivity.getIntent().getExtras().getString("photoType", setUserPhotoActivity.mPhotoType);
        setUserPhotoActivity.bBigPhoto = setUserPhotoActivity.getIntent().getBooleanExtra("photoBig", setUserPhotoActivity.bBigPhoto);
        setUserPhotoActivity.bTakePhotoOnly = setUserPhotoActivity.getIntent().getBooleanExtra("takePhotoOnly", setUserPhotoActivity.bTakePhotoOnly);
        setUserPhotoActivity.mSetAvatarByUri = setUserPhotoActivity.getIntent().getBooleanExtra("extra_mode", setUserPhotoActivity.mSetAvatarByUri);
        setUserPhotoActivity.mSetAvatarUri = setUserPhotoActivity.getIntent().getExtras() == null ? setUserPhotoActivity.mSetAvatarUri : setUserPhotoActivity.getIntent().getExtras().getString("extra_token", setUserPhotoActivity.mSetAvatarUri);
        setUserPhotoActivity.bOriginPhoto = setUserPhotoActivity.getIntent().getBooleanExtra("origin_photo", setUserPhotoActivity.bOriginPhoto);
        setUserPhotoActivity.bCropPhoto = setUserPhotoActivity.getIntent().getBooleanExtra("crop_photo", setUserPhotoActivity.bCropPhoto);
        setUserPhotoActivity.bPrivate = setUserPhotoActivity.getIntent().getBooleanExtra("private_photo", setUserPhotoActivity.bPrivate);
        setUserPhotoActivity.pdfMode = setUserPhotoActivity.getIntent().getExtras() == null ? setUserPhotoActivity.pdfMode : setUserPhotoActivity.getIntent().getExtras().getString("pdf_mode", setUserPhotoActivity.pdfMode);
    }
}
