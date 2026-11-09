package com.transsnet.palmpay.ui.fragment.settings;

import Ac.e;
import Ac.f;
import F6.d;
import Fe.q0;
import Pa.AbstractC0520q;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.app.M;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import com.transsnet.palmpay.account.bean.rsp.NotificationSettings;
import com.transsnet.palmpay.account.bean.rsp.SettingSwitchRsp;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.ui.activity.MerchantPaymentListActivity;
import com.transsnet.palmpay.ui.activity.settings.SubSettingsActivity;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import com.transsnet.palmpay.ui.view.SettingItem;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p183m6.n;
import p220oa.h;
import p367ya.a;
import p367ya.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/settings/SettingsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/q0;", "Lcom/transsnet/palmpay/ui/mvp/contract/SettingsContract$View;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SettingsFragment extends BaseMVPFragment<q0> implements SettingsContract.View, View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SettingItem f35281A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SettingItem f35282B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SettingItem f35283C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f35284H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SettingItem f35285j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SettingItem f35286o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SettingItem f35287p;
    public SettingItem t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SettingItem f35288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SettingItem f35289w;

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_settings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleNotificationSettings(CommonBeanResult commonBeanResult) {
        NotificationSettings notificationSettings;
        if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
            SettingItem settingItem = this.t;
            if (settingItem != null) {
                h.C(settingItem);
                return;
            }
            return;
        }
        if (commonBeanResult == null || (notificationSettings = (NotificationSettings) commonBeanResult.data) == null || !notificationSettings.isNotificationAllEnabled()) {
            SettingItem settingItem2 = this.t;
            if (settingItem2 != null) {
                h.C(settingItem2);
                return;
            }
            return;
        }
        SettingItem settingItem3 = this.t;
        if (settingItem3 != null) {
            h.c(settingItem3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleSettingSwitchRsp(CommonBeanResult rsp) {
        Intrinsics.checkNotNullParameter(rsp, "rsp");
        if ((rsp != null ? (SettingSwitchRsp) rsp.data : null) != null) {
            boolean zIsShowMerchants = ((SettingSwitchRsp) rsp.data).isShowMerchants();
            boolean zIsShowLoginAuthorization = ((SettingSwitchRsp) rsp.data).isShowLoginAuthorization();
            d.h("settingSwitchRsp", 3, "onSuccess: " + zIsShowMerchants + " " + zIsShowLoginAuthorization);
            boolean zIsShowTeen = ((SettingSwitchRsp) rsp.data).isShowTeen();
            if (this.f35281A == null) {
                SettingItem settingItem = (SettingItem) this.f27318b.findViewById(e.key_login_author);
                this.f35281A = settingItem;
                if (settingItem != null) {
                    settingItem.setOnPreferenceClickListener(this);
                }
            }
            if (this.f35289w == null) {
                SettingItem settingItem2 = (SettingItem) this.f27318b.findViewById(e.key_merchant);
                this.f35289w = settingItem2;
                if (settingItem2 != null) {
                    settingItem2.setOnPreferenceClickListener(this);
                }
            }
            SettingItem settingItem3 = this.f35282B;
            if (settingItem3 != null) {
                settingItem3.setVisibility(zIsShowTeen ? 0 : 8);
            }
            SettingItem settingItem4 = this.f35282B;
            if (settingItem4 != null) {
                settingItem4.setOnPreferenceClickListener(this);
            }
            SettingItem settingItem5 = this.f35283C;
            if (settingItem5 != null) {
                settingItem5.setVisibility(((SettingSwitchRsp) rsp.data).isShowGuardian() ? 0 : 8);
            }
            SettingItem settingItem6 = this.f35283C;
            if (settingItem6 != null) {
                settingItem6.setOnPreferenceClickListener(this);
            }
            SettingItem settingItem7 = this.f35281A;
            if (settingItem7 != null) {
                settingItem7.f35333e.setVisibility(zIsShowMerchants ? 0 : 8);
            }
            SettingItem settingItem8 = this.f35281A;
            if (settingItem8 != null) {
                settingItem8.setVisibility(zIsShowLoginAuthorization ? 0 : 8);
            }
            SettingItem settingItem9 = this.f35289w;
            if (settingItem9 != null) {
                settingItem9.f35333e.setVisibility(8);
            }
            SettingItem settingItem10 = this.f35289w;
            if (settingItem10 != null) {
                settingItem10.setVisibility(zIsShowMerchants ? 0 : 8);
            }
            boolean z3 = zIsShowMerchants || zIsShowLoginAuthorization;
            View view = this.f35284H;
            if (view != null) {
                view.setVisibility(z3 ? 0 : 8);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        boolean zB;
        SettingItem settingItem = (SettingItem) this.f27318b.findViewById(e.key_login_setting);
        if (settingItem != null) {
            settingItem.setOnPreferenceClickListener(this);
        }
        boolean z3 = SPUtils.getInstance().getBoolean("PAYMENT_METHODE_GUIDE", true);
        SettingItem settingItem2 = (SettingItem) this.f27318b.findViewById(e.key_pay_set);
        this.f35285j = settingItem2;
        if (settingItem2 != null) {
            settingItem2.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem3 = this.f35285j;
        if (settingItem3 != null) {
            settingItem3.c(z3);
        }
        this.f35286o = (SettingItem) this.f27318b.findViewById(e.key_dark_mode);
        if (r0.V0()) {
            string = getString(Ac.h.main_automatic);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            string = r0.Z0() ? "Dark" : "Light";
        }
        SettingItem settingItem4 = this.f35286o;
        if (settingItem4 != null) {
            settingItem4.setSummary(string);
        }
        SettingItem settingItem5 = this.f35286o;
        if (settingItem5 != null) {
            settingItem5.setOnPreferenceClickListener(this);
        }
        this.f27318b.findViewById(e.layoutDarkMode).setVisibility(r0.T0() && (!AbstractC0520q.f7143i || AbstractC0520q.f7138d != 28) ? 0 : 8);
        SettingItem settingItem6 = (SettingItem) this.f27318b.findViewById(e.key_about);
        this.f35287p = settingItem6;
        if (settingItem6 != null) {
            settingItem6.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem7 = this.f35287p;
        if (settingItem7 != null) {
            settingItem7.c(b.b());
        }
        SettingItem settingItem8 = (SettingItem) this.f27318b.findViewById(e.key_close_account);
        if (settingItem8 != null) {
            settingItem8.setOnPreferenceClickListener(this);
        }
        try {
            zB = n.f39523a.instance().b("featureCloseAccount", true);
        } catch (Exception unused) {
            zB = false;
        }
        if (!zB) {
            this.f27318b.findViewById(e.layoutCloseAccount).setVisibility(8);
        }
        SettingItem settingItem9 = (SettingItem) this.f27318b.findViewById(e.key_sms_subscribe);
        if (settingItem9 != null) {
            settingItem9.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem10 = (SettingItem) this.f27318b.findViewById(e.key_notification_setting);
        this.t = settingItem10;
        if (settingItem10 != null) {
            settingItem10.setOnPreferenceClickListener(this);
        }
        if (new M(requireContext()).f15943b.areNotificationsEnabled()) {
            SettingItem settingItem11 = this.t;
            if (settingItem11 != null) {
                h.c(settingItem11);
            }
        } else {
            SettingItem settingItem12 = this.t;
            if (settingItem12 != null) {
                h.C(settingItem12);
            }
        }
        SettingItem settingItem13 = (SettingItem) this.f27318b.findViewById(e.key_email_alert_settings);
        if (settingItem13 != null) {
            settingItem13.setOnPreferenceClickListener(this);
        }
        SettingItem settingItem14 = (SettingItem) this.f27318b.findViewById(e.key_speaker_on);
        this.f35288v = settingItem14;
        if (settingItem14 != null) {
            settingItem14.setChecked(a.d().f44149a.getBoolean("key_speaker_on", false));
        }
        SettingItem settingItem15 = this.f35288v;
        if (settingItem15 != null) {
            settingItem15.setOnCheckedChangeListener(this);
        }
        View viewFindViewById = this.f27318b.findViewById(e.layoutMerchantSettings);
        this.f35284H = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        SettingItem settingItem16 = (SettingItem) this.f27318b.findViewById(e.key_minor_account_management);
        this.f35282B = settingItem16;
        if (settingItem16 != null) {
            settingItem16.setVisibility(8);
        }
        SettingItem settingItem17 = (SettingItem) this.f27318b.findViewById(e.key_minor_guardian);
        this.f35283C = settingItem17;
        if (settingItem17 != null) {
            settingItem17.setVisibility(8);
        }
        return 0;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        a.d().f44149a.k("key_speaker_on", z3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        if (id2 == e.key_login_setting) {
            SubSettingsActivity.a aVar = SubSettingsActivity.f34974b;
            E activity = getActivity();
            Intrinsics.e(activity);
            aVar.launch(activity, "4");
            return;
        }
        if (id2 == e.key_pay_set) {
            SPUtils.getInstance().put("PAYMENT_METHODE_GUIDE", false);
            User user = BaseApplication.getInstance().getUser();
            if (user != null && user.shouldApplyForBalance()) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/ask_apply_for_balance");
                return;
            }
            SubSettingsActivity.a aVar2 = SubSettingsActivity.f34974b;
            E activity2 = getActivity();
            Intrinsics.e(activity2);
            aVar2.launch(activity2, "1");
            n0.g().l("Settings_Click_Payment_settings");
            return;
        }
        if (id2 == e.key_about) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/main/about");
            n0.g().l("Settings_Click_About_PalmPay");
            return;
        }
        if (id2 == e.key_dark_mode) {
            N8.q0.u("/main/dark_mode_setting");
            return;
        }
        if (id2 == e.key_merchant) {
            E activity3 = getActivity();
            int i7 = MerchantPaymentListActivity.f34496d;
            activity3.startActivity(new Intent(activity3, (Class<?>) MerchantPaymentListActivity.class));
            return;
        }
        if (id2 == e.key_login_author) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoginAuthorManagementHome");
            return;
        }
        if (id2 == e.key_notification_setting) {
            com.palmpay.lib.apm.launchcounter.util.d.y("NotificationSettings", "sceneCode", 6);
            return;
        }
        if (id2 == e.key_email_alert_settings) {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "EmailAlertSettings");
            return;
        }
        if (id2 == e.key_close_account) {
            i0.b0("/close-account/home");
            return;
        }
        if (id2 == e.key_sms_subscribe) {
            i0.b0("/single-page/sms-alert-subscribe/home");
        } else if (id2 == e.key_minor_account_management) {
            N8.q0.u("/main/minor_account_list");
        } else if (id2 == e.key_minor_guardian) {
            N8.q0.u("/main/minor_account_guardian");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean z3 = SPUtils.getInstance().getBoolean("PAYMENT_METHODE_GUIDE", true);
        SettingItem settingItem = this.f35285j;
        if (settingItem != null) {
            settingItem.c(z3);
        }
        q0 q0Var = (q0) this.f27328i;
        if (q0Var != null) {
            q0Var.querySettingSwitch();
        }
        if (new M(requireContext()).f15943b.areNotificationsEnabled()) {
            q0 q0Var2 = (q0) this.f27328i;
            if (q0Var2 != null) {
                q0Var2.queryNotificationSetting();
                return;
            }
            return;
        }
        SettingItem settingItem2 = this.t;
        if (settingItem2 != null) {
            h.C(settingItem2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new q0();
    }
}
