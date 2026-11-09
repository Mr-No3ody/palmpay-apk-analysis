package p051d9;

import J3.a;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends j implements VerifyAccountContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.Presenter
    public final void checkPin(String str) {
        a.D(this, (VerifyAccountContract.View) this.f27351a, new k0(str, null), new j0(this, 0), new C1624v(14), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.Presenter
    public final void getSmsCode(SmsActionReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        VerifyAccountContract.View view = (VerifyAccountContract.View) this.f27351a;
        if (view != null) {
            view.updateSendSmsButton(false);
        }
        a.D(this, (VerifyAccountContract.View) this.f27351a, new l0(req, null), new C1605b(6, this, req), new j0(this, 1), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract.Presenter
    public final void getSmsToken(SmsActionReq smsActionReq) {
        a.D(this, (VerifyAccountContract.View) this.f27351a, new m0(smsActionReq, null), new j0(this, 2), new j0(this, 3), false, true);
    }
}
