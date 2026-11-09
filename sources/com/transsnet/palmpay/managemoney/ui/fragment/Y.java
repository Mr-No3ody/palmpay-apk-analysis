package com.transsnet.palmpay.managemoney.ui.fragment;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OldUserFixedSavingFragment f32583a;

    public Y(OldUserFixedSavingFragment oldUserFixedSavingFragment) {
        this.f32583a = oldUserFixedSavingFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        this.f32583a.A(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        this.f32583a.A(tab, false);
    }
}
