package com.timehop.stickyheadersrecyclerview;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.caching.HeaderProvider;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.util.OrientationProvider;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderPositionCalculator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StickyRecyclerHeadersAdapter f25539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrientationProvider f25540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HeaderProvider f25541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DimensionCalculator f25542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f25543e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f25544f = new Rect();

    public HeaderPositionCalculator(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter, HeaderProvider headerProvider, OrientationProvider orientationProvider, DimensionCalculator dimensionCalculator) {
        this.f25539a = stickyRecyclerHeadersAdapter;
        this.f25541c = headerProvider;
        this.f25540b = orientationProvider;
        this.f25542d = dimensionCalculator;
    }

    public final View a(RecyclerView recyclerView, View view) {
        OrientationProvider orientationProvider = this.f25540b;
        boolean zIsReverseLayout = orientationProvider.isReverseLayout(recyclerView);
        int i7 = zIsReverseLayout ? -1 : 1;
        for (int childCount = zIsReverseLayout ? recyclerView.getChildCount() - 1 : 0; childCount >= 0 && childCount <= recyclerView.getChildCount() - 1; childCount += i7) {
            View childAt = recyclerView.getChildAt(childCount);
            int orientation = orientationProvider.getOrientation(recyclerView);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            DimensionCalculator dimensionCalculator = this.f25542d;
            Rect rect = this.f25543e;
            dimensionCalculator.initMargins(rect, view);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && this.f25541c.getHeader(recyclerView, childAdapterPosition) == view) {
                if (orientation == 1) {
                    if (childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin <= view.getBottom() + rect.bottom + rect.top) {
                    }
                } else if (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin <= view.getRight() + rect.right + rect.left) {
                }
            }
            return childAt;
        }
        return null;
    }

    public boolean hasNewHeader(int i7, boolean z3) {
        StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter = this.f25539a;
        if (!(i7 < 0 || i7 >= stickyRecyclerHeadersAdapter.getItemCount())) {
            long headerId = stickyRecyclerHeadersAdapter.getHeaderId(i7);
            if (headerId >= 0) {
                int i10 = (z3 ? 1 : -1) + i7;
                long headerId2 = (i10 < 0 || i10 >= stickyRecyclerHeadersAdapter.getItemCount()) ? -1L : stickyRecyclerHeadersAdapter.getHeaderId(i10);
                if (i7 == (z3 ? stickyRecyclerHeadersAdapter.getItemCount() - 1 : 0) || headerId != headerId2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasStickyHeader(View view, int i7, int i10) {
        int left;
        int i11;
        DimensionCalculator dimensionCalculator = this.f25542d;
        Rect rect = this.f25543e;
        dimensionCalculator.initMargins(rect, view);
        if (i7 == 1) {
            left = view.getTop();
            i11 = rect.top;
        } else {
            left = view.getLeft();
            i11 = rect.left;
        }
        return left <= i11 && this.f25539a.getHeaderId(i10) >= 0;
    }

    public void initHeaderBounds(Rect rect, RecyclerView recyclerView, View view, View view2, boolean z3) {
        int i7;
        int i10;
        int iMax;
        int iMax2;
        View viewA;
        int childAdapterPosition;
        OrientationProvider orientationProvider = this.f25540b;
        int orientation = orientationProvider.getOrientation(recyclerView);
        DimensionCalculator dimensionCalculator = this.f25542d;
        Rect rect2 = this.f25543e;
        dimensionCalculator.initMargins(rect2, view);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i10 = marginLayoutParams.leftMargin;
            i7 = marginLayoutParams.topMargin;
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (orientation == 1) {
            iMax = (view2.getLeft() - i10) + rect2.left;
            iMax2 = Math.max(((view2.getTop() - i7) - view.getHeight()) - rect2.bottom, (recyclerView.getLayoutManager().getClipToPadding() ? recyclerView.getPaddingTop() : 0) + rect2.top);
        } else {
            int top2 = (view2.getTop() - i7) + rect2.top;
            iMax = Math.max(((view2.getLeft() - i10) - view.getWidth()) - rect2.right, (recyclerView.getLayoutManager().getClipToPadding() ? recyclerView.getPaddingLeft() : 0) + rect2.left);
            iMax2 = top2;
        }
        rect.set(iMax, iMax2, view.getWidth() + iMax, view.getHeight() + iMax2);
        if (!z3 || (childAdapterPosition = recyclerView.getChildAdapterPosition((viewA = a(recyclerView, view)))) == -1) {
            return;
        }
        boolean zIsReverseLayout = orientationProvider.isReverseLayout(recyclerView);
        if (childAdapterPosition <= 0 || !hasNewHeader(childAdapterPosition, zIsReverseLayout)) {
            return;
        }
        HeaderProvider headerProvider = this.f25541c;
        View header = headerProvider.getHeader(recyclerView, childAdapterPosition);
        dimensionCalculator.initMargins(rect2, header);
        Rect rect3 = this.f25544f;
        dimensionCalculator.initMargins(rect3, view);
        if (orientationProvider.getOrientation(recyclerView) == 1) {
            if (((viewA.getTop() - rect2.bottom) - header.getHeight()) - rect2.top >= view.getBottom() + recyclerView.getPaddingTop() + rect3.top + rect3.bottom) {
                return;
            }
        } else if (((viewA.getLeft() - rect2.right) - header.getWidth()) - rect2.left >= view.getRight() + recyclerView.getPaddingLeft() + rect3.left + rect3.right) {
            return;
        }
        View viewA2 = a(recyclerView, view);
        View header2 = headerProvider.getHeader(recyclerView, recyclerView.getChildAdapterPosition(viewA2));
        int orientation2 = orientationProvider.getOrientation(recyclerView);
        dimensionCalculator.initMargins(rect2, header2);
        dimensionCalculator.initMargins(rect3, view);
        if (orientation2 == 1) {
            int paddingTop = (recyclerView.getLayoutManager().getClipToPadding() ? recyclerView.getPaddingTop() : 0) + rect3.top + rect3.bottom;
            int top3 = ((((viewA2.getTop() - header2.getHeight()) - rect2.bottom) - rect2.top) - view.getHeight()) - paddingTop;
            if (top3 < paddingTop) {
                rect.top += top3;
                return;
            }
            return;
        }
        int paddingLeft = (recyclerView.getLayoutManager().getClipToPadding() ? recyclerView.getPaddingLeft() : 0) + rect3.left + rect3.right;
        int left = ((((viewA2.getLeft() - header2.getWidth()) - rect2.right) - rect2.left) - view.getWidth()) - paddingLeft;
        if (left < paddingLeft) {
            rect.left += left;
        }
    }
}
