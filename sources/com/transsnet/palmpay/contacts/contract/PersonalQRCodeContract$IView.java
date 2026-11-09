package com.transsnet.palmpay.contacts.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;

/* JADX INFO: loaded from: classes3.dex */
public interface PersonalQRCodeContract$IView extends IBaseView {
    void showError(String msg);

    void showPersonalQRCodeInfo(CommonResult resp);

    void showQrcodeImg(Bitmap bit);

    void showSavePath(String path);
}
