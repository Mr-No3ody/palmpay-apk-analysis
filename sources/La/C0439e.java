package La;

import com.transsnet.palmpay.core.bean.PaymentMethodResp;
import com.transsnet.palmpay.core.ui.mvp.contract.AddBankAccountContract;
import io.reactivex.disposables.Disposable;

/* JADX INFO: renamed from: La.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0439e extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f5578f;

    public C0439e(h hVar) {
        this.f5578f = hVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f5578f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        PaymentMethodResp paymentMethodResp = (PaymentMethodResp) obj;
        if (paymentMethodResp.isSuccess()) {
            ((AddBankAccountContract.IView) this.f5578f.f27351a).handlePaymentMethods(paymentMethodResp.data);
        }
    }

    @Override // Z4.e
    public final void w(String str) {
    }
}
