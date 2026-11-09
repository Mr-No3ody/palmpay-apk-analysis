package com.transsnet.palmpay.ui.mvp.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;

/* JADX INFO: loaded from: classes4.dex */
public interface ReceiveMoneyContract$IPresenter<T> extends IBasePresenter<T> {
    void generateQrcodeData(QrcodeGenerateReq qrcodeGenerateReq, boolean z3);

    void generateQrcodeImg(String str);

    void saveQrcodeImg(Bitmap bitmap);
}
