package com.transsnet.palmpay.credit.ui.activity.cashloan;

import L6.b;
import N8.q0;
import Ya.e;
import Ya.f;
import Za.d;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit二级首页", path = "/credit_score/oc_main_second_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLSecondMainActivity;", "LZa/d;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLSecondMainActivity extends d {
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_main_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        F6.d.h(this.TAG, 3, "setupView >>>");
        initStatusBar(getColor(b.ppColorBackgroundDark));
        BarUtils.setStatusBarLightMode(this, !isDarkMode());
        if (com.facebook.imagepipeline.nativecode.b.G(null)) {
            finish();
            return;
        }
        Object objNavigation = ARouter.getInstance().build("/main/home_tab_finance").withBoolean("showBackImg", true).navigation();
        Intrinsics.f(objNavigation, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.cl_main_root_fl, (Fragment) objNavigation, null);
        c1161aE.h(true);
    }
}
