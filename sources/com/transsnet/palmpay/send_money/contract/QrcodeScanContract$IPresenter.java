package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.AnalysisPartnerInForCashOutReq;
import com.transsnet.palmpay.core.bean.req.AnalysisBlankQrCodeReq;
import com.transsnet.palmpay.core.bean.req.AnalysisPartnerInCodeReq;
import com.transsnet.palmpay.send_money.bean.AnalysisCodeSendMoneyReq;

/* JADX INFO: loaded from: classes4.dex */
public interface QrcodeScanContract$IPresenter<T> extends IBasePresenter<T> {
    void analysisBlankQrCode(AnalysisBlankQrCodeReq analysisBlankQrCodeReq);

    void analysisPartnerInCode(AnalysisPartnerInCodeReq analysisPartnerInCodeReq);

    void analysisPartnerInCodeForCashOut(AnalysisPartnerInForCashOutReq analysisPartnerInForCashOutReq);

    void getShopNameByQrCode(String str);

    void parseCouponQrcodeData(String str);

    void parseMemberQrcodeData(String str);

    void parseQrcodeData(AnalysisCodeSendMoneyReq analysisCodeSendMoneyReq);

    void syncDecodeQRCode(String str);
}
