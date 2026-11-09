package W8;

import C0.G;
import Pa.n0;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithSmsFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInWithSmsFragment f10594b;

    public /* synthetic */ n(LogInWithSmsFragment logInWithSmsFragment, int i7) {
        this.f10593a = i7;
        this.f10594b = logInWithSmsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String securityEmail;
        OneTimeCodeV5View oneTimeCodeV5View;
        OneTimeCodeV5View oneTimeCodeV5View2;
        LogInWithSmsFragment logInWithSmsFragment = this.f10594b;
        switch (this.f10593a) {
            case 0:
                int i7 = LogInWithSmsFragment.f26222C;
                String string = logInWithSmsFragment.getResources().getString(p025ba.k.core_return);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
                LogInActivity logInActivityW = logInWithSmsFragment.w();
                if (logInActivityW != null) {
                    logInActivityW.onBackPressed();
                }
                break;
            case 1:
                int i10 = LogInWithSmsFragment.f26222C;
                String string2 = logInWithSmsFragment.getResources().getString(F8.h.ac_modify_login_phone_number);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string2));
                if (TextUtils.isEmpty(logInWithSmsFragment.f26224B)) {
                    Bc.i iVar = logInWithSmsFragment.f26223A;
                    securityEmail = iVar != null ? ((OneTimeCodeV5View) iVar.f725c).getSecurityEmail() : null;
                } else {
                    securityEmail = logInWithSmsFragment.f26224B;
                }
                ActivityUtils.startActivity(VerifyAccountActivity.f26062o.getIntent(logInWithSmsFragment.getActivity(), SecurityVerifyMethodReq.UNLOGIN_CHANGE_PHONE, logInWithSmsFragment.v(), securityEmail));
                break;
            case 2:
                Bc.i iVar2 = logInWithSmsFragment.f26223A;
                if (iVar2 != null && (oneTimeCodeV5View = (OneTimeCodeV5View) iVar2.f725c) != null) {
                    oneTimeCodeV5View.q();
                    break;
                }
                break;
            case 3:
                int i11 = LogInWithSmsFragment.f26222C;
                n0.g().l("LoginOtpPopupWait");
                Bc.i iVar3 = logInWithSmsFragment.f26223A;
                if (iVar3 != null && (oneTimeCodeV5View2 = (OneTimeCodeV5View) iVar3.f725c) != null) {
                    oneTimeCodeV5View2.q();
                    break;
                }
                break;
            default:
                int i12 = LogInWithSmsFragment.f26222C;
                n0.g().l("LoginOtpPopupQuit");
                E activity = logInWithSmsFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
