package Cd;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MoneyTransferHistoryFragment f1369a;

    public j(MoneyTransferHistoryFragment moneyTransferHistoryFragment) {
        this.f1369a = moneyTransferHistoryFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        MoneyTransferHistoryFragment moneyTransferHistoryFragment = this.f1369a;
        moneyTransferHistoryFragment.z(moneyTransferHistoryFragment.f33675M, moneyTransferHistoryFragment.f33674L, true);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        MoneyTransferHistoryFragment moneyTransferHistoryFragment = this.f1369a;
        moneyTransferHistoryFragment.z(moneyTransferHistoryFragment.f33675M, moneyTransferHistoryFragment.f33674L, false);
    }
}
