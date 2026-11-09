package p051d9;

import Z4.e;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Z extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f35588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f35589g;

    public Z(d0 d0Var, boolean z3) {
        this.f35588f = d0Var;
        this.f35589g = z3;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f35588f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        SignUpContract.View view = (SignUpContract.View) this.f35588f.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CommonListResultV2 response = (CommonListResultV2) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        d0 d0Var = this.f35588f;
        SignUpContract.View view = (SignUpContract.View) d0Var.f27351a;
        if (view != null) {
            view.showLoadingView(false);
        }
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        SignUpContract.View view2 = (SignUpContract.View) d0Var.f27351a;
        if (view2 != null) {
            view2.handleCountryRegionListData(this.f35589g, response.data);
        }
    }
}
