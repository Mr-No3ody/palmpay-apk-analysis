package com.transsnet.palmpay.ui.fragment.settings;

import Ab.ViewOnClickListenerC0053e;
import Ac.f;
import Ac.h;
import Pa.C0521s;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.E;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.ui.view.SettingItem;
import com.transsnet.palmpay.util.SPUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p038ca.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/settings/LoginSettingsFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoginSettingsFragment extends BaseFragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f35263B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SettingItem f35264A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p131id.a f35265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f35266j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SettingItem f35267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SettingItem f35268p;
    public SettingItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SettingItem f35269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SettingItem f35270w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getAutoLogoutGuideFlag() {
            return SPUtils.getInstance().getBoolean("PATTERN_PIN_SETTING_GUIDE", true);
        }

        private a() {
        }
    }

    public LoginSettingsFragment() {
        new e(this, null, null);
        this.f35266j = new e(this, null, null);
        new e(this, null, null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_login_settings;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f35265i = new p131id.a(getContext());
        SettingItem settingItem = (SettingItem) this.f27318b.findViewById(Ac.e.key_device);
        this.f35269v = settingItem;
        if (settingItem != null) {
            settingItem.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem2 = (SettingItem) this.f27318b.findViewById(Ac.e.key_auto_logout_setting);
        this.f35264A = settingItem2;
        if (settingItem2 != null) {
            settingItem2.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem3 = this.f35264A;
        if (settingItem3 != null) {
            settingItem3.c(f35263B.getAutoLogoutGuideFlag());
        }
        SettingItem settingItem4 = (SettingItem) this.f27318b.findViewById(Ac.e.key_set_psw);
        this.t = settingItem4;
        if (settingItem4 != null) {
            settingItem4.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem5 = (SettingItem) this.f27318b.findViewById(Ac.e.key_reset_psw);
        this.f35267o = settingItem5;
        if (settingItem5 != null) {
            settingItem5.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem6 = (SettingItem) this.f27318b.findViewById(Ac.e.key_change_psw);
        this.f35268p = settingItem6;
        if (settingItem6 != null) {
            settingItem6.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem7 = (SettingItem) this.f27318b.findViewById(Ac.e.key_touchId_for_login);
        this.f35270w = settingItem7;
        if (settingItem7 != null) {
            settingItem7.setOnCheckedChangeListener(this);
        }
        SettingItem settingItem8 = this.f35270w;
        if (settingItem8 == null) {
            return 0;
        }
        settingItem8.setChecked(n.v());
        return 0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        int i7 = 1;
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        p131id.a aVar = this.f35265i;
        if (aVar != null && !aVar.W()) {
            C0521s c0521s = C0521s.f7158a;
            C0521s.i(getContext());
            return;
        }
        try {
            Intent intentQ = i0.q(getActivity());
            intentQ.putExtra("extra_mode", z3 ? 1 : 0);
            intentQ.putExtra("extra_scene", "_scene_login_with_touch");
            intentQ.putExtra("_encrypt", z3);
            intentQ.putExtra("extra_use_night_mode", true);
            if (z3) {
                this.f35266j.f(intentQ, new A8.a(this, 29));
                return;
            }
            Context context = getContext();
            if (context != null) {
                De.a aVar2 = new De.a(this, 0);
                int i10 = k.core_later;
                n.O(context, 0, null, "Disable Touch ID Login?", null, null, null, "Are you sure you want to disable fingerprint login?", Integer.valueOf(i10), null, new De.a(this, i7), null, "Disable", aVar2, null, true, 0, 8292987);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        SettingItem settingItem = this.f35268p;
        if (Intrinsics.c(numValueOf, settingItem != null ? Integer.valueOf(settingItem.getId()) : null)) {
            if (t()) {
                d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_CHANGE_PASSWORD);
                return;
            }
            return;
        }
        SettingItem settingItem2 = this.f35267o;
        if (Intrinsics.c(numValueOf, settingItem2 != null ? Integer.valueOf(settingItem2.getId()) : null)) {
            if (t()) {
                d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD);
                return;
            }
            return;
        }
        SettingItem settingItem3 = this.t;
        if (Intrinsics.c(numValueOf, settingItem3 != null ? Integer.valueOf(settingItem3.getId()) : null)) {
            if (t()) {
                if (BaseApplication.get().getUser().isLoginPswSet()) {
                    E activity = getActivity();
                    if (activity != null) {
                        n.O(activity, 0, Integer.valueOf(h.main_set_psw), null, null, null, null, "Do you want to enable USSD Password for logging into PalmPay?", Integer.valueOf(k.core_enable), null, new De.a(this, 2), null, null, null, null, false, 0, 8387197);
                        return;
                    }
                    return;
                }
                E activity2 = getActivity();
                if (activity2 != null) {
                    n.O(activity2, 0, Integer.valueOf(h.main_set_psw), null, null, null, null, "Setting up a Password for PalmPay login and USSD service to enhance account security", Integer.valueOf(k.core_continue), null, new De.a(this, 3), null, null, null, null, false, 0, 8387197);
                    return;
                }
                return;
            }
            return;
        }
        SettingItem settingItem4 = this.f35269v;
        if (Intrinsics.c(numValueOf, settingItem4 != null ? Integer.valueOf(settingItem4.getId()) : null)) {
            d.F("/account/device/list");
            n0.g().l("Settings_Click_Manage_device");
            return;
        }
        SettingItem settingItem5 = this.f35264A;
        if (Intrinsics.c(numValueOf, settingItem5 != null ? Integer.valueOf(settingItem5.getId()) : null)) {
            SPUtils.getInstance().put("PATTERN_PIN_SETTING_GUIDE", false);
            d.F("/account/settinglockpin");
            n0.g().l("PalmPay_AutologoutSettingClick");
        } else {
            SettingItem settingItem6 = this.f35269v;
            if (Intrinsics.c(numValueOf, settingItem6 != null ? Integer.valueOf(settingItem6.getId()) : null)) {
                d.F("/account/device/list");
                n0.g().l("Settings_Click_Manage_device");
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SettingItem settingItem = this.f35264A;
        if (settingItem != null) {
            settingItem.c(f35263B.getAutoLogoutGuideFlag());
        }
        User user = BaseApplication.get().getUser();
        if (user != null) {
            boolean z3 = user.isLoginPswSet() && user.isLoginPswEnabled();
            SettingItem settingItem2 = this.f35267o;
            if (settingItem2 != null) {
                p220oa.h.s(settingItem2, z3);
            }
            SettingItem settingItem3 = this.f35268p;
            if (settingItem3 != null) {
                p220oa.h.s(settingItem3, z3);
            }
            SettingItem settingItem4 = this.t;
            if (settingItem4 != null) {
                p220oa.h.s(settingItem4, !z3);
            }
        }
    }

    public final boolean t() {
        if (BaseApplication.get().getUser().isAuthen()) {
            return true;
        }
        E activity = getActivity();
        if (activity == null) {
            return false;
        }
        n.O(activity, 0, null, "Verify BVN/NIN", null, null, null, "Please authenticate BVN or NIN first, then you can set the password", null, "Verify", new ViewOnClickListenerC0053e(9), Integer.valueOf(k.core_later), null, null, null, false, 0, 8384891);
        return false;
    }
}
