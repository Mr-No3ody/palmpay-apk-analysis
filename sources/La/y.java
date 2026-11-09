package La;

import Pa.i0;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.ui.mvp.contract.RiskControlCheckOtcContact;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ A f5609f;

    public y(A a3) {
        this.f5609f = a3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5609f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((RiskControlCheckOtcContact.View) this.f5609f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        A a3 = this.f5609f;
        ((RiskControlCheckOtcContact.View) a3.f27351a).showLoadingView(false);
        if (commonResult.isSuccess()) {
            ToastUtils.showLong(i0.C(0, p367ya.a.d().g(), null));
        } else {
            ((RiskControlCheckOtcContact.View) a3.f27351a).showErrorMessage(commonResult.getRespMsg());
        }
    }
}
