package com.transsnet.palmpay.airtime.ui.fragment;

import L6.b;
import Pd.c;
import Rd.a0;
import V8.w;
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
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.X;
import p059e1.a;
import p140j8.f;
import p141j9.s;
import p155k9.n;
import p171lb.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpGuideFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/a0;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpGuideFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpGuideFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpGuideFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,120:1\n115#2,8:121\n145#2:129\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpGuideFragment.kt\ncom/transsnet/palmpay/airtime/ui/fragment/ScheduleTopUpGuideFragment\n*L\n79#1:121,8\n79#1:129\n*E\n"})
public final class ScheduleTopUpGuideFragment extends BaseMvvmVBFragment<ScheduleTopUpViewModel, a0> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26579o = C2131j.b(new d(14));

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        a0 a0Var = (a0) this.f27335j;
        if (a0Var != null) {
            a0Var.f8206c.setOnClickListener(new p054dd.d(24));
        }
        a0 a0Var2 = (a0) this.f27335j;
        if (a0Var2 != null) {
            a0Var2.f8205b.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLineDark), getResources().getDimensionPixelOffset(q.dp1), CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(16));
        c1548f.f31337f = false;
        c1548f.f31336e = false;
        a0 a0Var3 = (a0) this.f27335j;
        if (a0Var3 != null) {
            a0Var3.f8205b.addItemDecoration(c1548f);
        }
        a0 a0Var4 = (a0) this.f27335j;
        if (a0Var4 != null) {
            a0Var4.f8205b.setAdapter(u());
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        l lVar = scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26644i : null;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 18), (char) 0));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) this.f27333i;
        if (scheduleTopUpViewModel != null) {
            f.s(scheduleTopUpViewModel, new X(1, null), scheduleTopUpViewModel.f26644i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_airtime_schedule_guide, viewGroup, false);
        int i7 = c.adTopBanner;
        if (((SingleAdView) a.m(i7, viewInflate)) != null) {
            i7 = c.ryFAQ;
            RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = c.tvAddNumbers;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    a0 a0Var = new a0((LinearLayout) viewInflate, recyclerView, textView);
                    Intrinsics.checkNotNullExpressionValue(a0Var, "inflate(...)");
                    return a0Var;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final n u() {
        return (n) this.f26579o.getValue();
    }
}
