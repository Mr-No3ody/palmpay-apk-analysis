package Fe;

import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends com.transsnet.palmpay.core.base.j implements MerchantPaymentListContract.Presenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract.Presenter
    public final void queryMerchantList() {
        ((MerchantPaymentListContract.View) this.f27351a).showLoadingView(true);
        ((IApiMainService) Cc.a.f1353a.f39520b).queryMerchantList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new L(this));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract.Presenter
    public final void unbind(String str) {
        ((MerchantPaymentListContract.View) this.f27351a).showLoadingView(true);
        ((IApiMainService) Cc.a.f1353a.f39520b).unbindMerchant(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new K(this));
    }
}
