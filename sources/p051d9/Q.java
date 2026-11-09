package p051d9;

import F6.d;
import H8.g;
import H8.h;
import N8.q0;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.rsp.NameCheckRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.PreSignUpRsp;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.QueryUiResourceRsp1;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f35572b;

    public /* synthetic */ Q(d0 d0Var, int i7) {
        this.f35571a = i7;
        this.f35572b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SignUpContract.View view;
        switch (this.f35571a) {
            case 0:
                CommonResult it = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SignUpContract.View view2 = (SignUpContract.View) this.f35572b.f27351a;
                if (view2 != null) {
                    view2.handleCheckInvitationCode(it);
                }
                break;
            case 1:
                CommonBeanResult<PreSignUpRsp> it2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SignUpContract.View view3 = (SignUpContract.View) this.f35572b.f27351a;
                if (view3 != null) {
                    view3.handlePreSignUpResult(it2);
                }
                break;
            case 2:
                CommonBeanResult<NameCheckRsp> it3 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                SignUpContract.View view4 = (SignUpContract.View) this.f35572b.f27351a;
                if (view4 != null) {
                    view4.handleCheckName(it3);
                }
                break;
            case 3:
                CommonBeanResult<RegisterCouponResp> it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                SignUpContract.View view5 = (SignUpContract.View) this.f35572b.f27351a;
                if (view5 != null) {
                    view5.handleRegisterCoupon(it4);
                }
                break;
            case 4:
                CommonBeanResult<PreCheckPhoneRsp> response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                d0 d0Var = this.f35572b;
                SignUpContract.View view6 = (SignUpContract.View) d0Var.f27351a;
                if (view6 != null) {
                    view6.showLoadingView(false);
                }
                if (response.isSuccess() && response.data == null) {
                    ToastUtils.showLong("data is null", new Object[0]);
                } else {
                    SignUpContract.View view7 = (SignUpContract.View) d0Var.f27351a;
                    if (view7 != null) {
                        view7.onCheckMobileNumberResult(response);
                    }
                }
                break;
            case 5:
                ToastUtils.showLong((String) obj, new Object[0]);
                SignUpContract.View view8 = (SignUpContract.View) this.f35572b.f27351a;
                if (view8 != null) {
                    view8.showLoadingView(false);
                }
                break;
            case 6:
                h ret = (h) obj;
                Intrinsics.checkNotNullParameter(ret, "ret");
                StringBuilder sbQ = q0.q("getRedirectUrl: ", ret.f3765a, " ");
                g gVar = ret.f3766b;
                sbQ.append(gVar);
                d.h("SignUpPresenter", 3, sbQ.toString());
                String str = ret.f3765a;
                if (TextUtils.isEmpty(str)) {
                    d.h("SignUpPresenter", 3, "verifyMtnNumber: Error: " + gVar);
                } else {
                    SignUpContract.View view9 = (SignUpContract.View) this.f35572b.f27351a;
                    if (view9 != null) {
                        view9.handleVerifyMtnNumber(true, str);
                    }
                }
                break;
            default:
                QueryUiResourceRsp1 it5 = (QueryUiResourceRsp1) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5.isSuccess() && (view = (SignUpContract.View) this.f35572b.f27351a) != null) {
                    view.handleAppConfigResult(it5);
                }
                break;
        }
        return Unit.f38893a;
    }
}
