package com.transsnet.palmpay.custom_view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRecyclerView f31018a;

    public F(SwipeRecyclerView swipeRecyclerView) {
        this.f31018a = swipeRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        SwipeRecyclerView.OnLoadListener onLoadListener;
        super.onScrolled(recyclerView, i7, i10);
        SwipeRecyclerView swipeRecyclerView = this.f31018a;
        if (!swipeRecyclerView.f31149p || swipeRecyclerView.f31142d.isRefreshing() || swipeRecyclerView.f31148o) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        swipeRecyclerView.f31143e = layoutManager;
        if (layoutManager instanceof LinearLayoutManager) {
            swipeRecyclerView.f31150v = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof GridLayoutManager) {
            swipeRecyclerView.f31150v = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            int[] iArr = new int[spanCount];
            ((StaggeredGridLayoutManager) swipeRecyclerView.f31143e).findLastVisibleItemPositions(iArr);
            int i11 = iArr[0];
            for (int i12 = 0; i12 < spanCount; i12++) {
                int i13 = iArr[i12];
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            swipeRecyclerView.f31150v = i11;
        }
        J j6 = swipeRecyclerView.f31147j;
        int itemCount = j6 != null ? j6.getItemCount() : 0;
        if (itemCount <= 1 || swipeRecyclerView.f31150v != itemCount - 1 || (onLoadListener = swipeRecyclerView.f31144f) == null) {
            return;
        }
        swipeRecyclerView.f31148o = true;
        onLoadListener.onLoadMore();
    }
}
