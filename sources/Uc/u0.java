package Uc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NearbyAgent2Page f9727a;

    public u0(NearbyAgent2Page nearbyAgent2Page) {
        this.f9727a = nearbyAgent2Page;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        int i7 = NearbyAgent2Page.f32889k0;
        NearbyAgent2Page nearbyAgent2Page = this.f9727a;
        if (nearbyAgent2Page.n().f9697b) {
            NearbyAgent2Page.l(nearbyAgent2Page).c();
        } else {
            NearbyAgent2Page.l(nearbyAgent2Page).a();
            nearbyAgent2Page.n().d(nearbyAgent2Page.n().f9696a + 1);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = NearbyAgent2Page.f32889k0;
        NearbyAgent2Page nearbyAgent2Page = this.f9727a;
        nearbyAgent2Page.n().b();
        nearbyAgent2Page.n().d(1);
    }
}
