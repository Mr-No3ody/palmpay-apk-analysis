package F7;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.shencoder.pagergridlayoutmanager.PagerGridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PagerGridLayoutManager f2624a;

    public d(RecyclerView recyclerView, PagerGridLayoutManager pagerGridLayoutManager) {
        super(recyclerView.getContext());
        this.f2624a = pagerGridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return this.f2624a.f25201X / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateTimeForScrolling(int i7) {
        return Math.min(this.f2624a.f25202Y, super.calculateTimeForScrolling(i7));
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        PagerGridLayoutManager pagerGridLayoutManager;
        int position;
        PointF pointFComputeScrollVectorForPosition;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (!(layoutManager instanceof PagerGridLayoutManager) || (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition((position = (pagerGridLayoutManager = (PagerGridLayoutManager) layoutManager).getPosition(view)))) == null) {
            return;
        }
        int i14 = 0;
        boolean z3 = pointFComputeScrollVectorForPosition.x > 0.0f || pointFComputeScrollVectorForPosition.y > 0.0f;
        if (pagerGridLayoutManager.p()) {
            z3 = !z3;
        }
        Rect rect = z3 ? pagerGridLayoutManager.f25217w : pagerGridLayoutManager.f25194A;
        Rect rect2 = new Rect();
        layoutManager.getDecoratedBoundsWithMargins(view, rect2);
        if (pagerGridLayoutManager.canScrollHorizontally()) {
            if (z3) {
                i7 = rect2.left;
                i10 = rect.left;
            } else {
                i7 = rect2.right;
                i10 = rect.right;
            }
            i11 = i7 - i10;
        } else {
            i11 = 0;
        }
        if (pagerGridLayoutManager.canScrollVertically()) {
            if (z3) {
                i12 = rect2.top;
                i13 = rect.top;
            } else {
                i12 = rect2.bottom;
                i13 = rect.bottom;
            }
            i14 = i12 - i13;
        }
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i11), Math.abs(i14)));
        if (iCalculateTimeForDeceleration > 0) {
            action.update(i11, i14, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        } else {
            pagerGridLayoutManager.o(position / pagerGridLayoutManager.f25208e);
        }
    }
}
