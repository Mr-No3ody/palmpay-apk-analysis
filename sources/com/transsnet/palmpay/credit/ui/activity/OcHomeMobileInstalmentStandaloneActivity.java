package com.transsnet.palmpay.credit.ui.activity;

import Bc.p;
import N8.q0;
import Pa.i0;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.d;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.BarUtils;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p173ld.o;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC手机分期独立首页", path = "/credit_score/oc_home_mobile_installment_standalone_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/OcHomeMobileInstalmentStandaloneActivity;", "LZa/d;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcHomeMobileInstalmentStandaloneActivity extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28699e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f28700d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.h, com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.cs_activity_mobile_installment_standalone, (ViewGroup) null, false);
        int i7 = e.cs_mi_top_bg;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i10 = e.fragment_container;
            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i10, viewInflate);
            if (frameLayout != null) {
                i10 = e.statusView;
                if (((StatusBarView) p059e1.a.m(i10, viewInflate)) != null) {
                    i10 = e.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i10, viewInflate);
                    if (ppTitleBar != null) {
                        p pVar = new p(constraintLayout, frameLayout, ppTitleBar, 17);
                        this.f28700d = pVar;
                        return pVar;
                    }
                }
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (i7 >= 35) {
            initStatusBar(0, false);
        } else {
            super.initStatusBar();
            BarUtils.setStatusBarLightMode((Activity) this, false);
        }
    }

    public final void o() {
        Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
        if (activityIsActivityExistsInStack == null) {
            if (ActivityUtils.getActivityList().size() > 1) {
                finish();
                return;
            } else {
                i0.H(null);
                finish();
                return;
            }
        }
        Intent intent = activityIsActivityExistsInStack.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("action");
            Uri data = intent.getData();
            String queryParameter = data != null ? data.getQueryParameter("action") : null;
            if ("mobileInstallmentTab".equals(stringExtra) || "mobileInstallmentTab".equals(queryParameter)) {
                intent.removeExtra("action");
                Uri data2 = intent.getData();
                if (data2 != null && data2.getQueryParameter("action") != null) {
                    try {
                        Uri.Builder builderClearQuery = data2.buildUpon().clearQuery();
                        for (String str : data2.getQueryParameterNames()) {
                            if (!Intrinsics.c(str, "action")) {
                                Iterator<String> it = data2.getQueryParameters(str).iterator();
                                while (it.hasNext()) {
                                    builderClearQuery.appendQueryParameter(str, it.next());
                                }
                            }
                        }
                        intent.setData(builderClearQuery.build());
                    } catch (Exception unused) {
                    }
                }
            }
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        o();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        Eb.e.a(this, intent);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle != null) {
            return;
        }
        Object objNavigation = ARouter.getInstance().build("/credit_score/oc_home_mobile_installment_tab_fragment").navigation();
        Fragment fragment = objNavigation instanceof Fragment ? (Fragment) objNavigation : null;
        if (fragment == null) {
            return;
        }
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.fragment_container, fragment, "oc_home_mobile_installment");
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        p pVar = this.f28700d;
        if (pVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((PpTitleBar) pVar.f813d).setTitle(getString(g.cs_mi_standalone_activity_title));
        p pVar2 = this.f28700d;
        if (pVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ((PpTitleBar) pVar2.f813d).setBackButtonClickListener(new o(this, 27));
        p pVar3 = this.f28700d;
        if (pVar3 != null) {
            ((PpTitleBar) pVar3.f813d).getRightImageView1().setOnClickListener(new p054dd.d(29));
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }
}
