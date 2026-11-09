package com.transsnet.palmpay.credit.ui.fragment;

import Ya.b;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p221ob.c;
import p355xf.C2131j;
import p355xf.t;
import p368yb.U;
import p382zb.C2168k;
import p382zb.k0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcReferEarnWithdrawListFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcReferEarnWithdrawListFragment extends BaseFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f30489o = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30490i = C2131j.b(new p325vb.a(this, 9));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public U f30491j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OcReferEarnWithdrawListFragment newInstance() {
            OcReferEarnWithdrawListFragment ocReferEarnWithdrawListFragment = new OcReferEarnWithdrawListFragment();
            ocReferEarnWithdrawListFragment.setArguments(new Bundle());
            return ocReferEarnWithdrawListFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_fragment_rv;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        u();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        SwipeRecyclerView swipeRecyclerViewT = t();
        if (swipeRecyclerViewT != null && (recyclerView2 = swipeRecyclerViewT.getRecyclerView()) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        U u6 = new U(context);
        Intrinsics.checkNotNullParameter(u6, "<set-?>");
        this.f30491j = u6;
        SwipeRecyclerView swipeRecyclerViewT2 = t();
        if (swipeRecyclerViewT2 != null) {
            U u10 = this.f30491j;
            if (u10 == null) {
                Intrinsics.n("mAdapter");
                throw null;
            }
            swipeRecyclerViewT2.setAdapter(u10);
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
        modelEmptyView.f31512c.setText(getString(g.cs_invite_frands_earn_mote));
        modelEmptyView.setBackgroundColor(getResources().getColor(p.transparent));
        SwipeRecyclerView swipeRecyclerViewT3 = t();
        if (swipeRecyclerViewT3 != null) {
            swipeRecyclerViewT3.setEmptyView(modelEmptyView);
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.cs_oc_refer_earn_line), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp19), getResources().getDimensionPixelOffset(q.dp19));
        c1548f.f31336e = false;
        SwipeRecyclerView swipeRecyclerViewT4 = t();
        if (swipeRecyclerViewT4 != null && (recyclerView = swipeRecyclerViewT4.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        SwipeRecyclerView swipeRecyclerViewT5 = t();
        if (swipeRecyclerViewT5 != null) {
            swipeRecyclerViewT5.setLoadMoreEnable(false);
        }
        SwipeRecyclerView swipeRecyclerViewT6 = t();
        if (swipeRecyclerViewT6 != null) {
            swipeRecyclerViewT6.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT7 = t();
        if (swipeRecyclerViewT7 != null) {
            swipeRecyclerViewT7.setOnLoadListener(new k0(this));
        }
        return 0;
    }

    public final SwipeRecyclerView t() {
        return (SwipeRecyclerView) this.f30490i.getValue();
    }

    public final void u() {
        c.f40268a.getInstance().getClass();
        c.a().queryWithdrawList().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2168k(this, 8));
    }
}
