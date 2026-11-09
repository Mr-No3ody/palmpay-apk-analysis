package com.transsnet.palmpay.custom_view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31014b = 1;

    public E(int i7) {
        this.f31013a = i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        if (parent.getChildCount() > 0 && (adapter = parent.getAdapter()) != null) {
            if (parent.getChildLayoutPosition(view) == adapter.getItemCount() - 1) {
                outRect.left = 0;
                outRect.right = 0;
                outRect.bottom = 0;
                outRect.top = 0;
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int spanIndex = layoutParams2.getSpanIndex();
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null) {
            int spanCount = staggeredGridLayoutManager.getSpanCount();
            boolean zIsFullSpan = layoutParams2.isFullSpan();
            int i7 = this.f31014b;
            int i10 = this.f31013a;
            if (i7 == 1) {
                if (zIsFullSpan) {
                    outRect.left = 0;
                    outRect.right = 0;
                } else if (spanIndex == 0) {
                    outRect.left = i10;
                    outRect.right = i10 / 2;
                } else if (spanIndex == spanCount - 1) {
                    outRect.left = i10 / 2;
                    outRect.right = i10;
                } else {
                    int i11 = i10 / 2;
                    outRect.left = i11;
                    outRect.right = i11;
                }
                outRect.top = childAdapterPosition < spanCount ? i10 : i10 / 2;
                outRect.bottom = i10 / 2;
                return;
            }
            if (zIsFullSpan) {
                outRect.top = 0;
                outRect.bottom = 0;
            } else if (spanIndex == 0) {
                outRect.top = i10;
                outRect.bottom = i10 / 2;
            } else if (spanIndex == spanCount - 1) {
                outRect.top = i10 / 2;
                outRect.bottom = i10;
            } else {
                int i12 = i10 / 2;
                outRect.top = i12;
                outRect.bottom = i12;
            }
            outRect.left = childAdapterPosition < spanCount ? i10 : i10 / 2;
            outRect.right = i10 / 2;
        }
    }
}
