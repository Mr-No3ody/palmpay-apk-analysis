package p235pb;

import La.F;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.contract.CLRepayPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendPreviewActivity;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends F implements CLRepayPreviewContract.ICLRepayPreviewPresenter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CLRepaymentExtendPreviewActivity f41275f;

    public b(CLRepaymentExtendPreviewActivity cLRepaymentExtendPreviewActivity) {
        this.f41275f = cLRepaymentExtendPreviewActivity;
    }

    @Override // com.transsnet.palmpay.credit.contract.CLRepayPreviewContract.ICLRepayPreviewPresenter
    public final void queryPreviewInfo(PreviewPayInfoV2Req previewPayInfoV2Req) {
        this.f41275f.showLoadingDialog(true);
        ((PayApiService) c.f43141a.f14621b).queryPreviewPayInfoV2(previewPayInfoV2Req).k(f.f42629b).i(p071ef.b.a()).subscribe(new a(this));
    }
}
