package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class E extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f35556f;

    public E(G g7) {
        this.f35556f = g7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f35556f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String str) {
        ResetPinVerificationContract.View view = (ResetPinVerificationContract.View) this.f35556f.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        ToastUtils.showLong(str, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        ResetPinVerificationContract.View view;
        CommonBeanResult<ResetPinVerifyTypeRsp> commonBeanResult = (CommonBeanResult) obj;
        G g7 = this.f35556f;
        ResetPinVerificationContract.View view2 = (ResetPinVerificationContract.View) g7.f27351a;
        if (view2 != null) {
            view2.showLoadingView(false);
        }
        if (commonBeanResult == null || (view = (ResetPinVerificationContract.View) g7.f27351a) == null) {
            return;
        }
        view.handleResetPinVerifyTypeRsp(commonBeanResult);
    }
}
