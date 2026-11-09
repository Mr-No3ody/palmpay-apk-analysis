package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPage2ItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spanCount;

    public ViewPage2ItemDecoration(int i7, int i10) {
        this.spanCount = i7;
        this.spacing = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, @NonNull View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = this.spanCount;
        int i10 = childAdapterPosition % i7;
        int i11 = this.spacing;
        rect.left = i11 - ((i10 * i11) / i7);
        rect.right = ((i10 + 1) * i11) / i7;
    }
}
