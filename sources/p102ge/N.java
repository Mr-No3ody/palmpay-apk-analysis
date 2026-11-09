package p102ge;

import Pa.F;
import Pa.n0;
import android.content.Intent;
import android.text.TextUtils;
import android.window.SplashScreenView;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.custom_view.m;
import com.transsnet.palmpay.ui.activity.SplashActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeNewUserActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f37198b;

    public /* synthetic */ N(SplashActivity splashActivity, int i7) {
        this.f37197a = i7;
        this.f37198b = splashActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SplashActivity splashActivity = this.f37198b;
        switch (this.f37197a) {
            case 0:
                int i7 = SplashActivity.f34568g;
                splashActivity.getClass();
                if (NQEManager.INSTANCE.isNetworkOffline()) {
                    n0.g().v("open_the_app_without_internet");
                }
                n0.p(splashActivity.getIntent());
                splashActivity.f34572d = true;
                if (!BaseApplication.hasLogin()) {
                    splashActivity.g(TextUtils.isEmpty(a.d().g()) ? 2 : 3);
                } else {
                    splashActivity.g(1);
                }
                break;
            case 1:
                int i10 = SplashActivity.f34568g;
                splashActivity.getClass();
                if (!BaseApplication.hasLogin()) {
                    if (p059e1.a.D(0, "main_sp_welcome_new_user_show_count") > 0) {
                        SplashScreenView splashScreenView = splashActivity.f34574f;
                        if (splashScreenView != null) {
                            splashScreenView.remove();
                            splashActivity.f34574f = null;
                        }
                        WelcomeNewUserActivity.f35040i.start(splashActivity);
                    } else if (TextUtils.isEmpty(a.d().g()) && !d.t()) {
                        Intent intentA = F.a(splashActivity, p059e1.a.H("main_sp_welcome_new_user_link"));
                        if (intentA != null) {
                            SplashScreenView splashScreenView2 = splashActivity.f34574f;
                            if (splashScreenView2 != null) {
                                splashScreenView2.remove();
                                splashActivity.f34574f = null;
                            }
                            ActivityUtils.startActivity(intentA);
                        } else {
                            try {
                                Intent intent = new Intent();
                                intent.addFlags(268468224);
                                intent.setClassName(splashActivity, "com.transsnet.palmpay.account.ui.activity.SignUpActivityForSplash");
                                splashActivity.startActivity(intent);
                                splashActivity.overridePendingTransition(0, m.cv_anim_keep_activity);
                            } catch (Exception e10) {
                                F6.d.c("SplashActivity", "gotoSignUpPage: ", e10);
                                return;
                            }
                        }
                    }
                }
                splashActivity.h();
                break;
            case 2:
                int i11 = SplashActivity.f34568g;
                splashActivity.h();
                break;
            default:
                int i12 = SplashActivity.f34568g;
                splashActivity.h();
                break;
        }
    }
}
