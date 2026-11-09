package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.i0;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/common_result")
public class CoreCommonResultActivity extends BaseActivity implements CoreCommonResultFragment.OnButtonActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27543f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27545i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27547o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27544g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27546j = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27548p = false;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p025ba.g.core_activity_common_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final void l(int i7, String str) {
        if (i7 == 1) {
            finish();
            return;
        }
        if (i7 == 2) {
            i0.H(null);
            return;
        }
        if (i7 == 3) {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.SettingsActivity");
            if (activityIsActivityExistsInStack != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                return;
            } else {
                i0.H(null);
                return;
            }
        }
        if (i7 == 4) {
            i0.I(str);
            return;
        }
        if (i7 != 5) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            i0.H(null);
            return;
        }
        Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack(str);
        if (activityIsActivityExistsInStack2 != null) {
            ActivityUtils.finishToActivity(activityIsActivityExistsInStack2, false);
        } else {
            i0.H(null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment.OnButtonActionListener
    public final void onButtonAction(int i7) {
        if (i7 == 1) {
            l(this.f27544g, this.f27545i);
        } else if (i7 == 2) {
            l(this.f27546j, this.f27547o);
        } else {
            i0.H(null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getResources().getColor(L6.b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        CoreCommonResultFragment coreCommonResultFragmentF = CoreCommonResultFragment.f(this.f27538a, this.f27539b, TextUtils.isEmpty(this.f27540c) ? null : this.f27540c, TextUtils.isEmpty(this.f27541d) ? null : this.f27541d, TextUtils.isEmpty(this.f27542e) ? null : this.f27542e, TextUtils.isEmpty(this.f27543f) ? null : this.f27543f, this.f27548p);
        androidx.fragment.app.Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(p025ba.e.fragmentContainer, coreCommonResultFragmentF, null);
        c1161aE.h(true);
    }
}
