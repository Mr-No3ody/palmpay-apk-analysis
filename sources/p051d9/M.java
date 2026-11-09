package p051d9;

import C0.G;
import L7.a;
import Pa.T;
import Pa.n0;
import com.transsnet.palmpay.account.bean.ChangeTempPinReq;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.req.ResetPinNoTokenReq;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends j implements SetNewPinContract.Presenter {
    public final void b(String str, String str2) {
        BaseApplication.get().setToken(str);
        n0.g().u(((ViewEvent) G.g("Login_Result_Success", true)).add("memberId", str2));
        SetNewPinContract.View view = (SetNewPinContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        BaseApplication.get().getUserDataSource().a().i(b.a()).subscribe(new L(this));
        T.b(-1).execute(new a(1));
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.Presenter
    public final void changeTempPin(String str, String str2, String str3) {
        ChangeTempPinReq changeTempPinReq = new ChangeTempPinReq();
        changeTempPinReq.temporaryPIN = SecurityUtils.a(str);
        changeTempPinReq.temporaryToken = str2;
        changeTempPinReq.smsToken = str3;
        changeTempPinReq.loginFlag = BaseApplication.hasLogin();
        J3.a.E(this, this.f27351a, new I(changeTempPinReq, null), new H(this, 3), new C1624v(7), false, true, 16);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.Presenter
    public final void login(String str, String str2) {
        LogInReq logInReq = new LogInReq();
        p367ya.a.d().getClass();
        logInReq.fcmToken = p059e1.a.I("fcm_sp_fcm_token", "");
        logInReq.gaid = p367ya.a.d().c();
        logInReq.pin = SecurityUtils.a(str);
        logInReq.mobileNo = str2;
        J3.a.E(this, this.f27351a, new J(logInReq, null), new H(this, 1), new H(this, 2), false, true, 16);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract.Presenter
    public final void resetPin(ResetPinNoTokenReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        J3.a.E(this, this.f27351a, new K(req, null), new H(this, 0), new C1624v(6), false, true, 16);
    }
}
