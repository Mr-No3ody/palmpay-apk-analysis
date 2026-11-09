package W8;

import Pa.i0;
import Pa.n0;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpPermissionDialog;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInInputMobileFragment f10577b;

    public /* synthetic */ c(LogInInputMobileFragment logInInputMobileFragment, int i7) {
        this.f10576a = i7;
        this.f10577b = logInInputMobileFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LogInInputMobileFragment logInInputMobileFragment = this.f10577b;
        switch (this.f10576a) {
            case 0:
                SignUpPermissionDialog signUpPermissionDialog = logInInputMobileFragment.f26197j;
                if (signUpPermissionDialog != null) {
                    signUpPermissionDialog.dismiss();
                }
                logInInputMobileFragment.f26197j = null;
                logInInputMobileFragment.v();
                break;
            case 1:
                SignUpPermissionDialog signUpPermissionDialog2 = logInInputMobileFragment.f26197j;
                if (signUpPermissionDialog2 != null) {
                    signUpPermissionDialog2.dismiss();
                }
                logInInputMobileFragment.f26197j = null;
                break;
            case 2:
                int i7 = LogInInputMobileFragment.f26194C;
                n0.g().l("Login2SignUpNow");
                LogInActivity logInActivityW = logInInputMobileFragment.w();
                if (logInActivityW != null) {
                    logInActivityW.C(i0.D(logInInputMobileFragment.x()), logInInputMobileFragment.f26198o);
                }
                break;
            case 3:
                int i10 = LogInInputMobileFragment.f26194C;
                logInInputMobileFragment.z();
                break;
            case 4:
                int i11 = LogInInputMobileFragment.f26194C;
                n0.g().l("LoginJumpSignUp");
                LogInActivity logInActivityW2 = logInInputMobileFragment.w();
                if (logInActivityW2 != null) {
                    logInActivityW2.C(i0.D(logInInputMobileFragment.x()), logInInputMobileFragment.f26198o);
                }
                break;
            default:
                int i12 = LogInInputMobileFragment.f26194C;
                E activity = logInInputMobileFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
