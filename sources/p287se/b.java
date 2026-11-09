package p287se;

import Ac.h;
import O6.c;
import O6.d;
import Pa.r0;
import Pe.C0545q;
import android.view.View;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.settings.DarkModeSettingActivity;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.viewmodule.DarkModeSettingViewModel;
import p025ba.k;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DarkModeSettingActivity f42244b;

    public /* synthetic */ b(DarkModeSettingActivity darkModeSettingActivity, int i7) {
        this.f42243a = i7;
        this.f42244b = darkModeSettingActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 4;
        DarkModeSettingActivity darkModeSettingActivity = this.f42244b;
        switch (this.f42243a) {
            case 0:
                d dVar = darkModeSettingActivity.f34951f;
                if (dVar == null || !dVar.isShowing()) {
                    c cVar = new c(darkModeSettingActivity);
                    cVar.f6596b = d.f(CommonViewExtKt.string(h.main_notifications, darkModeSettingActivity));
                    cVar.f6598d = "New settings will take effect after restarting PalmPay";
                    cVar.f6601g = CommonViewExtKt.string(k.core_cancel, darkModeSettingActivity);
                    cVar.f6603i = null;
                    b bVar = new b(darkModeSettingActivity, i7);
                    cVar.f6600f = "Restart";
                    cVar.f6602h = bVar;
                    darkModeSettingActivity.f34951f = cVar.g();
                }
                break;
            case 1:
                darkModeSettingActivity.f34949d = !darkModeSettingActivity.f34949d;
                darkModeSettingActivity.n();
                break;
            case 2:
                darkModeSettingActivity.f34949d = false;
                darkModeSettingActivity.f34950e = false;
                darkModeSettingActivity.n();
                break;
            case 3:
                darkModeSettingActivity.f34949d = false;
                darkModeSettingActivity.f34950e = true;
                darkModeSettingActivity.n();
                break;
            default:
                int i10 = DarkModeSettingActivity.f34948g;
                DarkModeSettingViewModel darkModeSettingViewModel = (DarkModeSettingViewModel) darkModeSettingActivity.l();
                if (!darkModeSettingActivity.f34949d) {
                    i7 = darkModeSettingActivity.f34950e ? 1 : 0;
                } else if (r0.J0(BaseApplication.get().getResources()) != 32) {
                    i7 = 3;
                }
                darkModeSettingViewModel.getClass();
                f.s(darkModeSettingViewModel, new C0545q(i7, null), darkModeSettingViewModel.f35363e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                if (!darkModeSettingActivity.f34949d) {
                    SPUtils.get().put("key_mode_night_yes", darkModeSettingActivity.f34950e);
                }
                SPUtils.get().put("key_mode_night_follow_system", darkModeSettingActivity.f34949d);
                BaseApplication.get().resetDarkMode();
                break;
        }
    }
}
