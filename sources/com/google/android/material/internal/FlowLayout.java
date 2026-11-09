package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    public FlowLayout(@NonNull Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i7, int i10, int i11) {
        if (i10 != Integer.MIN_VALUE) {
            return i10 != 1073741824 ? i11 : i7;
        }
        return Math.min(i11, i7);
    }

    private void loadFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlowLayout_horizontalItemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@NonNull View view) {
        Object tag = view.getTag(R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int marginEnd;
        int marginStart;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        boolean z8 = true;
        this.rowCount = 1;
        boolean z10 = getLayoutDirection() == 1;
        int paddingRight = z10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i13 = 0;
        int measuredWidth = paddingRight;
        int i14 = paddingTop;
        while (i13 < getChildCount()) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i15 = i11 - i7;
                int i16 = i15 - paddingLeft;
                if (!this.singleLine && measuredWidth2 > i16) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i14 = paddingTop + this.lineSpacing;
                    this.rowCount++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (z10) {
                    childAt.layout(i15 - measuredWidth2, i14, (i15 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i14, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.itemSpacing;
                paddingTop = measuredHeight;
            }
            i13++;
            z8 = z8;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int i13 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i13 - getPaddingRight();
        int i14 = paddingTop;
        int i15 = 0;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i7, i10);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.leftMargin;
                    i12 = marginLayoutParams.rightMargin;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                int i17 = paddingLeft2;
                if (childAt.getMeasuredWidth() + paddingLeft2 + i11 <= paddingRight || isSingleLine()) {
                    paddingLeft = i17;
                } else {
                    paddingLeft = getPaddingLeft();
                    i14 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (measuredWidth > i15) {
                    i15 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i11 + i12 + this.itemSpacing + paddingLeft;
                if (i16 == getChildCount() - 1) {
                    i15 += i12;
                }
                paddingLeft2 = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, getPaddingRight() + i15), getMeasuredDimension(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public void setItemSpacing(int i7) {
        this.itemSpacing = i7;
    }

    public void setLineSpacing(int i7) {
        this.lineSpacing = i7;
    }

    public void setSingleLine(boolean z3) {
        this.singleLine = z3;
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    public FlowLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
