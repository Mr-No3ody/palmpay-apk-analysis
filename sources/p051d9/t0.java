package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f35663f;

    public t0(u0 u0Var) {
        this.f35663f = u0Var;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f35663f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        ((VerifyRealNameContract.View) this.f35663f.f27351a).showLoadingView(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonResult commonResult = (CommonResult) obj;
        u0 u0Var = this.f35663f;
        ((VerifyRealNameContract.View) u0Var.f27351a).showLoadingView(false);
        if (commonResult.isSuccess()) {
            u0.b(u0Var, commonResult);
        } else {
            ((VerifyRealNameContract.View) u0Var.f27351a).showLoadingView(false);
            ((VerifyRealNameContract.View) u0Var.f27351a).handleVerifyName(commonResult);
        }
    }
}
