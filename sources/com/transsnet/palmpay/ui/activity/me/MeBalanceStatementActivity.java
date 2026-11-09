package com.transsnet.palmpay.ui.activity.me;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.p;
import L6.b;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.tabs.TabLayout;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p059e1.a;
import p171lb.d;
import p328ve.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "余额流水/Balance Statement", path = "/main/balance_statement")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/me/MeBalanceStatementActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/BalanceViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MeBalanceStatementActivity extends BaseMvvmActivity<BalanceViewModel> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34744g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f34745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34746d = C2131j.b(new d(2));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34747e = C2131j.b(new d(3));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f34748f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_palmpay_balance_statement, (ViewGroup) null, false);
        int i7 = e.tabLayout;
        TabLayout tabLayout = (TabLayout) a.m(i7, viewInflate);
        if (tabLayout != null) {
            i7 = e.viewPager;
            ViewPager viewPager = (ViewPager) a.m(i7, viewInflate);
            if (viewPager != null) {
                p pVar = new p((LinearLayout) viewInflate, tabLayout, viewPager, 0);
                this.f34745c = pVar;
                return pVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        p pVar = this.f34745c;
        if (pVar != null) {
            ((TabLayout) pVar.f812c).setupWithViewPager((ViewPager) pVar.f813d);
        }
        t tVar = this.f34746d;
        ArrayList arrayList = (ArrayList) tVar.getValue();
        MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
        arrayList.add(aVar.newInstance(""));
        ((ArrayList) tVar.getValue()).add(aVar.newInstance("C"));
        ((ArrayList) tVar.getValue()).add(aVar.newInstance("D"));
        t tVar2 = this.f34747e;
        ((ArrayList) tVar2.getValue()).add(getString(k.core_all));
        ((ArrayList) tVar2.getValue()).add(getString(h.main_money_in));
        ((ArrayList) tVar2.getValue()).add(getString(h.main_money_out));
        Z fm = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fm, "getSupportFragmentManager(...)");
        ArrayList fragments = (ArrayList) tVar.getValue();
        ArrayList titles = (ArrayList) tVar2.getValue();
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        Intrinsics.checkNotNullParameter(titles, "titles");
        l lVar = new l(fm, 1);
        lVar.f43185h = fragments;
        lVar.f43186i = titles;
        this.f34748f = lVar;
        p pVar2 = this.f34745c;
        if (pVar2 != null) {
            ((ViewPager) pVar2.f813d).setOffscreenPageLimit(2);
        }
        p pVar3 = this.f34745c;
        if (pVar3 != null) {
            ((ViewPager) pVar3.f813d).setAdapter(this.f34748f);
        }
    }
}
