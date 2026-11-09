package com.google.android.flexbox;

import C0.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.core.view.N;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements FlexContainer {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;

    @Nullable
    private Drawable mDividerDrawableHorizontal;

    @Nullable
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<FlexLine> mFlexLines;
    private FlexboxHelper.FlexLinesResult mFlexLinesResult;
    private int mFlexWrap;
    private FlexboxHelper mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private boolean allFlexLinesAreDummyBefore(int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.mFlexLines.get(i10).getItemCountNotGone() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i7, int i10) {
        for (int i11 = 1; i11 <= i10; i11++) {
            View reorderedChildAt = getReorderedChildAt(i7 - i11);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z3, boolean z8) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i7 = 0; i7 < size; i7++) {
            FlexLine flexLine = this.mFlexLines.get(i7);
            for (int i10 = 0; i10 < flexLine.mItemCount; i10++) {
                int i11 = flexLine.mFirstIndex + i10;
                View reorderedChildAt = getReorderedChildAt(i11);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i11, i10)) {
                        drawVerticalDivider(canvas, z3 ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, flexLine.mTop, flexLine.mCrossSize);
                    }
                    if (i10 == flexLine.mItemCount - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z3 ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, flexLine.mTop, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i7)) {
                drawHorizontalDivider(canvas, paddingLeft, z8 ? flexLine.mBottom : flexLine.mTop - this.mDividerHorizontalHeight, iMax);
            }
            if (hasEndDividerAfterFlexLine(i7) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z8 ? flexLine.mTop - this.mDividerHorizontalHeight : flexLine.mBottom, iMax);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z3, boolean z8) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i7 = 0; i7 < size; i7++) {
            FlexLine flexLine = this.mFlexLines.get(i7);
            for (int i10 = 0; i10 < flexLine.mItemCount; i10++) {
                int i11 = flexLine.mFirstIndex + i10;
                View reorderedChildAt = getReorderedChildAt(i11);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i11, i10)) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z8 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, flexLine.mCrossSize);
                    }
                    if (i10 == flexLine.mItemCount - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, flexLine.mLeft, z8 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, flexLine.mCrossSize);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i7)) {
                drawVerticalDivider(canvas, z3 ? flexLine.mRight : flexLine.mLeft - this.mDividerVerticalWidth, paddingTop, iMax);
            }
            if (hasEndDividerAfterFlexLine(i7) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z3 ? flexLine.mLeft - this.mDividerVerticalWidth : flexLine.mRight, paddingTop, iMax);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i7, int i10, int i11) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i10, i11 + i7, this.mDividerHorizontalHeight + i10);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i7, int i10, int i11) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i7, i10, this.mDividerVerticalWidth + i7, i11 + i10);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i7, int i10) {
        if (allViewsAreGoneBefore(i7, i10)) {
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerVertical & 1) != 0;
            }
            return (this.mShowDividerHorizontal & 1) != 0;
        }
        if (isMainAxisDirectionHorizontal()) {
            return (this.mShowDividerVertical & 2) != 0;
        }
        return (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i7) {
        if (i7 >= 0 && i7 < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i7)) {
                if (isMainAxisDirectionHorizontal()) {
                    return (this.mShowDividerHorizontal & 1) != 0;
                }
                return (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i7) {
        if (i7 >= 0 && i7 < this.mFlexLines.size()) {
            for (int i10 = i7 + 1; i10 < this.mFlexLines.size(); i10++) {
                if (this.mFlexLines.get(i10).getItemCountNotGone() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01db  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ec  */
    private void layoutHorizontal(boolean z3, int i7, int i10, int i11, int i12) {
        float measuredWidth;
        float f10;
        float f11;
        float fMax;
        int i13;
        int i14;
        View reorderedChildAt;
        boolean z8;
        int i15;
        int i16;
        float f12;
        float f13;
        int i17;
        float f14;
        int i18;
        View view;
        FlexLine flexLine;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i19 = i11 - i7;
        int paddingBottom = (i12 - i10) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i20 = 0; i20 < size; i20++) {
            FlexLine flexLine2 = this.mFlexLines.get(i20);
            if (hasDividerBeforeFlexLine(i20)) {
                int i21 = this.mDividerHorizontalHeight;
                paddingBottom -= i21;
                paddingTop += i21;
            }
            int i22 = paddingBottom;
            int i23 = this.mJustifyContent;
            char c6 = 4;
            int i24 = 2;
            boolean z10 = true;
            if (i23 == 0) {
                measuredWidth = paddingLeft;
                f10 = i19 - paddingRight;
            } else if (i23 != 1) {
                if (i23 == 2) {
                    int i25 = flexLine2.mMainSize;
                    measuredWidth = paddingLeft + ((i19 - i25) / 2.0f);
                    f10 = (i19 - paddingRight) - ((i19 - i25) / 2.0f);
                } else if (i23 == 3) {
                    measuredWidth = paddingLeft;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f11 = (i19 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f10 = i19 - paddingRight;
                } else if (i23 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    float f15 = itemCountNotGone2 != 0 ? (i19 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f16 = f15 / 2.0f;
                    measuredWidth = paddingLeft + f16;
                    float f17 = (i19 - paddingRight) - f16;
                    f11 = f15;
                    f10 = f17;
                } else {
                    if (i23 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f11 = itemCountNotGone3 != 0 ? (i19 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f10 = (i19 - paddingRight) - f11;
                }
                fMax = Math.max(f11, 0.0f);
                i13 = 0;
                while (i13 < flexLine2.mItemCount) {
                    i14 = flexLine2.mFirstIndex + i13;
                    reorderedChildAt = getReorderedChildAt(i14);
                    char c10 = c6;
                    if (reorderedChildAt != null) {
                        z8 = z10;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z8 = z8;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i14, i13)) {
                                int i26 = this.mDividerVerticalWidth;
                                float f18 = i26;
                                f12 += f18;
                                f13 -= f18;
                                i17 = i26;
                            } else {
                                i17 = 0;
                            }
                            f14 = f13;
                            if (i13 == flexLine2.mItemCount - 1 || (this.mShowDividerVertical & 4) <= 0) {
                                i18 = 0;
                            } else {
                                i18 = this.mDividerVerticalWidth;
                            }
                            if (this.mFlexWrap == i24) {
                                if (z3) {
                                    i16 = i24;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f14) - reorderedChildAt.getMeasuredWidth(), i22 - reorderedChildAt.getMeasuredHeight(), Math.round(f14), i22);
                                } else {
                                    i16 = i24;
                                    view = reorderedChildAt;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f12), i22 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f12), i22);
                                }
                                i15 = i22;
                            } else {
                                i16 = i24;
                                i13 = i13;
                                i15 = i22;
                                view = reorderedChildAt;
                                z8 = z8;
                                if (z3) {
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i27 = paddingTop;
                                    this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f12), i27, view.getMeasuredWidth() + Math.round(f12), view.getMeasuredHeight() + i27);
                                    paddingTop = i27;
                                }
                            }
                            measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth2 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z3) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i18, 0, i17, 0);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(view, i17, 0, i18, 0);
                            }
                            flexLine2 = flexLine;
                            f10 = measuredWidth2;
                        }
                        i13++;
                        c6 = c10;
                        z10 = z8;
                        i24 = i16;
                        i22 = i15;
                    } else {
                        z8 = z10;
                    }
                    i16 = i24;
                    i13 = i13;
                    i15 = i22;
                    i13++;
                    c6 = c10;
                    z10 = z8;
                    i24 = i16;
                    i22 = i15;
                }
                int i28 = flexLine2.mCrossSize;
                paddingTop += i28;
                paddingBottom = i22 - i28;
            } else {
                int i29 = flexLine2.mMainSize;
                f10 = i29 - paddingLeft;
                measuredWidth = (i19 - i29) + paddingRight;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i13 = 0;
            while (i13 < flexLine2.mItemCount) {
                i14 = flexLine2.mFirstIndex + i13;
                reorderedChildAt = getReorderedChildAt(i14);
                char c11 = c6;
                if (reorderedChildAt != null) {
                    z8 = z10;
                    if (reorderedChildAt.getVisibility() == 8) {
                        z8 = z8;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i14, i13)) {
                            int i210 = this.mDividerVerticalWidth;
                            float f19 = i210;
                            f12 += f19;
                            f13 -= f19;
                            i17 = i210;
                        } else {
                            i17 = 0;
                        }
                        f14 = f13;
                        if (i13 == flexLine2.mItemCount - 1) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                        }
                        if (this.mFlexWrap == i24) {
                            if (z3) {
                                i16 = i24;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f14) - reorderedChildAt.getMeasuredWidth(), i22 - reorderedChildAt.getMeasuredHeight(), Math.round(f14), i22);
                            } else {
                                i16 = i24;
                                view = reorderedChildAt;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f12), i22 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f12), i22);
                            }
                            i15 = i22;
                        } else {
                            i16 = i24;
                            i13 = i13;
                            i15 = i22;
                            view = reorderedChildAt;
                            z8 = z8;
                            if (z3) {
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f14) - view.getMeasuredWidth(), paddingTop, Math.round(f14), view.getMeasuredHeight() + paddingTop);
                            } else {
                                int i211 = paddingTop;
                                this.mFlexboxHelper.layoutSingleChildHorizontal(view, flexLine2, Math.round(f12), i211, view.getMeasuredWidth() + Math.round(f12), view.getMeasuredHeight() + i211);
                                paddingTop = i211;
                            }
                        }
                        measuredWidth = f12 + view.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f14 - ((view.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z3) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i18, 0, i17, 0);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(view, i17, 0, i18, 0);
                        }
                        flexLine2 = flexLine;
                        f10 = measuredWidth3;
                    }
                    i13++;
                    c6 = c11;
                    z10 = z8;
                    i24 = i16;
                    i22 = i15;
                } else {
                    z8 = z10;
                }
                i16 = i24;
                i13 = i13;
                i15 = i22;
                i13++;
                c6 = c11;
                z10 = z8;
                i24 = i16;
                i22 = i15;
            }
            int i212 = flexLine2.mCrossSize;
            paddingTop += i212;
            paddingBottom = i22 - i212;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x010e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x014a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dc  */
    private void layoutVertical(boolean z3, boolean z8, int i7, int i10, int i11, int i12) {
        float measuredHeight;
        float f10;
        float f11;
        float fMax;
        int i13;
        int i14;
        int i15;
        View reorderedChildAt;
        char c6;
        int i16;
        int i17;
        float f12;
        float f13;
        int i18;
        float f14;
        int i19;
        FlexLine flexLine;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i20 = i12 - i10;
        int i21 = (i11 - i7) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i22 = 0; i22 < size; i22++) {
            FlexLine flexLine2 = this.mFlexLines.get(i22);
            if (hasDividerBeforeFlexLine(i22)) {
                int i23 = this.mDividerVerticalWidth;
                paddingLeft += i23;
                i21 -= i23;
            }
            int i24 = i21;
            int i25 = this.mJustifyContent;
            char c10 = 4;
            int i26 = 1;
            if (i25 == 0) {
                measuredHeight = paddingTop;
                f10 = i20 - paddingBottom;
            } else if (i25 != 1) {
                if (i25 == 2) {
                    int i27 = flexLine2.mMainSize;
                    measuredHeight = paddingTop + ((i20 - i27) / 2.0f);
                    f10 = (i20 - paddingBottom) - ((i20 - i27) / 2.0f);
                } else if (i25 == 3) {
                    measuredHeight = paddingTop;
                    int itemCountNotGone = flexLine2.getItemCountNotGone();
                    f11 = (i20 - flexLine2.mMainSize) / (itemCountNotGone != 1 ? itemCountNotGone - 1 : 1.0f);
                    f10 = i20 - paddingBottom;
                } else if (i25 == 4) {
                    int itemCountNotGone2 = flexLine2.getItemCountNotGone();
                    f11 = itemCountNotGone2 != 0 ? (i20 - flexLine2.mMainSize) / itemCountNotGone2 : 0.0f;
                    float f15 = f11 / 2.0f;
                    measuredHeight = paddingTop + f15;
                    f10 = (i20 - paddingBottom) - f15;
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.mJustifyContent);
                    }
                    int itemCountNotGone3 = flexLine2.getItemCountNotGone();
                    f11 = itemCountNotGone3 != 0 ? (i20 - flexLine2.mMainSize) / (itemCountNotGone3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f11;
                    f10 = (i20 - paddingBottom) - f11;
                }
                fMax = Math.max(f11, 0.0f);
                i13 = 0;
                while (i13 < flexLine2.mItemCount) {
                    i14 = flexLine2.mFirstIndex + i13;
                    i15 = i26;
                    reorderedChildAt = getReorderedChildAt(i14);
                    if (reorderedChildAt != null) {
                        c6 = c10;
                        if (reorderedChildAt.getVisibility() == 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i14, i13)) {
                                i18 = this.mDividerHorizontalHeight;
                                float f16 = i18;
                                f12 += f16;
                                f13 -= f16;
                            } else {
                                i18 = 0;
                            }
                            f14 = f13;
                            if (i13 == flexLine2.mItemCount - i15 || (this.mShowDividerHorizontal & 4) <= 0) {
                                i19 = 0;
                            } else {
                                i19 = this.mDividerHorizontalHeight;
                            }
                            if (z3) {
                                if (z8) {
                                    i17 = i13;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f14) - reorderedChildAt.getMeasuredHeight(), i24, Math.round(f14));
                                } else {
                                    i17 = i13;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f12), i24, reorderedChildAt.getMeasuredHeight() + Math.round(f12));
                                }
                                i16 = i24;
                            } else {
                                i17 = i13;
                                i15 = i15;
                                i16 = i24;
                                if (z8) {
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f14) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f14));
                                } else {
                                    int i28 = paddingLeft;
                                    this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i28, Math.round(f12), reorderedChildAt.getMeasuredWidth() + i28, reorderedChildAt.getMeasuredHeight() + Math.round(f12));
                                    paddingLeft = i28;
                                }
                            }
                            measuredHeight = f12 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight2 = f14 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z8) {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i19, 0, i18);
                            } else {
                                flexLine = flexLine2;
                                flexLine.updatePositionFromView(reorderedChildAt, 0, i18, 0, i19);
                            }
                            flexLine2 = flexLine;
                            f10 = measuredHeight2;
                        }
                        i13 = i17 + 1;
                        c10 = c6;
                        i26 = i15;
                        i24 = i16;
                    } else {
                        c6 = c10;
                    }
                    i17 = i13;
                    i15 = i15;
                    i16 = i24;
                    i13 = i17 + 1;
                    c10 = c6;
                    i26 = i15;
                    i24 = i16;
                }
                int i29 = flexLine2.mCrossSize;
                paddingLeft += i29;
                i21 = i24 - i29;
            } else {
                int i30 = flexLine2.mMainSize;
                f10 = i30 - paddingTop;
                measuredHeight = (i20 - i30) + paddingBottom;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i13 = 0;
            while (i13 < flexLine2.mItemCount) {
                i14 = flexLine2.mFirstIndex + i13;
                i15 = i26;
                reorderedChildAt = getReorderedChildAt(i14);
                if (reorderedChildAt != null) {
                    c6 = c10;
                    if (reorderedChildAt.getVisibility() == 8) {
                        LayoutParams layoutParams2 = (LayoutParams) reorderedChildAt.getLayoutParams();
                        f12 = measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        if (hasDividerBeforeChildAtAlongMainAxis(i14, i13)) {
                            i18 = this.mDividerHorizontalHeight;
                            float f17 = i18;
                            f12 += f17;
                            f13 -= f17;
                        } else {
                            i18 = 0;
                        }
                        f14 = f13;
                        if (i13 == flexLine2.mItemCount - i15) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                        }
                        if (z3) {
                            if (z8) {
                                i17 = i13;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f14) - reorderedChildAt.getMeasuredHeight(), i24, Math.round(f14));
                            } else {
                                i17 = i13;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, true, i24 - reorderedChildAt.getMeasuredWidth(), Math.round(f12), i24, reorderedChildAt.getMeasuredHeight() + Math.round(f12));
                            }
                            i16 = i24;
                        } else {
                            i17 = i13;
                            i15 = i15;
                            i16 = i24;
                            if (z8) {
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, paddingLeft, Math.round(f14) - reorderedChildAt.getMeasuredHeight(), reorderedChildAt.getMeasuredWidth() + paddingLeft, Math.round(f14));
                            } else {
                                int i210 = paddingLeft;
                                this.mFlexboxHelper.layoutSingleChildVertical(reorderedChildAt, flexLine2, false, i210, Math.round(f12), reorderedChildAt.getMeasuredWidth() + i210, reorderedChildAt.getMeasuredHeight() + Math.round(f12));
                                paddingLeft = i210;
                            }
                        }
                        measuredHeight = f12 + reorderedChildAt.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        float measuredHeight3 = f14 - ((reorderedChildAt.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
                        if (z8) {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i19, 0, i18);
                        } else {
                            flexLine = flexLine2;
                            flexLine.updatePositionFromView(reorderedChildAt, 0, i18, 0, i19);
                        }
                        flexLine2 = flexLine;
                        f10 = measuredHeight3;
                    }
                    i13 = i17 + 1;
                    c10 = c6;
                    i26 = i15;
                    i24 = i16;
                } else {
                    c6 = c10;
                }
                i17 = i13;
                i15 = i15;
                i16 = i24;
                i13 = i17 + 1;
                c10 = c6;
                i26 = i15;
                i24 = i16;
            }
            int i211 = flexLine2.mCrossSize;
            paddingLeft += i211;
            i21 = i24 - i211;
        }
    }

    private void measureHorizontal(int i7, int i10) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateHorizontalFlexLines(this.mFlexLinesResult, i7, i10);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i7, i10);
        if (this.mAlignItems == 3) {
            for (FlexLine flexLine : this.mFlexLines) {
                int iMax = Integer.MIN_VALUE;
                for (int i11 = 0; i11 < flexLine.mItemCount; i11++) {
                    View reorderedChildAt = getReorderedChildAt(flexLine.mFirstIndex + i11);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        iMax = this.mFlexWrap != 2 ? Math.max(iMax, reorderedChildAt.getMeasuredHeight() + Math.max(flexLine.mMaxBaseline - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (flexLine.mMaxBaseline - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                flexLine.mCrossSize = iMax;
            }
        }
        this.mFlexboxHelper.determineCrossSize(i7, i10, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i7, i10, this.mFlexLinesResult.mChildState);
    }

    private void measureVertical(int i7, int i10) {
        this.mFlexLines.clear();
        this.mFlexLinesResult.reset();
        this.mFlexboxHelper.calculateVerticalFlexLines(this.mFlexLinesResult, i7, i10);
        this.mFlexLines = this.mFlexLinesResult.mFlexLines;
        this.mFlexboxHelper.determineMainSize(i7, i10);
        this.mFlexboxHelper.determineCrossSize(i7, i10, getPaddingRight() + getPaddingLeft());
        this.mFlexboxHelper.stretchViews();
        setMeasuredDimensionForFlex(this.mFlexDirection, i7, i10, this.mFlexLinesResult.mChildState);
    }

    private void setMeasuredDimensionForFlex(int i7, int i10, int i11, int i12) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (i7 == 0 || i7 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new IllegalArgumentException(G.m(i7, "Invalid flex direction: "));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i10, i12);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(G.m(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i12 = View.combineMeasuredStates(i12, PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i10, i12);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i11, i12);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(G.m(mode2, "Unknown height mode is set: "));
            }
            if (size2 < paddingBottom) {
                i12 = View.combineMeasuredStates(i12, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i11, i12);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(view, i7, layoutParams, this.mOrderCache);
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildHeightMeasureSpec(int i7, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i7, i10, i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getChildWidthMeasureSpec(int i7, int i10, int i11) {
        return ViewGroup.getChildMeasureSpec(i7, i10, i11);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getDecorationLengthMainAxis(View view, int i7, int i10) {
        int i11;
        int i12;
        if (isMainAxisDirectionHorizontal()) {
            i11 = hasDividerBeforeChildAtAlongMainAxis(i7, i10) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i11;
            }
            i12 = this.mDividerVerticalWidth;
        } else {
            i11 = hasDividerBeforeChildAtAlongMainAxis(i7, i10) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i11;
            }
            i12 = this.mDividerHorizontalHeight;
        }
        return i11 + i12;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getFlexItemAt(int i7) {
        return getChildAt(i7);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (FlexLine flexLine : this.mFlexLines) {
            if (flexLine.getItemCountNotGone() != 0) {
                arrayList.add(flexLine);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public List<FlexLine> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getLargestMainSize() {
        Iterator<FlexLine> it = this.mFlexLines.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mMainSize);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i7) {
        if (i7 < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i7 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i7]);
    }

    @Override // com.google.android.flexbox.FlexContainer
    public View getReorderedFlexItemAt(int i7) {
        return getReorderedChildAt(i7);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            FlexLine flexLine = this.mFlexLines.get(i10);
            if (hasDividerBeforeFlexLine(i10)) {
                i7 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i10)) {
                i7 += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i7 += flexLine.mCrossSize;
        }
        return i7;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public boolean isMainAxisDirectionHorizontal() {
        int i7 = this.mFlexDirection;
        return i7 == 0 || i7 == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        int i7 = this.mFlexDirection;
        if (i7 == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i7 == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i7 == 2) {
            boolean z3 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z3 = !z3;
            }
            drawDividersVertical(canvas, z3, false);
            return;
        }
        if (i7 != 3) {
            return;
        }
        boolean z8 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z8 = !z8;
        }
        drawDividersVertical(canvas, z8, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        boolean z8;
        boolean z10 = true;
        WeakHashMap weakHashMap = N.f16168a;
        int layoutDirection = getLayoutDirection();
        int i13 = this.mFlexDirection;
        if (i13 == 0) {
            if (layoutDirection != 1) {
                z10 = false;
            }
            layoutHorizontal(z10, i7, i10, i11, i12);
            return;
        }
        if (i13 == 1) {
            if (layoutDirection == 1) {
                z10 = false;
            }
            layoutHorizontal(z10, i7, i10, i11, i12);
        } else {
            if (i13 == 2) {
                z8 = layoutDirection == 1;
                if (this.mFlexWrap == 2) {
                    z8 = !z8;
                }
                layoutVertical(z8, false, i7, i10, i11, i12);
                return;
            }
            if (i13 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.mFlexDirection);
            }
            z8 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z8 = !z8;
            }
            layoutVertical(z8, true, i7, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        if (this.mFlexboxHelper.isOrderChangedFromLastMeasurement(this.mOrderCache)) {
            this.mReorderedIndices = this.mFlexboxHelper.createReorderedIndices(this.mOrderCache);
        }
        int i11 = this.mFlexDirection;
        if (i11 == 0 || i11 == 1) {
            measureHorizontal(i7, i10);
        } else if (i11 == 2 || i11 == 3) {
            measureVertical(i7, i10);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.mFlexDirection);
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine) {
        if (hasDividerBeforeChildAtAlongMainAxis(i7, i10)) {
            if (isMainAxisDirectionHorizontal()) {
                int i11 = flexLine.mMainSize;
                int i12 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i11 + i12;
                flexLine.mDividerLengthInMainSize += i12;
                return;
            }
            int i13 = flexLine.mMainSize;
            int i14 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i13 + i14;
            flexLine.mDividerLengthInMainSize += i14;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void onNewFlexLineAdded(FlexLine flexLine) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i7 = flexLine.mMainSize;
                int i10 = this.mDividerVerticalWidth;
                flexLine.mMainSize = i7 + i10;
                flexLine.mDividerLengthInMainSize += i10;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i11 = flexLine.mMainSize;
            int i12 = this.mDividerHorizontalHeight;
            flexLine.mMainSize = i11 + i12;
            flexLine.mDividerLengthInMainSize += i12;
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignContent(int i7) {
        if (this.mAlignContent != i7) {
            this.mAlignContent = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setAlignItems(int i7) {
        if (this.mAlignItems != i7) {
            this.mAlignItems = i7;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexDirection(int i7) {
        if (this.mFlexDirection != i7) {
            this.mFlexDirection = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexLines(List<FlexLine> list) {
        this.mFlexLines = list;
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setFlexWrap(int i7) {
        if (this.mFlexWrap != i7) {
            this.mFlexWrap = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setJustifyContent(int i7) {
        if (this.mJustifyContent != i7) {
            this.mJustifyContent = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void setMaxLine(int i7) {
        if (this.mMaxLine != i7) {
            this.mMaxLine = i7;
            requestLayout();
        }
    }

    public void setShowDivider(int i7) {
        setShowDividerVertical(i7);
        setShowDividerHorizontal(i7);
    }

    public void setShowDividerHorizontal(int i7) {
        if (i7 != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i7;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i7) {
        if (i7 != this.mShowDividerVertical) {
            this.mShowDividerVertical = i7;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.FlexContainer
    public void updateViewCache(int i7, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new FlexboxHelper(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new FlexboxHelper.FlexLinesResult();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout, i7, 0);
        this.mFlexDirection = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.mAlignContent = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.mMaxLine = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i10 != 0) {
            this.mShowDividerVertical = i10;
            this.mShowDividerHorizontal = i10;
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i11 != 0) {
            this.mShowDividerVertical = i11;
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i12 != 0) {
            this.mShowDividerHorizontal = i12;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i7) {
                return new LayoutParams[i7];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlexboxLayout_Layout);
            this.mOrder = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, FlexItem.MAX_SIZE);
            this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, FlexItem.MAX_SIZE);
            this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.mOrder;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i7) {
            this.mAlignSelf = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f10) {
            this.mFlexBasisPercent = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f10) {
            this.mFlexGrow = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f10) {
            this.mFlexShrink = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i7) {
            ((ViewGroup.MarginLayoutParams) this).height = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i7) {
            this.mMaxHeight = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i7) {
            this.mMaxWidth = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i7) {
            this.mMinHeight = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i7) {
            this.mMinWidth = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i7) {
            this.mOrder = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i7) {
            ((ViewGroup.MarginLayoutParams) this).width = i7;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z3) {
            this.mWrapBefore = z3;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.mOrder);
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mOrder = layoutParams.mOrder;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(int i7, int i10) {
            super(new ViewGroup.LayoutParams(i7, i10));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = FlexItem.MAX_SIZE;
            this.mMaxHeight = FlexItem.MAX_SIZE;
            this.mOrder = parcel.readInt();
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
