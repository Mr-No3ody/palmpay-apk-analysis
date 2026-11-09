package com.transsnet.palmpay.ui.view;

import Ac.f;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public class CustomTabLayout extends TabLayout {
    public CustomTabLayout(@NonNull Context context) {
        super(context);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final TabLayout.Tab newTab() {
        TabLayout.Tab tabNewTab = super.newTab();
        tabNewTab.setCustomView(f.main_layout_custom_giveway_tab);
        if (getTabTextColors() != null) {
            ColorStateList tabTextColors = getTabTextColors();
            TextView textView = (TextView) tabNewTab.getCustomView().findViewById(R.id.text1);
            if (textView != null) {
                textView.setTextColor(tabTextColors);
            }
        }
        return tabNewTab;
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setTabTextColors(ColorStateList colorStateList) {
        super.setTabTextColors(colorStateList);
        for (int i7 = 0; i7 < getTabCount(); i7++) {
            TextView textView = (TextView) getTabAt(i7).getCustomView().findViewById(R.id.text1);
            if (textView != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public CustomTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomTabLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
