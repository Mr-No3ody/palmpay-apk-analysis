package com.transsnet.palmpay.credit.ui.fragment;

import Jb.u;
import Ya.f;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmVBFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p099gb.j;
import p141j9.C1807o;
import p220oa.h;
import p287se.d;
import p327vd.c;
import p339wb.i;
import p369yd.e;
import p382zb.r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanRepaymentListFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmVBFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Lgb/j;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanRepaymentListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanRepaymentListFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanRepaymentListFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,317:1\n260#2,10:318\n296#2:328\n*S KotlinDebug\n*F\n+ 1 LoanRepaymentListFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanRepaymentListFragment\n*L\n93#1:318,10\n93#1:328\n*E\n"})
public final class LoanRepaymentListFragment extends CreditBaseMvvmVBFragment<OcHomeFinanceViewModel, j> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f30356w = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f30357o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f30358p;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f30359v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoanRepaymentListFragment newInstance() {
            LoanRepaymentListFragment loanRepaymentListFragment = new LoanRepaymentListFragment();
            loanRepaymentListFragment.setArguments(new Bundle());
            return loanRepaymentListFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
        l lVar = ocHomeFinanceViewModel != null ? ocHomeFinanceViewModel.f30910H : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new e(new r(this, this, 2), (char) 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        j jVar = (j) this.f27335j;
        if (jVar != null) {
            jVar.f37173e.setOnRefreshListener(new d(this, 28));
        }
        Context context = getContext();
        if (context != null) {
            this.f30358p = new i(new C1807o(this, 14));
            j jVar2 = (j) this.f27335j;
            if (jVar2 != null) {
                jVar2.f37172d.setLayoutManager(new LinearLayoutManager(context, 1, false));
            }
            j jVar3 = (j) this.f27335j;
            if (jVar3 != null) {
                jVar3.f37172d.setAdapter(this.f30358p);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.t = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            w();
        } else {
            v(false, false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(f.cs_fragment_loan_repayment_list, viewGroup, false);
        int i7 = Ya.e.emptyViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null && (viewM = p059e1.a.m((i7 = Ya.e.layout_rv_empty), viewInflate)) != null) {
            i7 = Ya.e.repaymentRv;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = Ya.e.srlRefresh;
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                if (swipeRefreshLayout != null) {
                    j jVar = new j((ConstraintLayout) viewInflate, viewStub, viewM, recyclerView, swipeRefreshLayout);
                    Intrinsics.checkNotNullExpressionValue(jVar, "inflate(...)");
                    return jVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void u(boolean z3) {
        Fragment parentFragment = getParentFragment();
        LoanHomeFragment loanHomeFragment = parentFragment instanceof LoanHomeFragment ? (LoanHomeFragment) parentFragment : null;
        if (loanHomeFragment == null || !loanHomeFragment.f30341C) {
            return;
        }
        loanHomeFragment.f30341C = false;
        if (z3) {
            ViewPager2 viewPager2 = (ViewPager2) loanHomeFragment.f30344M.getValue();
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(0, false);
            }
            loanHomeFragment.refreshLoanHomeData(false);
        }
    }

    public final void v(boolean z3, boolean z8) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z8 || jElapsedRealtime - this.f30359v >= 500) {
            this.f30359v = jElapsedRealtime;
            OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) this.f27333i;
            if (ocHomeFinanceViewModel == null) {
                x();
            } else {
                p140j8.f.s(ocHomeFinanceViewModel, new u(1, null), ocHomeFinanceViewModel.f30910H, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : z3, (28 & 16) == 0);
            }
        }
    }

    public final void w() {
        View viewInflate;
        j jVar = (j) this.f27335j;
        if (jVar != null) {
            jVar.f37172d.setVisibility(8);
        }
        j jVar2 = (j) this.f27335j;
        if (jVar2 != null) {
            jVar2.f37171c.setVisibility(8);
        }
        if (this.t == null) {
            j jVar3 = (j) this.f27335j;
            if (jVar3 == null || (viewInflate = jVar3.f37170b.inflate()) == null) {
                viewInflate = null;
            } else {
                viewInflate.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_rect_corner_12_bg_white);
                h.j(viewInflate, Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(16.0f)), Integer.valueOf(CommonViewExtKt.getDp(96.0f)));
                View viewFindViewById = viewInflate.findViewById(Ya.e.rtvRefresh);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new c(this, 19));
                }
            }
            this.t = viewInflate;
        }
        View view = this.t;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void x() {
        SwipeRefreshLayout swipeRefreshLayout;
        j jVar = (j) this.f27335j;
        if (jVar != null && (swipeRefreshLayout = jVar.f37173e) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        showLoadingDialog(false);
    }
}
