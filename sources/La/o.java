package La;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.mvp.contract.BasePaymentContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PayByOrderReq f5591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f5592g;

    public o(r rVar, PayByOrderReq payByOrderReq) {
        this.f5592g = rVar;
        this.f5591f = payByOrderReq;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5592g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        IBaseView iBaseView = this.f5592g.f27351a;
        if (iBaseView != null) {
            ((BasePaymentContract.IView) iBaseView).showLoadingView(false);
        }
        if (CommonResult.ERROR_MSG_CONNECT_TIMEOUT.equals(str)) {
            ToastUtils.showLong(p025ba.k.core_msg_pay_order_time_out);
        } else {
            ToastUtils.showLong(str);
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PayByOrderResp payByOrderResp = (PayByOrderResp) obj;
        IBaseView iBaseView = this.f5592g.f27351a;
        if (iBaseView != null) {
            ((BasePaymentContract.IView) iBaseView).showPayResult(payByOrderResp);
            r.b(payByOrderResp, this.f5591f);
        }
    }
}
