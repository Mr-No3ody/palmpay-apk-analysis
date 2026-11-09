package com.timehop.stickyheadersrecyclerview.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class LinearLayoutOrientationProvider implements OrientationProvider {
    @Override // com.timehop.stickyheadersrecyclerview.util.OrientationProvider
    public int getOrientation(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
    }

    @Override // com.timehop.stickyheadersrecyclerview.util.OrientationProvider
    public boolean isReverseLayout(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getReverseLayout();
        }
        throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
    }
}
