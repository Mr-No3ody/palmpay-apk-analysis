package com.transsnet.palmpay.ui.mvp.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBaseView;

/* JADX INFO: loaded from: classes4.dex */
public interface QrcodeShareContract$IView extends IBaseView {
    void handleInviteUrl(String str);

    void showError(String str);

    void showInvitationCode(String str);

    void showQrcodeImg(Bitmap bitmap);

    void showSavePath(String str);
}
