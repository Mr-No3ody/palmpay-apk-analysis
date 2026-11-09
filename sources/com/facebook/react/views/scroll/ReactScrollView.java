package com.facebook.react.views.scroll;

import E.AbstractC0198c;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import androidx.core.view.N;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.R;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactClippingViewGroup;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ReactOverflowViewWithInset;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.Overflow;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public class ReactScrollView extends ScrollView implements ReactClippingViewGroup, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, ReactAccessibleScrollView, ReactOverflowViewWithInset, ReactScrollViewHelper.HasScrollState, ReactScrollViewHelper.HasStateWrapper, ReactScrollViewHelper.HasFlingAnimator, ReactScrollViewHelper.HasScrollEventThrottle, ReactScrollViewHelper.HasSmoothScroll {
    private static final int UNSET_CONTENT_OFFSET = -1;

    @Nullable
    private static Field sScrollerField = null;
    private static boolean sTriedToGetScrollerField = false;
    private final ValueAnimator DEFAULT_FLING_ANIMATOR;
    private boolean mActivelyScrolling;

    @Nullable
    private Rect mClippingRect;

    @Nullable
    private View mContentView;

    @Nullable
    private ReadableMap mCurrentContentOffset;
    private boolean mDisableIntervalMomentum;
    private boolean mDragging;

    @Nullable
    private Drawable mEndBackground;
    private int mEndFillColor;
    private int mFadingEdgeLengthEnd;
    private int mFadingEdgeLengthStart;

    @Nullable
    private FpsListener mFpsListener;
    private long mLastScrollDispatchTime;

    @Nullable
    private MaintainVisibleScrollPositionHelper mMaintainVisibleContentPositionHelper;
    private final OnScrollDispatchHelper mOnScrollDispatchHelper;
    private Overflow mOverflow;
    private final Rect mOverflowInset;
    private boolean mPagingEnabled;
    private PointerEvents mPointerEvents;

    @Nullable
    private Runnable mPostTouchRunnable;
    private final ReactScrollViewHelper.ReactScrollViewScrollState mReactScrollViewScrollState;
    private boolean mRemoveClippedSubviews;
    private boolean mScrollEnabled;
    private int mScrollEventThrottle;

    @Nullable
    private String mScrollPerfTag;

    @Nullable
    private final OverScroller mScroller;
    private boolean mSendMomentumEvents;
    private int mSnapInterval;

    @Nullable
    private List<Integer> mSnapOffsets;
    private int mSnapToAlignment;
    private boolean mSnapToEnd;
    private boolean mSnapToStart;

    @Nullable
    private StateWrapper mStateWrapper;
    private final Rect mTempRect;
    private final VelocityHelper mVelocityHelper;
    private int pendingContentOffsetX;
    private int pendingContentOffsetY;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollView$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$Overflow;

        static {
            int[] iArr = new int[Overflow.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$Overflow = iArr;
            try {
                iArr[Overflow.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$Overflow[Overflow.VISIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ReactScrollView(Context context) {
        this(context, null);
    }

    private void cancelPostTouchScrolling() {
        Runnable runnable = this.mPostTouchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mPostTouchRunnable = null;
            getFlingAnimator().cancel();
        }
    }

    private int correctFlingVelocityY(int i7) {
        if (Build.VERSION.SDK_INT != 28) {
            return i7;
        }
        float fSignum = Math.signum(this.mOnScrollDispatchHelper.getYFlingVelocity());
        if (fSignum == 0.0f) {
            fSignum = Math.signum(i7);
        }
        return (int) (Math.abs(i7) * fSignum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            p059e1.a.f(this.mFpsListener);
            p059e1.a.f(this.mScrollPerfTag);
            this.mFpsListener.disable(this.mScrollPerfTag);
        }
    }

    private void enableFpsListener() {
        if (isScrollPerfLoggingEnabled()) {
            p059e1.a.f(this.mFpsListener);
            p059e1.a.f(this.mScrollPerfTag);
            this.mFpsListener.enable(this.mScrollPerfTag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    public void flingAndSnap(int i7) {
        int iFloor;
        int iMin;
        int iIntValue;
        int top2;
        int top3;
        int height;
        int scrollY;
        OverScroller overScroller;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.mSnapInterval == 0 && this.mSnapOffsets == null && this.mSnapToAlignment == 0) {
            smoothScrollAndSnap(i7);
            return;
        }
        boolean z3 = getFlingAnimator() != this.DEFAULT_FLING_ANIMATOR;
        int maxScrollY = getMaxScrollY();
        int iPredictFinalScrollPosition = predictFinalScrollPosition(i7);
        if (this.mDisableIntervalMomentum) {
            iPredictFinalScrollPosition = getScrollY();
        }
        int height2 = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.mSnapOffsets;
        int i10 = 2;
        if (list != null) {
            iIntValue = list.get(0).intValue();
            maxScrollY = ((Integer) u.e(1, this.mSnapOffsets)).intValue();
            iMin = maxScrollY;
            iFloor = 0;
            for (int i11 = 0; i11 < this.mSnapOffsets.size(); i11++) {
                int iIntValue2 = this.mSnapOffsets.get(i11).intValue();
                if (iIntValue2 <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - iIntValue2 < iPredictFinalScrollPosition - iFloor) {
                    iFloor = iIntValue2;
                }
                if (iIntValue2 >= iPredictFinalScrollPosition && iIntValue2 - iPredictFinalScrollPosition < iMin - iPredictFinalScrollPosition) {
                    iMin = iIntValue2;
                }
            }
        } else {
            int i12 = this.mSnapToAlignment;
            if (i12 != 0) {
                int i13 = this.mSnapInterval;
                if (i13 > 0) {
                    double d2 = ((double) iPredictFinalScrollPosition) / ((double) i13);
                    double dFloor = Math.floor(d2);
                    int i14 = this.mSnapInterval;
                    int iMax = Math.max(getItemStartOffset(i12, (int) (dFloor * ((double) i14)), i14, height2), 0);
                    int i15 = this.mSnapToAlignment;
                    double dCeil = Math.ceil(d2);
                    int i16 = this.mSnapInterval;
                    iMin = Math.min(getItemStartOffset(i15, (int) (dCeil * ((double) i16)), i16, height2), maxScrollY);
                    iFloor = iMax;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = maxScrollY;
                    int i17 = iMin2;
                    int i18 = 0;
                    int i19 = 0;
                    int iMax2 = 0;
                    while (i18 < viewGroup.getChildCount()) {
                        View childAt = viewGroup.getChildAt(i18);
                        int i20 = this.mSnapToAlignment;
                        if (i20 != 1) {
                            if (i20 == i10) {
                                top3 = childAt.getTop();
                                height = (height2 - childAt.getHeight()) / 2;
                            } else {
                                if (i20 != 3) {
                                    throw new IllegalStateException("Invalid SnapToAlignment value: " + this.mSnapToAlignment);
                                }
                                top3 = childAt.getTop();
                                height = height2 - childAt.getHeight();
                            }
                            top2 = top3 - height;
                        } else {
                            i10 = i10;
                            top2 = childAt.getTop();
                        }
                        if (top2 <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - top2 < iPredictFinalScrollPosition - i19) {
                            i19 = top2;
                        }
                        if (top2 >= iPredictFinalScrollPosition && top2 - iPredictFinalScrollPosition < i17 - iPredictFinalScrollPosition) {
                            i17 = top2;
                        }
                        iMin2 = Math.min(iMin2, top2);
                        iMax2 = Math.max(iMax2, top2);
                        i18++;
                        i10 = i10;
                    }
                    iFloor = Math.max(i19, iMin2);
                    iMin = Math.min(i17, iMax2);
                }
                iIntValue = 0;
            } else {
                double snapInterval = getSnapInterval();
                double d10 = ((double) iPredictFinalScrollPosition) / snapInterval;
                iFloor = (int) (Math.floor(d10) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d10) * snapInterval), maxScrollY);
            }
            iIntValue = 0;
        }
        int i21 = iPredictFinalScrollPosition - iFloor;
        int i22 = iMin - iPredictFinalScrollPosition;
        int i23 = Math.abs(i21) < Math.abs(i22) ? iFloor : iMin;
        if (this.mSnapToEnd || iPredictFinalScrollPosition < maxScrollY) {
            if (!this.mSnapToStart && iPredictFinalScrollPosition <= iIntValue) {
                if (getScrollY() <= iIntValue) {
                    iIntValue = iPredictFinalScrollPosition;
                }
                scrollY = i7;
            } else if (i7 > 0) {
                scrollY = !z3 ? i7 + ((int) (((double) i22) * 10.0d)) : i7;
                iIntValue = iMin;
            } else if (i7 < 0) {
                scrollY = !z3 ? i7 - ((int) (((double) i21) * 10.0d)) : i7;
                iIntValue = iFloor;
            } else {
                scrollY = i7;
                iIntValue = i23;
            }
        } else if (getScrollY() >= maxScrollY) {
            iIntValue = iPredictFinalScrollPosition;
            scrollY = i7;
        } else {
            scrollY = i7;
            iIntValue = maxScrollY;
        }
        int iMin3 = Math.min(Math.max(0, iIntValue), maxScrollY);
        if (z3 || (overScroller = this.mScroller) == null) {
            reactSmoothScrollTo(getScrollX(), iMin3);
            return;
        }
        this.mActivelyScrolling = true;
        int scrollX = getScrollX();
        int scrollY2 = getScrollY();
        if (scrollY == 0) {
            scrollY = iMin3 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY2, 0, scrollY, 0, 0, iMin3, iMin3, 0, (iMin3 == 0 || iMin3 == maxScrollY) ? height2 / 2 : 0);
        postInvalidateOnAnimation();
    }

    private View getContentView() {
        return getChildAt(0);
    }

    private int getItemStartOffset(int i7, int i10, int i11, int i12) {
        int i13;
        if (i7 == 1) {
            return i10;
        }
        if (i7 == 2) {
            i13 = (i12 - i11) / 2;
        } else {
            if (i7 != 3) {
                throw new IllegalStateException("Invalid SnapToAlignment value: " + this.mSnapToAlignment);
            }
            i13 = i12 - i11;
        }
        return i10 - i13;
    }

    private int getMaxScrollY() {
        View view = this.mContentView;
        return Math.max(0, (view == null ? 0 : view.getHeight()) - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private int getScrollDelta(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
    }

    private int getSnapInterval() {
        int i7 = this.mSnapInterval;
        return i7 != 0 ? i7 : getHeight();
    }

    private void handlePostTouchScrolling(int i7, int i10) {
        if (this.mPostTouchRunnable != null) {
            return;
        }
        if (this.mSendMomentumEvents) {
            enableFpsListener();
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i7, i10);
        }
        this.mActivelyScrolling = false;
        Runnable runnable = new Runnable() { // from class: com.facebook.react.views.scroll.ReactScrollView.1
            private boolean mSnappingToPage = false;
            private int mStableFrames = 0;

            @Override // java.lang.Runnable
            public void run() {
                NativeAnimatedModule nativeAnimatedModule;
                if (ReactScrollView.this.mActivelyScrolling) {
                    ReactScrollView.this.mActivelyScrolling = false;
                    this.mStableFrames = 0;
                    ReactScrollView reactScrollView = ReactScrollView.this;
                    WeakHashMap weakHashMap = N.f16168a;
                    reactScrollView.postOnAnimationDelayed(this, 20L);
                    return;
                }
                ReactScrollViewHelper.updateFabricScrollState(ReactScrollView.this);
                int i11 = this.mStableFrames + 1;
                this.mStableFrames = i11;
                if (i11 < 3) {
                    if (ReactScrollView.this.mPagingEnabled && !this.mSnappingToPage) {
                        this.mSnappingToPage = true;
                        ReactScrollView.this.flingAndSnap(0);
                    }
                    ReactScrollView reactScrollView2 = ReactScrollView.this;
                    WeakHashMap weakHashMap2 = N.f16168a;
                    reactScrollView2.postOnAnimationDelayed(this, 20L);
                    return;
                }
                ReactScrollView.this.mPostTouchRunnable = null;
                if (ReactScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactScrollView.this);
                }
                ReactContext reactContext = (ReactContext) ReactScrollView.this.getContext();
                if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(ReactScrollView.this.getId());
                }
                ReactScrollView.this.disableFpsListener();
            }
        };
        this.mPostTouchRunnable = runnable;
        WeakHashMap weakHashMap = N.f16168a;
        postOnAnimationDelayed(runnable, 20L);
    }

    private boolean isContentReady() {
        View contentView = getContentView();
        return (contentView == null || contentView.getWidth() == 0 || contentView.getHeight() == 0) ? false : true;
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private int predictFinalScrollPosition(int i7) {
        if (getFlingAnimator() == this.DEFAULT_FLING_ANIMATOR) {
            return ReactScrollViewHelper.predictFinalScrollPosition(this, 0, i7, 0, getMaxScrollY()).y;
        }
        return getFlingExtrapolatedDistance(i7) + ReactScrollViewHelper.getNextFlingStartValue(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i7);
    }

    private void recreateFlingAnimation(int i7) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currY = this.mScroller.getCurrY();
        boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
        this.mScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo(getScrollX(), (this.mScroller.getCurrX() - currY) + i7);
            return;
        }
        this.mScroller.fling(getScrollX(), i7, 0, (int) (this.mScroller.getCurrVelocity() * Math.signum(this.mScroller.getFinalY() - this.mScroller.getStartY())), 0, 0, 0, Integer.MAX_VALUE);
    }

    private void scrollToChild(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private void setPendingContentOffsets(int i7, int i10) {
        if (isContentReady()) {
            this.pendingContentOffsetX = -1;
            this.pendingContentOffsetY = -1;
        } else {
            this.pendingContentOffsetX = i7;
            this.pendingContentOffsetY = i10;
        }
    }

    private void smoothScrollAndSnap(int i7) {
        double snapInterval = getSnapInterval();
        double nextFlingStartValue = ReactScrollViewHelper.getNextFlingStartValue(this, getScrollY(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().y, i7);
        double dPredictFinalScrollPosition = predictFinalScrollPosition(i7);
        double d2 = nextFlingStartValue / snapInterval;
        int iFloor = (int) Math.floor(d2);
        int iCeil = (int) Math.ceil(d2);
        int iRound = (int) Math.round(d2);
        int iRound2 = (int) Math.round(dPredictFinalScrollPosition / snapInterval);
        if (i7 > 0 && iCeil == iFloor) {
            iCeil++;
        } else if (i7 < 0 && iFloor == iCeil) {
            iFloor--;
        }
        if (i7 > 0 && iRound < iCeil && iRound2 > iFloor) {
            iRound = iCeil;
        } else if (i7 < 0 && iRound > iFloor && iRound2 < iCeil) {
            iRound = iFloor;
        }
        double d10 = ((double) iRound) * snapInterval;
        if (d10 != nextFlingStartValue) {
            this.mActivelyScrolling = true;
            reactSmoothScrollTo(getScrollX(), (int) d10);
        }
    }

    private void updateScrollAwayState(int i7) {
        getReactScrollViewScrollState().setScrollAwayPaddingTop(i7);
        ReactScrollViewHelper.forceUpdateState(this);
    }

    public void abortAnimation() {
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View contentView = getContentView();
            if (this.mEndBackground != null && contentView != null && contentView.getBottom() < getHeight()) {
                this.mEndBackground.setBounds(0, contentView.getBottom(), getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.mScrollEnabled || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView
    public void fling(int i7) {
        int iCorrectFlingVelocityY = correctFlingVelocityY(i7);
        if (this.mPagingEnabled) {
            flingAndSnap(iCorrectFlingVelocityY);
        } else if (this.mScroller != null) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, iCorrectFlingVelocityY, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            WeakHashMap weakHashMap = N.f16168a;
            postInvalidateOnAnimation();
        } else {
            super.fling(iCorrectFlingVelocityY);
        }
        handlePostTouchScrolling(0, iCorrectFlingVelocityY);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public View focusSearch(View view, int i7) {
        View viewFindNextFocusableView;
        View viewFocusSearch = super.focusSearch(view, i7);
        return (!ReactNativeFeatureFlags.enableCustomFocusSearchOnClippedElementsAndroid() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewFindNextFocusableView = ReactScrollViewHelper.findNextFocusableView(this, view, i7)) == null) ? viewFocusSearch : viewFindNextFocusableView;
    }

    @Override // android.widget.ScrollView, android.view.View
    public float getBottomFadingEdgeStrength() {
        return this.mFadingEdgeLengthEnd / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void getClippingRect(Rect rect) {
        Rect rect2 = this.mClippingRect;
        p059e1.a.f(rect2);
        rect.set(rect2);
    }

    public int getFadingEdgeLengthEnd() {
        return this.mFadingEdgeLengthEnd;
    }

    public int getFadingEdgeLengthStart() {
        return this.mFadingEdgeLengthStart;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    @NonNull
    public ValueAnimator getFlingAnimator() {
        return this.DEFAULT_FLING_ANIMATOR;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public int getFlingExtrapolatedDistance(int i7) {
        return ReactScrollViewHelper.predictFinalScrollPosition(this, 0, i7, 0, getMaxScrollY()).y;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public long getLastScrollDispatchTime() {
        return this.mLastScrollDispatchTime;
    }

    @Nullable
    public OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                p229p2.a.v("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = sScrollerField;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    p229p2.a.v("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e10);
            }
        }
        return overScroller;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowView
    @Nullable
    public String getOverflow() {
        int i7 = AnonymousClass2.$SwitchMap$com$facebook$react$uimanager$style$Overflow[this.mOverflow.ordinal()];
        if (i7 == 1) {
            return ViewProps.HIDDEN;
        }
        if (i7 == 2) {
            return ViewProps.SCROLL;
        }
        if (i7 != 3) {
            return null;
        }
        return ViewProps.VISIBLE;
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    public PointerEvents getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollState
    public ReactScrollViewHelper.ReactScrollViewScrollState getReactScrollViewScrollState() {
        return this.mReactScrollViewScrollState;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    /* JADX INFO: renamed from: getRemoveClippedSubviews */
    public boolean get_removeClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.views.scroll.ReactAccessibleScrollView
    public boolean getScrollEnabled() {
        return this.mScrollEnabled;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public int getScrollEventThrottle() {
        return this.mScrollEventThrottle;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasStateWrapper
    @Nullable
    public StateWrapper getStateWrapper() {
        return this.mStateWrapper;
    }

    @Override // android.widget.ScrollView, android.view.View
    public float getTopFadingEdgeStrength() {
        return this.mFadingEdgeLengthStart / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
    }

    public void handleInterceptedTouchEvent(MotionEvent motionEvent) {
        NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
        ReactScrollViewHelper.emitScrollBeginDragEvent(this);
        this.mDragging = true;
        enableFpsListener();
        getFlingAnimator().cancel();
    }

    @Override // com.facebook.react.views.scroll.ReactAccessibleScrollView
    public boolean isPartiallyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        return scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.start();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.mContentView = view2;
        view2.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.mContentView;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.mContentView = null;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.stop();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mOverflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        if (!PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return true;
        }
        try {
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            handleInterceptedTouchEvent(motionEvent);
            return true;
        } catch (IllegalArgumentException e10) {
            p229p2.a.w("ReactNative", "Error intercepting touch event.", e10);
            return false;
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        if (isContentReady()) {
            int scrollX = this.pendingContentOffsetX;
            if (scrollX == -1) {
                scrollX = getScrollX();
            }
            int scrollY = this.pendingContentOffsetY;
            if (scrollY == -1) {
                scrollY = getScrollY();
            }
            scrollTo(scrollX, scrollY);
        }
        ReactScrollViewHelper.emitLayoutEvent(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (this.mContentView == null) {
            return;
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper != null) {
            maintainVisibleScrollPositionHelper.updateScrollPosition();
        }
        if (isShown() && isContentReady()) {
            int scrollY = getScrollY();
            int maxScrollY = getMaxScrollY();
            if (scrollY > maxScrollY) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
        ReactScrollViewHelper.emitLayoutChangeEvent(this);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(i7, i10);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        int maxScrollY;
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && this.mContentView != null && !overScroller.isFinished() && this.mScroller.getCurrY() != this.mScroller.getFinalY() && i10 >= (maxScrollY = getMaxScrollY())) {
            this.mScroller.abortAnimation();
            i10 = maxScrollY;
        }
        super.onOverScrolled(i7, i10, z3, z8);
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter("ReactScrollView.onScrollChanged", "sectionName");
        AbstractC0198c.e("ReactScrollView.onScrollChanged");
        try {
            super.onScrollChanged(i7, i10, i11, i12);
            this.mActivelyScrolling = true;
            if (this.mOnScrollDispatchHelper.onScrollChanged(i7, i10)) {
                if (this.mRemoveClippedSubviews) {
                    updateClippingRect();
                }
                ReactScrollViewHelper.updateStateOnScrollChanged(this, this.mOnScrollDispatchHelper.getXFlingVelocity(), this.mOnScrollDispatchHelper.getYFlingVelocity());
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled || !PointerEvents.canBeTouchTarget(this.mPointerEvents)) {
            return false;
        }
        this.mVelocityHelper.calculateVelocity(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 && this.mDragging) {
            ReactScrollViewHelper.updateFabricScrollState(this);
            float xVelocity = this.mVelocityHelper.getXVelocity();
            float yVelocity = this.mVelocityHelper.getYVelocity();
            ReactScrollViewHelper.emitScrollEndDragEvent(this, xVelocity, yVelocity);
            NativeGestureUtil.notifyNativeGestureEnded(this, motionEvent);
            this.mDragging = false;
            handlePostTouchScrolling(Math.round(xVelocity), Math.round(yVelocity));
        }
        if (actionMasked == 0) {
            cancelPostTouchScrolling();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void reactSmoothScrollTo(int i7, int i10) {
        ReactScrollViewHelper.smoothScrollTo(this, i7, i10);
        setPendingContentOffsets(i7, i10);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i7, int i10) {
        super.scrollTo(i7, i10);
        ReactScrollViewHelper.updateFabricScrollState(this);
        setPendingContentOffsets(i7, i10);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void scrollToPreservingMomentum(int i7, int i10) {
        scrollTo(i7, i10);
        recreateFlingAnimation(i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        BackgroundStyleApplicator.setBackgroundColor(this, Integer.valueOf(i7));
    }

    public void setBorderColor(int i7, @Nullable Integer num) {
        BackgroundStyleApplicator.setBorderColor(this, LogicalEdge.values()[i7], num);
    }

    public void setBorderRadius(float f10) {
        setBorderRadius(f10, BorderRadiusProp.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(@Nullable String str) {
        BackgroundStyleApplicator.setBorderStyle(this, str == null ? null : BorderStyle.fromString(str));
    }

    public void setBorderWidth(int i7, float f10) {
        BackgroundStyleApplicator.setBorderWidth(this, LogicalEdge.values()[i7], Float.valueOf(PixelUtil.toDIPFromPixel(f10)));
    }

    public void setContentOffset(@Nullable ReadableMap readableMap) {
        ReadableMap readableMap2 = this.mCurrentContentOffset;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.mCurrentContentOffset = readableMap;
            if (readableMap != null) {
                scrollTo((int) PixelUtil.toPixelFromDIP(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) PixelUtil.toPixelFromDIP(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
            } else {
                scrollTo(0, 0);
            }
        }
    }

    public void setDecelerationRate(float f10) {
        getReactScrollViewScrollState().setDecelerationRate(f10);
        OverScroller overScroller = this.mScroller;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f10);
        }
    }

    public void setDisableIntervalMomentum(boolean z3) {
        this.mDisableIntervalMomentum = z3;
    }

    public void setEndFillColor(int i7) {
        if (i7 != this.mEndFillColor) {
            this.mEndFillColor = i7;
            this.mEndBackground = new ColorDrawable(this.mEndFillColor);
        }
    }

    public void setFadingEdgeLengthEnd(int i7) {
        this.mFadingEdgeLengthEnd = i7;
        invalidate();
    }

    public void setFadingEdgeLengthStart(int i7) {
        this.mFadingEdgeLengthStart = i7;
        invalidate();
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setLastScrollDispatchTime(long j6) {
        this.mLastScrollDispatchTime = j6;
    }

    public void setMaintainVisibleContentPosition(@Nullable MaintainVisibleScrollPositionHelper.Config config) {
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper;
        if (config != null && this.mMaintainVisibleContentPositionHelper == null) {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper2 = new MaintainVisibleScrollPositionHelper(this, false);
            this.mMaintainVisibleContentPositionHelper = maintainVisibleScrollPositionHelper2;
            maintainVisibleScrollPositionHelper2.start();
        } else if (config == null && (maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper) != null) {
            maintainVisibleScrollPositionHelper.stop();
            this.mMaintainVisibleContentPositionHelper = null;
        }
        MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper3 = this.mMaintainVisibleContentPositionHelper;
        if (maintainVisibleScrollPositionHelper3 != null) {
            maintainVisibleScrollPositionHelper3.setConfig(config);
        }
    }

    public void setOverflow(@Nullable String str) {
        if (str == null) {
            this.mOverflow = Overflow.SCROLL;
        } else {
            Overflow overflowFromString = Overflow.fromString(str);
            if (overflowFromString == null) {
                overflowFromString = Overflow.SCROLL;
            }
            this.mOverflow = overflowFromString;
        }
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactOverflowViewWithInset
    public void setOverflowInset(int i7, int i10, int i11, int i12) {
        this.mOverflowInset.set(i7, i10, i11, i12);
    }

    public void setPagingEnabled(boolean z3) {
        this.mPagingEnabled = z3;
    }

    public void setPointerEvents(PointerEvents pointerEvents) {
        this.mPointerEvents = pointerEvents;
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void setRemoveClippedSubviews(boolean z3) {
        if (z3 && this.mClippingRect == null) {
            this.mClippingRect = new Rect();
        }
        this.mRemoveClippedSubviews = z3;
        updateClippingRect();
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i7) {
        int childCount = getChildCount();
        p059e1.a.e(childCount <= 1, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setTranslationY(i7);
            }
            setPadding(0, 0, 0, i7);
        }
        updateScrollAwayState(i7);
        setRemoveClippedSubviews(this.mRemoveClippedSubviews);
    }

    public void setScrollEnabled(boolean z3) {
        this.mScrollEnabled = z3;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public void setScrollEventThrottle(int i7) {
        this.mScrollEventThrottle = i7;
    }

    public void setScrollPerfTag(@Nullable String str) {
        this.mScrollPerfTag = str;
    }

    public void setSendMomentumEvents(boolean z3) {
        this.mSendMomentumEvents = z3;
    }

    public void setSnapInterval(int i7) {
        this.mSnapInterval = i7;
    }

    public void setSnapOffsets(@Nullable List<Integer> list) {
        this.mSnapOffsets = list;
    }

    public void setSnapToAlignment(int i7) {
        this.mSnapToAlignment = i7;
    }

    public void setSnapToEnd(boolean z3) {
        this.mSnapToEnd = z3;
    }

    public void setSnapToStart(boolean z3) {
        this.mSnapToStart = z3;
    }

    public void setStateWrapper(StateWrapper stateWrapper) {
        this.mStateWrapper = stateWrapper;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public void startFlingAnimator(int i7, int i10) {
        this.DEFAULT_FLING_ANIMATOR.cancel();
        int defaultScrollAnimationDuration = ReactScrollViewHelper.getDefaultScrollAnimationDuration(getContext());
        this.DEFAULT_FLING_ANIMATOR.setDuration(defaultScrollAnimationDuration).setIntValues(i7, i10);
        this.DEFAULT_FLING_ANIMATOR.start();
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, 0, defaultScrollAnimationDuration > 0 ? (i10 - i7) / defaultScrollAnimationDuration : 0);
            ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        updateClippingRect(null);
    }

    public ReactScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
        this.mTempRect = new Rect();
        this.mOverflowInset = new Rect();
        this.mOverflow = Overflow.SCROLL;
        this.mPagingEnabled = false;
        this.mScrollEnabled = true;
        this.mFpsListener = null;
        this.mEndFillColor = 0;
        this.mDisableIntervalMomentum = false;
        this.mSnapInterval = 0;
        this.mSnapToStart = true;
        this.mSnapToEnd = true;
        this.mSnapToAlignment = 0;
        this.mCurrentContentOffset = null;
        this.pendingContentOffsetX = -1;
        this.pendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.mReactScrollViewScrollState = new ReactScrollViewHelper.ReactScrollViewScrollState();
        this.DEFAULT_FLING_ANIMATOR = ObjectAnimator.ofInt(this, "scrollY", 0, 0);
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mMaintainVisibleContentPositionHelper = null;
        this.mFadingEdgeLengthStart = 0;
        this.mFadingEdgeLengthEnd = 0;
        this.mFpsListener = fpsListener;
        this.mScroller = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        N.q(this, new ReactScrollViewAccessibilityDelegate());
    }

    public void setBorderRadius(float f10, int i7) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i7], Float.isNaN(f10) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f10), LengthPercentageType.POINT));
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(@Nullable Set<Integer> set) {
        if (this.mRemoveClippedSubviews) {
            Intrinsics.checkNotNullParameter("ReactScrollView.updateClippingRect", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("ReactScrollView.updateClippingRect"));
            try {
                p059e1.a.f(this.mClippingRect);
                ReactClippingViewGroupHelper.calculateClippingRect(this, this.mClippingRect);
                KeyEvent.Callback contentView = getContentView();
                if (contentView instanceof ReactClippingViewGroup) {
                    ((ReactClippingViewGroup) contentView).updateClippingRect(set);
                }
            } finally {
                Trace.endSection();
            }
        }
    }
}
