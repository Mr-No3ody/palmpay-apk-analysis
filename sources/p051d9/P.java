package p051d9;

import J3.a;
import X6.c;
import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.bean.req.ResetPasswordReq;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract;
import com.transsnet.palmpay.core.base.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class P extends j implements SetNewPswContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract.Presenter
    public final void resetPassword(ResetPasswordReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.C(this, this.f27351a, new c(req, 28), new N(this, 1), new C1624v(9), false, true, 16);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract.Presenter
    public final void resetTempPassword(ChangeTempPinReq changeTempPinReq) {
        a.E(this, this.f27351a, new O(changeTempPinReq, null), new N(this, 0), new C1624v(8), false, true, 16);
    }
}
