package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.bean.RegularRuleRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyRealNameContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f35647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f35648g;

    public o0(u0 u0Var, boolean z3) {
        this.f35648g = u0Var;
        this.f35647f = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f35648g.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ((VerifyRealNameContract.View) this.f35648g.f27351a).showLoadingView(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        u0 u0Var = this.f35648g;
        ((VerifyRealNameContract.View) u0Var.f27351a).showLoadingView(false);
        ((VerifyRealNameContract.View) u0Var.f27351a).handleRegularRule((RegularRuleRsp) obj, this.f35647f);
    }
}
