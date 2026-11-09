package p028be;

import La.F;
import Qd.a;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import com.transsnet.palmpay.teller.bean.BettingWithdrawRedeemPayReq;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends F implements BettingConfirmPaymentOrderContract.Presenter {
    @Override // com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract.Presenter
    public final void bettingWithdrawRedeemCodePay(BettingWithdrawRedeemPayReq bettingWithdrawRedeemPayReq) {
        ((BettingConfirmPaymentOrderContract.View) this.f27351a).showLoadingView(true);
        ((IApiTellerService) a.f7847a.f8871b).bettingWithdrawRedeemCodePay(bettingWithdrawRedeemPayReq).k(f.f42629b).i(b.a()).subscribe(new b(this));
    }

    @Override // com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract.Presenter
    public final void queryBettingDefaultPayMethod(DefaultPayMethodReq defaultPayMethodReq) {
        ((AccountApiService) p324va.c.f43141a.f14623d).queryDefaultMethod(defaultPayMethodReq).k(f.f42629b).i(b.a()).subscribe(new a(this));
    }
}
