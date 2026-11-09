package p382zb;

import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithdrawListFragment;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcReferEarnWithdrawListFragment f44598a;

    public k0(OcReferEarnWithdrawListFragment ocReferEarnWithdrawListFragment) {
        this.f44598a = ocReferEarnWithdrawListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        OcReferEarnWithdrawListFragment.a aVar = OcReferEarnWithdrawListFragment.f30489o;
        this.f44598a.u();
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
    }
}
