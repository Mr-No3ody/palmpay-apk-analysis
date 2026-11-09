package com.google.android.material.carousel;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselSnapHelper extends SnapHelper {
    private static final float HORIZONTAL_SNAP_SPEED = 100.0f;
    private static final float VERTICAL_SNAP_SPEED = 50.0f;
    private final boolean disableFling;
    private RecyclerView recyclerView;

    public CarouselSnapHelper() {
        this(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] calculateDistanceToSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view, boolean z3) {
        if (!(layoutManager instanceof CarouselLayoutManager)) {
            return new int[]{0, 0};
        }
        int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(view, (CarouselLayoutManager) layoutManager, z3);
        if (layoutManager.canScrollHorizontally()) {
            return new int[]{iDistanceToFirstFocalKeyline, 0};
        }
        return layoutManager.canScrollVertically() ? new int[]{0, iDistanceToFirstFocalKeyline} : new int[]{0, 0};
    }

    private int distanceToFirstFocalKeyline(@NonNull View view, CarouselLayoutManager carouselLayoutManager, boolean z3) {
        return carouselLayoutManager.getOffsetToScrollToPositionForSnap(carouselLayoutManager.getPosition(view), z3);
    }

    @Nullable
    private View findViewNearestFirstKeyline(RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0 && (layoutManager instanceof CarouselLayoutManager)) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) layoutManager;
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = layoutManager.getChildAt(i10);
                int iAbs = Math.abs(carouselLayoutManager.getOffsetToScrollToPositionForSnap(layoutManager.getPosition(childAt), false));
                if (iAbs < i7) {
                    view = childAt;
                    i7 = iAbs;
                }
            }
        }
        return view;
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i7, int i10) {
        if (layoutManager.canScrollHorizontally()) {
            return i7 > 0;
        }
        return i10 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (pointFComputeScrollVectorForPosition = ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        super.attachToRecyclerView(recyclerView);
        this.recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        return calculateDistanceToSnap(layoutManager, view, false);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public RecyclerView.SmoothScroller createScroller(@NonNull final RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselSnapHelper.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    float f10;
                    float f11;
                    if (layoutManager.canScrollVertically()) {
                        f10 = displayMetrics.densityDpi;
                        f11 = CarouselSnapHelper.VERTICAL_SNAP_SPEED;
                    } else {
                        f10 = displayMetrics.densityDpi;
                        f11 = CarouselSnapHelper.HORIZONTAL_SNAP_SPEED;
                    }
                    return f11 / f10;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    if (CarouselSnapHelper.this.recyclerView != null) {
                        CarouselSnapHelper carouselSnapHelper = CarouselSnapHelper.this;
                        int[] iArrCalculateDistanceToSnap = carouselSnapHelper.calculateDistanceToSnap(carouselSnapHelper.recyclerView.getLayoutManager(), view, true);
                        int i7 = iArrCalculateDistanceToSnap[0];
                        int i10 = iArrCalculateDistanceToSnap[1];
                        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i7), Math.abs(i10)));
                        if (iCalculateTimeForDeceleration > 0) {
                            action.update(i7, i10, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                        }
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return findViewNearestFirstKeyline(layoutManager);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i7, int i10) {
        int itemCount;
        if (!this.disableFling || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = layoutManager.getChildAt(i13);
            if (childAt != null) {
                int iDistanceToFirstFocalKeyline = distanceToFirstFocalKeyline(childAt, (CarouselLayoutManager) layoutManager, false);
                if (iDistanceToFirstFocalKeyline <= 0 && iDistanceToFirstFocalKeyline > i12) {
                    view2 = childAt;
                    i12 = iDistanceToFirstFocalKeyline;
                }
                if (iDistanceToFirstFocalKeyline >= 0 && iDistanceToFirstFocalKeyline < i11) {
                    view = childAt;
                    i11 = iDistanceToFirstFocalKeyline;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(layoutManager, i7, i10);
        if (zIsForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (isReverseLayout(layoutManager) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    public CarouselSnapHelper(boolean z3) {
        this.disableFling = z3;
    }
}
