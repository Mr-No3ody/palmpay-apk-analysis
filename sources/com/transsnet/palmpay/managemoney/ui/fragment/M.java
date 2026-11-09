package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryFragment f32481a;

    public M(FundTransactionHistoryFragment fundTransactionHistoryFragment) {
        this.f32481a = fundTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        this.f32481a.w(false);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        FundTransactionHistoryFragment fundTransactionHistoryFragment = this.f32481a;
        FundTransactionHistoryFragment.a aVar = FundTransactionHistoryFragment.f32458Z;
        fundTransactionHistoryFragment.w(true);
    }
}
