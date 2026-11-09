package p051d9;

import G8.a;
import com.transsnet.palmpay.account.bean.ResetPinVerificationReq;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract;
import com.transsnet.palmpay.core.base.j;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class G extends j implements ResetPinVerificationContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract.Presenter
    public final void getResetPinVerifyType(String str) {
        ResetPinVerificationContract.View view = (ResetPinVerificationContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        a.t().getResetPinVerifyType(str).k(f.f42629b).i(b.a()).subscribe(new E(this));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinVerificationContract.Presenter
    public final void resetPinVerify(ResetPinVerificationReq req, boolean z3) {
        Intrinsics.checkNotNullParameter(req, "req");
        ResetPinVerificationContract.View view = (ResetPinVerificationContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        (z3 ? a.t().resetPinVerifyV2(req) : a.t().resetPinVerify(req)).k(f.f42629b).i(b.a()).subscribe(new F(this));
    }
}
