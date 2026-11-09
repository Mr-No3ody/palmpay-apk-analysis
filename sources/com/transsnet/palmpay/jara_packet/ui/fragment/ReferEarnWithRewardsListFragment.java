package com.transsnet.palmpay.jara_packet.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.jara_packet.api.JaraPacketApiService;
import com.transsnet.palmpay.jara_packet.ui.model.ReferEarnFooterView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p236pc.b;
import p236pc.c;
import p236pc.e;
import p236pc.f;
import p294tb.C2055q;
import p295tc.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/fragment/ReferEarnWithRewardsListFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "a", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnWithRewardsListFragment extends BaseFragment {
    public static final a t = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f31957j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31956i = C2131j.b(new p325vb.a(this, 3));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31958o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f31959p = "";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ReferEarnWithRewardsListFragment newInstance(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            ReferEarnWithRewardsListFragment referEarnWithRewardsListFragment = new ReferEarnWithRewardsListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_data", id2);
            referEarnWithRewardsListFragment.setArguments(bundle);
            return referEarnWithRewardsListFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.jp_fragment_rv;
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
        String string;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("extra_data", "")) != null) {
            str = string;
        }
        this.f31959p = str;
        SwipeRecyclerView swipeRecyclerViewT = t();
        if (swipeRecyclerViewT != null && (recyclerView2 = swipeRecyclerViewT.getRecyclerView()) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        l lVar = new l();
        lVar.f42577a = context;
        lVar.f42578b = new ArrayList();
        this.f31957j = lVar;
        SwipeRecyclerView swipeRecyclerViewT2 = t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.setAdapter(this.f31957j);
        }
        SwipeRecyclerView swipeRecyclerViewT3 = t();
        if (swipeRecyclerViewT3 != null) {
            swipeRecyclerViewT3.setRefreshEnable(false);
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
        modelEmptyView.f31512c.setText(f.jp_history_invite_friends1);
        modelEmptyView.setBackgroundResource(c.jp_refer_earn_bg);
        SwipeRecyclerView swipeRecyclerViewT4 = t();
        if (swipeRecyclerViewT4 != null) {
            swipeRecyclerViewT4.setEmptyView(modelEmptyView);
        }
        SwipeRecyclerView swipeRecyclerViewT5 = t();
        if (swipeRecyclerViewT5 != null) {
            swipeRecyclerViewT5.setFooterView(new ReferEarnFooterView(requireContext()));
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.jp_invite_divider_line), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp19), getResources().getDimensionPixelOffset(q.dp19));
        c1548f.f31336e = false;
        SwipeRecyclerView swipeRecyclerViewT6 = t();
        if (swipeRecyclerViewT6 != null && (recyclerView = swipeRecyclerViewT6.getRecyclerView()) != null) {
            recyclerView.addItemDecoration(c1548f);
        }
        SwipeRecyclerView swipeRecyclerViewT7 = t();
        if (swipeRecyclerViewT7 != null) {
            swipeRecyclerViewT7.setLoadMoreEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT8 = t();
        if (swipeRecyclerViewT8 != null) {
            swipeRecyclerViewT8.setOnLoadListener(new p340wc.a(this));
        }
        return 0;
    }

    public final SwipeRecyclerView t() {
        return (SwipeRecyclerView) this.f31956i.getValue();
    }

    public final void u() {
        if (this.f31959p.length() == 0) {
            return;
        }
        ((JaraPacketApiService) p254qc.a.f41475a.f35518b).queryReferEarnRewards(this.f31959p).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 28));
    }
}
