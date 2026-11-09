package Fe;

import Pa.C0525w;
import android.graphics.Bitmap;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.rsp.QrcodeGenerateResp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IPresenter;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1760l;
import io.reactivex.internal.operators.observable.C1765q;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends com.transsnet.palmpay.core.base.j implements ReceiveMoneyContract$IPresenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IPresenter
    public final void generateQrcodeData(QrcodeGenerateReq qrcodeGenerateReq, boolean z3) {
        df.d<QrcodeGenerateResp> dVarGenerateQrcode = ((PayApiService) p324va.c.f43141a.f14621b).generateQrcode(qrcodeGenerateReq);
        if (dVarGenerateQrcode == null) {
            return;
        }
        new C1760l(dVarGenerateQrcode, new d0(this), 2).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new c0(this, z3, qrcodeGenerateReq));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IPresenter
    public final void generateQrcodeImg(String str) {
        C1765q c1765qI = new C1755g(new e0(str), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new C0525w(this, 4), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ReceiveMoneyContract$IPresenter
    public final void saveQrcodeImg(Bitmap bitmap) {
        C1765q c1765qI = new C1755g(new p183m6.j(bitmap, 3), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new p045d3.k(this, 4), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }
}
