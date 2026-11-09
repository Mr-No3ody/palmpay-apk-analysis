package com.transsnet.palmpay.ui.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterTypeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/ui/view/FlowLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlowLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransactionHistoryDownloadFilterTypeActivity f35292a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i7;
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        detachAndScrapAttachedViews(recycler);
        int width = getWidth();
        int itemCount = getItemCount();
        int i10 = 0;
        int dimensionPixelOffset = 0;
        int iMax = 0;
        for (int i11 = 0; i11 < itemCount; i11++) {
            int i12 = i10;
            View viewForPosition = recycler.getViewForPosition(i11);
            Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
            addView(viewForPosition);
            measureChildWithMargins(viewForPosition, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            int i13 = i12 + decoratedMeasuredWidth;
            if (i13 <= width) {
                i7 = i13;
                layoutDecorated(viewForPosition, i7 - decoratedMeasuredWidth, dimensionPixelOffset, i7, dimensionPixelOffset + decoratedMeasuredHeight);
                iMax = Math.max(iMax, decoratedMeasuredHeight);
            } else {
                if (iMax == 0) {
                    iMax = decoratedMeasuredHeight;
                }
                dimensionPixelOffset += this.f35292a.getResources().getDimensionPixelOffset(q.dp12) + iMax;
                i7 = decoratedMeasuredWidth;
                layoutDecorated(viewForPosition, 0, dimensionPixelOffset, i7, dimensionPixelOffset + decoratedMeasuredHeight);
                iMax = decoratedMeasuredHeight;
            }
            i10 = i7;
        }
    }
}
