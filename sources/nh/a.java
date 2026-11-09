package nh;

import android.R;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f39975f = new a(D3.a.f1587c.getResources().getColor(R.color.transparent), p118hf.a.a(16.0f), p118hf.a.a(30.0f), p118hf.a.a(30.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorDrawable f39976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39980e = true;

    static {
        new a(Color.parseColor("#F3F3F3"), 2, 0, 0).f39980e = false;
    }

    public a(int i7, int i10, int i11, int i12) {
        this.f39976a = new ColorDrawable(i7);
        this.f39977b = i10;
        this.f39978c = i11;
        this.f39979d = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int orientation;
        LinearLayoutManager linearLayoutManager;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else {
            if (layoutManager instanceof GridLayoutManager) {
                linearLayoutManager = (GridLayoutManager) layoutManager;
            } else if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                orientation = 0;
            }
            orientation = linearLayoutManager.getOrientation();
        }
        if ((childAdapterPosition < 0 || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - 1) && !(childAdapterPosition == recyclerView.getAdapter().getItemCount() - 1 && this.f39980e)) {
            return;
        }
        int i7 = this.f39977b;
        if (orientation == 1) {
            rect.bottom = i7;
        } else {
            rect.right = i7;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int orientation;
        LinearLayoutManager linearLayoutManager;
        int paddingTop;
        int height;
        int paddingBottom;
        int itemCount = recyclerView.getAdapter().getItemCount();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            orientation = ((StaggeredGridLayoutManager) layoutManager).getOrientation();
        } else {
            if (layoutManager instanceof GridLayoutManager) {
                linearLayoutManager = (GridLayoutManager) layoutManager;
            } else if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                orientation = 0;
            }
            orientation = linearLayoutManager.getOrientation();
        }
        int i7 = this.f39979d;
        int i10 = this.f39978c;
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
            if ((childAdapterPosition >= 0 && childAdapterPosition < itemCount - 1) || (childAdapterPosition == itemCount - 1 && this.f39980e)) {
                ColorDrawable colorDrawable = this.f39976a;
                int i13 = this.f39977b;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (orientation == 1) {
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    colorDrawable.setBounds(paddingTop, bottom, i11, i13 + bottom);
                } else {
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    colorDrawable.setBounds(right, paddingTop, i13 + right, i11);
                }
                colorDrawable.draw(canvas);
            }
        }
    }
}
