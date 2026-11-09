package p051d9;

import J3.a;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends j implements SignUpStepOtcContract.Presenter {
    static {
        new f0(null);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.Presenter
    public final void getSmsCode(int i7) {
        SignUpStepOtcContract.View view = (SignUpStepOtcContract.View) this.f27351a;
        if (view != null) {
            view.updateSendSmsButton(false);
        }
        SignUpStepOtcContract.View view2 = (SignUpStepOtcContract.View) this.f27351a;
        String fullMobileNumber = view2 != null ? view2.getFullMobileNumber() : null;
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 4;
        smsActionReq.phoneNo = fullMobileNumber;
        smsActionReq.voiceSms = i7;
        smsActionReq.codeCount = 4;
        SignUpStepOtcContract.View view3 = (SignUpStepOtcContract.View) this.f27351a;
        smsActionReq.email = view3 != null ? view3.getEmail() : null;
        a.D(this, (SignUpStepOtcContract.View) this.f27351a, new g0(smsActionReq, null), new C1605b(5, this, smsActionReq), new e0(this, 0), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract.Presenter
    public final void getSmsToken(String str, String smsCode) {
        Intrinsics.checkNotNullParameter(smsCode, "smsCode");
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = 4;
        smsActionReq.phoneNo = str;
        smsActionReq.smsCode = smsCode;
        a.D(this, (SignUpStepOtcContract.View) this.f27351a, new h0(smsActionReq, null), new e0(this, 1), new e0(this, 2), false, true);
    }
}
