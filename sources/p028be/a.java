package p028be;

import Z4.e;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.DefaultPayMethodResp;
import com.transsnet.palmpay.teller.ui.mvp.contract.BettingConfirmPaymentOrderContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f18848f;

    public a(c cVar) {
        this.f18848f = cVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f18848f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((BettingConfirmPaymentOrderContract.View) this.f18848f.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        c cVar = this.f18848f;
        ((BettingConfirmPaymentOrderContract.View) cVar.f27351a).showLoadingView(false);
        if (commonBeanResult.isSuccess()) {
            ((BettingConfirmPaymentOrderContract.View) cVar.f27351a).handleBettingDefaultPaymentOrder(((DefaultPayMethodResp) commonBeanResult.data).paymentMethod);
        } else {
            ToastUtils.showLong(commonBeanResult.getRespMsg());
        }
    }
}
