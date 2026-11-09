package p285sc;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnCommentListActivity;
import p025ba.k;

/* JADX INFO: renamed from: sc.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2030d implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReferEarnCommentListActivity f42211a;

    public C2030d(ReferEarnCommentListActivity referEarnCommentListActivity) {
        this.f42211a = referEarnCommentListActivity;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        ReferEarnCommentListActivity referEarnCommentListActivity = this.f42211a;
        int i7 = referEarnCommentListActivity.f31860d;
        if (i7 < referEarnCommentListActivity.f31859c) {
            referEarnCommentListActivity.m(i7 + 1);
        } else {
            referEarnCommentListActivity.l().c();
            referEarnCommentListActivity.l().b(referEarnCommentListActivity.getString(k.core_list_end));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        int i7 = ReferEarnCommentListActivity.f31856i;
        this.f42211a.m(1);
    }
}
