package Fe;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class K extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f2738f;

    public K(M m7) {
        this.f2738f = m7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2738f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        M m7 = this.f2738f;
        ((MerchantPaymentListContract.View) m7.f27351a).showLoadingView(false);
        ((MerchantPaymentListContract.View) m7.f27351a).showFailMessage(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        boolean zIsSuccess = commonResult.isSuccess();
        M m7 = this.f2738f;
        if (zIsSuccess) {
            m7.queryMerchantList();
        } else {
            ((MerchantPaymentListContract.View) m7.f27351a).showFailMessage(commonResult.getRespMsg());
        }
    }
}
