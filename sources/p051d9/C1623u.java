package p051d9;

import F6.d;
import J3.a;
import android.text.TextUtils;
import com.flexibank.sdk.k;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.LoginContract;
import com.transsnet.palmpay.core.base.j;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.ShareAccountDetailReq;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p121i2.e;

/* JADX INFO: renamed from: d9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1623u extends j implements LoginContract.Presenter {
    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void checkMobileNumber(String str, String str2) {
        a.D(this, this.f27351a, new C1616m(str, str2, null), new C1613j(this, 0), new com.facebook.react.packagerconnection.a(26), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void checkPassword(String str, String str2, int i7) {
        a.D(this, (LoginContract.View) this.f27351a, new C1617n(str, str2, null), new C1614k(this, i7, 1), new com.facebook.react.packagerconnection.a(27), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void checkPin(String str, String str2, int i7) {
        a.D(this, (LoginContract.View) this.f27351a, new C1618o(str, str2, null), new C1614k(this, i7, 0), new com.facebook.react.packagerconnection.a(25), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void checkSmsCode(String str, String str2, String str3, int i7) {
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = i7;
        smsActionReq.phoneNo = str;
        smsActionReq.smsCode = str3;
        smsActionReq.email = str2;
        a.D(this, (LoginContract.View) this.f27351a, new C1619p(smsActionReq, null), new C1613j(this, 1), new C1613j(this, 2), false, true);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void getSmsCode(String str, String str2, int i7, int i10) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SmsActionReq smsActionReq = new SmsActionReq();
        smsActionReq.businessType = i10;
        smsActionReq.phoneNo = str;
        smsActionReq.voiceSms = i7;
        smsActionReq.email = str2;
        smsActionReq.codeCount = 4;
        a.D(this, (LoginContract.View) this.f27351a, new C1620q(smsActionReq, null), new C1605b(2, this, smsActionReq), new C1613j(this, 4), false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void login(final LogInReq logInReq) {
        LoginContract.View view = (LoginContract.View) this.f27351a;
        r rVar = new r(logInReq, null);
        final int i7 = 0;
        Function1 function1 = new Function1(this) { // from class: d9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1623u f35632b;

            {
                this.f35632b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignUpRsp signUpRsp;
                switch (i7) {
                    case 0:
                        CommonBeanResult<SignUpRsp> response = (CommonBeanResult) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        C1623u c1623u = this.f35632b;
                        if (zIsSuccess && (signUpRsp = response.data) != null) {
                            String authCode = signUpRsp.getAuthCode();
                            try {
                                k.n();
                            } catch (Exception e10) {
                                d.c("LoginPresenter", "Clear FlexiBank session failed", e10);
                            }
                            if (authCode == null) {
                                authCode = "";
                            }
                            try {
                                k.c(authCode, new e(c1623u));
                            } catch (Exception e11) {
                                d.c("LoginPresenter", "FlexiBank authorization failed locally", e11);
                                try {
                                    k.n();
                                } catch (Exception e12) {
                                    d.c("LoginPresenter", "Clear FlexiBank session failed", e12);
                                }
                            }
                        }
                        LoginContract.View view2 = (LoginContract.View) c1623u.f27351a;
                        if (view2 != null) {
                            view2.handleLoginResult(logInReq, response, null);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        LoginContract.View view3 = (LoginContract.View) this.f35632b.f27351a;
                        if (view3 != null) {
                            view3.handleLoginResult(logInReq, null, str);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        };
        final int i10 = 1;
        a.D(this, view, rVar, function1, new Function1(this) { // from class: d9.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1623u f35632b;

            {
                this.f35632b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                SignUpRsp signUpRsp;
                switch (i10) {
                    case 0:
                        CommonBeanResult<SignUpRsp> response = (CommonBeanResult) obj;
                        Intrinsics.checkNotNullParameter(response, "response");
                        boolean zIsSuccess = response.isSuccess();
                        C1623u c1623u = this.f35632b;
                        if (zIsSuccess && (signUpRsp = response.data) != null) {
                            String authCode = signUpRsp.getAuthCode();
                            try {
                                k.n();
                            } catch (Exception e10) {
                                d.c("LoginPresenter", "Clear FlexiBank session failed", e10);
                            }
                            if (authCode == null) {
                                authCode = "";
                            }
                            try {
                                k.c(authCode, new e(c1623u));
                            } catch (Exception e11) {
                                d.c("LoginPresenter", "FlexiBank authorization failed locally", e11);
                                try {
                                    k.n();
                                } catch (Exception e12) {
                                    d.c("LoginPresenter", "Clear FlexiBank session failed", e12);
                                }
                            }
                        }
                        LoginContract.View view2 = (LoginContract.View) c1623u.f27351a;
                        if (view2 != null) {
                            view2.handleLoginResult(logInReq, response, null);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        LoginContract.View view3 = (LoginContract.View) this.f35632b.f27351a;
                        if (view3 != null) {
                            view3.handleLoginResult(logInReq, null, str);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, false, false);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void queryConfig() {
        a.E(this, (LoginContract.View) this.f27351a, new C1621s(1, null), new C1613j(this, 3), null, false, false, 8);
    }

    @Override // com.transsnet.palmpay.account.ui.mvp.contract.LoginContract.Presenter
    public final void queryShareAccountDetail(ShareAccountDetailReq shareAccountDetailReq) {
        a.D(this, (LoginContract.View) this.f27351a, new C1622t(shareAccountDetailReq, null), new C1613j(this, 5), new com.facebook.react.packagerconnection.a(24), false, false);
    }
}
