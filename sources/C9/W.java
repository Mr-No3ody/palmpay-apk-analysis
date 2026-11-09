package C9;

import com.google.android.material.tabs.TabLayout;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class W implements TabLayout.OnTabSelectedListener {
    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        SPUtils.getInstance("WITHDRAW_MODULE").put("TAB_CURRENT", tab.getPosition());
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }
}
