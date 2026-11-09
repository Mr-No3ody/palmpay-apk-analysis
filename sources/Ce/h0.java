package Ce;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MeBalanceStatementFragment f1488a;

    public h0(MeBalanceStatementFragment meBalanceStatementFragment) {
        this.f1488a = meBalanceStatementFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        MeBalanceStatementFragment meBalanceStatementFragment = this.f1488a;
        int i7 = meBalanceStatementFragment.f35212C;
        if (i7 < meBalanceStatementFragment.f35216Q) {
            meBalanceStatementFragment.f35212C = i7 + 1;
            meBalanceStatementFragment.u();
            return;
        }
        SwipeRecyclerView swipeRecyclerViewT = meBalanceStatementFragment.t();
        if (swipeRecyclerViewT != null) {
            swipeRecyclerViewT.c();
        }
        SwipeRecyclerView swipeRecyclerViewT2 = meBalanceStatementFragment.t();
        if (swipeRecyclerViewT2 != null) {
            swipeRecyclerViewT2.b(meBalanceStatementFragment.getString(Ac.h.main_list_end));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        MeBalanceStatementFragment meBalanceStatementFragment = this.f1488a;
        meBalanceStatementFragment.f35212C = 1;
        meBalanceStatementFragment.u();
    }
}
