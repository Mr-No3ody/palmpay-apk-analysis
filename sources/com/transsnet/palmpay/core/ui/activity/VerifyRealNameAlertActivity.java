package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.i0;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment;
import com.transsnet.palmpay.util.BarUtils;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/modify_real_name_alert")
public class VerifyRealNameAlertActivity extends BaseActivity implements CoreCommonResultFragment.OnButtonActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27728c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p025ba.g.core_activity_common_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.CoreCommonResultFragment.OnButtonActionListener
    public final void onButtonAction(int i7) {
        if (i7 == 1) {
            ARouter.getInstance().build("/account/verify_real_name").withInt("extra_type", this.f27727b).withString("extra_data", this.f27728c).navigation();
            finish();
        } else if (i7 == 2) {
            i0.H(null);
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
        CoreCommonResultFragment coreCommonResultFragmentF = CoreCommonResultFragment.f(3, 0, getResources().getString(p025ba.k.core_failed), this.f27726a, getResources().getString(p025ba.k.core_edit_your_name), getResources().getString(p025ba.k.core_cancel), false);
        androidx.fragment.app.Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(p025ba.e.fragmentContainer, coreCommonResultFragmentF, null);
        c1161aE.h(true);
    }
}
