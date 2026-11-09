package Fe;

import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.ui.mvp.contract.MerchantPaymentListContract;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M f2739f;

    public L(M m7) {
        this.f2739f = m7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2739f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        M m7 = this.f2739f;
        ((MerchantPaymentListContract.View) m7.f27351a).showLoadingView(false);
        ((MerchantPaymentListContract.View) m7.f27351a).showFailMessage(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) obj;
        M m7 = this.f2739f;
        ((MerchantPaymentListContract.View) m7.f27351a).showLoadingView(false);
        if (commonListResultV2.isSuccess()) {
            ((MerchantPaymentListContract.View) m7.f27351a).updateMerchantList(commonListResultV2.data);
        } else {
            ((MerchantPaymentListContract.View) m7.f27351a).showFailMessage(commonListResultV2.getRespMsg());
        }
    }
}
