package p207ne;

import Bc.k;
import Pe.N;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountListActivity;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MinorAccountListActivity f39947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f39948b;

    public i(MinorAccountListActivity minorAccountListActivity, k kVar) {
        this.f39947a = minorAccountListActivity;
        this.f39948b = kVar;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = MinorAccountListActivity.f34767f;
        MinorViewModel minorViewModel = (MinorViewModel) this.f39947a.l();
        minorViewModel.getClass();
        f.s(minorViewModel, new N(1, null), minorViewModel.f35379f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : true, (28 & 16) == 0);
        ((SwipeRecyclerView) this.f39948b.f752f).setRefreshing(false);
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
    }
}
