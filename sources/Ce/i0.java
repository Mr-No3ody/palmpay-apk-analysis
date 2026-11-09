package Ce;

import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.ui.fragment.MessageListFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements SwipeRecyclerView.OnLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MessageListFragment f1491a;

    public i0(MessageListFragment messageListFragment) {
        this.f1491a = messageListFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onLoadMore() {
        MessageListFragment messageListFragment = this.f1491a;
        int i7 = messageListFragment.f35231w;
        if (i7 < messageListFragment.f35224A) {
            messageListFragment.f35231w = i7 + 1;
            Fe.T t = (Fe.T) messageListFragment.f27328i;
            if (t != null) {
                int i10 = messageListFragment.f35227j;
                t.loadMessageList(i10 == Integer.MAX_VALUE ? null : Integer.valueOf(i10), messageListFragment.f35231w, false);
            }
            SwipeRecyclerView swipeRecyclerViewU = messageListFragment.u();
            if (swipeRecyclerViewU != null) {
                swipeRecyclerViewU.a();
                return;
            }
            return;
        }
        SwipeRecyclerView swipeRecyclerViewU2 = messageListFragment.u();
        if (swipeRecyclerViewU2 != null) {
            swipeRecyclerViewU2.c();
        }
        SwipeRecyclerView swipeRecyclerViewU3 = messageListFragment.u();
        if (swipeRecyclerViewU3 != null) {
            swipeRecyclerViewU3.setRefreshing(false);
        }
        SwipeRecyclerView swipeRecyclerViewU4 = messageListFragment.u();
        if (swipeRecyclerViewU4 != null) {
            swipeRecyclerViewU4.b(messageListFragment.getString(Ac.h.main_list_end));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.SwipeRecyclerView.OnLoadListener
    public final void onRefresh() {
        MessageListFragment messageListFragment = this.f1491a;
        messageListFragment.f35231w = 1;
        Fe.T t = (Fe.T) messageListFragment.f27328i;
        if (t != null) {
            int i7 = messageListFragment.f35227j;
            t.loadMessageList(i7 == Integer.MAX_VALUE ? null : Integer.valueOf(i7), messageListFragment.f35231w, false);
        }
    }
}
