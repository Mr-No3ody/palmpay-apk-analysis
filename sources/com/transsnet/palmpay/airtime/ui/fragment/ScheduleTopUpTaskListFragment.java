package com.transsnet.palmpay.airtime.ui.fragment;

import L6.b;
import Pd.c;
import Rd.b0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m9.s;
import m9.u;
import m9.v;
import o9.L;
import o9.X;
import p002a.a;
import p054dd.q;
import p140j8.f;
import p141j9.C1798f;
import p155k9.m;
import p155k9.n;
import p171lb.d;
import p173ld.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpTaskListFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/b0;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpTaskListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpTaskListFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpTaskListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n172#2,9:253\n115#3,8:262\n145#3:270\n115#3,8:272\n145#3:280\n1#4:271\n1761#5,3:281\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpTaskListFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpTaskListFragment\n*L\n47#1:253,9\n135#1:262,8\n135#1:270\n208#1:272,8\n208#1:280\n77#1:281,3\n*E\n"})
public final class ScheduleTopUpTaskListFragment extends BaseMvvmVBFragment<ScheduleTopUpViewModel, b0> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.b0 f26580o = a.h(this, G.a(L.class), new v(this, 0), new v(this, 1), new v(this, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f26581p = C2131j.b(new d(15));
    public final t t = C2131j.b(new d(16));

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        b0 b0Var = (b0) this.f27335j;
        if (b0Var != null) {
            b0Var.f8211c.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        b0 b0Var2 = (b0) this.f27335j;
        if (b0Var2 != null) {
            b0Var2.f8211c.addItemDecoration(new u());
        }
        b0 b0Var3 = (b0) this.f27335j;
        if (b0Var3 != null) {
            b0Var3.f8211c.setAdapter(v());
        }
        v().setOnItemClickListener(new s(this));
        m mVarV = v();
        if (mVarV != null) {
            mVarV.setOnItemChildClickListener(new s(this));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        l lVar = scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26645j : null;
        if (lVar != null) {
            lVar.e(this, new q(new m9.t(this, 1), 15));
        }
        androidx.lifecycle.b0 b0Var4 = this.f26580o;
        List list = (List) ((L) b0Var4.getValue()).f40122d.d();
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                v().setList(list);
            }
        }
        ((L) b0Var4.getValue()).f40122d.e(this, new p141j9.s(new C1798f(this, 9)));
        b0 b0Var5 = (b0) this.f27335j;
        if (b0Var5 != null) {
            b0Var5.f8210b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLineDark), getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp1), 0, 0);
        c1548f.f31337f = false;
        c1548f.f31336e = false;
        b0 b0Var6 = (b0) this.f27335j;
        if (b0Var6 != null) {
            b0Var6.f8210b.addItemDecoration(c1548f);
        }
        b0 b0Var7 = (b0) this.f27335j;
        if (b0Var7 != null) {
            b0Var7.f8210b.setAdapter(u());
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
        l lVar2 = scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26644i : null;
        if (lVar2 != null) {
            lVar2.e(this, new q(new m9.t(this, 0), 15));
        }
        b0 b0Var8 = (b0) this.f27335j;
        if (b0Var8 != null) {
            b0Var8.f8212d.setOnClickListener(new o(this, 2));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        if (scheduleTopUpViewModel != null) {
            scheduleTopUpViewModel.h();
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) this.f27333i;
        if (scheduleTopUpViewModel2 != null) {
            f.s(scheduleTopUpViewModel2, new X(1, null), scheduleTopUpViewModel2.f26644i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_airtime_schedule_manager, viewGroup, false);
        int i7 = c.adTopBanner;
        if (((SingleAdView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = c.ryFAQ;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = c.ryScheduleList;
                RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                if (recyclerView2 != null) {
                    i7 = c.tvAddNumbers;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        b0 b0Var = new b0((LinearLayout) viewInflate, recyclerView, recyclerView2, textView);
                        Intrinsics.checkNotNullExpressionValue(b0Var, "inflate(...)");
                        return b0Var;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final n u() {
        return (n) this.f26581p.getValue();
    }

    public final m v() {
        return (m) this.t.getValue();
    }
}
