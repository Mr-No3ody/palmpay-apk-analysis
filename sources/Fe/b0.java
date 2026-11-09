package Fe;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IPresenter;
import com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView;
import io.reactivex.internal.operators.observable.C1755g;
import io.reactivex.internal.operators.observable.C1765q;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends com.transsnet.palmpay.core.base.j implements QrcodeShareContract$IPresenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IPresenter
    public final void generateQrcodeImg(String str) {
        new C1755g(new Z(str, 0), 0).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new a0(this, 1));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IPresenter
    public final void getInviteUrl(CommonShareReq commonShareReq) {
        ((QrcodeShareContract$IView) this.f27351a).showLoadingDialog(true);
        ((PayApiService) p324va.c.f43141a.f14621b).commonShare(commonShareReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new a0(this, 2));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IPresenter
    public final void queryInvitationCode() {
        if (TextUtils.isEmpty(p367ya.a.d().f44149a.getString("key_invitation_code", ""))) {
            ((MemberApiService) p324va.c.f43141a.f14622c).queryInvitationCode().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new a0(this, 0));
            return;
        }
        IBaseView iBaseView = this.f27351a;
        if (iBaseView != null) {
            ((QrcodeShareContract$IView) iBaseView).showInvitationCode(p367ya.a.d().f44149a.getString("key_invitation_code", ""));
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IPresenter
    public final void savePicture(Bitmap bitmap) {
        C1765q c1765qI = new C1755g(new Dg.a(bitmap, 12), 0).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(new Oe.a(this, 4), p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        addSubscription(eVar);
    }
}
