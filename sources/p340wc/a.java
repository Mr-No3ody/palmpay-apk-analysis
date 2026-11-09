package p340wc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithRewardsListFragment;
import p236pc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithRewardsListFragment f43388a;

    public a(ReferEarnWithRewardsListFragment referEarnWithRewardsListFragment) {
        this.f43388a = referEarnWithRewardsListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        ReferEarnWithRewardsListFragment referEarnWithRewardsListFragment = this.f43388a;
        int i7 = referEarnWithRewardsListFragment.f31958o;
        if (i7 < 0) {
            referEarnWithRewardsListFragment.f31958o = i7 + 1;
            referEarnWithRewardsListFragment.u();
            return;
        }
        SwipeRecyclerView swipeRecyclerViewT = referEarnWithRewardsListFragment.t();
        if (swipeRecyclerViewT != null) {
            swipeRecyclerViewT.c();
        }
        SwipeRecyclerView swipeRecyclerViewT2 = referEarnWithRewardsListFragment.t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.b(referEarnWithRewardsListFragment.getString(f.jp_history_invite_friends1));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
    }
}
