package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.N;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
class FastScroller extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int ANIMATION_STATE_FADING_IN = 1;
    private static final int ANIMATION_STATE_FADING_OUT = 3;
    private static final int ANIMATION_STATE_IN = 2;
    private static final int ANIMATION_STATE_OUT = 0;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_X = 1;
    private static final int DRAG_Y = 2;
    private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
    private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
    private static final int HIDE_DURATION_MS = 500;
    private static final int SCROLLBAR_FULL_OPAQUE = 255;
    private static final int SHOW_DURATION_MS = 500;
    private static final int STATE_DRAGGING = 2;
    private static final int STATE_HIDDEN = 0;
    private static final int STATE_VISIBLE = 1;
    int mAnimationState;
    private final Runnable mHideRunnable;

    @VisibleForTesting
    float mHorizontalDragX;

    @VisibleForTesting
    int mHorizontalThumbCenterX;
    private final StateListDrawable mHorizontalThumbDrawable;
    private final int mHorizontalThumbHeight;

    @VisibleForTesting
    int mHorizontalThumbWidth;
    private final Drawable mHorizontalTrackDrawable;
    private final int mHorizontalTrackHeight;
    private final int mMargin;
    private final RecyclerView.OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private final int mScrollbarMinimumRange;
    final ValueAnimator mShowHideAnimator;

    @VisibleForTesting
    float mVerticalDragY;

    @VisibleForTesting
    int mVerticalThumbCenterY;
    final StateListDrawable mVerticalThumbDrawable;

    @VisibleForTesting
    int mVerticalThumbHeight;
    private final int mVerticalThumbWidth;
    final Drawable mVerticalTrackDrawable;
    private final int mVerticalTrackWidth;
    private static final int[] PRESSED_STATE_SET = {R.attr.state_pressed};
    private static final int[] EMPTY_STATE_SET = new int[0];
    private int mRecyclerViewWidth = 0;
    private int mRecyclerViewHeight = 0;
    private boolean mNeedVerticalScrollbar = false;
    private boolean mNeedHorizontalScrollbar = false;
    private int mState = 0;
    private int mDragState = 0;
    private final int[] mVerticalRange = new int[2];
    private final int[] mHorizontalRange = new int[2];

    public class AnimatorListener extends AnimatorListenerAdapter {
        private boolean mCanceled = false;

        public AnimatorListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.mCanceled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.mCanceled) {
                this.mCanceled = false;
                return;
            }
            if (((Float) FastScroller.this.mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0f) {
                FastScroller fastScroller = FastScroller.this;
                fastScroller.mAnimationState = 0;
                fastScroller.setState(0);
            } else {
                FastScroller fastScroller2 = FastScroller.this;
                fastScroller2.mAnimationState = 2;
                fastScroller2.requestRedraw();
            }
        }
    }

    public class AnimatorUpdater implements ValueAnimator.AnimatorUpdateListener {
        public AnimatorUpdater() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            FastScroller.this.mVerticalThumbDrawable.setAlpha(iFloatValue);
            FastScroller.this.mVerticalTrackDrawable.setAlpha(iFloatValue);
            FastScroller.this.requestRedraw();
        }
    }

    public FastScroller(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i7, int i10, int i11) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.mShowHideAnimator = valueAnimatorOfFloat;
        this.mAnimationState = 0;
        this.mHideRunnable = new Runnable() { // from class: androidx.recyclerview.widget.FastScroller.1
            @Override // java.lang.Runnable
            public void run() {
                FastScroller.this.hide(500);
            }
        };
        this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: androidx.recyclerview.widget.FastScroller.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i12, int i13) {
                FastScroller.this.updateScrollPosition(recyclerView2.computeHorizontalScrollOffset(), recyclerView2.computeVerticalScrollOffset());
            }
        };
        this.mVerticalThumbDrawable = stateListDrawable;
        this.mVerticalTrackDrawable = drawable;
        this.mHorizontalThumbDrawable = stateListDrawable2;
        this.mHorizontalTrackDrawable = drawable2;
        this.mVerticalThumbWidth = Math.max(i7, stateListDrawable.getIntrinsicWidth());
        this.mVerticalTrackWidth = Math.max(i7, drawable.getIntrinsicWidth());
        this.mHorizontalThumbHeight = Math.max(i7, stateListDrawable2.getIntrinsicWidth());
        this.mHorizontalTrackHeight = Math.max(i7, drawable2.getIntrinsicWidth());
        this.mScrollbarMinimumRange = i10;
        this.mMargin = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListener());
        valueAnimatorOfFloat.addUpdateListener(new AnimatorUpdater());
        attachToRecyclerView(recyclerView);
    }

    private void cancelHide() {
        this.mRecyclerView.removeCallbacks(this.mHideRunnable);
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeItemDecoration(this);
        this.mRecyclerView.removeOnItemTouchListener(this);
        this.mRecyclerView.removeOnScrollListener(this.mOnScrollListener);
        cancelHide();
    }

    private void drawHorizontalScrollbar(Canvas canvas) {
        int i7 = this.mRecyclerViewHeight;
        int i10 = this.mHorizontalThumbHeight;
        int i11 = i7 - i10;
        int i12 = this.mHorizontalThumbCenterX;
        int i13 = this.mHorizontalThumbWidth;
        int i14 = i12 - (i13 / 2);
        this.mHorizontalThumbDrawable.setBounds(0, 0, i13, i10);
        this.mHorizontalTrackDrawable.setBounds(0, 0, this.mRecyclerViewWidth, this.mHorizontalTrackHeight);
        canvas.translate(0.0f, i11);
        this.mHorizontalTrackDrawable.draw(canvas);
        canvas.translate(i14, 0.0f);
        this.mHorizontalThumbDrawable.draw(canvas);
        canvas.translate(-i14, -i11);
    }

    private void drawVerticalScrollbar(Canvas canvas) {
        int i7 = this.mRecyclerViewWidth;
        int i10 = this.mVerticalThumbWidth;
        int i11 = i7 - i10;
        int i12 = this.mVerticalThumbCenterY;
        int i13 = this.mVerticalThumbHeight;
        int i14 = i12 - (i13 / 2);
        this.mVerticalThumbDrawable.setBounds(0, 0, i10, i13);
        this.mVerticalTrackDrawable.setBounds(0, 0, this.mVerticalTrackWidth, this.mRecyclerViewHeight);
        if (!isLayoutRTL()) {
            canvas.translate(i11, 0.0f);
            this.mVerticalTrackDrawable.draw(canvas);
            canvas.translate(0.0f, i14);
            this.mVerticalThumbDrawable.draw(canvas);
            canvas.translate(-i11, -i14);
            return;
        }
        this.mVerticalTrackDrawable.draw(canvas);
        canvas.translate(this.mVerticalThumbWidth, i14);
        canvas.scale(-1.0f, 1.0f);
        this.mVerticalThumbDrawable.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.mVerticalThumbWidth, -i14);
    }

    private int[] getHorizontalRange() {
        int[] iArr = this.mHorizontalRange;
        int i7 = this.mMargin;
        iArr[0] = i7;
        iArr[1] = this.mRecyclerViewWidth - i7;
        return iArr;
    }

    private int[] getVerticalRange() {
        int[] iArr = this.mVerticalRange;
        int i7 = this.mMargin;
        iArr[0] = i7;
        iArr[1] = this.mRecyclerViewHeight - i7;
        return iArr;
    }

    private void horizontalScrollTo(float f10) {
        int[] horizontalRange = getHorizontalRange();
        float fMax = Math.max(horizontalRange[0], Math.min(horizontalRange[1], f10));
        if (Math.abs(this.mHorizontalThumbCenterX - fMax) < 2.0f) {
            return;
        }
        int iScrollTo = scrollTo(this.mHorizontalDragX, fMax, horizontalRange, this.mRecyclerView.computeHorizontalScrollRange(), this.mRecyclerView.computeHorizontalScrollOffset(), this.mRecyclerViewWidth);
        if (iScrollTo != 0) {
            this.mRecyclerView.scrollBy(iScrollTo, 0);
        }
        this.mHorizontalDragX = fMax;
    }

    private boolean isLayoutRTL() {
        RecyclerView recyclerView = this.mRecyclerView;
        WeakHashMap weakHashMap = N.f16168a;
        return recyclerView.getLayoutDirection() == 1;
    }

    private void resetHideDelay(int i7) {
        cancelHide();
        this.mRecyclerView.postDelayed(this.mHideRunnable, i7);
    }

    private int scrollTo(float f10, float f11, int[] iArr, int i7, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 == 0) {
            return 0;
        }
        int i13 = i7 - i11;
        int i14 = (int) (((f11 - f10) / i12) * i13);
        int i15 = i10 + i14;
        if (i15 >= i13 || i15 < 0) {
            return 0;
        }
        return i14;
    }

    private void setupCallbacks() {
        this.mRecyclerView.addItemDecoration(this);
        this.mRecyclerView.addOnItemTouchListener(this);
        this.mRecyclerView.addOnScrollListener(this.mOnScrollListener);
    }

    private void verticalScrollTo(float f10) {
        int[] verticalRange = getVerticalRange();
        float fMax = Math.max(verticalRange[0], Math.min(verticalRange[1], f10));
        if (Math.abs(this.mVerticalThumbCenterY - fMax) < 2.0f) {
            return;
        }
        int iScrollTo = scrollTo(this.mVerticalDragY, fMax, verticalRange, this.mRecyclerView.computeVerticalScrollRange(), this.mRecyclerView.computeVerticalScrollOffset(), this.mRecyclerViewHeight);
        if (iScrollTo != 0) {
            this.mRecyclerView.scrollBy(0, iScrollTo);
        }
        this.mVerticalDragY = fMax;
    }

    public void attachToRecyclerView(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
        }
    }

    @VisibleForTesting
    public Drawable getHorizontalThumbDrawable() {
        return this.mHorizontalThumbDrawable;
    }

    @VisibleForTesting
    public Drawable getHorizontalTrackDrawable() {
        return this.mHorizontalTrackDrawable;
    }

    @VisibleForTesting
    public Drawable getVerticalThumbDrawable() {
        return this.mVerticalThumbDrawable;
    }

    @VisibleForTesting
    public Drawable getVerticalTrackDrawable() {
        return this.mVerticalTrackDrawable;
    }

    @VisibleForTesting
    public void hide(int i7) {
        int i10 = this.mAnimationState;
        if (i10 == 1) {
            this.mShowHideAnimator.cancel();
        } else if (i10 != 2) {
            return;
        }
        this.mAnimationState = 3;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.mShowHideAnimator.setDuration(i7);
        this.mShowHideAnimator.start();
    }

    public boolean isDragging() {
        return this.mState == 2;
    }

    @VisibleForTesting
    public boolean isPointInsideHorizontalThumb(float f10, float f11) {
        if (f11 < this.mRecyclerViewHeight - this.mHorizontalThumbHeight) {
            return false;
        }
        int i7 = this.mHorizontalThumbCenterX;
        int i10 = this.mHorizontalThumbWidth;
        return f10 >= ((float) (i7 - (i10 / 2))) && f10 <= ((float) ((i10 / 2) + i7));
    }

    @VisibleForTesting
    public boolean isPointInsideVerticalThumb(float f10, float f11) {
        if (isLayoutRTL()) {
            if (f10 > this.mVerticalThumbWidth) {
                return false;
            }
        } else if (f10 < this.mRecyclerViewWidth - this.mVerticalThumbWidth) {
            return false;
        }
        int i7 = this.mVerticalThumbCenterY;
        int i10 = this.mVerticalThumbHeight;
        return f11 >= ((float) (i7 - (i10 / 2))) && f11 <= ((float) ((i10 / 2) + i7));
    }

    @VisibleForTesting
    public boolean isVisible() {
        return this.mState == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.mRecyclerViewWidth != this.mRecyclerView.getWidth() || this.mRecyclerViewHeight != this.mRecyclerView.getHeight()) {
            this.mRecyclerViewWidth = this.mRecyclerView.getWidth();
            this.mRecyclerViewHeight = this.mRecyclerView.getHeight();
            setState(0);
        } else if (this.mAnimationState != 0) {
            if (this.mNeedVerticalScrollbar) {
                drawVerticalScrollbar(canvas);
            }
            if (this.mNeedHorizontalScrollbar) {
                drawHorizontalScrollbar(canvas);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i7 = this.mState;
        if (i7 != 1) {
            return i7 == 2;
        }
        boolean zIsPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
        boolean zIsPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zIsPointInsideVerticalThumb && !zIsPointInsideHorizontalThumb)) {
            return false;
        }
        if (zIsPointInsideHorizontalThumb) {
            this.mDragState = 1;
            this.mHorizontalDragX = (int) motionEvent.getX();
        } else if (zIsPointInsideVerticalThumb) {
            this.mDragState = 2;
            this.mVerticalDragY = (int) motionEvent.getY();
        }
        setState(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.mState == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zIsPointInsideVerticalThumb = isPointInsideVerticalThumb(motionEvent.getX(), motionEvent.getY());
            boolean zIsPointInsideHorizontalThumb = isPointInsideHorizontalThumb(motionEvent.getX(), motionEvent.getY());
            if (zIsPointInsideVerticalThumb || zIsPointInsideHorizontalThumb) {
                if (zIsPointInsideHorizontalThumb) {
                    this.mDragState = 1;
                    this.mHorizontalDragX = (int) motionEvent.getX();
                } else if (zIsPointInsideVerticalThumb) {
                    this.mDragState = 2;
                    this.mVerticalDragY = (int) motionEvent.getY();
                }
                setState(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.mState == 2) {
            this.mVerticalDragY = 0.0f;
            this.mHorizontalDragX = 0.0f;
            setState(1);
            this.mDragState = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.mState == 2) {
            show();
            if (this.mDragState == 1) {
                horizontalScrollTo(motionEvent.getX());
            }
            if (this.mDragState == 2) {
                verticalScrollTo(motionEvent.getY());
            }
        }
    }

    public void requestRedraw() {
        this.mRecyclerView.invalidate();
    }

    public void setState(int i7) {
        if (i7 == 2 && this.mState != 2) {
            this.mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
            cancelHide();
        }
        if (i7 == 0) {
            requestRedraw();
        } else {
            show();
        }
        if (this.mState == 2 && i7 != 2) {
            this.mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
            resetHideDelay(HIDE_DELAY_AFTER_DRAGGING_MS);
        } else if (i7 == 1) {
            resetHideDelay(1500);
        }
        this.mState = i7;
    }

    public void show() {
        int i7 = this.mAnimationState;
        if (i7 != 0) {
            if (i7 != 3) {
                return;
            } else {
                this.mShowHideAnimator.cancel();
            }
        }
        this.mAnimationState = 1;
        ValueAnimator valueAnimator = this.mShowHideAnimator;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.mShowHideAnimator.setDuration(500L);
        this.mShowHideAnimator.setStartDelay(0L);
        this.mShowHideAnimator.start();
    }

    public void updateScrollPosition(int i7, int i10) {
        int iComputeVerticalScrollRange = this.mRecyclerView.computeVerticalScrollRange();
        int i11 = this.mRecyclerViewHeight;
        this.mNeedVerticalScrollbar = iComputeVerticalScrollRange - i11 > 0 && i11 >= this.mScrollbarMinimumRange;
        int iComputeHorizontalScrollRange = this.mRecyclerView.computeHorizontalScrollRange();
        int i12 = this.mRecyclerViewWidth;
        boolean z3 = iComputeHorizontalScrollRange - i12 > 0 && i12 >= this.mScrollbarMinimumRange;
        this.mNeedHorizontalScrollbar = z3;
        boolean z8 = this.mNeedVerticalScrollbar;
        if (!z8 && !z3) {
            if (this.mState != 0) {
                setState(0);
                return;
            }
            return;
        }
        if (z8) {
            float f10 = i11;
            this.mVerticalThumbCenterY = (int) ((((f10 / 2.0f) + i10) * f10) / iComputeVerticalScrollRange);
            this.mVerticalThumbHeight = Math.min(i11, (i11 * i11) / iComputeVerticalScrollRange);
        }
        if (this.mNeedHorizontalScrollbar) {
            float f11 = i12;
            this.mHorizontalThumbCenterX = (int) ((((f11 / 2.0f) + i7) * f11) / iComputeHorizontalScrollRange);
            this.mHorizontalThumbWidth = Math.min(i12, (i12 * i12) / iComputeHorizontalScrollRange);
        }
        int i13 = this.mState;
        if (i13 == 0 || i13 == 1) {
            setState(1);
        }
    }
}
