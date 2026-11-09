package com.transsnet.palmpay.send_money.contract;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.rsp.AnalysisBlankQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisCouponQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInRsp;
import com.transsnet.palmpay.core.bean.rsp.MemberQRCodeScanResp;
import com.transsnet.palmpay.core.bean.rsp.QueryShopNameByQrCodeResp;
import com.transsnet.palmpay.send_money.bean.QrcodeParseResp;

/* JADX INFO: loaded from: classes4.dex */
public interface QrcodeScanContract$IView extends IBaseView {
    void handleAnalysisBlankQrCodeResult(AnalysisBlankQrCodeRsp analysisBlankQrCodeRsp);

    void queryShopNameSuccess(QueryShopNameByQrCodeResp queryShopNameByQrCodeResp);

    void showAnalysisPartnerInQrcodeData(AnalysisPartnerInCodeRsp analysisPartnerInCodeRsp);

    void showAnalysisPartnerInQrcodeDataForCashOut(AnalysisPartnerInRsp analysisPartnerInRsp);

    void showCouponQrcodeData(AnalysisCouponQrCodeRsp analysisCouponQrCodeRsp, String str);

    void showMemberQrcodeData(MemberQRCodeScanResp memberQRCodeScanResp);

    void showQrcodeData(QrcodeParseResp qrcodeParseResp);

    void showQrcodeDataError(String str);

    void showQrcodeResult(String str);
}
