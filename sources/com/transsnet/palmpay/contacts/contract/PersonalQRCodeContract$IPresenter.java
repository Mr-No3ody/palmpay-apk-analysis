package com.transsnet.palmpay.contacts.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBasePresenter;

/* JADX INFO: loaded from: classes3.dex */
public interface PersonalQRCodeContract$IPresenter extends IBasePresenter<PersonalQRCodeContract$IView> {
    void generateQrcodeImg(String data);

    void getPersonalQRCodeInfo();

    void savePicture(Bitmap bitmap);
}
