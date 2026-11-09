package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.N;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SlideSelectTouchListener implements RecyclerView.OnItemTouchListener {
    private boolean isActive;
    private int mBottomBoundFrom;
    private int mBottomBoundTo;
    private int mEnd;
    private int mHeaderViewCount;
    private boolean mInBottomSpot;
    private boolean mInTopSpot;
    private int mLastEnd;
    private int mLastStart;
    private float mLastX;
    private float mLastY;
    private RecyclerView mRecyclerView;
    private int mScrollDistance;
    private OverScroller mScroller;
    private OnSlideSelectListener mSelectListener;
    private int mStart;
    private int mTopBoundFrom;
    private int mTopBoundTo;
    private final Runnable mScrollRunnable = new Runnable() { // from class: com.luck.picture.lib.widget.SlideSelectTouchListener.1
        @Override // java.lang.Runnable
        public void run() {
            if (SlideSelectTouchListener.this.mScroller == null || !SlideSelectTouchListener.this.mScroller.computeScrollOffset()) {
                return;
            }
            SlideSelectTouchListener slideSelectTouchListener = SlideSelectTouchListener.this;
            slideSelectTouchListener.scrollBy(slideSelectTouchListener.mScrollDistance);
            RecyclerView recyclerView = SlideSelectTouchListener.this.mRecyclerView;
            Runnable runnable = SlideSelectTouchListener.this.mScrollRunnable;
            WeakHashMap weakHashMap = N.f16168a;
            recyclerView.postOnAnimation(runnable);
        }
    };
    private int mMaxScrollDistance = 16;
    private int mAutoScrollDistance = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);
    private int mTouchRegionTopOffset = 0;
    private int mTouchRegionBottomOffset = 0;
    private boolean mScrollAboveTopRegion = true;
    private boolean mScrollBelowTopRegion = true;

    public interface OnAdvancedSlideSelectListener extends OnSlideSelectListener {
        void onSelectionFinished(int i7);

        void onSelectionStarted(int i7);
    }

    public interface OnSlideSelectListener {
        void onSelectChange(int i7, int i10, boolean z3);
    }

    public SlideSelectTouchListener() {
        reset();
    }

    private void changeSelectedRange(RecyclerView recyclerView, MotionEvent motionEvent) {
        changeSelectedRange(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    private void initScroller(Context context) {
        if (this.mScroller == null) {
            this.mScroller = new OverScroller(context, new LinearInterpolator());
        }
    }

    private void notifySelectRangeChange() {
        int i7;
        int i10;
        if (this.mSelectListener == null || (i7 = this.mStart) == -1 || (i10 = this.mEnd) == -1) {
            return;
        }
        int iMin = Math.min(i7, i10);
        int iMax = Math.max(this.mStart, this.mEnd);
        if (iMin < 0) {
            return;
        }
        int i11 = this.mLastStart;
        if (i11 != -1 && this.mLastEnd != -1) {
            if (iMin > i11) {
                this.mSelectListener.onSelectChange(i11, iMin - 1, false);
            } else if (iMin < i11) {
                this.mSelectListener.onSelectChange(iMin, i11 - 1, true);
            }
            int i12 = this.mLastEnd;
            if (iMax > i12) {
                this.mSelectListener.onSelectChange(i12 + 1, iMax, true);
            } else if (iMax < i12) {
                this.mSelectListener.onSelectChange(iMax + 1, i12, false);
            }
        } else if (iMax - iMin == 1) {
            this.mSelectListener.onSelectChange(iMin, iMin, true);
        } else {
            this.mSelectListener.onSelectChange(iMin, iMax, true);
        }
        this.mLastStart = iMin;
        this.mLastEnd = iMax;
    }

    private void processAutoScroll(MotionEvent motionEvent) {
        int y8 = (int) motionEvent.getY();
        int i7 = this.mTopBoundFrom;
        if (y8 >= i7 && y8 <= this.mTopBoundTo) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            int i10 = this.mTopBoundTo;
            int i11 = this.mTopBoundFrom;
            this.mScrollDistance = (int) (this.mMaxScrollDistance * (((i10 - i11) - (y8 - i11)) / (i10 - i11)) * (-1.0f));
            if (this.mInTopSpot) {
                return;
            }
            this.mInTopSpot = true;
            startAutoScroll();
            return;
        }
        if (this.mScrollAboveTopRegion && y8 < i7) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            this.mScrollDistance = this.mMaxScrollDistance * (-1);
            if (this.mInTopSpot) {
                return;
            }
            this.mInTopSpot = true;
            startAutoScroll();
            return;
        }
        if (y8 >= this.mBottomBoundFrom && y8 <= this.mBottomBoundTo) {
            this.mLastX = motionEvent.getX();
            this.mLastY = motionEvent.getY();
            float f10 = y8;
            int i12 = this.mBottomBoundFrom;
            this.mScrollDistance = (int) (this.mMaxScrollDistance * ((f10 - i12) / (this.mBottomBoundTo - i12)));
            if (this.mInBottomSpot) {
                return;
            }
            this.mInBottomSpot = true;
            startAutoScroll();
            return;
        }
        if (!this.mScrollBelowTopRegion || y8 <= this.mBottomBoundTo) {
            this.mInBottomSpot = false;
            this.mInTopSpot = false;
            this.mLastX = Float.MIN_VALUE;
            this.mLastY = Float.MIN_VALUE;
            stopAutoScroll();
            return;
        }
        this.mLastX = motionEvent.getX();
        this.mLastY = motionEvent.getY();
        this.mScrollDistance = this.mMaxScrollDistance;
        if (this.mInTopSpot) {
            return;
        }
        this.mInTopSpot = true;
        startAutoScroll();
    }

    private void reset() {
        setActive(false);
        OnSlideSelectListener onSlideSelectListener = this.mSelectListener;
        if (onSlideSelectListener != null && (onSlideSelectListener instanceof OnAdvancedSlideSelectListener)) {
            ((OnAdvancedSlideSelectListener) onSlideSelectListener).onSelectionFinished(this.mEnd);
        }
        this.mStart = -1;
        this.mEnd = -1;
        this.mLastStart = -1;
        this.mLastEnd = -1;
        this.mInTopSpot = false;
        this.mInBottomSpot = false;
        this.mLastX = Float.MIN_VALUE;
        this.mLastY = Float.MIN_VALUE;
        stopAutoScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollBy(int i7) {
        this.mRecyclerView.scrollBy(0, i7 > 0 ? Math.min(i7, this.mMaxScrollDistance) : Math.max(i7, -this.mMaxScrollDistance));
        float f10 = this.mLastX;
        if (f10 != Float.MIN_VALUE) {
            float f11 = this.mLastY;
            if (f11 != Float.MIN_VALUE) {
                changeSelectedRange(this.mRecyclerView, f10, f11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.isActive || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            reset();
        }
        this.mRecyclerView = recyclerView;
        int height = recyclerView.getHeight();
        int i7 = this.mTouchRegionTopOffset;
        this.mTopBoundFrom = i7;
        int i10 = this.mAutoScrollDistance;
        this.mTopBoundTo = i7 + i10;
        int i11 = this.mTouchRegionBottomOffset;
        this.mBottomBoundFrom = (height + i11) - i10;
        this.mBottomBoundTo = height + i11;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.isActive) {
            reset();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.mInTopSpot && !this.mInBottomSpot) {
                    changeSelectedRange(recyclerView, motionEvent);
                }
                processAutoScroll(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        reset();
    }

    public void setActive(boolean z3) {
        this.isActive = z3;
    }

    public SlideSelectTouchListener setRecyclerViewHeaderCount(int i7) {
        this.mHeaderViewCount = i7;
        return this;
    }

    public void startAutoScroll() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            return;
        }
        initScroller(recyclerView.getContext());
        if (this.mScroller.isFinished()) {
            this.mRecyclerView.removeCallbacks(this.mScrollRunnable);
            OverScroller overScroller = this.mScroller;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 5000, 100000);
            RecyclerView recyclerView2 = this.mRecyclerView;
            Runnable runnable = this.mScrollRunnable;
            WeakHashMap weakHashMap = N.f16168a;
            recyclerView2.postOnAnimation(runnable);
        }
    }

    public void startSlideSelection(int i7) {
        setActive(true);
        this.mStart = i7;
        this.mEnd = i7;
        this.mLastStart = i7;
        this.mLastEnd = i7;
        OnSlideSelectListener onSlideSelectListener = this.mSelectListener;
        if (onSlideSelectListener == null || !(onSlideSelectListener instanceof OnAdvancedSlideSelectListener)) {
            return;
        }
        ((OnAdvancedSlideSelectListener) onSlideSelectListener).onSelectionStarted(i7);
    }

    public void stopAutoScroll() {
        try {
            OverScroller overScroller = this.mScroller;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.mRecyclerView.removeCallbacks(this.mScrollRunnable);
            this.mScroller.abortAnimation();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public SlideSelectTouchListener withBottomOffset(int i7) {
        this.mTouchRegionBottomOffset = i7;
        return this;
    }

    public SlideSelectTouchListener withMaxScrollDistance(int i7) {
        this.mMaxScrollDistance = i7;
        return this;
    }

    public SlideSelectTouchListener withScrollAboveTopRegion(boolean z3) {
        this.mScrollAboveTopRegion = z3;
        return this;
    }

    public SlideSelectTouchListener withScrollBelowTopRegion(boolean z3) {
        this.mScrollBelowTopRegion = z3;
        return this;
    }

    public SlideSelectTouchListener withSelectListener(OnSlideSelectListener onSlideSelectListener) {
        this.mSelectListener = onSlideSelectListener;
        return this;
    }

    public SlideSelectTouchListener withTopOffset(int i7) {
        this.mTouchRegionTopOffset = i7;
        return this;
    }

    public SlideSelectTouchListener withTouchRegion(int i7) {
        this.mAutoScrollDistance = i7;
        return this;
    }

    private void changeSelectedRange(RecyclerView recyclerView, float f10, float f11) {
        int childAdapterPosition;
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(f10, f11);
        if (viewFindChildViewUnder == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - this.mHeaderViewCount) == -1 || this.mEnd == childAdapterPosition) {
            return;
        }
        this.mEnd = childAdapterPosition;
        notifySelectRangeChange();
    }
}
