package com.transsnet.palmpay.managemoney.ui.fragment;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TargetSavingsTransactionHistoryFragment f32658a;

    public r0(TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment) {
        this.f32658a = targetSavingsTransactionHistoryFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        this.f32658a.v(false);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        TargetSavingsTransactionHistoryFragment targetSavingsTransactionHistoryFragment = this.f32658a;
        TargetSavingsTransactionHistoryFragment.a aVar = TargetSavingsTransactionHistoryFragment.f32549X;
        targetSavingsTransactionHistoryFragment.v(true);
    }
}
