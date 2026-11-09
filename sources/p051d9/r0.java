package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.core.bean.CommonResult;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CommonResult f35657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f35658g;

    public r0(u0 u0Var, CommonResult commonResult) {
        this.f35658g = u0Var;
        this.f35657f = commonResult;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f35658g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        u0 u0Var = this.f35658g;
        ((VerifyRealNameContract.View) u0Var.f27351a).showLoadingView(false);
        ((VerifyRealNameContract.View) u0Var.f27351a).handleVerifyName(this.f35657f);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        u0 u0Var = this.f35658g;
        ((VerifyRealNameContract.View) u0Var.f27351a).showLoadingView(false);
        ((VerifyRealNameContract.View) u0Var.f27351a).handleVerifyName(this.f35657f);
    }
}
