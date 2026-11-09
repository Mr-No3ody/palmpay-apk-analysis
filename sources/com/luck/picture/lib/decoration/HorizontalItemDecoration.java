package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spanCount;

    public HorizontalItemDecoration(int i7, int i10) {
        this.spanCount = i7;
        this.spacing = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i7 = this.spanCount;
        int i10 = childAdapterPosition % i7;
        if (childAdapterPosition == 0) {
            int i11 = this.spacing;
            rect.left = i11 - ((i10 * i11) / i7);
        } else {
            rect.left = (this.spacing * i10) / i7;
        }
        int i12 = this.spacing;
        rect.right = i12 - (((i10 + 1) * i12) / i7);
        if (childAdapterPosition < i7) {
            rect.top = i12;
        }
        rect.bottom = i12;
    }
}
