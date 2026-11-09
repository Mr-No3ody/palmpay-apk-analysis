package com.transsnet.palmpay.custom_view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/CatchCrashStaggeredGridLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CatchCrashStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i7) {
        try {
            super.onScrollStateChanged(i7);
        } catch (Exception unused) {
        }
    }
}
