package com.transsnet.palmpay.ui.mvp.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;

/* JADX INFO: loaded from: classes4.dex */
public interface QrcodeShareContract$IPresenter extends IBasePresenter<QrcodeShareContract$IView> {
    void generateQrcodeImg(String str);

    void getInviteUrl(CommonShareReq commonShareReq);

    void queryInvitationCode();

    void savePicture(Bitmap bitmap);
}
