package p382zb;

import com.transsnet.palmpay.credit.ui.fragment.OcReferEarnWithRewardsListFragment;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcReferEarnWithRewardsListFragment f44595a;

    public j0(OcReferEarnWithRewardsListFragment ocReferEarnWithRewardsListFragment) {
        this.f44595a = ocReferEarnWithRewardsListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        OcReferEarnWithRewardsListFragment.a aVar = OcReferEarnWithRewardsListFragment.f30486o;
        this.f44595a.u();
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
    }
}
