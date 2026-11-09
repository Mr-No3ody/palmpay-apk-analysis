package com.transsnet.palmpay.ui.fragment;

import Ac.f;
import Ae.j;
import C9.C0138e;
import C9.Q;
import Ce.j0;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.CommonListReq;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;
import p355xf.t;
import p370ye.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/PalmZoneTaskRewardsFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/PalmZoneViewModel;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmZoneTaskRewardsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmZoneTaskRewardsFragment.kt\ncom/transsnet/palmpay/ui/fragment/PalmZoneTaskRewardsFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n260#2,10:101\n296#2:111\n1#3:112\n*S KotlinDebug\n*F\n+ 1 PalmZoneTaskRewardsFragment.kt\ncom/transsnet/palmpay/ui/fragment/PalmZoneTaskRewardsFragment\n*L\n67#1:101,10\n67#1:111\n*E\n"})
public final class PalmZoneTaskRewardsFragment extends BaseMvvmFragment<PalmZoneViewModel> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f35232v = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f35233j = C2131j.b(new j(this, 7));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f35234o = C2131j.b(new Aa.a(18));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f35235p;
    public int t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PalmZoneTaskRewardsFragment newInstance() {
            return new PalmZoneTaskRewardsFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_palmpay_zone_reward;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        RecyclerView recyclerView;
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        List rewardsList = (List) this.f35234o.getValue();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rewardsList, "rewardsList");
        e eVar = new e();
        eVar.f44322a = context;
        eVar.f44323b = rewardsList;
        this.f35235p = eVar;
        SwipeRecyclerView swipeRecyclerViewT = t();
        if (swipeRecyclerViewT != null && (recyclerView = swipeRecyclerViewT.getRecyclerView()) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        SwipeRecyclerView swipeRecyclerViewT2 = t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.setRefreshEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT3 = t();
        if (swipeRecyclerViewT3 != null) {
            swipeRecyclerViewT3.setLoadMoreEnable(true);
        }
        SwipeRecyclerView swipeRecyclerViewT4 = t();
        if (swipeRecyclerViewT4 != null) {
            swipeRecyclerViewT4.setAdapter(this.f35235p);
        }
        SwipeRecyclerView swipeRecyclerViewT5 = t();
        if (swipeRecyclerViewT5 != null) {
            swipeRecyclerViewT5.setOnLoadListener(new j0(this));
        }
        SwipeRecyclerView swipeRecyclerViewT6 = t();
        if (swipeRecyclerViewT6 == null) {
            return 0;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        EmptyView emptyView = new EmptyView(contextRequireContext);
        emptyView.setTips("No History\n\n");
        emptyView.setIcon(r.cv_empty_no_giveaways);
        swipeRecyclerViewT6.setEmptyView(emptyView);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) this.f27333i;
        l lVar = palmZoneViewModel != null ? palmZoneViewModel.f35393j : null;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(4, this, this), (char) 0));
        }
        PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) this.f27333i;
        if (palmZoneViewModel2 != null) {
            palmZoneViewModel2.i(new CommonListReq());
        }
    }

    public final SwipeRecyclerView t() {
        return (SwipeRecyclerView) this.f35233j.getValue();
    }
}
