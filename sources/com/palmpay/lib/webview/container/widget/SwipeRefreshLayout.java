package com.palmpay.lib.webview.container.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.C1066s;
import androidx.core.view.E;
import androidx.core.view.N;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.r;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent3, NestedScrollingParent2, NestedScrollingChild3, NestedScrollingChild2, NestedScrollingParent, NestedScrollingChild {
    private static final int ALPHA_ANIMATION_DURATION = 300;
    private static final int ANIMATE_TO_START_DURATION = 200;
    private static final int ANIMATE_TO_TRIGGER_DURATION = 200;

    @VisibleForTesting
    static final int CIRCLE_DIAMETER = 40;

    @VisibleForTesting
    static final int CIRCLE_DIAMETER_LARGE = 56;
    private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0f;
    public static final int DEFAULT = 1;
    private static final int DEFAULT_CIRCLE_TARGET = 64;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final float DRAG_RATE = 0.5f;
    private static final int INVALID_POINTER = -1;
    public static final int LARGE = 0;
    private static final int[] LAYOUT_ATTRS = {R.attr.enabled};
    private static final String LOG_TAG = "SwipeRefreshLayout";
    private static final int MAX_ALPHA = 255;
    private static final float MAX_PROGRESS_ANGLE = 0.8f;
    private static final int SCALE_DOWN_DURATION = 150;
    private static final int STARTING_PROGRESS_ALPHA = 76;
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private OnChildScrollUpCallback mChildScrollUpCallback;
    private int mCircleDiameter;
    CircleImageView mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    private boolean mEnableLegacyRequestDisallowInterceptTouch;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    OnRefreshListener mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final r mNestedScrollingChildHelper;
    private final C1066s mNestedScrollingParentHelper;
    private final int[] mNestedScrollingV2ConsumedCompat;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    CircularProgressDrawable mProgress;
    private boolean mPullToRefreshEnabled;
    private Animation.AnimationListener mRefreshListener;
    boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(@NonNull SwipeRefreshLayout swipeRefreshLayout, @Nullable View view);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void animateOffsetToCorrectPosition(int i7, Animation.AnimationListener animationListener) {
        this.mFrom = i7;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200L);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i7, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i7, animationListener);
            return;
        }
        this.mFrom = i7;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200L);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void createProgressView() {
        this.mCircleView = new CircleImageView(getContext());
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.setStyle(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    private void finishSpinner(float f10) {
        if (f10 > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.setStartEndTrim(0.0f, 0.0f);
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, !this.mScale ? new Animation.AnimationListener() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (swipeRefreshLayout.mScale) {
                    return;
                }
                swipeRefreshLayout.startScaleDownAnimation(null);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        } : null);
        this.mProgress.setArrowEnabled(false);
    }

    private boolean isAnimationRunning(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void moveSpinner(float f10) {
        this.mProgress.setArrowEnabled(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.mTotalDragDistance));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.mTotalDragDistance;
        int i7 = this.mCustomSlingshotDistance;
        if (i7 <= 0) {
            i7 = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f11 = i7;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * DECELERATE_INTERPOLATION_FACTOR) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * DECELERATE_INTERPOLATION_FACTOR;
        int i10 = this.mOriginalOffsetTop + ((int) ((f11 * fMin) + (f11 * fPow * DECELERATE_INTERPOLATION_FACTOR)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f10 / this.mTotalDragDistance));
        }
        if (f10 < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > STARTING_PROGRESS_ALPHA && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.setStartEndTrim(0.0f, Math.min(MAX_PROGRESS_ANGLE, fMax * MAX_PROGRESS_ANGLE));
        this.mProgress.setArrowScale(Math.min(1.0f, fMax));
        this.mProgress.setProgressRotation(((fPow * DECELERATE_INTERPOLATION_FACTOR) + ((fMax * 0.4f) - 0.25f)) * DRAG_RATE);
        setTargetOffsetTopAndBottom(i10 - this.mCurrentTargetOffsetTop);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            this.mActivePointerId = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i7) {
        this.mCircleView.getBackground().setAlpha(i7);
        this.mProgress.setAlpha(i7);
    }

    private Animation startAlphaAnimation(final int i7, final int i10) {
        Animation animation = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.mProgress;
                int i11 = i7;
                circularProgressDrawable.setAlpha((int) (((i10 - i11) * f10) + i11));
            }
        };
        animation.setDuration(300L);
        this.mCircleView.setAnimationListener(null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(animation);
        return animation;
    }

    private void startDragging(float f10) {
        float f11 = this.mInitialDownY;
        float f12 = f10 - f11;
        int i7 = this.mTouchSlop;
        if (f12 <= i7 || this.mIsBeingDragged) {
            return;
        }
        this.mInitialMotionY = f11 + i7;
        this.mIsBeingDragged = true;
        this.mProgress.setAlpha(STARTING_PROGRESS_ALPHA);
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), STARTING_PROGRESS_ALPHA);
    }

    private void startScaleDownReturnToStartAnimation(int i7, Animation.AnimationListener animationListener) {
        this.mFrom = i7;
        this.mStartingScale = this.mCircleView.getScaleX();
        Animation animation = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                float f11 = swipeRefreshLayout.mStartingScale;
                swipeRefreshLayout.setAnimationProgress(((-f11) * f10) + f11);
                SwipeRefreshLayout.this.moveToStart(f10);
            }
        };
        this.mScaleDownToStartAnimation = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        Animation animation = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f10);
            }
        };
        this.mScaleAnimation = animation;
        animation.setDuration(this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public boolean canChildScrollUp() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.mChildScrollUpCallback;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.mTarget);
        }
        View view = this.mTarget;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f10, float f11, boolean z3) {
        return this.mNestedScrollingChildHelper.a(f10, f11, z3);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.mNestedScrollingChildHelper.b(f10, f11);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2, int i11) {
        return i11 == 0 && dispatchNestedPreScroll(i7, i10, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i7, int i10, int i11, int i12, @Nullable int[] iArr, int i13, @NonNull int[] iArr2) {
        if (i13 == 0) {
            this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, i13, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i10) {
        int i11 = this.mCircleViewIndex;
        if (i11 < 0) {
            return i10;
        }
        if (i10 == i7 - 1) {
            return i11;
        }
        return i10 >= i11 ? i10 + 1 : i10;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i7) {
        return i7 == 0 && hasNestedScrollingParent();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f16281d;
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    public void moveToStart(float f10) {
        int i7 = this.mFrom;
        setTargetOffsetTopAndBottom((i7 + ((int) ((this.mOriginalOffsetTop - i7) * f10))) - this.mCircleView.getTop());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x005d  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        if (!this.mPullToRefreshEnabled) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else if (actionMasked == 2) {
            int i7 = this.mActivePointerId;
            if (i7 == -1) {
                Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i7);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            startDragging(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else if (actionMasked == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        return this.mIsBeingDragged;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.mCircleView.getMeasuredWidth();
        int measuredHeight2 = this.mCircleView.getMeasuredHeight();
        int i13 = measuredWidth / 2;
        int i14 = measuredWidth2 / 2;
        int i15 = this.mCurrentTargetOffsetTop;
        this.mCircleView.layout(i13 - i14, i15, i13 + i14, measuredHeight2 + i15);
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
        this.mCircleViewIndex = -1;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == this.mCircleView) {
                this.mCircleViewIndex = i11;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z3) {
        return dispatchNestedFling(f10, f11, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr, int i11) {
        if (i11 == 0) {
            onNestedPreScroll(view, i7, i10, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i7, int i10, int i11, int i12, int i13, @NonNull int[] iArr) {
        if (i13 != 0) {
            return;
        }
        int i14 = iArr[1];
        dispatchNestedScroll(i7, i10, i11, i12, this.mParentOffsetInWindow, i13, iArr);
        int i15 = i12 - (iArr[1] - i14);
        int i16 = i15 == 0 ? i12 + this.mParentOffsetInWindow[1] : i15;
        if (i16 >= 0 || canChildScrollUp()) {
            return;
        }
        float fAbs = this.mTotalUnconsumed + Math.abs(i16);
        this.mTotalUnconsumed = fAbs;
        moveSpinner(fAbs);
        iArr[1] = iArr[1] + i15;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.mRefreshing);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.mRefreshing);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i7, int i10) {
        if (i10 == 0) {
            return onStartNestedScroll(view, view2, i7);
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mPullToRefreshEnabled) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.mIsBeingDragged) {
                    float y8 = (motionEvent.getY(iFindPointerIndex) - this.mInitialMotionY) * DRAG_RATE;
                    this.mIsBeingDragged = false;
                    finishSpinner(y8);
                }
                this.mActivePointerId = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex2 < 0) {
                    Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y10 = motionEvent.getY(iFindPointerIndex2);
                startDragging(y10);
                if (this.mIsBeingDragged) {
                    float f10 = (y10 - this.mInitialMotionY) * DRAG_RATE;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    moveSpinner(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        ViewParent parent;
        View view = this.mTarget;
        if (view != null) {
            WeakHashMap weakHashMap = N.f16168a;
            if (!E.i(view)) {
                if (this.mEnableLegacyRequestDisallowInterceptTouch || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z3);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setAnimationProgress(float f10) {
        this.mCircleView.setScaleX(f10);
        this.mCircleView.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        ensureTarget();
        this.mProgress.setColorSchemeColors(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            iArr2[i7] = context.getColor(iArr[i7]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i7) {
        this.mTotalDragDistance = i7;
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (z3) {
            return;
        }
        reset();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z3) {
        this.mEnableLegacyRequestDisallowInterceptTouch = z3;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z3) {
        this.mNestedScrollingChildHelper.g(z3);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.mChildScrollUpCallback = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.mListener = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i7) {
        setProgressBackgroundColorSchemeResource(i7);
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i7) {
        this.mCircleView.setBackgroundColor(i7);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i7) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i7));
    }

    public void setProgressViewEndTarget(boolean z3, int i7) {
        this.mSpinnerOffsetEnd = i7;
        this.mScale = z3;
        this.mCircleView.invalidate();
    }

    public void setProgressViewOffset(boolean z3, int i7, int i10) {
        this.mScale = z3;
        this.mOriginalOffsetTop = i7;
        this.mSpinnerOffsetEnd = i10;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public void setPullToRefreshEnabled(boolean z3) {
        this.mPullToRefreshEnabled = z3;
        if (z3) {
            return;
        }
        reset();
    }

    public void setRefreshing(boolean z3) {
        if (!z3 || this.mRefreshing == z3) {
            setRefreshing(z3, false);
            return;
        }
        this.mRefreshing = z3;
        setTargetOffsetTopAndBottom((!this.mUsingCustomStart ? this.mSpinnerOffsetEnd + this.mOriginalOffsetTop : this.mSpinnerOffsetEnd) - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i7) {
        if (i7 == 0 || i7 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i7 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.setStyle(i7);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public void setSlingshotDistance(@Px int i7) {
        this.mCustomSlingshotDistance = i7;
    }

    public void setTargetOffsetTopAndBottom(int i7) {
        this.mCircleView.bringToFront();
        CircleImageView circleImageView = this.mCircleView;
        WeakHashMap weakHashMap = N.f16168a;
        circleImageView.offsetTopAndBottom(i7);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i7, int i10) {
        return i10 == 0 && startNestedScroll(i7);
    }

    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
            }
        };
        this.mScaleDownAnimation = animation;
        animation.setDuration(150L);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i7) {
        if (i7 == 0) {
            stopNestedScroll();
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        };
        final boolean mRefreshing;

        public SavedState(Parcelable parcelable, boolean z3) {
            super(parcelable);
            this.mRefreshing = z3;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.mRefreshing ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mRefreshing = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.mRefreshing) {
                    swipeRefreshLayout.reset();
                    return;
                }
                swipeRefreshLayout.mProgress.setAlpha(255);
                SwipeRefreshLayout.this.mProgress.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.mNotify && (onRefreshListener = swipeRefreshLayout2.mListener) != null) {
                    onRefreshListener.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.mCurrentTargetOffsetTop = swipeRefreshLayout3.mCircleView.getTop();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        };
        this.mAnimateToCorrectPosition = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                int iAbs = !swipeRefreshLayout.mUsingCustomStart ? swipeRefreshLayout.mSpinnerOffsetEnd - Math.abs(swipeRefreshLayout.mOriginalOffsetTop) : swipeRefreshLayout.mSpinnerOffsetEnd;
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                int i7 = swipeRefreshLayout2.mFrom;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i7 + ((int) ((iAbs - i7) * f10))) - swipeRefreshLayout2.mCircleView.getTop());
                SwipeRefreshLayout.this.mProgress.setArrowScale(1.0f - f10);
            }
        };
        this.mAnimateToStartPosition = new Animation() { // from class: com.palmpay.lib.webview.container.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f10, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f10);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(DECELERATE_INTERPOLATION_FACTOR);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i7;
        this.mTotalDragDistance = i7;
        this.mNestedScrollingParentHelper = new C1066s();
        this.mNestedScrollingChildHelper = new r(this);
        setNestedScrollingEnabled(true);
        int i10 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i10;
        this.mOriginalOffsetTop = i10;
        moveToStart(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.c(i7, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.f(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        if (i10 > 0) {
            float f10 = this.mTotalUnconsumed;
            if (f10 > 0.0f) {
                float f11 = i10;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f10 - f11;
                    iArr[1] = i10;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i10 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i10 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i7 - iArr[0], i10 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.mNestedScrollingParentHelper.f16285a = i7;
        startNestedScroll(i7 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i7 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.f16285a = 0;
        this.mNestedScrollInProgress = false;
        float f10 = this.mTotalUnconsumed;
        if (f10 > 0.0f) {
            finishSpinner(f10);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i7) {
        return this.mNestedScrollingChildHelper.h(i7, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.i(0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr, int i13) {
        return i13 == 0 && this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, i13, null);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.mNestedScrollingChildHelper.d(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12, int i13) {
        onNestedScroll(view, i7, i10, i11, i12, i13, this.mNestedScrollingV2ConsumedCompat);
    }

    private void setRefreshing(boolean z3, boolean z8) {
        if (this.mRefreshing != z3) {
            this.mNotify = z8;
            ensureTarget();
            this.mRefreshing = z3;
            if (z3) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        onNestedScroll(view, i7, i10, i11, i12, 0, this.mNestedScrollingV2ConsumedCompat);
    }
}
