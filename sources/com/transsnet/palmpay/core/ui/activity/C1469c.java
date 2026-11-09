package com.transsnet.palmpay.core.ui.activity;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1469c implements TabLayout.OnTabSelectedListener {
    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        TabLayout.TabView tabView;
        View childAt = (tab == null || (tabView = tab.view) == null) ? null : tabView.getChildAt(1);
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTypeface(Typeface.create("sans-serif-medium", 0));
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        TabLayout.TabView tabView;
        View childAt = (tab == null || (tabView = tab.view) == null) ? null : tabView.getChildAt(1);
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTypeface(Typeface.create("sans-serif", 0));
        }
    }
}
