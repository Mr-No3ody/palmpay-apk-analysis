package com.transsnet.palmpay.custom_view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1548f extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f31332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31336e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31337f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31338g = false;

    public C1548f(int i7, int i10) {
        this.f31332a = new ColorDrawable(i7);
        this.f31333b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int orientation;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else if (layoutManager instanceof GridLayoutManager) {
            orientation = ((GridLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : 0;
        }
        if ((childAdapterPosition <= 0 || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - 1) && !((childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 && this.f31336e) || ((childAdapterPosition == 0 && this.f31337f) || this.f31338g))) {
            return;
        }
        int i7 = this.f31333b;
        if (orientation == 1) {
            rect.bottom = i7;
        } else {
            rect.right = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int orientation;
        int paddingTop;
        int height;
        int paddingBottom;
        int itemCount = recyclerView.getAdapter().getItemCount();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else if (layoutManager instanceof GridLayoutManager) {
            orientation = ((GridLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : 0;
        }
        int i7 = this.f31335d;
        int i10 = this.f31334c;
        if (orientation == 1) {
            paddingTop = recyclerView.getPaddingLeft() + i10;
            height = recyclerView.getWidth();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            paddingTop = recyclerView.getPaddingTop() + i10;
            height = recyclerView.getHeight();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        int i11 = (height - paddingBottom) - i7;
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if ((childAdapterPosition != 0 || childCount != 1 || this.f31336e) && ((childAdapterPosition > 0 && childAdapterPosition < itemCount - 1) || ((childAdapterPosition == 0 && this.f31337f) || ((childAdapterPosition == itemCount - 1 && this.f31336e) || ((childAdapterPosition < 0 || childAdapterPosition >= itemCount) && this.f31338g))))) {
                int i13 = this.f31333b;
                ColorDrawable colorDrawable = this.f31332a;
                if (orientation == 1) {
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    colorDrawable.setBounds(paddingTop, bottom, i11, i13 + bottom);
                    colorDrawable.draw(canvas);
                } else {
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                    colorDrawable.setBounds(right, paddingTop, i13 + right, i11);
                    colorDrawable.draw(canvas);
                }
            }
        }
    }

    public C1548f(int i7, int i10, int i11, int i12) {
        this.f31332a = new ColorDrawable(i7);
        this.f31333b = i10;
        this.f31334c = i11;
        this.f31335d = i12;
    }
}
