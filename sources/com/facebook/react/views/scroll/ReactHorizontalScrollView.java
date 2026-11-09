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
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import androidx.core.view.E;
import androidx.core.view.N;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.react.R;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.ReactContext;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public class ReactHorizontalScrollView extends HorizontalScrollView implements ReactClippingViewGroup, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener, ReactAccessibleScrollView, ReactOverflowViewWithInset, ReactScrollViewHelper.HasScrollState, ReactScrollViewHelper.HasStateWrapper, ReactScrollViewHelper.HasFlingAnimator, ReactScrollViewHelper.HasScrollEventThrottle, ReactScrollViewHelper.HasSmoothScroll {
    private static boolean DEBUG_MODE = false;
    private static int NO_SCROLL_POSITION = Integer.MIN_VALUE;
    private static String TAG = "ReactHorizontalScrollView";
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
    private boolean mPagedArrowScrolling;
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
    private int mScrollXAfterMeasure;

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

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactHorizontalScrollView$2, reason: invalid class name */
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

    public ReactHorizontalScrollView(Context context) {
        this(context, null);
    }

    private void adjustPositionForContentChangeRTL(int i7, int i10, int i11, int i12) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().end();
        }
        int i13 = i10 - i7;
        int scrollX = i13 - (i12 - getScrollX());
        scrollTo(scrollX, getScrollY());
        recreateFlingAnimation(scrollX, i13 - getWidth());
    }

    private void cancelPostTouchScrolling() {
        Runnable runnable = this.mPostTouchRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mPostTouchRunnable = null;
            getFlingAnimator().cancel();
        }
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

    @Nullable
    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent) {
        return findDeepestScrollViewForMotionEvent(view, motionEvent, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flingAndSnap(int i7) {
        int scrollX;
        int iMin;
        int iMax;
        int iIntValue;
        OverScroller overScroller;
        if (DEBUG_MODE) {
            p229p2.a.l(TAG, "smoothScrollAndSnap[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        if (getChildCount() <= 0) {
            return;
        }
        if (this.mSnapInterval == 0 && this.mSnapOffsets == null && this.mSnapToAlignment == 0) {
            smoothScrollAndSnap(i7);
            return;
        }
        boolean z3 = getFlingAnimator() != this.DEFAULT_FLING_ANIMATOR;
        int iMax2 = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int iPredictFinalScrollPosition = predictFinalScrollPosition(i7);
        if (this.mDisableIntervalMomentum) {
            iPredictFinalScrollPosition = getScrollX();
        }
        int width = getWidth();
        WeakHashMap weakHashMap = N.f16168a;
        int paddingStart = (width - getPaddingStart()) - getPaddingEnd();
        if (getLayoutDirection() == 1) {
            iPredictFinalScrollPosition = iMax2 - iPredictFinalScrollPosition;
            scrollX = -i7;
        } else {
            scrollX = i7;
        }
        List<Integer> list = this.mSnapOffsets;
        if (list == null || list.isEmpty()) {
            int i10 = this.mSnapToAlignment;
            if (i10 != 0) {
                int i11 = this.mSnapInterval;
                if (i11 > 0) {
                    double d2 = ((double) iPredictFinalScrollPosition) / ((double) i11);
                    double dFloor = Math.floor(d2);
                    int i12 = this.mSnapInterval;
                    int iMax3 = Math.max(getItemStartOffset(i10, (int) (dFloor * ((double) i12)), i12, paddingStart), 0);
                    int i13 = this.mSnapToAlignment;
                    double dCeil = Math.ceil(d2);
                    int i14 = this.mSnapInterval;
                    iMin = Math.min(getItemStartOffset(i13, (int) (dCeil * ((double) i14)), i14, paddingStart), iMax2);
                    iMax2 = iMax2;
                    iMax = iMax3;
                    iIntValue = 0;
                } else {
                    ViewGroup viewGroup = (ViewGroup) getContentView();
                    int iMin2 = iMax2;
                    int i15 = iMin2;
                    int i16 = 0;
                    int iMax4 = 0;
                    for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
                        View childAt = viewGroup.getChildAt(i17);
                        int itemStartOffset = getItemStartOffset(this.mSnapToAlignment, childAt.getLeft(), childAt.getWidth(), paddingStart);
                        if (itemStartOffset <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - itemStartOffset < iPredictFinalScrollPosition - i16) {
                            i16 = itemStartOffset;
                        }
                        if (itemStartOffset >= iPredictFinalScrollPosition && itemStartOffset - iPredictFinalScrollPosition < i15 - iPredictFinalScrollPosition) {
                            i15 = itemStartOffset;
                        }
                        iMin2 = Math.min(iMin2, itemStartOffset);
                        iMax4 = Math.max(iMax4, itemStartOffset);
                    }
                    iMax = Math.max(i16, iMin2);
                    iMin = Math.min(i15, iMax4);
                }
            } else {
                double snapInterval = getSnapInterval();
                double d10 = ((double) iPredictFinalScrollPosition) / snapInterval;
                int iFloor = (int) (Math.floor(d10) * snapInterval);
                iMin = Math.min((int) (Math.ceil(d10) * snapInterval), iMax2);
                iMax = iFloor;
            }
            iIntValue = 0;
        } else {
            iIntValue = this.mSnapOffsets.get(0).intValue();
            iMax2 = ((Integer) u.e(1, this.mSnapOffsets)).intValue();
            iMin = iMax2;
            iMax = 0;
            for (int i18 = 0; i18 < this.mSnapOffsets.size(); i18++) {
                int iIntValue2 = this.mSnapOffsets.get(i18).intValue();
                if (iIntValue2 <= iPredictFinalScrollPosition && iPredictFinalScrollPosition - iIntValue2 < iPredictFinalScrollPosition - iMax) {
                    iMax = iIntValue2;
                }
                if (iIntValue2 >= iPredictFinalScrollPosition && iIntValue2 - iPredictFinalScrollPosition < iMin - iPredictFinalScrollPosition) {
                    iMin = iIntValue2;
                }
            }
        }
        int i19 = iPredictFinalScrollPosition - iMax;
        int i20 = iMin - iPredictFinalScrollPosition;
        int i21 = Math.abs(i19) < Math.abs(i20) ? iMax : iMin;
        int scrollX2 = getScrollX();
        if (getLayoutDirection() == 1) {
            scrollX2 = iMax2 - scrollX2;
        }
        if (this.mSnapToEnd || iPredictFinalScrollPosition < iMax2) {
            if (this.mSnapToStart || iPredictFinalScrollPosition > iIntValue) {
                if (scrollX > 0) {
                    if (!z3) {
                        scrollX += (int) (((double) i20) * 10.0d);
                    }
                    iPredictFinalScrollPosition = iMin;
                } else if (scrollX < 0) {
                    if (!z3) {
                        scrollX -= (int) (((double) i19) * 10.0d);
                    }
                    iPredictFinalScrollPosition = iMax;
                } else {
                    iPredictFinalScrollPosition = i21;
                }
            } else if (scrollX2 > iIntValue) {
                iPredictFinalScrollPosition = iIntValue;
            }
        } else if (scrollX2 < iMax2) {
            iPredictFinalScrollPosition = iMax2;
        }
        int iMin3 = Math.min(Math.max(0, iPredictFinalScrollPosition), iMax2);
        if (getLayoutDirection() == 1) {
            iMin3 = iMax2 - iMin3;
            scrollX = -scrollX;
        }
        int i22 = iMin3;
        if (z3 || (overScroller = this.mScroller) == null) {
            reactSmoothScrollTo(i22, getScrollY());
            return;
        }
        this.mActivelyScrolling = true;
        int scrollX3 = getScrollX();
        int scrollY = getScrollY();
        if (scrollX == 0) {
            scrollX = i22 - getScrollX();
        }
        overScroller.fling(scrollX3, scrollY, scrollX, 0, i22, i22, 0, 0, (i22 == 0 || i22 == iMax2) ? paddingStart / 2 : 0, 0);
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

    @Nullable
    private OverScroller getOverScrollerFromParent() {
        if (!sTriedToGetScrollerField) {
            sTriedToGetScrollerField = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                sScrollerField = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                p229p2.a.v(TAG, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
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
                    p229p2.a.v(TAG, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e10);
            }
        }
        return overScroller;
    }

    private int getScrollDelta(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
    }

    private int getSnapInterval() {
        int i7 = this.mSnapInterval;
        return i7 != 0 ? i7 : getWidth();
    }

    private void handlePostTouchScrolling(int i7, int i10) {
        if (DEBUG_MODE) {
            p229p2.a.m(TAG, "handlePostTouchScrolling[%d] velocityX %d velocityY %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10));
        }
        if (this.mPostTouchRunnable != null) {
            return;
        }
        if (this.mSendMomentumEvents) {
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, i7, i10);
        }
        this.mActivelyScrolling = false;
        Runnable runnable = new Runnable() { // from class: com.facebook.react.views.scroll.ReactHorizontalScrollView.1
            private boolean mSnappingToPage = false;
            private int mStableFrames = 0;

            @Override // java.lang.Runnable
            public void run() {
                NativeAnimatedModule nativeAnimatedModule;
                if (ReactHorizontalScrollView.this.mActivelyScrolling) {
                    ReactHorizontalScrollView.this.mActivelyScrolling = false;
                    this.mStableFrames = 0;
                    ReactHorizontalScrollView reactHorizontalScrollView = ReactHorizontalScrollView.this;
                    WeakHashMap weakHashMap = N.f16168a;
                    reactHorizontalScrollView.postOnAnimationDelayed(this, 20L);
                    return;
                }
                ReactScrollViewHelper.updateFabricScrollState(ReactHorizontalScrollView.this);
                int i11 = this.mStableFrames + 1;
                this.mStableFrames = i11;
                if (i11 < 3) {
                    if (ReactHorizontalScrollView.this.mPagingEnabled && !this.mSnappingToPage) {
                        this.mSnappingToPage = true;
                        ReactHorizontalScrollView.this.flingAndSnap(0);
                    }
                    ReactHorizontalScrollView reactHorizontalScrollView2 = ReactHorizontalScrollView.this;
                    WeakHashMap weakHashMap2 = N.f16168a;
                    reactHorizontalScrollView2.postOnAnimationDelayed(this, 20L);
                    return;
                }
                ReactHorizontalScrollView.this.mPostTouchRunnable = null;
                if (ReactHorizontalScrollView.this.mSendMomentumEvents) {
                    ReactScrollViewHelper.emitScrollMomentumEndEvent(ReactHorizontalScrollView.this);
                }
                ReactContext reactContext = (ReactContext) ReactHorizontalScrollView.this.getContext();
                if (reactContext != null && (nativeAnimatedModule = (NativeAnimatedModule) reactContext.getNativeModule(NativeAnimatedModule.class)) != null) {
                    nativeAnimatedModule.userDrivenScrollEnded(ReactHorizontalScrollView.this.getId());
                }
                ReactHorizontalScrollView.this.disableFpsListener();
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

    private boolean isMostlyScrolledInView(View view) {
        int scrollDelta = getScrollDelta(view);
        view.getDrawingRect(this.mTempRect);
        return scrollDelta != 0 && Math.abs(scrollDelta) < this.mTempRect.width() / 2;
    }

    private boolean isScrollPerfLoggingEnabled() {
        String str;
        return (this.mFpsListener == null || (str = this.mScrollPerfTag) == null || str.isEmpty()) ? false : true;
    }

    private boolean isScrolledInView(View view) {
        return getScrollDelta(view) == 0;
    }

    private int predictFinalScrollPosition(int i7) {
        int iMax = Math.max(0, computeHorizontalScrollRange() - getWidth());
        if (getFlingAnimator() == this.DEFAULT_FLING_ANIMATOR) {
            return ReactScrollViewHelper.predictFinalScrollPosition(this, i7, 0, iMax, 0).x;
        }
        return getFlingExtrapolatedDistance(i7) + ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i7);
    }

    private void recreateFlingAnimation(int i7, int i10) {
        if (getFlingAnimator().isRunning()) {
            getFlingAnimator().cancel();
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        int currX = this.mScroller.getCurrX();
        boolean zComputeScrollOffset = this.mScroller.computeScrollOffset();
        this.mScroller.forceFinished(true);
        if (!zComputeScrollOffset) {
            scrollTo((this.mScroller.getCurrX() - currX) + i7, getScrollY());
            return;
        }
        this.mScroller.fling(i7, getScrollY(), (int) (this.mScroller.getCurrVelocity() * Math.signum(this.mScroller.getFinalX() - this.mScroller.getStartX())), 0, 0, i10, 0, 0);
    }

    private void scrollToChild(View view) {
        int scrollDelta = getScrollDelta(view);
        if (scrollDelta != 0) {
            scrollBy(scrollDelta, 0);
        }
    }

    private void setPendingContentOffsets(int i7, int i10) {
        if (DEBUG_MODE) {
            p229p2.a.m(TAG, "setPendingContentOffsets[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10));
        }
        if (isContentReady()) {
            this.pendingContentOffsetX = -1;
            this.pendingContentOffsetY = -1;
        } else {
            this.pendingContentOffsetX = i7;
            this.pendingContentOffsetY = i10;
        }
    }

    private void smoothScrollAndSnap(int i7) {
        if (DEBUG_MODE) {
            p229p2.a.l(TAG, "smoothScrollAndSnap[%d] velocity %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        double snapInterval = getSnapInterval();
        double nextFlingStartValue = ReactScrollViewHelper.getNextFlingStartValue(this, getScrollX(), getReactScrollViewScrollState().getFinalAnimatedPositionScroll().x, i7);
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
            reactSmoothScrollTo((int) d10, getScrollY());
        }
    }

    private void smoothScrollToNextPage(int i7) {
        if (DEBUG_MODE) {
            p229p2.a.l(TAG, "smoothScrollToNextPage[%d] direction %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        int width = getWidth();
        int scrollX = getScrollX();
        int i10 = scrollX / width;
        if (scrollX % width != 0) {
            i10++;
        }
        int i11 = i7 == 17 ? i10 - 1 : i10 + 1;
        if (i11 < 0) {
            i11 = 0;
        }
        reactSmoothScrollTo(i11 * width, getScrollY());
        handlePostTouchScrolling(0, 0);
    }

    public void abortAnimation() {
        OverScroller overScroller = this.mScroller;
        if (overScroller == null || overScroller.isFinished()) {
            return;
        }
        this.mScroller.abortAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i7, int i10) {
        if (!this.mPagingEnabled || this.mPagedArrowScrolling) {
            super.addFocusables(arrayList, i7, i10);
            return;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i7, i10);
        for (View view : arrayList2) {
            if (isScrolledInView(view) || isPartiallyScrolledInView(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i7) {
        if (!this.mPagingEnabled) {
            return super.arrowScroll(i7);
        }
        boolean z3 = true;
        this.mPagedArrowScrolling = true;
        if (getChildCount() > 0) {
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i7);
            View contentView = getContentView();
            if (contentView == null || viewFindNextFocus == null || viewFindNextFocus.getParent() != contentView) {
                smoothScrollToNextPage(i7);
            } else {
                if (!isScrolledInView(viewFindNextFocus) && !isMostlyScrolledInView(viewFindNextFocus)) {
                    smoothScrollToNextPage(i7);
                }
                viewFindNextFocus.requestFocus();
            }
        } else {
            z3 = false;
        }
        this.mPagedArrowScrolling = false;
        return z3;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i7) {
        return this.mScrollEnabled && super.canScrollHorizontally(i7);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (PointerEvents.canChildrenBeTouchTarget(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.mEndFillColor != 0) {
            View contentView = getContentView();
            if (this.mEndBackground != null && contentView != null && contentView.getRight() < getWidth()) {
                this.mEndBackground.setBounds(contentView.getRight(), 0, getWidth(), getHeight());
                this.mEndBackground.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.mScrollEnabled || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public void flashScrollIndicators() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i7) {
        if (DEBUG_MODE) {
            p229p2.a.l(TAG, "fling[%d] velocityX %d", Integer.valueOf(getId()), Integer.valueOf(i7));
        }
        if (Build.VERSION.SDK_INT == 28) {
            i7 = (int) (Math.signum(this.mOnScrollDispatchHelper.getXFlingVelocity()) * Math.abs(i7));
        }
        int i10 = i7;
        if (this.mPagingEnabled) {
            flingAndSnap(i10);
        } else if (this.mScroller != null) {
            int width = getWidth();
            WeakHashMap weakHashMap = N.f16168a;
            this.mScroller.fling(getScrollX(), getScrollY(), i10, 0, 0, Integer.MAX_VALUE, 0, 0, ((width - getPaddingStart()) - getPaddingEnd()) / 2, 0);
            postInvalidateOnAnimation();
        } else {
            super.fling(i10);
        }
        handlePostTouchScrolling(i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Nullable
    public View focusSearch(View view, int i7) {
        View viewFindNextFocusableView;
        View viewFocusSearch = super.focusSearch(view, i7);
        return (!ReactNativeFeatureFlags.enableCustomFocusSearchOnClippedElementsAndroid() || !(viewFocusSearch == null || findViewById(viewFocusSearch.getId()) == null) || (viewFindNextFocusableView = ReactScrollViewHelper.findNextFocusableView(this, view, i7)) == null) ? viewFocusSearch : viewFindNextFocusableView;
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
    public ValueAnimator getFlingAnimator() {
        return this.DEFAULT_FLING_ANIMATOR;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasFlingAnimator
    public int getFlingExtrapolatedDistance(int i7) {
        return ReactScrollViewHelper.predictFinalScrollPosition(this, i7, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0).x;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasScrollEventThrottle
    public long getLastScrollDispatchTime() {
        return this.mLastScrollDispatchTime;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.mFadingEdgeLengthEnd : this.mFadingEdgeLengthStart) / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
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

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return (getLayoutDirection() == 1 ? this.mFadingEdgeLengthStart : this.mFadingEdgeLengthEnd) / Math.max(this.mFadingEdgeLengthStart, this.mFadingEdgeLengthEnd);
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
    @Nullable
    public void onChildViewRemoved(View view, View view2) {
        View view3 = this.mContentView;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.mContentView = null;
    }

    @Override // android.view.ViewGroup, android.view.View
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.mScrollEnabled) {
            return false;
        }
        if (motionEvent.getAction() == 0 && findDeepestScrollViewForMotionEvent(this, motionEvent) != null) {
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        OverScroller overScroller;
        if (DEBUG_MODE) {
            p229p2.a.n(TAG, "onLayout[%d] l %d t %d r %d b %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        int i13 = this.mScrollXAfterMeasure;
        if (i13 != NO_SCROLL_POSITION && (overScroller = this.mScroller) != null && i13 != overScroller.getFinalX() && !this.mScroller.isFinished()) {
            if (DEBUG_MODE) {
                p229p2.a.l(TAG, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d", Integer.valueOf(getId()), Integer.valueOf(this.mScrollXAfterMeasure));
            }
            OverScroller overScroller2 = this.mScroller;
            overScroller2.startScroll(this.mScrollXAfterMeasure, overScroller2.getFinalY(), 0, 0);
            this.mScroller.forceFinished(true);
            this.mScrollXAfterMeasure = NO_SCROLL_POSITION;
        }
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
        if (view.getLayoutDirection() == 1) {
            adjustPositionForContentChangeRTL(i7, i11, i13, i15);
        } else {
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper = this.mMaintainVisibleContentPositionHelper;
            if (maintainVisibleScrollPositionHelper != null) {
                maintainVisibleScrollPositionHelper.updateScrollPosition();
            }
        }
        ReactScrollViewHelper.emitLayoutChangeEvent(this);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        OverScroller overScroller;
        MeasureSpecAssertions.assertExplicitMeasureSpec(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        if (DEBUG_MODE) {
            p229p2.a.m(TAG, "onMeasure[%d] measured width: %d measured height: %d", Integer.valueOf(getId()), Integer.valueOf(size), Integer.valueOf(size2));
        }
        boolean z3 = getMeasuredHeight() != size2;
        setMeasuredDimension(size, size2);
        if (!z3 || (overScroller = this.mScroller) == null) {
            return;
        }
        this.mScrollXAfterMeasure = overScroller.getCurrX();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i7, int i10, boolean z3, boolean z8) {
        int iMax;
        if (DEBUG_MODE) {
            p229p2.a.n(TAG, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10), Boolean.valueOf(z3), Boolean.valueOf(z8));
        }
        OverScroller overScroller = this.mScroller;
        if (overScroller != null && !overScroller.isFinished() && this.mScroller.getCurrX() != this.mScroller.getFinalX() && i7 >= (iMax = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            this.mScroller.abortAnimation();
            i7 = iMax;
        }
        super.onOverScrolled(i7, i10, z3, z8);
    }

    @Override // android.view.View
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        if (DEBUG_MODE) {
            p229p2.a.n(TAG, "onScrollChanged[%d] x %d y %d oldx %d oldy %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        Intrinsics.checkNotNullParameter("ReactHorizontalScrollView.onScrollChanged", "sectionName");
        Trace.beginSection(AbstractC0198c.m0("ReactHorizontalScrollView.onScrollChanged"));
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

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
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

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i7) {
        boolean zPageScroll = super.pageScroll(i7);
        if (this.mPagingEnabled && zPageScroll) {
            handlePostTouchScrolling(0, 0);
        }
        return zPageScroll;
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void reactSmoothScrollTo(int i7, int i10) {
        ReactScrollViewHelper.smoothScrollTo(this, i7, i10);
        setPendingContentOffsets(i7, i10);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.mPagingEnabled) {
            scrollToChild(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void scrollTo(int i7, int i10) {
        if (DEBUG_MODE) {
            p229p2.a.m(TAG, "scrollTo[%d] x %d y %d", Integer.valueOf(getId()), Integer.valueOf(i7), Integer.valueOf(i10));
        }
        super.scrollTo(i7, i10);
        ReactScrollViewHelper.updateFabricScrollState(this);
        setPendingContentOffsets(i7, i10);
    }

    @Override // com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll
    public void scrollToPreservingMomentum(int i7, int i10) {
        scrollTo(i7, i10);
        recreateFlingAnimation(i7, Integer.MAX_VALUE);
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
            MaintainVisibleScrollPositionHelper maintainVisibleScrollPositionHelper2 = new MaintainVisibleScrollPositionHelper(this, true);
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
            ReactScrollViewHelper.emitScrollMomentumBeginEvent(this, defaultScrollAnimationDuration > 0 ? (i10 - i7) / defaultScrollAnimationDuration : 0, 0);
            ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd(this);
        }
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect() {
        updateClippingRect(null);
    }

    public ReactHorizontalScrollView(Context context, @Nullable FpsListener fpsListener) {
        super(context);
        this.mScrollXAfterMeasure = NO_SCROLL_POSITION;
        this.mOnScrollDispatchHelper = new OnScrollDispatchHelper();
        this.mVelocityHelper = new VelocityHelper();
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
        this.mPagedArrowScrolling = false;
        this.pendingContentOffsetX = -1;
        this.pendingContentOffsetY = -1;
        this.mStateWrapper = null;
        this.DEFAULT_FLING_ANIMATOR = ObjectAnimator.ofInt(this, "scrollX", 0, 0);
        this.mPointerEvents = PointerEvents.AUTO;
        this.mLastScrollDispatchTime = 0L;
        this.mScrollEventThrottle = 0;
        this.mFadingEdgeLengthStart = 0;
        this.mFadingEdgeLengthEnd = 0;
        this.mTempRect = new Rect();
        this.mFpsListener = fpsListener;
        N.q(this, new ReactScrollViewAccessibilityDelegate());
        this.mScroller = getOverScrollerFromParent();
        this.mReactScrollViewScrollState = new ReactScrollViewHelper.ReactScrollViewScrollState();
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    @Nullable
    private static HorizontalScrollView findDeepestScrollViewForMotionEvent(View view, MotionEvent motionEvent, boolean z3) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z3 && (view instanceof HorizontalScrollView)) {
            WeakHashMap weakHashMap = N.f16168a;
            if (E.i(view) && (view instanceof ReactHorizontalScrollView) && ((ReactHorizontalScrollView) view).mScrollEnabled) {
                return (HorizontalScrollView) view;
            }
        }
        if (view instanceof ViewGroup) {
            int i7 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i7 >= viewGroup.getChildCount()) {
                    break;
                }
                HorizontalScrollView horizontalScrollViewFindDeepestScrollViewForMotionEvent = findDeepestScrollViewForMotionEvent(viewGroup.getChildAt(i7), motionEvent, false);
                if (horizontalScrollViewFindDeepestScrollViewForMotionEvent != null) {
                    return horizontalScrollViewFindDeepestScrollViewForMotionEvent;
                }
                i7++;
            }
        }
        return null;
    }

    public void setBorderRadius(float f10, int i7) {
        BackgroundStyleApplicator.setBorderRadius(this, BorderRadiusProp.values()[i7], Float.isNaN(f10) ? null : new LengthPercentage(PixelUtil.toDIPFromPixel(f10), LengthPercentageType.POINT));
    }

    @Override // com.facebook.react.uimanager.ReactClippingViewGroup
    public void updateClippingRect(@Nullable Set<Integer> set) {
        if (this.mRemoveClippedSubviews) {
            Intrinsics.checkNotNullParameter("ReactHorizontalScrollView.updateClippingRect", "sectionName");
            Trace.beginSection(AbstractC0198c.m0("ReactHorizontalScrollView.updateClippingRect"));
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
