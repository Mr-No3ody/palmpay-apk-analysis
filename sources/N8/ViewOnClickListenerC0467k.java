package N8;

import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPswFragment;

/* JADX INFO: renamed from: N8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0467k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInActivity f6229b;

    public /* synthetic */ ViewOnClickListenerC0467k(LogInActivity logInActivity, int i7) {
        this.f6228a = i7;
        this.f6229b = logInActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LogInWithPswFragment logInWithPswFragment;
        C0.P pF;
        LogInActivity logInActivity = this.f6229b;
        switch (this.f6228a) {
            case 0:
                int i7 = LogInActivity.f25877p0;
                logInActivity.s();
                break;
            case 1:
                int i10 = LogInActivity.f25877p0;
                logInActivity.x();
                logInActivity.finish();
                break;
            case 2:
                int i11 = LogInActivity.f25877p0;
                if ((logInActivity.o() instanceof LogInWithPswFragment) && (logInWithPswFragment = (LogInWithPswFragment) logInActivity.o()) != null) {
                    logInWithPswFragment.u();
                    break;
                }
                break;
            case 3:
                int i12 = LogInActivity.f25877p0;
                logInActivity.x();
                logInActivity.finish();
                break;
            case 4:
                int i13 = LogInActivity.f25877p0;
                logInActivity.n();
                logInActivity.A(300, null);
                LogInReq logInReq = logInActivity.f25888b;
                if (logInReq != null) {
                    logInReq.verifyToken = null;
                }
                NavHostFragment navHostFragment = logInActivity.f25886Y;
                if (navHostFragment != null && (pF = navHostFragment.f()) != null) {
                    pF.k(F8.d.fragment_login_input_mobile, false);
                    break;
                }
                break;
            default:
                int i14 = LogInActivity.f25877p0;
                logInActivity.showLoadingDialog(true);
                com.palmpay.lib.apm.launchcounter.util.d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PIN);
                logInActivity.finish();
                break;
        }
    }
}
