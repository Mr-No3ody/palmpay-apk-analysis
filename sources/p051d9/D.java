package p051d9;

import Fe.C0259g;
import J3.a;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends j implements ResetPinContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.Presenter
    public final void checkSmsCode(SmsActionReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.D(this, (ResetPinContract.View) this.f27351a, new B(req, null), new A(this, 0), new C1624v(2), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.Presenter
    public final void getResetPinVerifyList(String str) {
        a.B(this, (ResetPinContract.View) this.f27351a, new C0259g(str, 5), new A(this, 1), new C1624v(4), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.Presenter
    public final void getSecurityFlow(String str) {
        a.B(this, (ResetPinContract.View) this.f27351a, new C0259g(str, 6), new A(this, 2), new C1624v(5), true, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract.Presenter
    public final void sendSms(SmsActionReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.D(this, this.f27351a, new C(req, null), new C1605b(4, this, req), new C1624v(3), false, false);
    }
}
