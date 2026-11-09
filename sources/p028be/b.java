package p028be;

import Z4.e;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f18849f;

    public b(c cVar) {
        this.f18849f = cVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f18849f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((BettingConfirmPaymentOrderContract.View) this.f18849f.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CheckPayResp checkPayResp = (CheckPayResp) obj;
        c cVar = this.f18849f;
        ((BettingConfirmPaymentOrderContract.View) cVar.f27351a).showLoadingView(false);
        if (checkPayResp.isSuccess()) {
            ((BettingConfirmPaymentOrderContract.View) cVar.f27351a).handleBettingRedeemCodePay(checkPayResp);
        } else {
            ToastUtils.showLong(checkPayResp.getRespMsg());
        }
    }
}
