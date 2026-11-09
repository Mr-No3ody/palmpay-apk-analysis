package p132ie;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements TabLayout.OnTabSelectedListener {
    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        View childAt = tab.view.getChildAt(1);
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTypeface(Typeface.create("sans-serif-medium", 0));
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        View childAt = tab.view.getChildAt(1);
        if (childAt instanceof TextView) {
            ((TextView) childAt).setTypeface(Typeface.create("sans-serif", 0));
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }
}
