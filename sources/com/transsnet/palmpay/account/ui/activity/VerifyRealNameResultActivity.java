package com.transsnet.palmpay.account.ui.activity;

import F8.d;
import F8.e;
import F8.h;
import L6.b;
import N8.q0;
import Pa.i0;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/verify_real_name_result")
public class VerifyRealNameResultActivity extends BaseActivity implements CoreCommonResultFragment.OnButtonActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26086b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26087c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ac_activity_verify_real_name_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment.OnButtonActionListener
    public final void onButtonAction(int i7) {
        if (i7 != 1) {
            if (i7 == 2) {
                finish();
                return;
            } else {
                i0.H(null);
                return;
            }
        }
        int i10 = this.f26085a;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                finish();
                return;
            }
            return;
        }
        if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity") != null) {
            finish();
            return;
        }
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
        if (activityIsActivityExistsInStack != null) {
            ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
        } else {
            finish();
        }
        q0.u("/main/bankCardAndAccount");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String string;
        String str;
        String str2;
        String string2;
        ARouter.getInstance().inject(this);
        initStatusBar(getResources().getColor(b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        String string3 = getResources().getString(h.ac_msg_real_name_auth_success_by_card);
        String string4 = getResources().getString(h.ac_go_banks_and_cards);
        String string5 = getResources().getString(k.core_complete);
        int i7 = this.f26085a;
        if (i7 != 1) {
            if (i7 == 2) {
                string3 = getResources().getString(h.ac_msg_real_name_auth_success_by_account);
                if (ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.core.ui.activity.AddNewBankAccountActivity") != null) {
                    string = getResources().getString(k.core_complete);
                    str = string;
                    str2 = "";
                }
            } else {
                if (i7 == 3) {
                    string = getResources().getString(k.core_complete);
                    string3 = getResources().getString(h.ac_msg_real_name_auth_success_by_bvn);
                } else if (i7 == 4) {
                    string = getResources().getString(k.core_complete);
                    string3 = getResources().getString(h.ac_msg_real_name_auth_success_by_id);
                    if (this.f26086b == 2) {
                        string = getString(h.ac_ok_i_know_it);
                    }
                }
                str = string;
                str2 = "";
            }
            if (!TextUtils.isEmpty(this.f26087c)) {
                string3 = this.f26087c;
            }
            String str3 = string3;
            string2 = getResources().getString(k.core_success_upper);
            if (this.f26086b == 2) {
                string2 = getResources().getString(k.core_pending_upper);
            }
            CoreCommonResultFragment coreCommonResultFragmentF = CoreCommonResultFragment.f(this.f26086b, 0, string2, str3, str, str2, true);
            Z supportFragmentManager = getSupportFragmentManager();
            C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
            c1161aE.e(d.fragmentContainer, coreCommonResultFragmentF, null);
            c1161aE.h(true);
        }
        string3 = getResources().getString(h.ac_msg_real_name_auth_success_by_card);
        str = string4;
        str2 = string5;
        if (!TextUtils.isEmpty(this.f26087c)) {
            string3 = this.f26087c;
        }
        String str4 = string3;
        string2 = getResources().getString(k.core_success_upper);
        if (this.f26086b == 2) {
            string2 = getResources().getString(k.core_pending_upper);
        }
        CoreCommonResultFragment coreCommonResultFragmentF2 = CoreCommonResultFragment.f(this.f26086b, 0, string2, str4, str, str2, true);
        Z supportFragmentManager2 = getSupportFragmentManager();
        C1161a c1161aE2 = q0.e(supportFragmentManager2, supportFragmentManager2);
        c1161aE2.e(d.fragmentContainer, coreCommonResultFragmentF2, null);
        c1161aE2.h(true);
    }
}
