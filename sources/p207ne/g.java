package p207ne;

import Bc.k;
import Pe.S;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountHistoryListActivity;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MinorAccountHistoryListActivity f39945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39946b;

    public g(MinorAccountHistoryListActivity minorAccountHistoryListActivity, k kVar) {
        this.f39945a = minorAccountHistoryListActivity;
        this.f39946b = kVar;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = MinorAccountHistoryListActivity.f34764e;
        MinorViewModel minorViewModel = (MinorViewModel) this.f39945a.l();
        minorViewModel.getClass();
        f.s(minorViewModel, new S(1, null), minorViewModel.f35379f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        ((SwipeRecyclerView) this.f39946b.f752f).setRefreshing(false);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
    }
}
