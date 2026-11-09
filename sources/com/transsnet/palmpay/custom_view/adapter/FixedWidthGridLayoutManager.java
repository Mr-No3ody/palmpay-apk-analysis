package com.transsnet.palmpay.custom_view.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/adapter/FixedWidthGridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FixedWidthGridLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31183a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View child, int i7, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        int position = getPosition(child) % getSpanCount();
        int spanCount = (this.f31183a * position) / getSpanCount();
        int i11 = this.f31183a;
        int spanCount2 = i11 - (((position + 1) * i11) / getSpanCount());
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = spanCount;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = spanCount2;
        super.measureChildWithMargins(child, i7, i10);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getWidth() != 0) {
            int width = getWidth();
            getSpanCount();
            this.f31183a = width / (getSpanCount() - 1);
        }
        super.onLayoutChildren(recycler, state);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                measureChildWithMargins(childAt, 0, 0);
            }
        }
    }
}
