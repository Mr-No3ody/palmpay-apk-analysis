package p255qd;

import com.transsnet.palmpay.core.bean.rsp.AnalysisBlankQrCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInCodeRsp;
import com.transsnet.palmpay.core.bean.rsp.AnalysisPartnerInRsp;
import com.transsnet.palmpay.core.bean.rsp.MemberQRCodeScanResp;
import com.transsnet.palmpay.core.bean.rsp.QueryShopNameByQrCodeResp;
import com.transsnet.palmpay.send_money.bean.QrcodeParseResp;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f41495b;

    public /* synthetic */ h(s sVar, int i7) {
        this.f41494a = i7;
        this.f41495b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41494a) {
            case 0:
                AnalysisPartnerInCodeRsp it = (AnalysisPartnerInCodeRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView != null) {
                    qrcodeScanContract$IView.showAnalysisPartnerInQrcodeData(it);
                }
                break;
            case 1:
                AnalysisPartnerInRsp it2 = (AnalysisPartnerInRsp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView2 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView2 != null) {
                    qrcodeScanContract$IView2.showAnalysisPartnerInQrcodeDataForCashOut(it2);
                }
                break;
            case 2:
                String str = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView3 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView3 != null) {
                    qrcodeScanContract$IView3.showQrcodeDataError(str);
                }
                break;
            case 3:
                MemberQRCodeScanResp it3 = (MemberQRCodeScanResp) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView4 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView4 != null) {
                    qrcodeScanContract$IView4.showMemberQrcodeData(it3);
                }
                break;
            case 4:
                String str2 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView5 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView5 != null) {
                    qrcodeScanContract$IView5.showQrcodeDataError(str2);
                }
                break;
            case 5:
                String str3 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView6 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView6 != null) {
                    qrcodeScanContract$IView6.showQrcodeDataError(str3);
                }
                break;
            case 6:
                String str4 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView7 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView7 != null) {
                    qrcodeScanContract$IView7.showQrcodeDataError(str4);
                }
                break;
            case 7:
                QrcodeParseResp it4 = (QrcodeParseResp) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView8 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView8 != null) {
                    qrcodeScanContract$IView8.showQrcodeData(it4);
                }
                break;
            case 8:
                String str5 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView9 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView9 != null) {
                    qrcodeScanContract$IView9.showQrcodeDataError(str5);
                }
                break;
            case 9:
                AnalysisBlankQrCodeRsp it5 = (AnalysisBlankQrCodeRsp) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView10 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView10 != null) {
                    qrcodeScanContract$IView10.handleAnalysisBlankQrCodeResult(it5);
                }
                break;
            case 10:
                String str6 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView11 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView11 != null) {
                    qrcodeScanContract$IView11.showQrcodeDataError(str6);
                }
                break;
            case 11:
                QueryShopNameByQrCodeResp it6 = (QueryShopNameByQrCodeResp) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                QrcodeScanContract$IView qrcodeScanContract$IView12 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView12 != null) {
                    qrcodeScanContract$IView12.queryShopNameSuccess(it6);
                }
                break;
            default:
                String str7 = (String) obj;
                QrcodeScanContract$IView qrcodeScanContract$IView13 = (QrcodeScanContract$IView) this.f41495b.f27351a;
                if (qrcodeScanContract$IView13 != null) {
                    qrcodeScanContract$IView13.showQrcodeDataError(str7);
                }
                break;
        }
        return Unit.f38893a;
    }
}
