package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoreUssdListActivity f27675a;

    public P(CoreUssdListActivity coreUssdListActivity) {
        this.f27675a = coreUssdListActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = CoreUssdListActivity.f27608d;
        this.f27675a.n();
    }
}
