package com.transsnet.palmpay.ui.mvp.contract;

import android.graphics.Bitmap;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;

/* JADX INFO: loaded from: classes4.dex */
public interface ReceiveMoneyContract$IView extends IBaseView {
    void onFail(String str);

    void queryRefreshDurationSuccess(long j6);

    void showQrcodeData(QrcodeGenerateResp qrcodeGenerateResp);

    void showQrcodeImg(Bitmap bitmap);

    void showSaveResult(String str);

    void showSetAmountQrcodeImg(Bitmap bitmap, QrcodeGenerateReq qrcodeGenerateReq);
}
