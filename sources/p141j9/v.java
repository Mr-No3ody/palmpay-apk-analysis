package p141j9;

import com.transsnet.palmpay.airtime.ui.TopUpRecordActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopUpRecordActivity f38434a;

    public v(TopUpRecordActivity topUpRecordActivity) {
        this.f38434a = topUpRecordActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        TopUpRecordActivity topUpRecordActivity = this.f38434a;
        int i7 = topUpRecordActivity.f26490f;
        if (i7 < topUpRecordActivity.f26491g) {
            int i10 = i7 + 1;
            topUpRecordActivity.f26490f = i10;
            topUpRecordActivity.m(i10);
            return;
        }
        SwipeRecyclerView swipeRecyclerView = topUpRecordActivity.f26487c;
        if (swipeRecyclerView == null) {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
        swipeRecyclerView.c();
        SwipeRecyclerView swipeRecyclerView2 = topUpRecordActivity.f26487c;
        if (swipeRecyclerView2 != null) {
            swipeRecyclerView2.b(topUpRecordActivity.getString(k.core_list_end));
        } else {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
    }
}
