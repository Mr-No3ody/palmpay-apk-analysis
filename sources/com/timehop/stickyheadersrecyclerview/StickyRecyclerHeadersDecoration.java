package com.timehop.stickyheadersrecyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.timehop.stickyheadersrecyclerview.caching.HeaderViewCache;
import com.timehop.stickyheadersrecyclerview.calculation.DimensionCalculator;
import com.timehop.stickyheadersrecyclerview.rendering.HeaderRenderer;
import com.timehop.stickyheadersrecyclerview.util.LinearLayoutOrientationProvider;

/* JADX INFO: loaded from: classes3.dex */
public class StickyRecyclerHeadersDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StickyRecyclerHeadersAdapter f25545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f25546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HeaderViewCache f25547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayoutOrientationProvider f25548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HeaderPositionCalculator f25549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HeaderRenderer f25550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DimensionCalculator f25551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f25552h;

    public StickyRecyclerHeadersDecoration(StickyRecyclerHeadersAdapter stickyRecyclerHeadersAdapter) {
        LinearLayoutOrientationProvider linearLayoutOrientationProvider = new LinearLayoutOrientationProvider();
        DimensionCalculator dimensionCalculator = new DimensionCalculator();
        HeaderRenderer headerRenderer = new HeaderRenderer(linearLayoutOrientationProvider);
        HeaderViewCache headerViewCache = new HeaderViewCache(stickyRecyclerHeadersAdapter, linearLayoutOrientationProvider);
        HeaderPositionCalculator headerPositionCalculator = new HeaderPositionCalculator(stickyRecyclerHeadersAdapter, headerViewCache, linearLayoutOrientationProvider, dimensionCalculator);
        this.f25546b = new SparseArray();
        this.f25552h = new Rect();
        this.f25545a = stickyRecyclerHeadersAdapter;
        this.f25547c = headerViewCache;
        this.f25548d = linearLayoutOrientationProvider;
        this.f25550f = headerRenderer;
        this.f25551g = dimensionCalculator;
        this.f25549e = headerPositionCalculator;
    }

    public int findHeaderPositionUnder(int i7, int i10) {
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f25546b;
            if (i11 >= sparseArray.size()) {
                return -1;
            }
            if (((Rect) sparseArray.get(sparseArray.keyAt(i11))).contains(i7, i10)) {
                return sparseArray.keyAt(i11);
            }
            i11++;
        }
    }

    public View getHeaderView(RecyclerView recyclerView, int i7) {
        return this.f25547c.getHeader(recyclerView, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        LinearLayoutOrientationProvider linearLayoutOrientationProvider = this.f25548d;
        if (this.f25549e.hasNewHeader(childAdapterPosition, linearLayoutOrientationProvider.isReverseLayout(recyclerView))) {
            View headerView = getHeaderView(recyclerView, childAdapterPosition);
            int orientation = linearLayoutOrientationProvider.getOrientation(recyclerView);
            DimensionCalculator dimensionCalculator = this.f25551g;
            Rect rect2 = this.f25552h;
            dimensionCalculator.initMargins(rect2, headerView);
            if (orientation == 1) {
                rect.top = headerView.getHeight() + rect2.top + rect2.bottom;
            } else {
                rect.left = headerView.getWidth() + rect2.left + rect2.right;
            }
        }
    }

    public void invalidateHeaders() {
        this.f25547c.invalidate();
        this.f25546b.clear();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView recyclerView2;
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0 || this.f25545a.getItemCount() <= 0) {
            return;
        }
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = recyclerView.getChildAt(i7);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == -1) {
                recyclerView2 = recyclerView;
            } else {
                LinearLayoutOrientationProvider linearLayoutOrientationProvider = this.f25548d;
                int orientation = linearLayoutOrientationProvider.getOrientation(recyclerView);
                HeaderPositionCalculator headerPositionCalculator = this.f25549e;
                boolean zHasStickyHeader = headerPositionCalculator.hasStickyHeader(childAt, orientation, childAdapterPosition);
                if (zHasStickyHeader || headerPositionCalculator.hasNewHeader(childAdapterPosition, linearLayoutOrientationProvider.isReverseLayout(recyclerView))) {
                    View header = this.f25547c.getHeader(recyclerView, childAdapterPosition);
                    SparseArray sparseArray = this.f25546b;
                    Rect rect = (Rect) sparseArray.get(childAdapterPosition);
                    if (rect == null) {
                        rect = new Rect();
                        sparseArray.put(childAdapterPosition, rect);
                    }
                    Rect rect2 = rect;
                    recyclerView2 = recyclerView;
                    this.f25549e.initHeaderBounds(rect2, recyclerView2, header, childAt, zHasStickyHeader);
                    this.f25550f.drawHeader(recyclerView2, canvas, header, rect2);
                } else {
                    recyclerView2 = recyclerView;
                }
            }
            i7++;
            recyclerView = recyclerView2;
        }
    }
}
