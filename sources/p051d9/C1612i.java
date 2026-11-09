package p051d9;

import Ad.C0058e;
import Fe.C0259g;
import J3.a;
import com.transsnet.palmpay.account.bean.req.ChangePhoneNoTokenReq;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1612i extends j implements ChangeMobileContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.Presenter
    public final void changePhone(ChangePhoneNoTokenReq changePhoneNoTokenReq, String str) {
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 3;
        smsActionReq.phoneNo = changePhoneNoTokenReq != null ? changePhoneNoTokenReq.newPhoneNo : null;
        smsActionReq.smsCode = str;
        ChangeMobileContract.View view = (ChangeMobileContract.View) this.f27351a;
        if (view != null) {
            view.showLoadingView(true);
        }
        a.D(this, (ChangeMobileContract.View) this.f27351a, new C1606c(smsActionReq, null), new C1605b(0, changePhoneNoTokenReq, this), new C1604a(this, 6), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.Presenter
    public final void checkPhoneIsReg(String fullNumber) {
        Intrinsics.checkNotNullParameter(fullNumber, "fullNumber");
        a.D(this, (ChangeMobileContract.View) this.f27351a, new C1608e(fullNumber, null), new C1605b(this, fullNumber), new com.facebook.react.packagerconnection.a(23), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.Presenter
    public final void checkPin(String pin, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        a.D(this, (ChangeMobileContract.View) this.f27351a, new C1609f(pin, str, null), new C1604a(this, 0), new com.facebook.react.packagerconnection.a(22), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.Presenter
    public final void getSecurityFlow(String str) {
        a.B(this, (ChangeMobileContract.View) this.f27351a, new C0259g(str, 3), new C1604a(this, 7), new com.facebook.react.packagerconnection.a(21), true, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract.Presenter
    public final void sendSms(SmsActionReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        a.D(this, this.f27351a, new C1610g(req, null), new C0058e(29, this, req), new C1604a(this, 5), false, true);
    }
}
