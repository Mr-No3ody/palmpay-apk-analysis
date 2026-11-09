package La;

import Ad.C0058e;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends F implements CorePaymentPreviewContract.Presenter {
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract.Presenter
    public final void queryPreviewInfo(PreviewPayInfoV2Req previewPayInfoV2Req) {
        J3.a.C(this, (CorePaymentPreviewContract.View) this.f27351a, new w(previewPayInfoV2Req, 0), new C0058e(11, this, previewPayInfoV2Req), null, true, true, 8);
    }
}
