package p235pb;

import La.F;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRePayPreviewActivity;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends F implements OcPrePayPreviewContract.IPreviewPresenter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OcRePayPreviewActivity f41298f;

    @Override // com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract.IPreviewPresenter
    public final void createOrder(OcOrderReq ocOrderReq) {
        this.f41298f.showLoadingDialog(true);
        c.f40268a.getInstance().getClass();
        c.a().createOcOrder(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new u(this));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract.IPreviewPresenter
    public final void queryPreviewInfo(PreviewPayInfoV2Req previewPayInfoV2Req) {
        this.f41298f.showLoadingDialog(true);
        ((PayApiService) p324va.c.f43141a.f14621b).queryPreviewPayInfoV2(previewPayInfoV2Req).k(f.f42629b).i(b.a()).subscribe(new t(this));
    }
}
