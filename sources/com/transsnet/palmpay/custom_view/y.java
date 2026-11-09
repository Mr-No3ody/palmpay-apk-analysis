package com.transsnet.palmpay.custom_view;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReverseRecyclerView f31738a;

    public y(ReverseRecyclerView reverseRecyclerView) {
        this.f31738a = reverseRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i7, int i10) {
        ReverseRecyclerView.OnLoadListener onLoadListener;
        super.onScrolled(recyclerView, i7, i10);
        ReverseRecyclerView reverseRecyclerView = this.f31738a;
        if (!reverseRecyclerView.f31117o || reverseRecyclerView.f31116j) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        reverseRecyclerView.f31111d = layoutManager;
        if (layoutManager instanceof LinearLayoutManager) {
            reverseRecyclerView.t = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        } else if (layoutManager instanceof GridLayoutManager) {
            reverseRecyclerView.t = ((GridLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            int[] iArr = new int[spanCount];
            ((StaggeredGridLayoutManager) reverseRecyclerView.f31111d).findLastVisibleItemPositions(iArr);
            int i11 = iArr[0];
            for (int i12 = 0; i12 < spanCount; i12++) {
                int i13 = iArr[i12];
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            reverseRecyclerView.t = i11;
        }
        C c6 = reverseRecyclerView.f31115i;
        int itemCount = c6 != null ? c6.getItemCount() : 0;
        if (itemCount <= 1 || reverseRecyclerView.t != itemCount - 2 || (onLoadListener = reverseRecyclerView.f31112e) == null) {
            return;
        }
        reverseRecyclerView.f31116j = true;
        onLoadListener.onLoadMore();
    }
}
