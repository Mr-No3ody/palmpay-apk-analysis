package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface DividerMode {
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39802c})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean z3 = p1.f12995a;
        boolean z8 = getLayoutDirection() == 1;
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View virtualChildAt = getVirtualChildAt(i10);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z8 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (z8) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i7 = this.mDividerWidth;
                    right = left - i7;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z8) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.mDividerWidth;
                right = left - i7;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View virtualChildAt = getVirtualChildAt(i7);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i7)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i7) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i7, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i7);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i7) {
        this.mDivider.setBounds(i7, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i7, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.mBaselineAlignedChildIndex;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i7 = this.mGravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i7) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo({p192n.c.f39802c})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @GravityInt
    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i7) {
        return getChildAt(i7);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo({p192n.c.f39800a})
    public boolean hasDividerBeforeChildAt(int i7) {
        if (i7 == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) != 0) {
            for (int i10 = i7 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100  */
    public void layoutHorizontal(int i7, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        int i15;
        int i16;
        int baseline;
        int i17;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        char c6 = 1;
        boolean z3 = p1.f12995a;
        int childrenSkipCount = 0;
        boolean z8 = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i21 = i12 - i10;
        int paddingBottom = i21 - getPaddingBottom();
        int paddingBottom2 = (i21 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i22 = this.mGravity;
        int i23 = 8388615 & i22;
        int i24 = i22 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        boolean z10 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(i23, getLayoutDirection());
        char c10 = 2;
        if (absoluteGravity != 1) {
            paddingLeft = absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i7) - this.mTotalLength;
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i7) - this.mTotalLength) / 2);
        }
        if (z8) {
            i14 = virtualChildCount - 1;
            i13 = -1;
        } else {
            i13 = 1;
            i14 = 0;
        }
        while (childrenSkipCount < virtualChildCount) {
            char c11 = c6;
            int i25 = (i13 * childrenSkipCount) + i14;
            char c12 = c10;
            View virtualChildAt = getVirtualChildAt(i25);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i25) + paddingLeft;
                i15 = i14;
            } else {
                i15 = i14;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i26 = childrenSkipCount;
                    if (z10) {
                        i16 = paddingTop;
                        baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? virtualChildAt.getBaseline() : -1;
                        i17 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i17 < 0) {
                            i17 = i24;
                        }
                        i18 = i17 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                        i19 = paddingBottom2;
                        if (i18 != 16) {
                            if (i18 != 48) {
                                i20 = i16 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                                if (baseline != -1) {
                                    i20 = (iArr[c11] - baseline) + i20;
                                }
                            } else if (i18 != 80) {
                                i20 = i16;
                            } else {
                                i20 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c12] - (virtualChildAt.getMeasuredHeight() - baseline);
                                }
                            }
                            if (hasDividerBeforeChildAt(i25)) {
                                paddingLeft += this.mDividerWidth;
                            }
                            int i27 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                            int locationOffset = getLocationOffset(virtualChildAt) + i27;
                            virtualChildAt.layout(locationOffset, i20, locationOffset + measuredWidth, measuredHeight2 + i20);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i27;
                            childrenSkipCount = getChildrenSkipCount(virtualChildAt, i25) + i26;
                        } else {
                            i20 = ((i19 - measuredHeight2) / 2) + i16 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (hasDividerBeforeChildAt(i25)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i28 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        int locationOffset2 = getLocationOffset(virtualChildAt) + i28;
                        virtualChildAt.layout(locationOffset2, i20, locationOffset2 + measuredWidth, measuredHeight2 + i20);
                        paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i28;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i25) + i26;
                    } else {
                        i16 = paddingTop;
                    }
                    i17 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i17 < 0) {
                        i17 = i24;
                    }
                    i18 = i17 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
                    i19 = paddingBottom2;
                    if (i18 != 16) {
                        if (i18 != 48) {
                            i20 = i16 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                            if (baseline != -1) {
                                i20 = (iArr[c11] - baseline) + i20;
                            }
                        } else if (i18 != 80) {
                            i20 = i16;
                        } else {
                            i20 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c12] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i25)) {
                            paddingLeft += this.mDividerWidth;
                        }
                        int i29 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        int locationOffset3 = getLocationOffset(virtualChildAt) + i29;
                        virtualChildAt.layout(locationOffset3, i20, locationOffset3 + measuredWidth, measuredHeight2 + i20);
                        paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i29;
                        childrenSkipCount = getChildrenSkipCount(virtualChildAt, i25) + i26;
                    } else {
                        i20 = ((i19 - measuredHeight2) / 2) + i16 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (hasDividerBeforeChildAt(i25)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i210 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    int locationOffset4 = getLocationOffset(virtualChildAt) + i210;
                    virtualChildAt.layout(locationOffset4, i20, locationOffset4 + measuredWidth, measuredHeight2 + i20);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i210;
                    childrenSkipCount = getChildrenSkipCount(virtualChildAt, i25) + i26;
                }
                childrenSkipCount++;
                c10 = c12;
                i14 = i15;
                c6 = c11;
                paddingTop = i16;
                paddingBottom2 = i19;
            }
            i16 = paddingTop;
            i19 = paddingBottom2;
            childrenSkipCount++;
            c10 = c12;
            i14 = i15;
            c6 = c11;
            paddingTop = i16;
            paddingBottom2 = i19;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    public void layoutVertical(int i7, int i10, int i11, int i12) {
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int paddingLeft = getPaddingLeft();
        int i16 = i11 - i7;
        int paddingRight = i16 - getPaddingRight();
        int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.mGravity;
        int i18 = i17 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        int i19 = i17 & 8388615;
        if (i18 != 16) {
            paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.mTotalLength;
        } else {
            paddingTop = (((i12 - i10) - this.mTotalLength) / 2) + getPaddingTop();
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(childrenSkipCount) + paddingTop;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight = virtualChildAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i20 < 0) {
                    i20 = i19;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i15 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    } else {
                        i13 = paddingRight - measuredWidth;
                        i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        paddingTop += this.mDividerHeight;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    int locationOffset = getLocationOffset(virtualChildAt) + i21;
                    virtualChildAt.layout(i15, locationOffset, measuredWidth + i15, locationOffset + measuredHeight);
                    int nextLocationOffset = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i21;
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset;
                } else {
                    i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i15 = i13 - i14;
                if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    paddingTop += this.mDividerHeight;
                }
                int i22 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                int locationOffset2 = getLocationOffset(virtualChildAt) + i22;
                virtualChildAt.layout(i15, locationOffset2, measuredWidth + i15, locationOffset2 + measuredHeight);
                int nextLocationOffset2 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i22;
                childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                paddingTop = nextLocationOffset2;
            }
            childrenSkipCount++;
        }
    }

    public void measureChildBeforeLayout(View view, int i7, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x043d  */
    public void measureHorizontal(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax;
        int i15;
        int baseline;
        int i16;
        int i17;
        int childrenSkipCount;
        byte b7;
        int i18;
        int i19;
        boolean z3;
        boolean z8;
        int baseline2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        if (linearLayoutCompat.mMaxAscent == null || linearLayoutCompat.mMaxDescent == null) {
            linearLayoutCompat.mMaxAscent = new int[4];
            linearLayoutCompat.mMaxDescent = new int[4];
        }
        int[] iArr = linearLayoutCompat.mMaxAscent;
        int[] iArr2 = linearLayoutCompat.mMaxDescent;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z10 = linearLayoutCompat.mBaselineAligned;
        boolean z11 = linearLayoutCompat.mUseLargestChild;
        int i20 = 1073741824;
        boolean z12 = mode == 1073741824;
        boolean z13 = z11;
        int childrenSkipCount2 = 0;
        int i21 = 0;
        int iMax2 = 0;
        boolean z14 = false;
        int iCombineMeasuredStates = 0;
        boolean z15 = false;
        boolean z16 = true;
        float f10 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i11 = i21;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            boolean z17 = z10;
            View virtualChildAt = linearLayoutCompat.getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount2) + linearLayoutCompat.mTotalLength;
            } else {
                if (virtualChildAt.getVisibility() == 8) {
                    childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                } else {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(childrenSkipCount2)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
                    }
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    float f11 = ((LinearLayout.LayoutParams) layoutParams).weight;
                    float f12 = f10 + f11;
                    if (mode == i20 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f11 > 0.0f) {
                        if (z12) {
                            linearLayoutCompat.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + linearLayoutCompat.mTotalLength;
                        } else {
                            int i22 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i22, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i22 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z14 = true;
                        }
                        i19 = i11;
                        z3 = z13;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f11 <= 0.0f) {
                            b7 = -2;
                            i18 = Integer.MIN_VALUE;
                        } else {
                            b7 = -2;
                            ((LinearLayout.LayoutParams) layoutParams).width = -2;
                            i18 = 0;
                        }
                        mode = mode;
                        iArr = iArr;
                        i19 = i11;
                        int i23 = i18;
                        z3 = z13;
                        iArr2 = iArr2;
                        linearLayoutCompat.measureChildBeforeLayout(virtualChildAt, childrenSkipCount2, i7, f12 == 0.0f ? linearLayoutCompat.mTotalLength : 0, i10, 0);
                        virtualChildAt = virtualChildAt;
                        if (i23 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams).width = i23;
                        }
                        int measuredWidth = virtualChildAt.getMeasuredWidth();
                        if (z12) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + linearLayoutCompat.mTotalLength;
                        } else {
                            int i24 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i24, linearLayoutCompat.getNextLocationOffset(virtualChildAt) + i24 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                        }
                        if (z3) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                        z8 = false;
                    } else {
                        z8 = true;
                        z15 = true;
                    }
                    int i25 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    int measuredHeight = virtualChildAt.getMeasuredHeight() + i25;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt.getMeasuredState());
                    if (z17 && (baseline2 = virtualChildAt.getBaseline()) != -1) {
                        int i26 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i26 < 0) {
                            i26 = linearLayoutCompat.mGravity;
                        }
                        int i27 = (((i26 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) >> 4) & (-2)) >> 1;
                        iArr[i27] = Math.max(iArr[i27], baseline2);
                        iArr2[i27] = Math.max(iArr2[i27], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i19, measuredHeight);
                    z16 = z16 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                    if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                        if (!z8) {
                            i25 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i25);
                    } else {
                        if (z8 == 0) {
                            i25 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i25);
                    }
                    childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                    i21 = iMax5;
                    f10 = f12;
                }
                childrenSkipCount2++;
                z13 = z3;
                iArr2 = iArr2;
                z10 = z17;
                iArr = iArr;
                mode = mode;
                i20 = 1073741824;
            }
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i21 = i11;
            z3 = z13;
            childrenSkipCount2++;
            z13 = z3;
            iArr2 = iArr2;
            z10 = z17;
            iArr = iArr;
            mode = mode;
            i20 = 1073741824;
        }
        boolean z18 = z10;
        int i28 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int iCombineMeasuredStates2 = iCombineMeasuredStates;
        boolean z19 = z13;
        if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(virtualChildCount)) {
            linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerWidth;
        }
        int i29 = iArr3[1];
        int iMax6 = (i29 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i11 : Math.max(i11, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i29, iArr3[2]))));
        int i30 = i28;
        if (z19 && (i30 == Integer.MIN_VALUE || i30 == 0)) {
            linearLayoutCompat.mTotalLength = 0;
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i31);
                if (virtualChildAt2 == null) {
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(i31) + linearLayoutCompat.mTotalLength;
                } else {
                    if (virtualChildAt2.getVisibility() == 8) {
                        childrenSkipCount = i31 + linearLayoutCompat.getChildrenSkipCount(virtualChildAt2, i31);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                        if (z12) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + linearLayoutCompat.mTotalLength;
                        } else {
                            int i32 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i32, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + i32 + iMax2 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                        }
                        childrenSkipCount = i31;
                    }
                    i31 = childrenSkipCount + 1;
                }
                childrenSkipCount = i31;
                i31 = childrenSkipCount + 1;
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
        linearLayoutCompat.mTotalLength = paddingRight;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i7, 0);
        int i33 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
        if (z14 || (i33 != 0 && f10 > 0.0f)) {
            float f13 = linearLayoutCompat.mWeightSum;
            if (f13 > 0.0f) {
                f10 = f13;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            linearLayoutCompat.mTotalLength = 0;
            iMax6 = -1;
            int i34 = 0;
            while (i34 < virtualChildCount) {
                View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i34);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i30 = i30;
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f14 > 0.0f) {
                        int i35 = (int) ((i33 * f14) / f10);
                        f10 -= f14;
                        i33 -= i35;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i17 = 1073741824;
                            if (i30 == 1073741824) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i35 > 0 ? i35 : 0, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                        } else {
                            i17 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i35;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i17), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, virtualChildAt3.getMeasuredState() & (-16777216));
                    } else {
                        i30 = i30;
                    }
                    if (z12) {
                        linearLayoutCompat.mTotalLength = linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + linearLayoutCompat.mTotalLength;
                    } else {
                        int i36 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i36, linearLayoutCompat.getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i36 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z20 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i37 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i37;
                    iMax6 = Math.max(iMax6, measuredHeight2);
                    if (!z20) {
                        i37 = measuredHeight2;
                    }
                    int iMax7 = Math.max(iMax3, i37);
                    if (z16) {
                        i15 = -1;
                        boolean z21 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z18 && (baseline = virtualChildAt3.getBaseline()) != i15) {
                            i16 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i16 < 0) {
                                i16 = linearLayoutCompat.mGravity;
                            }
                            int i38 = (((i16 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) >> 4) & (-2)) >> 1;
                            iArr3[i38] = Math.max(iArr3[i38], baseline);
                            iArr4[i38] = Math.max(iArr4[i38], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax7;
                        z16 = z21;
                    } else {
                        i15 = -1;
                    }
                    if (z18) {
                        i16 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i16 < 0) {
                            i16 = linearLayoutCompat.mGravity;
                        }
                        int i39 = (((i16 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) >> 4) & (-2)) >> 1;
                        iArr3[i39] = Math.max(iArr3[i39], baseline);
                        iArr4[i39] = Math.max(iArr4[i39], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax7;
                    z16 = z21;
                }
                i34++;
                iResolveSizeAndState = iResolveSizeAndState;
                i30 = i30;
            }
            i12 = iResolveSizeAndState;
            i13 = -16777216;
            linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.mTotalLength;
            int i40 = iArr3[1];
            if (i40 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) {
                i14 = 0;
            } else {
                i14 = 0;
                iMax6 = Math.max(iMax6, Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))) + Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i40, iArr3[2]))));
            }
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z19 && i30 != 1073741824) {
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i41);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i12 = iResolveSizeAndState;
            i13 = -16777216;
            i14 = 0;
        }
        if (z16 || mode2 == 1073741824) {
            iMax = iMax6;
        }
        linearLayoutCompat.setMeasuredDimension(i12 | (iCombineMeasuredStates2 & i13), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax, linearLayoutCompat.getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
        if (z15) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i42 = i14;
            while (i42 < virtualChildCount) {
                int i43 = iMakeMeasureSpec2;
                View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(i42);
                if (virtualChildAt5.getVisibility() != 8) {
                    LayoutParams layoutParams4 = (LayoutParams) virtualChildAt5.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams4).height == -1) {
                        int i44 = ((LinearLayout.LayoutParams) layoutParams4).width;
                        ((LinearLayout.LayoutParams) layoutParams4).width = virtualChildAt5.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(virtualChildAt5, i7, 0, i43, 0);
                        ((LinearLayout.LayoutParams) layoutParams4).width = i44;
                    }
                }
                i42++;
                linearLayoutCompat = this;
                iMakeMeasureSpec2 = i43;
            }
        }
    }

    public int measureNullChild(int i7) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02f7  */
    public void measureVertical(int i7, int i10) {
        int iMax;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        View view;
        boolean z10;
        int iMax2;
        LinearLayoutCompat linearLayoutCompat = this;
        linearLayoutCompat.mTotalLength = 0;
        int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i23 = linearLayoutCompat.mBaselineAlignedChildIndex;
        boolean z11 = linearLayoutCompat.mUseLargestChild;
        int childrenSkipCount = 0;
        int i24 = 0;
        int iMax3 = 0;
        int i25 = 0;
        int i26 = 0;
        int iMax4 = 0;
        boolean z12 = false;
        boolean z13 = false;
        float f10 = 0.0f;
        boolean z14 = true;
        while (true) {
            int i27 = i24;
            int i28 = 8;
            if (childrenSkipCount >= virtualChildCount) {
                float f11 = f10;
                int i29 = virtualChildCount;
                boolean z15 = z11;
                int i30 = iMax4;
                int iMax5 = i25;
                int iCombineMeasuredStates = i26;
                int i31 = mode2;
                int i32 = iMax3;
                if (linearLayoutCompat.mTotalLength > 0 && linearLayoutCompat.hasDividerBeforeChildAt(i29)) {
                    linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                }
                int i33 = i31;
                if (z15 && (i33 == Integer.MIN_VALUE || i33 == 0)) {
                    linearLayoutCompat.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i29) {
                        View virtualChildAt = linearLayoutCompat.getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount2) + linearLayoutCompat.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i28) {
                            childrenSkipCount2 += linearLayoutCompat.getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i34 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i34, linearLayoutCompat.getNextLocationOffset(virtualChildAt) + i34 + i32 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        childrenSkipCount2++;
                        i28 = 8;
                    }
                }
                int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                linearLayoutCompat.mTotalLength = paddingBottom;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i10, 0);
                int i35 = (16777215 & iResolveSizeAndState) - linearLayoutCompat.mTotalLength;
                if (z12 || (i35 != 0 && f11 > 0.0f)) {
                    float f12 = linearLayoutCompat.mWeightSum;
                    if (f12 > 0.0f) {
                        f11 = f12;
                    }
                    linearLayoutCompat.mTotalLength = 0;
                    int i36 = i30;
                    int i37 = i35;
                    int i38 = 0;
                    while (i38 < i29) {
                        View virtualChildAt2 = linearLayoutCompat.getVirtualChildAt(i38);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i11 = i33;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f13 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f13 > 0.0f) {
                                int i39 = (int) ((i37 * f13) / f11);
                                f11 -= f13;
                                i37 -= i39;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i13 = 1073741824;
                                    if (i33 == 1073741824) {
                                        if (i39 <= 0) {
                                            i39 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                                } else {
                                    i13 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i39;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i13));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & (-256));
                            }
                            int i40 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i40;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            if (mode != 1073741824) {
                                i11 = i33;
                                i12 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width != -1) {
                                }
                                int iMax6 = Math.max(i36, i40);
                                if (z14 || ((LinearLayout.LayoutParams) layoutParams2).width != i12) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                int i41 = linearLayoutCompat.mTotalLength;
                                linearLayoutCompat.mTotalLength = Math.max(i41, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i41 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                                z14 = z3;
                                i36 = iMax6;
                            } else {
                                i11 = i33;
                                i12 = -1;
                            }
                            i40 = measuredWidth;
                            int iMax7 = Math.max(i36, i40);
                            if (z14) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            int i42 = linearLayoutCompat.mTotalLength;
                            linearLayoutCompat.mTotalLength = Math.max(i42, linearLayoutCompat.getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i42 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            z14 = z3;
                            i36 = iMax7;
                        }
                        i38++;
                        i33 = i11;
                    }
                    linearLayoutCompat.mTotalLength = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.mTotalLength;
                    iMax = i36;
                } else {
                    iMax = Math.max(i30, i27);
                    if (z15 && i33 != 1073741824) {
                        for (int i43 = 0; i43 < i29; i43++) {
                            View virtualChildAt3 = linearLayoutCompat.getVirtualChildAt(i43);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i32, 1073741824));
                            }
                        }
                    }
                }
                if (z14 || mode == 1073741824) {
                    iMax = iMax5;
                }
                linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax, linearLayoutCompat.getSuggestedMinimumWidth()), i7, iCombineMeasuredStates), iResolveSizeAndState);
                if (z13) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                    int i44 = 0;
                    while (i44 < i29) {
                        View virtualChildAt4 = linearLayoutCompat.getVirtualChildAt(i44);
                        if (virtualChildAt4.getVisibility() != 8) {
                            LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                            if (((LinearLayout.LayoutParams) layoutParams3).width == -1) {
                                int i45 = ((LinearLayout.LayoutParams) layoutParams3).height;
                                ((LinearLayout.LayoutParams) layoutParams3).height = virtualChildAt4.getMeasuredHeight();
                                linearLayoutCompat.measureChildWithMargins(virtualChildAt4, iMakeMeasureSpec, 0, i10, 0);
                                ((LinearLayout.LayoutParams) layoutParams3).height = i45;
                            }
                        }
                        i44++;
                        linearLayoutCompat = this;
                    }
                    return;
                }
                return;
            }
            float f14 = f10;
            View virtualChildAt5 = linearLayoutCompat.getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt5 == null) {
                linearLayoutCompat.mTotalLength = linearLayoutCompat.measureNullChild(childrenSkipCount) + linearLayoutCompat.mTotalLength;
            } else {
                if (virtualChildAt5.getVisibility() == 8) {
                    childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(virtualChildAt5, childrenSkipCount);
                } else {
                    if (linearLayoutCompat.hasDividerBeforeChildAt(childrenSkipCount)) {
                        linearLayoutCompat.mTotalLength += linearLayoutCompat.mDividerHeight;
                    }
                    LayoutParams layoutParams4 = (LayoutParams) virtualChildAt5.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) layoutParams4).weight;
                    f14 += f15;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams4).height == 0 && f15 > 0.0f) {
                        int i46 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i46, ((LinearLayout.LayoutParams) layoutParams4).topMargin + i46 + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                        view = virtualChildAt5;
                        i21 = virtualChildCount;
                        z8 = z11;
                        i17 = iMax4;
                        z12 = true;
                        i18 = i27;
                        i22 = i25;
                        i19 = i26;
                        i20 = mode2;
                    } else {
                        if (((LinearLayout.LayoutParams) layoutParams4).height != 0 || f15 <= 0.0f) {
                            i14 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams4).height = -2;
                            i14 = 0;
                        }
                        if (f14 == 0.0f) {
                            int i47 = i26;
                            i16 = linearLayoutCompat.mTotalLength;
                            i15 = i47;
                        } else {
                            i15 = i26;
                            i16 = 0;
                        }
                        int i48 = iMax3;
                        z8 = z11;
                        i17 = iMax4;
                        i18 = i27;
                        i19 = i15;
                        i20 = mode2;
                        i21 = virtualChildCount;
                        i22 = i25;
                        linearLayoutCompat.measureChildBeforeLayout(virtualChildAt5, childrenSkipCount, i7, 0, i10, i16);
                        view = virtualChildAt5;
                        if (i14 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams4).height = i14;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i49 = linearLayoutCompat.mTotalLength;
                        linearLayoutCompat.mTotalLength = Math.max(i49, linearLayoutCompat.getNextLocationOffset(view) + i49 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                        iMax3 = z8 ? Math.max(measuredHeight2, i48) : i48;
                    }
                    if (i23 >= 0 && i23 == childrenSkipCount + 1) {
                        linearLayoutCompat.mBaselineChildTop = linearLayoutCompat.mTotalLength;
                    }
                    if (childrenSkipCount < i23 && ((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams4).width != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                        z13 = true;
                    }
                    int i50 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i50;
                    int iMax8 = Math.max(i22, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i19, view.getMeasuredState());
                    z14 = z14 && ((LinearLayout.LayoutParams) layoutParams4).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                        if (!z10) {
                            i50 = measuredWidth2;
                        }
                        iMax2 = Math.max(i18, i50);
                        iMax4 = i17;
                    } else {
                        if (!z10) {
                            i50 = measuredWidth2;
                        }
                        iMax4 = Math.max(i17, i50);
                        iMax2 = i18;
                    }
                    childrenSkipCount += linearLayoutCompat.getChildrenSkipCount(view, childrenSkipCount);
                    i24 = iMax2;
                    i25 = iMax8;
                    i26 = iCombineMeasuredStates2;
                }
                childrenSkipCount++;
                mode2 = i20;
                f10 = f14;
                virtualChildCount = i21;
                z11 = z8;
            }
            i21 = virtualChildCount;
            z8 = z11;
            i24 = i27;
            i20 = mode2;
            childrenSkipCount++;
            mode2 = i20;
            f10 = f14;
            virtualChildCount = i21;
            z11 = z8;
        }
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        if (this.mOrientation == 1) {
            layoutVertical(i7, i10, i11, i12);
        } else {
            layoutHorizontal(i7, i10, i11, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        if (this.mOrientation == 1) {
            measureVertical(i7, i10);
        } else {
            measureHorizontal(i7, i10);
        }
    }

    public void setBaselineAligned(boolean z3) {
        this.mBaselineAligned = z3;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.mBaselineAlignedChildIndex = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.mDividerPadding = i7;
    }

    public void setGravity(@GravityInt int i7) {
        if (this.mGravity != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) == 0) {
                i7 |= 48;
            }
            this.mGravity = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.mGravity;
        if ((8388615 & i11) != i10) {
            this.mGravity = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.mUseLargestChild = z3;
    }

    public void setOrientation(int i7) {
        if (this.mOrientation != i7) {
            this.mOrientation = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        int i11 = this.mGravity;
        if ((i11 & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR) != i10) {
            this.mGravity = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.mWeightSum = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i7 = this.mOrientation;
        if (i7 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i7 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        Z0 z0F = Z0.f(context, attributeSet, p241q.j.LinearLayoutCompat, i7, 0);
        androidx.core.view.N.p(this, context, p241q.j.LinearLayoutCompat, attributeSet, z0F.f12863b, i7, 0);
        int i10 = p241q.j.LinearLayoutCompat_android_orientation;
        TypedArray typedArray = z0F.f12863b;
        int i11 = typedArray.getInt(i10, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(p241q.j.LinearLayoutCompat_android_gravity, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z3 = typedArray.getBoolean(p241q.j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.mWeightSum = typedArray.getFloat(p241q.j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray.getInt(p241q.j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = typedArray.getBoolean(p241q.j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(z0F.b(p241q.j.LinearLayoutCompat_divider));
        this.mShowDividers = typedArray.getInt(p241q.j.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = typedArray.getDimensionPixelSize(p241q.j.LinearLayoutCompat_dividerPadding, 0);
        z0F.g();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
