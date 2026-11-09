package C9;

import com.transsnet.palmpay.cash_in.ui.activity.RecordListActivity;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecordListActivity f1252a;

    public D(RecordListActivity recordListActivity) {
        this.f1252a = recordListActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        RecordListActivity recordListActivity = this.f1252a;
        int i7 = recordListActivity.f26904f;
        if (i7 >= recordListActivity.f26905g) {
            recordListActivity.f26900b.c();
            recordListActivity.f26900b.b(recordListActivity.getString(p366y9.d.no_more));
        } else {
            int i10 = i7 + 1;
            recordListActivity.f26904f = i10;
            recordListActivity.l(i10, recordListActivity.f26902d);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
    }
}
