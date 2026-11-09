package com.google.android.material.carousel;

import C0.G;
import Ie.k;
import N8.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.d;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.horcrux.svg.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p024b9.g;
import p118hf.a;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements Carousel, RecyclerView.SmoothScroller.ScrollVectorProvider {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @NonNull
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;

    @Nullable
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @Nullable
    private KeylineStateList keylineStateList;

    @Nullable
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;

    @VisibleForTesting
    int maxScroll;

    @VisibleForTesting
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    @VisibleForTesting
    int scrollOffset;

    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view, float f10, float f11, KeylineRange keylineRange) {
            this.child = view;
            this.center = f10;
            this.offsetCenter = f11;
            this.range = keylineRange;
        }
    }

    public static class DebugItemDecoration extends RecyclerView.ItemDecoration {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(d.b(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            a.f(keyline.loc <= keyline2.loc);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    public static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i7, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i7);
        measureChildWithMargins(view, 0, 0);
        float f10 = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f10 - itemSize), (int) (f10 + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f10, float f11) {
        return isLayoutRtl() ? f10 - f11 : f10 + f11;
    }

    private float addStart(float f10, float f11) {
        return isLayoutRtl() ? f10 + f11 : f10 - f11;
    }

    private void addViewAtPosition(@NonNull RecyclerView.Recycler recycler, int i7, int i10) {
        if (i7 < 0 || i7 >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(recycler, calculateChildStartForFill(i7), i7);
        addAndLayoutView(childCalculationsMakeChildCalculations.child, i10, childCalculationsMakeChildCalculations);
    }

    private void addViewsEnd(RecyclerView.Recycler recycler, RecyclerView.State state, int i7) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i7);
        while (i7 < state.getItemCount()) {
            float fAddEnd = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
            if (isLocOffsetOutOfFillBoundsEnd(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                return;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                View viewForPosition = recycler.getViewForPosition(i7);
                addAndLayoutView(viewForPosition, -1, new ChildCalculations(viewForPosition, fAddEnd, fCalculateChildOffsetCenterForLocation, surroundingKeylineRange));
            }
            i7++;
        }
    }

    private void addViewsStart(RecyclerView.Recycler recycler, int i7) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i7);
        while (i7 >= 0) {
            float fAddEnd = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize() / 2.0f);
            KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
            if (isLocOffsetOutOfFillBoundsStart(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                return;
            }
            fCalculateChildStartForFill = addStart(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(fCalculateChildOffsetCenterForLocation, surroundingKeylineRange)) {
                View viewForPosition = recycler.getViewForPosition(i7);
                addAndLayoutView(viewForPosition, 0, new ChildCalculations(viewForPosition, fAddEnd, fCalculateChildOffsetCenterForLocation, surroundingKeylineRange));
            }
            i7--;
        }
    }

    private float calculateChildOffsetCenterForLocation(float f10, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f11 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float fLerp = AnimationUtils.lerp(f11, keyline2.locOffset, keyline.loc, keyline2.loc, f10);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return fLerp;
        }
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return d0.e(1.0f, keyline3.mask, f10 - keyline3.loc, fLerp);
    }

    private float calculateChildStartForFill(int i7) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i7);
    }

    private int calculateEndScroll(RecyclerView.State state, KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState startState = zIsLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        KeylineState.Keyline firstFocalKeyline = zIsLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int itemSize = (int) ((((zIsLayoutRtl ? -1 : 1) * firstFocalKeyline.maskedItemSize) / 2.0f) + (((startState.getItemSize() * (state.getItemCount() - 1)) * (zIsLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())));
        return zIsLayoutRtl ? Math.min(0, itemSize) : Math.max(0, itemSize);
    }

    private static int calculateShouldScrollBy(int i7, int i10, int i11, int i12) {
        int i13 = i10 + i7;
        if (i13 < i11) {
            return i11 - i10;
        }
        return i13 > i12 ? i12 - i10 : i7;
    }

    private int calculateStartScroll(@NonNull KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState endState = zIsLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((zIsLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i7) {
        int orientation = getOrientation();
        if (i7 == 1) {
            return -1;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i7 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i7 != 66) {
            return (i7 == 130 && orientation == 1) ? 1 : Integer.MIN_VALUE;
        }
        if (orientation == 0) {
            return isLayoutRtl() ? -1 : 1;
        }
        return Integer.MIN_VALUE;
    }

    private void fill(RecyclerView.Recycler recycler, RecyclerView.State state) {
        removeAndRecycleOutOfBoundsViews(recycler);
        if (getChildCount() == 0) {
            addViewsStart(recycler, this.currentFillStartPosition - 1);
            addViewsEnd(recycler, state, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(recycler, position - 1);
            addViewsEnd(recycler, state, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private int getContainerSize() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return isHorizontal() ? rect.centerX() : rect.centerY();
    }

    private int getItemMargins() {
        int i7;
        int i10;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i7 + i10;
    }

    private KeylineState getKeylineStartingState(KeylineStateList keylineStateList) {
        return isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
    }

    private KeylineState getKeylineStateForPosition(int i7) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(Integer.valueOf(a.m(i7, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float getMaskedItemSizeForLocOffset(float f10, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f11 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f11, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int getScrollOffsetForPosition(int i7, KeylineState keylineState) {
        if (isLayoutRtl()) {
            return (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (keylineState.getItemSize() * i7)) - (keylineState.getItemSize() / 2.0f));
        }
        return (int) ((keylineState.getItemSize() / 2.0f) + ((keylineState.getItemSize() * i7) - keylineState.getFirstFocalKeyline().loc));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i7, @NonNull KeylineState keylineState) {
        int i10 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (keylineState.getItemSize() / 2.0f) + (keylineState.getItemSize() * i7);
            int containerSize = (isLayoutRtl() ? (int) ((getContainerSize() - keyline.loc) - itemSize) : (int) (itemSize - keyline.loc)) - this.scrollOffset;
            if (Math.abs(i10) > Math.abs(containerSize)) {
                i10 = containerSize;
            }
        }
        return i10;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f10, boolean z3) {
        float f11 = Float.MAX_VALUE;
        int i7 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i13 = 0; i13 < list.size(); i13++) {
            KeylineState.Keyline keyline = list.get(i13);
            float f15 = z3 ? keyline.locOffset : keyline.loc;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i7 = i13;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i11 = i13;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i10 = i13;
                f14 = f15;
            }
            if (f15 > f12) {
                i12 = i13;
                f12 = f15;
            }
        }
        if (i7 == -1) {
            i7 = i10;
        }
        if (i11 == -1) {
            i11 = i12;
        }
        return new KeylineRange(list.get(i7), list.get(i11));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f10, KeylineRange keylineRange) {
        float fAddStart = addStart(f10, getMaskedItemSizeForLocOffset(f10, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddStart < 0.0f;
        }
        return fAddStart > ((float) getContainerSize());
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f10, KeylineRange keylineRange) {
        float fAddEnd = addEnd(f10, getMaskedItemSizeForLocOffset(f10, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            return fAddEnd > ((float) getContainerSize());
        }
        return fAddEnd < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i11 - i7 == i15 - i13 && i12 - i10 == i16 - i14) {
            return;
        }
        view.post(new g(this, 19));
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                getDecoratedCenterWithMargins(childAt);
                getPosition(childAt);
            }
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.Recycler recycler, float f10, int i7) {
        View viewForPosition = recycler.getViewForPosition(i7);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fAddEnd = addEnd(f10, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        return new ChildCalculations(viewForPosition, fAddEnd, calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f10, float f11, Rect rect) {
        float fAddEnd = addEnd(f10, f11);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(fAddEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, fAddEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f11, fCalculateChildOffsetCenterForLocation);
        return fCalculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewForPosition);
        if (isLayoutRtl()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.reverse(keylineStateOnFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, keylineStateOnFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift(), this.carouselStrategy.getStrategyType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    private void scrollBy(RecyclerView recyclerView, int i7) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i7, 0);
        } else {
            recyclerView.scrollBy(0, i7);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(I0.d.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f10, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f11 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float fLerp = AnimationUtils.lerp(f11, keyline2.mask, keyline.loc, keyline2.loc, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(f10, keylineRange);
            RectF rectF = new RectF(fCalculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), fCalculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), (maskRect.width() / 2.0f) + fCalculateChildOffsetCenterForLocation, (maskRect.height() / 2.0f) + fCalculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.getStrategyType() == CarouselStrategy.StrategyType.CONTAINED) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset(@NonNull KeylineStateList keylineStateList) {
        int i7 = this.maxScroll;
        int i10 = this.minScroll;
        if (i7 <= i10) {
            this.currentKeylineState = getKeylineStartingState(keylineStateList);
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i10, i7);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i7 = this.lastItemCount;
        if (itemCount == i7 || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i7)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i7 = 0;
        while (i7 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i7));
            int i10 = i7 + 1;
            int position2 = getPosition(getChildAt(i10));
            if (position > position2) {
                logChildrenIfDebugging();
                StringBuilder sbP = q0.p(i7, "Detected invalid child order. Child at index [", position, "] had adapter position [", "] and child at index [");
                sbP.append(i10);
                sbP.append("] had adapter position [");
                sbP.append(position2);
                sbP.append("].");
                throw new IllegalStateException(sbP.toString());
            }
            i7 = i10;
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i7) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i7, getKeylineStateForPosition(i7)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public PointF computeScrollVectorForPosition(int i7) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i7, getKeylineStateForPosition(i7));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(@NonNull RecyclerView.State state) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(@NonNull RecyclerView.State state) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(@NonNull RecyclerView.State state) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(fCenterY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fCenterY, true));
        float fWidth = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOffsetToScrollToPosition(int i7, @NonNull KeylineState keylineState) {
        return getScrollOffsetForPosition(i7, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i7, boolean z3) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i7, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i7, getKeylineStateForPosition(i7)) : offsetToScrollToPosition;
        return (!z3 || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(@NonNull View view, int i7, int i10) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i11 = rect.left + rect.right + i7;
        int i12 = rect.top + rect.bottom + i10;
        KeylineStateList keylineStateList = this.keylineStateList;
        float itemSize = (keylineStateList == null || this.orientationHelper.orientation != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : keylineStateList.getDefaultState().getItemSize();
        KeylineStateList keylineStateList2 = this.keylineStateList;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i11, (int) itemSize, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i12, (int) ((keylineStateList2 == null || this.orientationHelper.orientation != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : keylineStateList2.getDefaultState().getItemSize()), canScrollVertically()));
    }

    public void notifyItemSizeChanged() {
        refreshKeylineState();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(@NonNull View view, int i7, @NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(@NonNull RecyclerView recyclerView, int i7, int i10) {
        super.onItemsAdded(recyclerView, i7, i10);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(@NonNull RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(@NonNull RecyclerView recyclerView, int i7, int i10) {
        super.onItemsRemoved(recyclerView, i7, i10);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineStateList keylineStateList = this.keylineStateList;
        boolean z3 = keylineStateList == null;
        if (z3 || keylineStateList.getDefaultState().getCarouselSize() != getContainerSize()) {
            recalculateKeylineStateList(recycler);
        }
        int iCalculateStartScroll = calculateStartScroll(this.keylineStateList);
        int iCalculateEndScroll = calculateEndScroll(state, this.keylineStateList);
        this.minScroll = zIsLayoutRtl ? iCalculateEndScroll : iCalculateStartScroll;
        if (zIsLayoutRtl) {
            iCalculateEndScroll = iCalculateStartScroll;
        }
        this.maxScroll = iCalculateEndScroll;
        if (z3) {
            this.scrollOffset = iCalculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i7 = this.currentEstimatedPosition;
            if (i7 != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i7, getKeylineStateForPosition(i7));
            }
        }
        int i10 = this.scrollOffset;
        this.scrollOffset = i10 + calculateShouldScrollBy(0, i10, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = a.m(this.currentFillStartPosition, 0, state.getItemCount());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(recycler);
        fill(recycler, state);
        this.lastItemCount = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z3, boolean z8) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i7, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i7) {
        this.currentEstimatedPosition = i7;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i7, getKeylineStateForPosition(i7));
        this.currentFillStartPosition = a.m(i7, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i7, recycler, state);
        }
        return 0;
    }

    public void setCarouselAlignment(int i7) {
        this.carouselAlignment = i7;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@NonNull CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @RestrictTo({c.f39801b})
    public void setDebuggingEnabled(@NonNull RecyclerView recyclerView, boolean z3) {
        this.isDebuggingEnabled = z3;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z3) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException(G.m(i7, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i7 != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i7);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i7) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDxToMakeVisible(View view, int i10) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateDyToMakeVisible(View view, int i10) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
            @Nullable
            public PointF computeScrollVectorForPosition(int i10) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
            }
        };
        linearSmoothScroller.setTargetPosition(i7);
        startSmoothScroll(linearSmoothScroller);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@NonNull CarouselStrategy carouselStrategy, int i7) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new k(this, 1);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i7);
    }

    private int scrollBy(int i7, RecyclerView.Recycler recycler, RecyclerView.State state) {
        float f10;
        if (getChildCount() == 0 || i7 == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(recycler);
        }
        if (getItemCount() <= getKeylineStartingState(this.keylineStateList).getTotalVisibleFocalItems()) {
            return 0;
        }
        int iCalculateShouldScrollBy = calculateShouldScrollBy(i7, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += iCalculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float fCalculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f10 = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f10 = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f11 = Float.MAX_VALUE;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            float fAbs = Math.abs(f10 - offsetChild(childAt, fCalculateChildStartForFill, itemSize, rect));
            if (childAt != null && fAbs < f11) {
                this.currentEstimatedPosition = getPosition(childAt);
                f11 = fAbs;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(recycler, state);
        return iCalculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new k(this, 1);
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
