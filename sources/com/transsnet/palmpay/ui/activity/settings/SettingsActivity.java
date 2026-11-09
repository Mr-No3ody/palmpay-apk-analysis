package com.transsnet.palmpay.ui.activity.settings;

import Ac.e;
import Ac.f;
import Bc.p;
import C0.G;
import Fe.q0;
import L6.b;
import Pa.A;
import Pa.n0;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.settings.SettingsFragment;
import com.transsnet.palmpay.ui.mvp.contract.SettingsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p220oa.h;
import p270rd.C1976t;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "设置主页/Settings", path = "/main/settings")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/settings/SettingsActivity;", "Lcom/transsnet/palmpay/core/base/i;", "LFe/q0;", "Lcom/transsnet/palmpay/ui/mvp/contract/SettingsContract$View;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsActivity.kt\ncom/transsnet/palmpay/ui/activity/settings/SettingsActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,142:1\n562#2,10:143\n*S KotlinDebug\n*F\n+ 1 SettingsActivity.kt\ncom/transsnet/palmpay/ui/activity/settings/SettingsActivity\n*L\n49#1:143,10\n*E\n"})
public final class SettingsActivity extends i implements SettingsContract.View {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34971d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f34972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34973c = C2131j.b(new C1976t(11));

    public static void n(String str) {
        n0.g().k((ClickEvent) G.f("logout_login_popup_element_click", "element_name", str));
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.SettingsContract.View
    public final void handleLogoutRsp(CommonResult commonResult) {
        A.a();
        d.I(268468224, "/main/home");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_settings, (ViewGroup) null, false);
        int i7 = e.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = e.textViewLogout;
            PpButton ppButton = (PpButton) a.m(i7, viewInflate);
            if (ppButton != null) {
                p pVar = new p((LinearLayout) viewInflate, frameLayout, ppButton, 2);
                this.f34972b = pVar;
                return pVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new q0();
    }

    public final void m() {
        try {
            h.i(this, e.fragmentContainer, new SettingsFragment());
        } catch (Exception e10) {
            F6.d.c(this.TAG, "launchSettingsMainPage: ", e10);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().D(e.fragmentContainer) instanceof SettingsFragment) {
            super.onBackPressed();
        } else {
            m();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((Handler) this.f34973c.getValue()).removeCallbacksAndMessages(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        getWindow().getDecorView().post(new p7.h((Handler) this.f34973c.getValue(), 8, this, false));
    }
}
