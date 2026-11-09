package p010a9;

import F8.h;
import Pa.n0;
import android.view.View;
import androidx.fragment.app.E;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpPermissionDialog;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.core.config.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStep1Fragment f11831b;

    public /* synthetic */ a(SignUpStep1Fragment signUpStep1Fragment, int i7) {
        this.f11830a = i7;
        this.f11831b = signUpStep1Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String mobileNumber;
        SignUpStep1Fragment signUpStep1Fragment = this.f11831b;
        switch (this.f11830a) {
            case 0:
                SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                n0.g().l("SignUpJumpLogin");
                SignUpActivity signUpActivityX = signUpStep1Fragment.x();
                if (signUpActivityX != null) {
                    PpPhoneEditText ppPhoneEditText = signUpStep1Fragment.f26259X;
                    if (ppPhoneEditText == null || (mobileNumber = ppPhoneEditText.getMobileNumber()) == null) {
                        mobileNumber = "";
                    }
                    boolean z3 = signUpStep1Fragment.f26265p;
                    SignUpActivity.a aVar2 = SignUpActivity.f26029C;
                    signUpActivityX.p(mobileNumber, z3, null);
                }
                break;
            case 1:
                SignUpStep1Fragment.a aVar3 = SignUpStep1Fragment.f26251u0;
                String strG = d.g("/h5/conditions/ng/palmpay?showTitle=true");
                Intrinsics.checkNotNullExpressionValue(strG, "getTermsUrl(...)");
                String string = signUpStep1Fragment.getString(h.ac_terms_and_conditions);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = signUpStep1Fragment.getString(h.ac_confirm);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                SignUpStep1Fragment.B(strG, string, string2);
                break;
            case 2:
                SignUpStep1Fragment.a aVar4 = SignUpStep1Fragment.f26251u0;
                String strG2 = d.g("/h5/policy/ng/palmpay?showTitle=true");
                Intrinsics.checkNotNullExpressionValue(strG2, "getPrivacyUrl(...)");
                signUpStep1Fragment.z(strG2);
                break;
            case 3:
                SignUpPermissionDialog signUpPermissionDialog = signUpStep1Fragment.f26264o;
                if (signUpPermissionDialog != null) {
                    signUpPermissionDialog.dismiss();
                }
                signUpStep1Fragment.f26264o = null;
                signUpStep1Fragment.u();
                break;
            case 4:
                SignUpPermissionDialog signUpPermissionDialog2 = signUpStep1Fragment.f26264o;
                if (signUpPermissionDialog2 != null) {
                    signUpPermissionDialog2.dismiss();
                }
                signUpStep1Fragment.f26264o = null;
                break;
            case 5:
                SignUpStep1Fragment.a aVar5 = SignUpStep1Fragment.f26251u0;
                signUpStep1Fragment.A();
                break;
            case 6:
                SignUpStep1Fragment.a aVar6 = SignUpStep1Fragment.f26251u0;
                E activity = signUpStep1Fragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            default:
                n0.g().l("SignUpMobilePopupQuit");
                signUpStep1Fragment.f26252A = true;
                E activity2 = signUpStep1Fragment.getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                break;
        }
    }
}
