package De;

import Pa.i0;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.ui.fragment.settings.LoginSettingsFragment;
import com.transsnet.palmpay.ui.view.SettingItem;
import io.fastkv.n;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginSettingsFragment f1865b;

    public /* synthetic */ a(LoginSettingsFragment loginSettingsFragment, int i7) {
        this.f1864a = i7;
        this.f1865b = loginSettingsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p038ca.e f28604i;
        LoginSettingsFragment loginSettingsFragment = this.f1865b;
        switch (this.f1864a) {
            case 0:
                LoginSettingsFragment.a aVar = LoginSettingsFragment.f35263B;
                n.M(false);
                D3.a.N("disable", "success", null);
                SettingItem settingItem = loginSettingsFragment.f35270w;
                if (settingItem != null) {
                    settingItem.setChecked(false);
                }
                break;
            case 1:
                SettingItem settingItem2 = loginSettingsFragment.f35270w;
                if (settingItem2 != null) {
                    settingItem2.setChecked(true);
                }
                break;
            case 2:
                LoginSettingsFragment.a aVar2 = LoginSettingsFragment.f35263B;
                Intent intentQ = i0.q(loginSettingsFragment.getActivity());
                intentQ.putExtra("extra_mode", 4);
                intentQ.putExtra("extra_type", 2);
                BaseActivity baseActivity = (BaseActivity) loginSettingsFragment.getActivity();
                if (baseActivity != null && (f28604i = baseActivity.getF28604i()) != null) {
                    f28604i.f(intentQ, new B8.d(3));
                    break;
                }
                break;
            default:
                LoginSettingsFragment.a aVar3 = LoginSettingsFragment.f35263B;
                if (loginSettingsFragment.t()) {
                    com.palmpay.lib.apm.launchcounter.util.d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD);
                    break;
                }
                break;
        }
    }
}
