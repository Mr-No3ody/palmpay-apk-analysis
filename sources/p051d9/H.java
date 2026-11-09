package p051d9;

import C0.G;
import F6.d;
import Pa.n0;
import com.flexibank.sdk.k;
import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPinContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p137j3.u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M f35559b;

    public /* synthetic */ H(M m7, int i7) {
        this.f35558a = i7;
        this.f35559b = m7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35558a) {
            case 0:
                CommonResult it = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SetNewPinContract.View view = (SetNewPinContract.View) this.f35559b.f27351a;
                if (view != null) {
                    view.handleChangePinResult(it);
                }
                break;
            case 1:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean zIsSuccess = response.isSuccess();
                M m7 = this.f35559b;
                if (zIsSuccess) {
                    T t = response.data;
                    if (t != 0) {
                        String authCode = ((SignUpRsp) t).getAuthCode();
                        try {
                            k.n();
                        } catch (Exception e10) {
                            d.c("SetNewPinPresenter", "Clear FlexiBank session failed", e10);
                        }
                        if (authCode == null) {
                            authCode = "";
                        }
                        try {
                            k.c(authCode, new u(m7));
                        } catch (Exception e11) {
                            d.c("SetNewPinPresenter", "FlexiBank authorization failed locally", e11);
                            try {
                                k.n();
                            } catch (Exception e12) {
                                d.c("SetNewPinPresenter", "Clear FlexiBank session failed", e12);
                            }
                        }
                    }
                    SetNewPinContract.View view2 = (SetNewPinContract.View) m7.f27351a;
                    if (view2 != null) {
                        view2.loginSuccess((SignUpRsp) response.data);
                    }
                    n0.g().D(((SignUpRsp) response.data).getMemberId());
                    String token = ((SignUpRsp) response.data).getToken();
                    SignUpRsp signUpRsp = (SignUpRsp) response.data;
                    int i7 = signUpRsp.okcWhileListUser;
                    m7.b(token, signUpRsp.getMemberId());
                } else {
                    n0.g().u((ViewEvent) G.g("Login_Result_Failed", true));
                    SetNewPinContract.View view3 = (SetNewPinContract.View) m7.f27351a;
                    if (view3 != null) {
                        view3.loginFailShowDialog(response.getRespMsg());
                    }
                }
                break;
            case 2:
                ToastUtils.showLong((String) obj, new Object[0]);
                SetNewPinContract.View view4 = (SetNewPinContract.View) this.f35559b.f27351a;
                if (view4 != null) {
                    view4.AutoLoginFail();
                }
                break;
            default:
                CommonBeanResult<ChangeTempPinRsp> it2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SetNewPinContract.View view5 = (SetNewPinContract.View) this.f35559b.f27351a;
                if (view5 != null) {
                    view5.showChangeTempPinResult(it2);
                }
                break;
        }
        return Unit.f38893a;
    }
}
