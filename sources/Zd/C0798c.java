package Zd;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import com.transsnet.palmpay.teller.ui.fragment.BaseBillerHistoryFragment;
import com.transsnet.palmpay.teller.viewmodel.BillerHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p086fe.G0;

/* JADX INFO: renamed from: Zd.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0798c implements OnLoadMoreListener, SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseBillerHistoryFragment f11656a;

    public /* synthetic */ C0798c(BaseBillerHistoryFragment baseBillerHistoryFragment) {
        this.f11656a = baseBillerHistoryFragment;
    }

    @Override // com.chad.library.adapter.base.listener.OnLoadMoreListener
    public void onLoadMore() {
        BillerHistoryViewModel billerHistoryViewModel;
        com.transsnet.palmpay.core.base.l lVar;
        int i7 = BaseBillerHistoryFragment.f34252v;
        BaseBillerHistoryFragment baseBillerHistoryFragment = this.f11656a;
        BillerHistoryViewModel billerHistoryViewModel2 = (BillerHistoryViewModel) baseBillerHistoryFragment.f27333i;
        if (Intrinsics.c((billerHistoryViewModel2 == null || (lVar = billerHistoryViewModel2.f34418e) == null) ? null : (com.transsnet.palmpay.core.base.q) lVar.d(), com.transsnet.palmpay.core.base.o.f27359a) || (billerHistoryViewModel = (BillerHistoryViewModel) baseBillerHistoryFragment.f27333i) == null) {
            return;
        }
        String strV = baseBillerHistoryFragment.v();
        int i10 = baseBillerHistoryFragment.t + 1;
        baseBillerHistoryFragment.t = i10;
        HistoryOrderReq req = new HistoryOrderReq(strV, i10, ((Number) baseBillerHistoryFragment.f34254p.getValue()).intValue());
        Intrinsics.checkNotNullParameter(req, "req");
        G0 g7 = new G0(req, null);
        Boolean bool = Boolean.FALSE;
        com.transsnet.palmpay.core.base.l lVar2 = billerHistoryViewModel.f34418e;
        lVar2.f27356m = bool;
        Unit unit = Unit.f38893a;
        p140j8.f.v(billerHistoryViewModel, g7, lVar2, 0L);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        int i7 = BaseBillerHistoryFragment.f34252v;
        this.f11656a.x();
    }
}
