package p168l4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f39270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39272c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39273d = true;

    public a(int i7, int i10) {
        this.f39270a = new ColorDrawable(i7);
        this.f39271b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int orientation;
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else if (layoutManager instanceof GridLayoutManager) {
            orientation = ((GridLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : 0;
        }
        if (childAdapterPosition <= 0) {
            adapter = parent.getAdapter();
            Intrinsics.e(adapter);
            if (childAdapterPosition == adapter.getItemCount() - 1) {
                return;
            } else {
                return;
            }
        }
        RecyclerView.Adapter adapter2 = parent.getAdapter();
        Intrinsics.e(adapter2);
        if (childAdapterPosition >= adapter2.getItemCount() - 1) {
            adapter = parent.getAdapter();
            Intrinsics.e(adapter);
            if ((childAdapterPosition == adapter.getItemCount() - 1 || !this.f39272c) && (childAdapterPosition != 0 || !this.f39273d)) {
                return;
            }
        }
        int i7 = this.f39271b;
        if (orientation == 1) {
            outRect.bottom = i7;
        } else {
            outRect.right = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas c6, RecyclerView parent, RecyclerView.State state) {
        int orientation;
        int paddingTop;
        int height;
        int paddingBottom;
        Intrinsics.checkNotNullParameter(c6, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.e(adapter);
        int itemCount = adapter.getItemCount();
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else if (layoutManager instanceof GridLayoutManager) {
            orientation = ((GridLayoutManager) layoutManager).getOrientation();
        } else {
            orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : 0;
        }
        if (orientation == 1) {
            paddingTop = parent.getPaddingLeft();
            height = parent.getWidth();
            paddingBottom = parent.getPaddingRight();
        } else {
            paddingTop = parent.getPaddingTop();
            height = parent.getHeight();
            paddingBottom = parent.getPaddingBottom();
        }
        int i7 = height - paddingBottom;
        int childCount = parent.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = parent.getChildAt(i10);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            if ((childAdapterPosition > 0 && childAdapterPosition < itemCount - 1) || ((childAdapterPosition == 0 && this.f39273d) || (childAdapterPosition == itemCount - 1 && this.f39272c))) {
                ColorDrawable colorDrawable = this.f39270a;
                int i11 = this.f39271b;
                if (orientation == 1) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                    colorDrawable.setBounds(paddingTop, bottom, i7, i11 + bottom);
                    colorDrawable.draw(c6);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    Intrinsics.f(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams2)).rightMargin;
                    colorDrawable.setBounds(right, paddingTop, i11 + right, i7);
                    colorDrawable.draw(c6);
                }
            }
        }
    }
}
