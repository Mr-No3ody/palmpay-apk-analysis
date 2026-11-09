package com.google.android.flexbox;

import C0.G;
import N8.q0;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.video.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FlexboxHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_CAPACITY = 10;
    private static final long MEASURE_SPEC_WIDTH_MASK = 4294967295L;
    private boolean[] mChildrenFrozen;
    private final FlexContainer mFlexContainer;

    @Nullable
    int[] mIndexToFlexLine;

    @Nullable
    long[] mMeasureSpecCache;

    @Nullable
    private long[] mMeasuredSizeCache;

    public static class FlexLinesResult {
        int mChildState;
        List<FlexLine> mFlexLines;

        public void reset() {
            this.mFlexLines = null;
            this.mChildState = 0;
        }
    }

    public static class Order implements Comparable<Order> {
        int index;
        int order;

        private Order() {
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.order);
            sb2.append(", index=");
            return q0.m(sb2, this.index, '}');
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull Order order) {
            int i7 = this.order;
            int i10 = order.order;
            return i7 != i10 ? i7 - i10 : this.index - order.index;
        }
    }

    public FlexboxHelper(FlexContainer flexContainer) {
        this.mFlexContainer = flexContainer;
    }

    private void addFlexLine(List<FlexLine> list, FlexLine flexLine, int i7, int i10) {
        flexLine.mSumCrossSizeBefore = i10;
        this.mFlexContainer.onNewFlexLineAdded(flexLine);
        flexLine.mLastIndex = i7;
        list.add(flexLine);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void checkSizeConstraints(View view, int i7) {
        boolean z3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z8 = true;
        if (measuredWidth >= flexItem.getMinWidth()) {
            if (measuredWidth > flexItem.getMaxWidth()) {
                measuredWidth = flexItem.getMaxWidth();
            } else {
                z3 = false;
            }
            if (measuredHeight < flexItem.getMinHeight()) {
                measuredHeight = flexItem.getMinHeight();
            } else if (measuredHeight > flexItem.getMaxHeight()) {
                measuredHeight = flexItem.getMaxHeight();
            } else {
                z8 = z3;
            }
            if (z8) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                updateMeasureCache(i7, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.mFlexContainer.updateViewCache(i7, view);
            }
        }
        measuredWidth = flexItem.getMinWidth();
        z3 = true;
        if (measuredHeight < flexItem.getMinHeight()) {
            measuredHeight = flexItem.getMinHeight();
        } else if (measuredHeight > flexItem.getMaxHeight()) {
            measuredHeight = flexItem.getMaxHeight();
        } else {
            z8 = z3;
        }
        if (z8) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            updateMeasureCache(i7, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.mFlexContainer.updateViewCache(i7, view);
        }
    }

    private List<FlexLine> constructFlexLinesForAlignContentCenter(List<FlexLine> list, int i7, int i10) {
        int i11 = (i7 - i10) / 2;
        ArrayList arrayList = new ArrayList();
        FlexLine flexLine = new FlexLine();
        flexLine.mCrossSize = i11;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 == 0) {
                arrayList.add(flexLine);
            }
            arrayList.add(list.get(i12));
            if (i12 == list.size() - 1) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @NonNull
    private List<Order> createOrders(int i7) {
        ArrayList arrayList = new ArrayList(i7);
        for (int i10 = 0; i10 < i7; i10++) {
            FlexItem flexItem = (FlexItem) this.mFlexContainer.getFlexItemAt(i10).getLayoutParams();
            Order order = new Order();
            order.order = flexItem.getOrder();
            order.index = i10;
            arrayList.add(order);
        }
        return arrayList;
    }

    private void ensureChildrenFrozen(int i7) {
        boolean[] zArr = this.mChildrenFrozen;
        if (zArr == null) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.mChildrenFrozen = new boolean[i7];
        } else {
            if (zArr.length >= i7) {
                Arrays.fill(zArr, false);
                return;
            }
            int length = zArr.length * 2;
            if (length >= i7) {
                i7 = length;
            }
            this.mChildrenFrozen = new boolean[i7];
        }
    }

    private void evaluateMinimumSizeForCompoundButton(CompoundButton compoundButton) {
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int minWidth = flexItem.getMinWidth();
        int minHeight = flexItem.getMinHeight();
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
        int minimumHeight = buttonDrawable != null ? buttonDrawable.getMinimumHeight() : 0;
        if (minWidth == -1) {
            minWidth = minimumWidth;
        }
        flexItem.setMinWidth(minWidth);
        if (minHeight == -1) {
            minHeight = minimumHeight;
        }
        flexItem.setMinHeight(minHeight);
    }

    private void expandFlexItems(int i7, int i10, FlexLine flexLine, int i11, int i12, boolean z3) {
        int i13;
        float f10;
        float f11;
        int iMax;
        double d2;
        double d10;
        float f12 = flexLine.mTotalFlexGrow;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i11 < (i13 = flexLine.mMainSize)) {
            return;
        }
        float f14 = (i11 - i13) / f12;
        flexLine.mMainSize = i12 + flexLine.mDividerLengthInMainSize;
        if (!z3) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z8 = false;
        int i15 = 0;
        float f15 = 0.0f;
        while (i14 < flexLine.mItemCount) {
            int i16 = flexLine.mFirstIndex + i14;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z8 = z8;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    f11 = f14;
                    boolean z10 = z8;
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i16]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i16]);
                    }
                    if (this.mChildrenFrozen[i16] || flexItem.getFlexGrow() <= f10) {
                        z8 = z10;
                    } else {
                        float flexGrow = (flexItem.getFlexGrow() * f11) + measuredWidth;
                        if (i14 == flexLine.mItemCount - 1) {
                            flexGrow += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(flexGrow);
                        if (iRound > flexItem.getMaxWidth()) {
                            iRound = flexItem.getMaxWidth();
                            this.mChildrenFrozen[i16] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z8 = true;
                        } else {
                            float f16 = (flexGrow - iRound) + f15;
                            double d11 = f16;
                            if (d11 > 1.0d) {
                                iRound++;
                                d2 = d11 - 1.0d;
                            } else {
                                if (d11 < -1.0d) {
                                    iRound--;
                                    d2 = d11 + 1.0d;
                                }
                                f15 = f16;
                                z8 = z10;
                            }
                            f16 = (float) d2;
                            f15 = f16;
                            z8 = z10;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i10, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i16, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i16]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    f11 = f14;
                    boolean z11 = z8;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i16]);
                    }
                    if (this.mChildrenFrozen[i16] || flexItem.getFlexGrow() <= f10) {
                        z8 = z11;
                    } else {
                        float flexGrow2 = (flexItem.getFlexGrow() * f11) + measuredHeight3;
                        if (i14 == flexLine.mItemCount - 1) {
                            flexGrow2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(flexGrow2);
                        if (iRound2 > flexItem.getMaxHeight()) {
                            iRound2 = flexItem.getMaxHeight();
                            this.mChildrenFrozen[i16] = true;
                            flexLine.mTotalFlexGrow -= flexItem.getFlexGrow();
                            z8 = true;
                        } else {
                            float f17 = (flexGrow2 - iRound2) + f15;
                            double d12 = f17;
                            if (d12 > 1.0d) {
                                iRound2++;
                                d10 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound2--;
                                    d10 = d12 + 1.0d;
                                }
                                f15 = f17;
                                z8 = z11;
                            }
                            f17 = (float) d10;
                            f15 = f17;
                            z8 = z11;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i7, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i16, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i15 = iMax;
            }
            i14++;
            f14 = f11;
            f13 = f10;
        }
        if (!z8 || i13 == flexLine.mMainSize) {
            return;
        }
        expandFlexItems(i7, i10, flexLine, i11, i12, true);
    }

    private int getChildHeightMeasureSpecInternal(int i7, FlexItem flexItem, int i10) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childHeightMeasureSpec = flexContainer.getChildHeightMeasureSpec(i7, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i10, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(childHeightMeasureSpec);
        if (size > flexItem.getMaxHeight()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec));
        }
        return size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(childHeightMeasureSpec)) : childHeightMeasureSpec;
    }

    private int getChildWidthMeasureSpecInternal(int i7, FlexItem flexItem, int i10) {
        FlexContainer flexContainer = this.mFlexContainer;
        int childWidthMeasureSpec = flexContainer.getChildWidthMeasureSpec(i7, flexContainer.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i10, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(childWidthMeasureSpec);
        if (size > flexItem.getMaxWidth()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec));
        }
        return size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(childWidthMeasureSpec)) : childWidthMeasureSpec;
    }

    private int getFlexItemMarginEndCross(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getMarginBottom() : flexItem.getMarginRight();
    }

    private int getFlexItemMarginEndMain(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getMarginRight() : flexItem.getMarginBottom();
    }

    private int getFlexItemMarginStartCross(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getMarginTop() : flexItem.getMarginLeft();
    }

    private int getFlexItemMarginStartMain(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getMarginLeft() : flexItem.getMarginTop();
    }

    private int getFlexItemSizeCross(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getHeight() : flexItem.getWidth();
    }

    private int getFlexItemSizeMain(FlexItem flexItem, boolean z3) {
        return z3 ? flexItem.getWidth() : flexItem.getHeight();
    }

    private int getPaddingEndCross(boolean z3) {
        return z3 ? this.mFlexContainer.getPaddingBottom() : this.mFlexContainer.getPaddingEnd();
    }

    private int getPaddingEndMain(boolean z3) {
        return z3 ? this.mFlexContainer.getPaddingEnd() : this.mFlexContainer.getPaddingBottom();
    }

    private int getPaddingStartCross(boolean z3) {
        return z3 ? this.mFlexContainer.getPaddingTop() : this.mFlexContainer.getPaddingStart();
    }

    private int getPaddingStartMain(boolean z3) {
        return z3 ? this.mFlexContainer.getPaddingStart() : this.mFlexContainer.getPaddingTop();
    }

    private int getViewMeasuredSizeCross(View view, boolean z3) {
        return z3 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int getViewMeasuredSizeMain(View view, boolean z3) {
        return z3 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean isLastFlexItem(int i7, int i10, FlexLine flexLine) {
        return i7 == i10 - 1 && flexLine.getItemCountNotGone() != 0;
    }

    private boolean isWrapRequired(View view, int i7, int i10, int i11, int i12, FlexItem flexItem, int i13, int i14, int i15) {
        if (this.mFlexContainer.getFlexWrap() == 0) {
            return false;
        }
        if (flexItem.isWrapBefore()) {
            return true;
        }
        if (i7 == 0) {
            return false;
        }
        int maxLine = this.mFlexContainer.getMaxLine();
        if (maxLine != -1 && maxLine <= i15 + 1) {
            return false;
        }
        int decorationLengthMainAxis = this.mFlexContainer.getDecorationLengthMainAxis(view, i13, i14);
        if (decorationLengthMainAxis > 0) {
            i12 += decorationLengthMainAxis;
        }
        return i10 < i11 + i12;
    }

    private void shrinkFlexItems(int i7, int i10, FlexLine flexLine, int i11, int i12, boolean z3) {
        float f10;
        float f11;
        int iMax;
        int minWidth;
        int i13 = flexLine.mMainSize;
        float f12 = flexLine.mTotalFlexShrink;
        float f13 = 0.0f;
        if (f12 <= 0.0f || i11 > i13) {
            return;
        }
        float f14 = (i13 - i11) / f12;
        flexLine.mMainSize = i12 + flexLine.mDividerLengthInMainSize;
        if (!z3) {
            flexLine.mCrossSize = Integer.MIN_VALUE;
        }
        int i14 = 0;
        boolean z8 = false;
        int i15 = 0;
        float f15 = 0.0f;
        while (i14 < flexLine.mItemCount) {
            int i16 = flexLine.mFirstIndex + i14;
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i16);
            if (reorderedFlexItemAt == null || reorderedFlexItemAt.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                int flexDirection = this.mFlexContainer.getFlexDirection();
                f10 = f13;
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr = this.mMeasuredSizeCache;
                    if (jArr != null) {
                        measuredWidth = extractLowerInt(jArr[i16]);
                    }
                    int measuredHeight = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr2 = this.mMeasuredSizeCache;
                    f11 = f14;
                    if (jArr2 != null) {
                        measuredHeight = extractHigherInt(jArr2[i16]);
                    }
                    if (!this.mChildrenFrozen[i16] && flexItem.getFlexShrink() > f10) {
                        float flexShrink = measuredWidth - (f11 * flexItem.getFlexShrink());
                        if (i14 == flexLine.mItemCount - 1) {
                            flexShrink += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(flexShrink);
                        if (iRound < flexItem.getMinWidth()) {
                            minWidth = flexItem.getMinWidth();
                            this.mChildrenFrozen[i16] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z8 = true;
                        } else {
                            float f16 = (flexShrink - iRound) + f15;
                            double d2 = f16;
                            if (d2 > 1.0d) {
                                minWidth = iRound + 1;
                                f16 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                minWidth = iRound - 1;
                                f16 += 1.0f;
                            } else {
                                minWidth = iRound;
                            }
                            f15 = f16;
                        }
                        int childHeightMeasureSpecInternal = getChildHeightMeasureSpecInternal(i10, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(minWidth, 1073741824);
                        reorderedFlexItemAt.measure(iMakeMeasureSpec, childHeightMeasureSpecInternal);
                        int measuredWidth2 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight2 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i16, iMakeMeasureSpec, childHeightMeasureSpecInternal, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i15, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight() + flexLine.mMainSize;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = reorderedFlexItemAt.getMeasuredHeight();
                    long[] jArr3 = this.mMeasuredSizeCache;
                    if (jArr3 != null) {
                        measuredHeight3 = extractHigherInt(jArr3[i16]);
                    }
                    int measuredWidth3 = reorderedFlexItemAt.getMeasuredWidth();
                    long[] jArr4 = this.mMeasuredSizeCache;
                    if (jArr4 != null) {
                        measuredWidth3 = extractLowerInt(jArr4[i16]);
                    }
                    if (!this.mChildrenFrozen[i16] && flexItem.getFlexShrink() > f10) {
                        float flexShrink2 = measuredHeight3 - (flexItem.getFlexShrink() * f14);
                        if (i14 == flexLine.mItemCount - 1) {
                            flexShrink2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(flexShrink2);
                        if (iRound2 < flexItem.getMinHeight()) {
                            iRound2 = flexItem.getMinHeight();
                            this.mChildrenFrozen[i16] = true;
                            flexLine.mTotalFlexShrink -= flexItem.getFlexShrink();
                            z8 = true;
                        } else {
                            float f17 = (flexShrink2 - iRound2) + f15;
                            double d10 = f17;
                            if (d10 > 1.0d) {
                                iRound2++;
                                f17 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound2--;
                                f17 += 1.0f;
                            }
                            f15 = f17;
                        }
                        int childWidthMeasureSpecInternal = getChildWidthMeasureSpecInternal(i7, flexItem, flexLine.mSumCrossSizeBefore);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        reorderedFlexItemAt.measure(childWidthMeasureSpecInternal, iMakeMeasureSpec2);
                        int measuredWidth4 = reorderedFlexItemAt.getMeasuredWidth();
                        int measuredHeight4 = reorderedFlexItemAt.getMeasuredHeight();
                        updateMeasureCache(i16, childWidthMeasureSpecInternal, iMakeMeasureSpec2, reorderedFlexItemAt);
                        this.mFlexContainer.updateViewCache(i16, reorderedFlexItemAt);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i15, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mMainSize = measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom() + flexLine.mMainSize;
                    f11 = f14;
                }
                flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                i15 = iMax;
            }
            i14++;
            f14 = f11;
            f13 = f10;
        }
        if (!z8 || i13 == flexLine.mMainSize) {
            return;
        }
        shrinkFlexItems(i7, i10, flexLine, i11, i12, true);
    }

    private int[] sortOrdersIntoReorderedIndices(int i7, List<Order> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i7];
        int i10 = 0;
        for (Order order : list) {
            int i11 = order.index;
            iArr[i10] = i11;
            sparseIntArray.append(i11, order.order);
            i10++;
        }
        return iArr;
    }

    private void stretchViewHorizontally(View view, int i7, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i7 - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractHigherInt(jArr[i10]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        updateMeasureCache(i10, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.mFlexContainer.updateViewCache(i10, view);
    }

    private void stretchViewVertically(View view, int i7, int i10) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i7 - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.mFlexContainer.getDecorationLengthCrossAxis(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.mMeasuredSizeCache;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? extractLowerInt(jArr[i10]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        updateMeasureCache(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.mFlexContainer.updateViewCache(i10, view);
    }

    private void updateMeasureCache(int i7, int i10, int i11, View view) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr != null) {
            jArr[i7] = makeCombinedLong(i10, i11);
        }
        long[] jArr2 = this.mMeasuredSizeCache;
        if (jArr2 != null) {
            jArr2[i7] = makeCombinedLong(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void calculateFlexLines(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, int i13, @Nullable List<FlexLine> list) {
        int i14;
        boolean z3;
        int i15;
        int i16;
        int i17;
        int childWidthMeasureSpec;
        int i18;
        int i19;
        FlexLine flexLine;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25 = i7;
        boolean zIsMainAxisDirectionHorizontal = this.mFlexContainer.isMainAxisDirectionHorizontal();
        int mode = View.MeasureSpec.getMode(i25);
        int size = View.MeasureSpec.getSize(i25);
        List<FlexLine> arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.mFlexLines = arrayList;
        boolean z8 = i13 == -1;
        int paddingStartMain = getPaddingStartMain(zIsMainAxisDirectionHorizontal);
        int paddingEndMain = getPaddingEndMain(zIsMainAxisDirectionHorizontal);
        int paddingStartCross = getPaddingStartCross(zIsMainAxisDirectionHorizontal);
        int paddingEndCross = getPaddingEndCross(zIsMainAxisDirectionHorizontal);
        FlexLine flexLine2 = new FlexLine();
        int i26 = i12;
        flexLine2.mFirstIndex = i26;
        int i27 = paddingStartMain + paddingEndMain;
        flexLine2.mMainSize = i27;
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        boolean z10 = z8;
        FlexLine flexLine3 = flexLine2;
        int i28 = Integer.MIN_VALUE;
        int i29 = 0;
        int iCombineMeasuredStates = 0;
        int i30 = 0;
        while (i26 < flexItemCount) {
            View reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i26);
            if (reorderedFlexItemAt == null) {
                if (isLastFlexItem(i26, flexItemCount, flexLine3)) {
                    addFlexLine(arrayList, flexLine3, i26, i29);
                }
                i15 = i27;
                z3 = true;
            } else {
                z3 = true;
                i15 = i27;
                if (reorderedFlexItemAt.getVisibility() == 8) {
                    flexLine3.mGoneItemCount++;
                    flexLine3.mItemCount++;
                    if (isLastFlexItem(i26, flexItemCount, flexLine3)) {
                        addFlexLine(arrayList, flexLine3, i26, i29);
                    }
                } else {
                    if (reorderedFlexItemAt instanceof CompoundButton) {
                        evaluateMinimumSizeForCompoundButton((CompoundButton) reorderedFlexItemAt);
                    }
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    int i31 = flexItemCount;
                    if (flexItem.getAlignSelf() == 4) {
                        flexLine3.mIndicesAlignSelfStretch.add(Integer.valueOf(i26));
                    }
                    int flexItemSizeMain = getFlexItemSizeMain(flexItem, zIsMainAxisDirectionHorizontal);
                    if (flexItem.getFlexBasisPercent() != -1.0f && mode == 1073741824) {
                        flexItemSizeMain = Math.round(size * flexItem.getFlexBasisPercent());
                    }
                    if (zIsMainAxisDirectionHorizontal) {
                        childWidthMeasureSpec = this.mFlexContainer.getChildWidthMeasureSpec(i25, i15 + getFlexItemMarginStartMain(flexItem, true) + getFlexItemMarginEndMain(flexItem, true), flexItemSizeMain);
                        i16 = i29;
                        int childHeightMeasureSpec = this.mFlexContainer.getChildHeightMeasureSpec(i10, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, true) + getFlexItemMarginEndCross(flexItem, true) + i29, getFlexItemSizeCross(flexItem, true));
                        reorderedFlexItemAt.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                        updateMeasureCache(i26, childWidthMeasureSpec, childHeightMeasureSpec, reorderedFlexItemAt);
                        i17 = 0;
                    } else {
                        i16 = i29;
                        i17 = 0;
                        int childWidthMeasureSpec2 = this.mFlexContainer.getChildWidthMeasureSpec(i10, paddingStartCross + paddingEndCross + getFlexItemMarginStartCross(flexItem, false) + getFlexItemMarginEndCross(flexItem, false) + i16, getFlexItemSizeCross(flexItem, false));
                        int childHeightMeasureSpec2 = this.mFlexContainer.getChildHeightMeasureSpec(i25, i15 + getFlexItemMarginStartMain(flexItem, false) + getFlexItemMarginEndMain(flexItem, false), flexItemSizeMain);
                        reorderedFlexItemAt.measure(childWidthMeasureSpec2, childHeightMeasureSpec2);
                        updateMeasureCache(i26, childWidthMeasureSpec2, childHeightMeasureSpec2, reorderedFlexItemAt);
                        childWidthMeasureSpec = childHeightMeasureSpec2;
                    }
                    this.mFlexContainer.updateViewCache(i26, reorderedFlexItemAt);
                    checkSizeConstraints(reorderedFlexItemAt, i26);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, reorderedFlexItemAt.getMeasuredState());
                    int i32 = i17;
                    i18 = i26;
                    int i33 = childWidthMeasureSpec;
                    FlexLine flexLine4 = flexLine3;
                    int i34 = i30;
                    i19 = i16;
                    size = size;
                    if (isWrapRequired(reorderedFlexItemAt, mode, size, flexLine3.mMainSize, getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal), flexItem, i18, i34, arrayList.size())) {
                        if (flexLine4.getItemCountNotGone() > 0) {
                            addFlexLine(arrayList, flexLine4, i18 > 0 ? i18 - 1 : i32, i19);
                            i24 = i19 + flexLine4.mCrossSize;
                        } else {
                            i24 = i19;
                        }
                        if (zIsMainAxisDirectionHorizontal) {
                            if (flexItem.getHeight() == -1) {
                                FlexContainer flexContainer = this.mFlexContainer;
                                reorderedFlexItemAt.measure(i33, flexContainer.getChildHeightMeasureSpec(i10, flexContainer.getPaddingTop() + this.mFlexContainer.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i24, flexItem.getHeight()));
                                checkSizeConstraints(reorderedFlexItemAt, i18);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            FlexContainer flexContainer2 = this.mFlexContainer;
                            reorderedFlexItemAt.measure(flexContainer2.getChildWidthMeasureSpec(i10, flexContainer2.getPaddingLeft() + this.mFlexContainer.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i24, flexItem.getWidth()), i33);
                            checkSizeConstraints(reorderedFlexItemAt, i18);
                        }
                        FlexLine flexLine5 = new FlexLine();
                        flexLine5.mItemCount = 1;
                        i20 = i15;
                        flexLine5.mMainSize = i20;
                        flexLine5.mFirstIndex = i18;
                        i19 = i24;
                        i22 = Integer.MIN_VALUE;
                        flexLine = flexLine5;
                        i21 = i32;
                    } else {
                        flexLine = flexLine4;
                        i20 = i15;
                        flexLine.mItemCount++;
                        i21 = i34 + 1;
                        i22 = i28;
                    }
                    flexLine.mAnyItemsHaveFlexGrow = (flexLine.mAnyItemsHaveFlexGrow ? 1 : 0) | (flexItem.getFlexGrow() != 0.0f ? 1 : i32);
                    flexLine.mAnyItemsHaveFlexShrink = (flexLine.mAnyItemsHaveFlexShrink ? 1 : 0) | (flexItem.getFlexShrink() != 0.0f ? 1 : i32);
                    int[] iArr = this.mIndexToFlexLine;
                    if (iArr != null) {
                        iArr[i18] = arrayList.size();
                    }
                    flexLine.mMainSize = getViewMeasuredSizeMain(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartMain(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndMain(flexItem, zIsMainAxisDirectionHorizontal) + flexLine.mMainSize;
                    flexLine.mTotalFlexGrow += flexItem.getFlexGrow();
                    flexLine.mTotalFlexShrink += flexItem.getFlexShrink();
                    this.mFlexContainer.onNewFlexItemAdded(reorderedFlexItemAt, i18, i21, flexLine);
                    int iMax = Math.max(i22, getViewMeasuredSizeCross(reorderedFlexItemAt, zIsMainAxisDirectionHorizontal) + getFlexItemMarginStartCross(flexItem, zIsMainAxisDirectionHorizontal) + getFlexItemMarginEndCross(flexItem, zIsMainAxisDirectionHorizontal) + this.mFlexContainer.getDecorationLengthCrossAxis(reorderedFlexItemAt));
                    flexLine.mCrossSize = Math.max(flexLine.mCrossSize, iMax);
                    if (zIsMainAxisDirectionHorizontal) {
                        if (this.mFlexContainer.getFlexWrap() != 2) {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, reorderedFlexItemAt.getBaseline() + flexItem.getMarginTop());
                        } else {
                            flexLine.mMaxBaseline = Math.max(flexLine.mMaxBaseline, (reorderedFlexItemAt.getMeasuredHeight() - reorderedFlexItemAt.getBaseline()) + flexItem.getMarginBottom());
                        }
                    }
                    i23 = i31;
                    if (isLastFlexItem(i18, i23, flexLine)) {
                        addFlexLine(arrayList, flexLine, i18, i19);
                        i19 += flexLine.mCrossSize;
                    }
                    if (i13 != -1 && arrayList.size() > 0) {
                        if (((FlexLine) u.e(1, arrayList)).mLastIndex >= i13 && i18 >= i13 && !z10) {
                            i19 = -flexLine.getCrossSize();
                            z10 = true;
                        }
                    }
                    if (i19 > i11 && z10) {
                        i14 = iCombineMeasuredStates;
                        flexLinesResult.mChildState = i14;
                    } else {
                        i30 = i21;
                        i28 = iMax;
                    }
                }
                flexItemCount = i23;
                i26 = i18 + 1;
                i27 = i20;
                flexLine3 = flexLine;
                i29 = i19;
                mode = mode;
                i25 = i7;
            }
            i18 = i26;
            mode = mode;
            i23 = flexItemCount;
            i19 = i29;
            i20 = i15;
            flexLine = flexLine3;
            flexItemCount = i23;
            i26 = i18 + 1;
            i27 = i20;
            flexLine3 = flexLine;
            i29 = i19;
            mode = mode;
            i25 = i7;
        }
        i14 = iCombineMeasuredStates;
        flexLinesResult.mChildState = i14;
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i7, int i10) {
        calculateFlexLines(flexLinesResult, i7, i10, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateHorizontalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i7, i10, i11, 0, i12, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i7, int i10) {
        calculateFlexLines(flexLinesResult, i10, i7, Integer.MAX_VALUE, 0, -1, null);
    }

    public void calculateVerticalFlexLinesToIndex(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i10, i7, i11, 0, i12, list);
    }

    public void clearFlexLines(List<FlexLine> list, int i7) {
        int i10 = this.mIndexToFlexLine[i7];
        if (i10 == -1) {
            i10 = 0;
        }
        for (int size = list.size() - 1; size >= i10; size--) {
            list.remove(size);
        }
        int[] iArr = this.mIndexToFlexLine;
        int length = iArr.length - 1;
        if (i7 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i7, length, -1);
        }
        long[] jArr = this.mMeasureSpecCache;
        int length2 = jArr.length - 1;
        if (i7 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i7, length2, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] createReorderedIndices(View view, int i7, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        List<Order> listCreateOrders = createOrders(flexItemCount);
        Order order = new Order();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            order.order = 1;
        } else {
            order.order = ((FlexItem) layoutParams).getOrder();
        }
        if (i7 == -1 || i7 == flexItemCount || i7 >= this.mFlexContainer.getFlexItemCount()) {
            order.index = flexItemCount;
        } else {
            order.index = i7;
            while (i7 < flexItemCount) {
                listCreateOrders.get(i7).index++;
                i7++;
            }
        }
        listCreateOrders.add(order);
        return sortOrdersIntoReorderedIndices(flexItemCount + 1, listCreateOrders, sparseIntArray);
    }

    public void determineCrossSize(int i7, int i10, int i11) {
        int mode;
        int size;
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i10);
            int size2 = View.MeasureSpec.getSize(i10);
            mode = mode2;
            size = size2;
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(G.m(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
        }
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mFlexContainer.getSumOfCrossSize() + i11;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).mCrossSize = size - i11;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mFlexContainer.getAlignContent();
                if (alignContent == 1) {
                    int i13 = size - sumOfCrossSize;
                    FlexLine flexLine = new FlexLine();
                    flexLine.mCrossSize = i13;
                    flexLinesInternal.add(0, flexLine);
                    return;
                }
                if (alignContent == 2) {
                    this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f10 = 0.0f;
                    while (i12 < size4) {
                        arrayList.add(flexLinesInternal.get(i12));
                        if (i12 != flexLinesInternal.size() - 1) {
                            FlexLine flexLine2 = new FlexLine();
                            if (i12 == flexLinesInternal.size() - 2) {
                                flexLine2.mCrossSize = Math.round(f10 + size3);
                                f10 = 0.0f;
                            } else {
                                flexLine2.mCrossSize = Math.round(size3);
                            }
                            int i14 = flexLine2.mCrossSize;
                            float f11 = (size3 - i14) + f10;
                            if (f11 > 1.0f) {
                                flexLine2.mCrossSize = i14 + 1;
                                f11 -= 1.0f;
                            } else if (f11 < -1.0f) {
                                flexLine2.mCrossSize = i14 - 1;
                                f11 += 1.0f;
                            }
                            f10 = f11;
                            arrayList.add(flexLine2);
                        }
                        i12++;
                    }
                    this.mFlexContainer.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mFlexContainer.setFlexLines(constructFlexLinesForAlignContentCenter(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    FlexLine flexLine3 = new FlexLine();
                    flexLine3.mCrossSize = size5;
                    for (FlexLine flexLine4 : flexLinesInternal) {
                        arrayList2.add(flexLine3);
                        arrayList2.add(flexLine4);
                        arrayList2.add(flexLine3);
                    }
                    this.mFlexContainer.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i12 < size7) {
                        FlexLine flexLine5 = flexLinesInternal.get(i12);
                        float f13 = flexLine5.mCrossSize + size6;
                        if (i12 == flexLinesInternal.size() - 1) {
                            f13 += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(f13);
                        float f14 = (f13 - iRound) + f12;
                        if (f14 > 1.0f) {
                            iRound++;
                            f14 -= 1.0f;
                        } else if (f14 < -1.0f) {
                            iRound--;
                            f14 += 1.0f;
                        }
                        f12 = f14;
                        flexLine5.mCrossSize = iRound;
                        i12++;
                    }
                }
            }
        }
    }

    public void determineMainSize(int i7, int i10) {
        determineMainSize(i7, i10, 0);
    }

    public void ensureIndexToFlexLine(int i7) {
        int[] iArr = this.mIndexToFlexLine;
        if (iArr == null) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.mIndexToFlexLine = new int[i7];
        } else if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (length >= i7) {
                i7 = length;
            }
            this.mIndexToFlexLine = Arrays.copyOf(iArr, i7);
        }
    }

    public void ensureMeasureSpecCache(int i7) {
        long[] jArr = this.mMeasureSpecCache;
        if (jArr == null) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.mMeasureSpecCache = new long[i7];
        } else if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (length >= i7) {
                i7 = length;
            }
            this.mMeasureSpecCache = Arrays.copyOf(jArr, i7);
        }
    }

    public void ensureMeasuredSizeCache(int i7) {
        long[] jArr = this.mMeasuredSizeCache;
        if (jArr == null) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.mMeasuredSizeCache = new long[i7];
        } else if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (length >= i7) {
                i7 = length;
            }
            this.mMeasuredSizeCache = Arrays.copyOf(jArr, i7);
        }
    }

    public int extractHigherInt(long j6) {
        return (int) (j6 >> 32);
    }

    public int extractLowerInt(long j6) {
        return (int) j6;
    }

    public boolean isOrderChangedFromLastMeasurement(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i7 = 0; i7 < flexItemCount; i7++) {
            View flexItemAt = this.mFlexContainer.getFlexItemAt(i7);
            if (flexItemAt != null && ((FlexItem) flexItemAt.getLayoutParams()).getOrder() != sparseIntArray.get(i7)) {
                return true;
            }
        }
        return false;
    }

    public void layoutSingleChildHorizontal(View view, FlexLine flexLine, int i7, int i10, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i13 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i14 = i10 + i13;
                    view.layout(i7, (i14 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i11, i14 - flexItem.getMarginBottom());
                    return;
                } else {
                    view.layout(i7, view.getMeasuredHeight() + (i10 - i13) + flexItem.getMarginTop(), i11, view.getMeasuredHeight() + (i12 - i13) + flexItem.getMarginTop());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i13 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int i15 = i10 + measuredHeight;
                    view.layout(i7, i15, i11, view.getMeasuredHeight() + i15);
                    return;
                } else {
                    int i16 = i10 - measuredHeight;
                    view.layout(i7, i16, i11, view.getMeasuredHeight() + i16);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.mFlexContainer.getFlexWrap() != 2) {
                    int iMax = Math.max(flexLine.mMaxBaseline - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i7, i10 + iMax, i11, i12 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (flexLine.mMaxBaseline - view.getMeasuredHeight()), flexItem.getMarginBottom());
                    view.layout(i7, i10 - iMax2, i11, i12 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mFlexContainer.getFlexWrap() != 2) {
            view.layout(i7, i10 + flexItem.getMarginTop(), i11, i12 + flexItem.getMarginTop());
        } else {
            view.layout(i7, i10 - flexItem.getMarginBottom(), i11, i12 - flexItem.getMarginBottom());
        }
    }

    public void layoutSingleChildVertical(View view, FlexLine flexLine, boolean z3, int i7, int i10, int i11, int i12) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.mFlexContainer.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i13 = flexLine.mCrossSize;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z3) {
                    view.layout(((i7 + i13) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i10, ((i11 + i13) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i12);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i7 - i13) + flexItem.getMarginLeft(), i10, view.getMeasuredWidth() + (i11 - i13) + flexItem.getMarginLeft(), i12);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i13 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z3) {
                    view.layout(i7 - marginStart, i10, i11 - marginStart, i12);
                    return;
                } else {
                    view.layout(i7 + marginStart, i10, i11 + marginStart, i12);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z3) {
            view.layout(i7 - flexItem.getMarginRight(), i10, i11 - flexItem.getMarginRight(), i12);
        } else {
            view.layout(i7 + flexItem.getMarginLeft(), i10, i11 + flexItem.getMarginLeft(), i12);
        }
    }

    @VisibleForTesting
    public long makeCombinedLong(int i7, int i10) {
        return (((long) i7) & MEASURE_SPEC_WIDTH_MASK) | (((long) i10) << 32);
    }

    public void stretchViews() {
        stretchViews(0);
    }

    public void calculateHorizontalFlexLines(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i7, i10, i11, i12, -1, list);
    }

    public void calculateVerticalFlexLines(FlexLinesResult flexLinesResult, int i7, int i10, int i11, int i12, @Nullable List<FlexLine> list) {
        calculateFlexLines(flexLinesResult, i10, i7, i11, i12, -1, list);
    }

    public void determineMainSize(int i7, int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i12;
        int i13;
        ensureChildrenFrozen(this.mFlexContainer.getFlexItemCount());
        if (i11 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        int flexDirection2 = this.mFlexContainer.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i7);
            size = View.MeasureSpec.getSize(i7);
            int largestMainSize = this.mFlexContainer.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.mFlexContainer.getPaddingLeft();
            paddingRight = this.mFlexContainer.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(G.m(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = this.mFlexContainer.getLargestMainSize();
            }
            paddingLeft = this.mFlexContainer.getPaddingTop();
            paddingRight = this.mFlexContainer.getPaddingBottom();
        }
        int i14 = paddingLeft + paddingRight;
        int i15 = size;
        int[] iArr = this.mIndexToFlexLine;
        int i16 = iArr != null ? iArr[i11] : 0;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i16 < size2) {
            FlexLine flexLine = flexLinesInternal.get(i16);
            int i17 = flexLine.mMainSize;
            if (i17 >= i15 || !flexLine.mAnyItemsHaveFlexGrow) {
                i12 = i7;
                i13 = i10;
                if (i17 > i15 && flexLine.mAnyItemsHaveFlexShrink) {
                    shrinkFlexItems(i12, i13, flexLine, i15, i14, false);
                }
            } else {
                i12 = i7;
                i13 = i10;
                expandFlexItems(i12, i13, flexLine, i15, i14, false);
            }
            i16++;
            i7 = i12;
            i10 = i13;
        }
    }

    public void stretchViews(int i7) {
        View reorderedFlexItemAt;
        if (i7 >= this.mFlexContainer.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mFlexContainer.getFlexDirection();
        if (this.mFlexContainer.getAlignItems() != 4) {
            for (FlexLine flexLine : this.mFlexContainer.getFlexLinesInternal()) {
                for (Integer num : flexLine.mIndicesAlignSelfStretch) {
                    View reorderedFlexItemAt2 = this.mFlexContainer.getReorderedFlexItemAt(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        stretchViewVertically(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(G.m(flexDirection, "Invalid flex direction: "));
                        }
                        stretchViewHorizontally(reorderedFlexItemAt2, flexLine.mCrossSize, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.mIndexToFlexLine;
        List<FlexLine> flexLinesInternal = this.mFlexContainer.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i10 = iArr != null ? iArr[i7] : 0; i10 < size; i10++) {
            FlexLine flexLine2 = flexLinesInternal.get(i10);
            int i11 = flexLine2.mItemCount;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = flexLine2.mFirstIndex + i12;
                if (i12 < this.mFlexContainer.getFlexItemCount() && (reorderedFlexItemAt = this.mFlexContainer.getReorderedFlexItemAt(i13)) != null && reorderedFlexItemAt.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) reorderedFlexItemAt.getLayoutParams();
                    if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            stretchViewVertically(reorderedFlexItemAt, flexLine2.mCrossSize, i13);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(G.m(flexDirection, "Invalid flex direction: "));
                            }
                            stretchViewHorizontally(reorderedFlexItemAt, flexLine2.mCrossSize, i13);
                        }
                    }
                }
            }
        }
    }

    public int[] createReorderedIndices(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mFlexContainer.getFlexItemCount();
        return sortOrdersIntoReorderedIndices(flexItemCount, createOrders(flexItemCount), sparseIntArray);
    }
}
