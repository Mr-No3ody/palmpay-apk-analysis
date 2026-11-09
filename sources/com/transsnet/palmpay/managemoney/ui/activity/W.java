package com.transsnet.palmpay.managemoney.ui.activity;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class W implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransactionHistoryActivity f32218a;

    public W(TransactionHistoryActivity transactionHistoryActivity) {
        this.f32218a = transactionHistoryActivity;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        int i7 = TransactionHistoryActivity.f32203f;
        this.f32218a.o(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        int i7 = TransactionHistoryActivity.f32203f;
        this.f32218a.o(tab, false);
    }
}
