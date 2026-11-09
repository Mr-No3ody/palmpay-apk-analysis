package N8;

import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpSuccessActivity f6212b;

    public /* synthetic */ f0(SignUpSuccessActivity signUpSuccessActivity, int i7) {
        this.f6211a = i7;
        this.f6212b = signUpSuccessActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SignUpSuccessActivity signUpSuccessActivity = this.f6212b;
        switch (this.f6211a) {
            case 0:
                int i7 = SignUpSuccessActivity.f26045o;
                Pa.n0.g().m("registration_result_page_element_click", "ivBack", "");
                signUpSuccessActivity.onBackPressed();
                break;
            case 1:
                RegisterCouponResp registerCouponResp = signUpSuccessActivity.f26052i;
                if (!TextUtils.isEmpty(registerCouponResp != null ? registerCouponResp.androidLinkUrl : null)) {
                    RegisterCouponResp registerCouponResp2 = signUpSuccessActivity.f26052i;
                    ActivityUtils.startActivity(Pa.F.a(signUpSuccessActivity, registerCouponResp2 != null ? registerCouponResp2.androidLinkUrl : null));
                    signUpSuccessActivity.f26053j = true;
                } else {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                    signUpSuccessActivity.finish();
                }
                break;
            case 2:
                int i10 = SignUpSuccessActivity.f26045o;
                com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
                signUpSuccessActivity.f26053j = true;
                break;
            default:
                int i11 = SignUpSuccessActivity.f26045o;
                signUpSuccessActivity.m();
                break;
        }
    }
}
