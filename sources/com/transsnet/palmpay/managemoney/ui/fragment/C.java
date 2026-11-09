package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryFragment f32342a;

    public C(CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment) {
        this.f32342a = cashBoxTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        this.f32342a.v(false);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        CashBoxTransactionHistoryFragment cashBoxTransactionHistoryFragment = this.f32342a;
        CashBoxTransactionHistoryFragment.a aVar = CashBoxTransactionHistoryFragment.f32428Y;
        cashBoxTransactionHistoryFragment.v(true);
    }
}
