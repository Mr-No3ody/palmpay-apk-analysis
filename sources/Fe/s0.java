package Fe;

import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCompleteReq;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderPreviewReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IPresenter;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends La.F implements ThirdPartyMerchantPreviewContract$IPresenter {
    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IPresenter
    public final void completeMerchantOrder(MerchantOrderCompleteReq merchantOrderCompleteReq) {
        ((IApiMainService) Cc.a.f1353a.f39520b).completeMerchantOrder(merchantOrderCompleteReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r0(this, 1));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IPresenter
    public final void queryPaymentMethod(MerchantOrderPreviewReq merchantOrderPreviewReq) {
        ((IApiMainService) Cc.a.f1353a.f39520b).queryMerchantPreviewInfo(merchantOrderPreviewReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r0(this, 2));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.ThirdPartyMerchantPreviewContract$IPresenter
    public final void queryPreviewPayInfo(MerchantOrderPreviewReq merchantOrderPreviewReq) {
        ((IApiMainService) Cc.a.f1353a.f39520b).queryMerchantPreviewInfo(merchantOrderPreviewReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r0(this, 0));
    }
}
