package com.yalantis.ucrop.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private final boolean includeEdge;
    private final int spacing;
    private final int spanCount;

    public GridSpacingItemDecoration(int i7, int i10, boolean z3) {
        this.spanCount = i7;
        this.spacing = i10;
        this.includeEdge = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = this.spanCount;
        int i10 = childAdapterPosition % i7;
        if (this.includeEdge) {
            int i11 = this.spacing;
            rect.left = i11 - ((i10 * i11) / i7);
            rect.right = ((i10 + 1) * i11) / i7;
        } else {
            int i12 = this.spacing;
            rect.left = (i10 * i12) / i7;
            rect.right = i12 - (((i10 + 1) * i12) / i7);
        }
        if (childAdapterPosition < i7) {
            rect.top = this.spacing;
        }
        rect.bottom = this.spacing;
    }
}
