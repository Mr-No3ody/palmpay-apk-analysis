package p382zb;

import com.google.android.material.tabs.TabLayout;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zb.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2178v implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LoanHomeFragment f44621a;

    public C2178v(LoanHomeFragment loanHomeFragment) {
        this.f44621a = loanHomeFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
        this.f44621a.B(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
        this.f44621a.B(tab, true);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
        this.f44621a.B(tab, false);
    }
}
