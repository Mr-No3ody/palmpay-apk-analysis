package p255qd;

import J3.a;
import Wf.AbstractC0780y;
import Wf.I;
import androidx.lifecycle.AbstractC1207q;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.AnalysisPartnerInForCashOutReq;
import com.transsnet.palmpay.core.bean.req.AnalysisBlankQrCodeReq;
import com.transsnet.palmpay.core.bean.req.AnalysisPartnerInCodeReq;
import com.transsnet.palmpay.send_money.bean.AnalysisCodeSendMoneyReq;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter;
import com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IView;
import kotlin.jvm.internal.Intrinsics;
import p042cg.e;
import p042cg.f;
import p051d9.C1605b;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends j implements QrcodeScanContract$IPresenter {
    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void analysisBlankQrCode(AnalysisBlankQrCodeReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.E(this, this.f27351a, new i(req, null), new h(this, 9), new h(this, 10), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void analysisPartnerInCode(AnalysisPartnerInCodeReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.E(this, this.f27351a, new j(req, null), new h(this, 0), new h(this, 5), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void analysisPartnerInCodeForCashOut(AnalysisPartnerInForCashOutReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.E(this, this.f27351a, new k(req, null), new h(this, 1), new h(this, 2), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void getShopNameByQrCode(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        a.E(this, this.f27351a, new l(qrCode, null), new h(this, 11), new h(this, 12), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void parseCouponQrcodeData(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        a.E(this, this.f27351a, new m(data, null), new C1605b(15, this, data), new h(this, 6), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void parseMemberQrcodeData(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        a.E(this, this.f27351a, new n(data, null), new h(this, 3), new h(this, 4), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void parseQrcodeData(AnalysisCodeSendMoneyReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.E(this, this.f27351a, new o(req, null), new h(this, 7), new h(this, 8), false, false, 48);
    }

    @Override // com.transsnet.palmpay.send_money.contract.QrcodeScanContract$IPresenter
    public final void syncDecodeQRCode(String path) {
        AbstractC1207q coroutineScope;
        Intrinsics.checkNotNullParameter(path, "path");
        QrcodeScanContract$IView qrcodeScanContract$IView = (QrcodeScanContract$IView) this.f27351a;
        if (qrcodeScanContract$IView == null || (coroutineScope = qrcodeScanContract$IView.getCoroutineScope()) == null) {
            return;
        }
        f fVar = I.f10809a;
        AbstractC0780y.m(coroutineScope, e.f19009c, null, new r(path, this, null), 2);
    }
}
