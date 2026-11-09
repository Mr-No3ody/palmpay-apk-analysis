package com.transsnet.palmpay.betting.ui.activity;

import L6.b;
import Pd.c;
import Rd.C0591g;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p059e1.a;
import p068ec.d;
import p141j9.C1794b;
import p183m6.n;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import t9.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "LRd/g;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BettingHistoryActivity extends BaseMvvmVBActivity<BaseViewModel, C0591g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26658e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26659d = C2131j.b(new d(this, 13));

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(Pd.d.qt_activity_betting_history, (ViewGroup) null, false);
        int i7 = c.categroy_tabs;
        TabLayout tabLayout = (TabLayout) a.m(i7, viewInflate);
        if (tabLayout != null) {
            i7 = c.title_bar;
            if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                i7 = c.vp2_history;
                ViewPager2 viewPager2 = (ViewPager2) a.m(i7, viewInflate);
                if (viewPager2 != null) {
                    C0591g c0591g = new C0591g((LinearLayout) viewInflate, tabLayout, viewPager2);
                    Intrinsics.checkNotNullExpressionValue(c0591g, "inflate(...)");
                    return c0591g;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        boolean zB;
        TabLayout.Tab tabAt;
        View customView;
        TabLayout.Tab tabAt2;
        View customView2;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight), !isDarkMode());
        try {
            zB = n.f39523a.instance().b("featureBettingWithDraw", false);
        } catch (Throwable unused) {
            zB = false;
        }
        t tVar = this.f26659d;
        ((e) tVar.getValue()).f42360o = zB ? 2 : 1;
        C0591g c0591g = (C0591g) this.f27334c;
        if (c0591g != null) {
            c0591g.f8306c.setAdapter((e) tVar.getValue());
        }
        C0591g c0591g2 = (C0591g) this.f27334c;
        if (c0591g2 != null) {
            c0591g2.f8306c.setUserInputEnabled(true);
        }
        C0591g c0591g3 = (C0591g) this.f27334c;
        if (c0591g3 != null) {
            c0591g3.f8305b.removeAllTabs();
        }
        TextView textView = null;
        if (zB) {
            C0591g c0591g4 = (C0591g) this.f27334c;
            if (c0591g4 != null) {
                h.s(c0591g4.f8305b, true);
            }
            C0591g c0591g5 = (C0591g) this.f27334c;
            TabLayout tabLayout = c0591g5 != null ? c0591g5.f8305b : null;
            Intrinsics.e(tabLayout);
            C0591g c0591g6 = (C0591g) this.f27334c;
            ViewPager2 viewPager2 = c0591g6 != null ? c0591g6.f8306c : null;
            Intrinsics.e(viewPager2);
            new TabLayoutMediator(tabLayout, viewPager2, new C1794b(this, 24)).attach();
        } else {
            C0591g c0591g7 = (C0591g) this.f27334c;
            if (c0591g7 != null) {
                h.s(c0591g7.f8305b, false);
            }
        }
        C0591g c0591g8 = (C0591g) this.f27334c;
        if (c0591g8 != null) {
            c0591g8.f8306c.setCurrentItem(0);
        }
        C0591g c0591g9 = (C0591g) this.f27334c;
        TextView textView2 = (c0591g9 == null || (tabAt2 = c0591g9.f8305b.getTabAt(0)) == null || (customView2 = tabAt2.getCustomView()) == null) ? null : (TextView) customView2.findViewById(c.tvDeposit);
        C0591g c0591g10 = (C0591g) this.f27334c;
        if (c0591g10 != null && (tabAt = c0591g10.f8305b.getTabAt(1)) != null && (customView = tabAt.getCustomView()) != null) {
            textView = (TextView) customView.findViewById(c.tvWithdraw);
        }
        if (textView2 != null) {
            textView2.setSelected(true);
        }
        if (textView != null) {
            textView.setSelected(false);
        }
    }
}
