package La;

import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends com.transsnet.palmpay.core.base.j implements CheckPayContract$IPresenter {
    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void checkNewPay(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).checkSavingPay(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new s(this, checkPayReq, 1));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void checkPay(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).checkPay(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new s(this, checkPayReq, 0));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void checkWithdrawalPay(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).checkWithdrawalPay(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new s(this, checkPayReq, 2));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void partnerCheckPay(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).partnerCheckPay(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new s(this, checkPayReq, 3));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void queryPayResult(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).queryPayResult(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new t(this, 0));
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void queryPaymentReward(int i7, String str) {
        if (TextUtils.isEmpty(str)) {
            F6.d.c("CheckPayPresenter", "queryPaymentReward transType is empty");
        } else {
            ((PayApiService) p324va.c.f43141a.f14621b).queryPaymentReward(i7, str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new t(this, 2));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IPresenter
    public final void querySavingPayResult(CheckPayReq checkPayReq) {
        ((PayApiService) p324va.c.f43141a.f14621b).queryNewPayResult(checkPayReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new t(this, 1));
    }
}
