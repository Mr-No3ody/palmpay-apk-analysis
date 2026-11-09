package Z6;

import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N6.a f11551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11552b;

    public h(N6.a aVar, i iVar) {
        this.f11551a = aVar;
        this.f11552b = iVar;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        Integer numValueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
        N6.a aVar = this.f11551a;
        aVar.f6080c.post(new Da.h(numValueOf, 17, aVar, this.f11552b));
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
    }
}
