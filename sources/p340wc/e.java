package p340wc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.fragment.ReferEarnWithdrawListFragment;
import p236pc.f;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnWithdrawListFragment f43397a;

    public e(ReferEarnWithdrawListFragment referEarnWithdrawListFragment) {
        this.f43397a = referEarnWithdrawListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        ReferEarnWithdrawListFragment referEarnWithdrawListFragment = this.f43397a;
        int i7 = referEarnWithdrawListFragment.f31963o;
        if (i7 < referEarnWithdrawListFragment.f31964p) {
            referEarnWithdrawListFragment.f31963o = i7 + 1;
            referEarnWithdrawListFragment.u();
            return;
        }
        SwipeRecyclerView swipeRecyclerViewT = referEarnWithdrawListFragment.t();
        if (swipeRecyclerViewT != null) {
            swipeRecyclerViewT.c();
        }
        SwipeRecyclerView swipeRecyclerViewT2 = referEarnWithdrawListFragment.t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.b(referEarnWithdrawListFragment.getString(f.jp_history_invite_friends2));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
    }
}
