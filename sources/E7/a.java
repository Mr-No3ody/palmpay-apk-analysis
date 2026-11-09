package E7;

import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayoutListener f2255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RefreshLayout f2256b;

    public a(CoordinatorLayoutListener coordinatorLayoutListener, RefreshLayout refreshLayout) {
        this.f2255a = coordinatorLayoutListener;
        this.f2256b = refreshLayout;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
        boolean z3 = false;
        boolean z8 = i7 >= 0;
        if (this.f2256b.isEnableLoadMore() && appBarLayout.getTotalScrollRange() + i7 <= 0) {
            z3 = true;
        }
        this.f2255a.onCoordinatorUpdate(z8, z3);
    }
}
