package W8;

import C0.AbstractC0130w;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPinFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInWithPinFragment f10587b;

    public /* synthetic */ i(LogInWithPinFragment logInWithPinFragment, int i7) {
        this.f10586a = i7;
        this.f10587b = logInWithPinFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LogInWithPinFragment logInWithPinFragment = this.f10587b;
        switch (this.f10586a) {
            case 0:
                AbstractC0130w abstractC0130w = logInWithPinFragment.f26214j;
                if (abstractC0130w != null) {
                    abstractC0130w.j();
                }
                AbstractC0130w abstractC0130w2 = logInWithPinFragment.f26214j;
                if (abstractC0130w2 != null) {
                    abstractC0130w2.h(F8.d.fragment_login_verify_touch_id, logInWithPinFragment.getArguments(), null);
                }
                break;
            case 1:
                int i7 = LogInWithPinFragment.f26213p;
                if (!r0.U0()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_type", SecurityVerifyMethodReq.UNLOGIN_RESET_PIN);
                    LogInActivity logInActivityU = logInWithPinFragment.u();
                    bundle.putString("_number", logInActivityU != null ? logInActivityU.f25879B : null);
                    com.palmpay.lib.apm.launchcounter.util.d.E(bundle, "/account/verifyAccount");
                    break;
                }
                break;
            default:
                int i10 = LogInWithPinFragment.f26213p;
                E activity = logInWithPinFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
