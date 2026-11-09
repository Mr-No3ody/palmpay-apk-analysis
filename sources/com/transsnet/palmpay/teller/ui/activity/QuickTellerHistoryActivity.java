package com.transsnet.palmpay.teller.ui.activity;

import L6.b;
import N8.q0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.C0604u;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.teller.viewmodel.QuickTellerHistoryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "缴费/历史记录", path = "/quick_teller/record_list", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/QuickTellerHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/QuickTellerHistoryViewModel;", "LRd/u;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuickTellerHistoryActivity extends BaseMvvmVBActivity<QuickTellerHistoryViewModel, C0604u> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34230d = "0";

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_quick_teller_history, (ViewGroup) null, false);
        int i7 = c.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = c.title_bar;
            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
            if (ppTitleBar != null) {
                C0604u c0604u = new C0604u((LinearLayout) viewInflate, frameLayout, ppTitleBar);
                Intrinsics.checkNotNullExpressionValue(c0604u, "inflate(...)");
                return c0604u;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        C0604u c0604u = (C0604u) this.f27334c;
        if (c0604u != null) {
            PpTitleBar ppTitleBar = c0604u.f8524c;
            String str = p070ee.c.f36289a;
            ppTitleBar.setTitle(p070ee.c.c(this, this.f34230d) + getString(f.qt_space_history));
        }
        CommomHistoryFragment commomHistoryFragmentNewInstance = CommomHistoryFragment.f34200A.newInstance(this.f34230d);
        Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(c.fragmentContainer, commomHistoryFragmentNewInstance, null);
        c1161aE.h(false);
    }
}
