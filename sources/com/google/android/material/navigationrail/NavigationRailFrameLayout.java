package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationRailFrameLayout extends FrameLayout {
    int paddingTop;
    boolean scrollingEnabled;

    public NavigationRailFrameLayout(@NonNull Context context) {
        super(context);
        this.paddingTop = 0;
        this.scrollingEnabled = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        int childCount = getChildCount();
        int measuredHeight = this.paddingTop;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int iMax = Math.max(measuredHeight, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), iMax, childAt.getRight(), childAt.getMeasuredHeight() + iMax);
            measuredHeight = iMax + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int childCount = getChildCount();
        int measuredHeight = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i10);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i7, i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i11 = (size - measuredHeight) - this.paddingTop;
            childAt = getChildAt(1);
            if (!this.scrollingEnabled) {
                i10 = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i7, i10);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.paddingTop + measuredHeight + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i7) {
        this.paddingTop = i7;
    }

    public void setScrollingEnabled(boolean z3) {
        this.scrollingEnabled = z3;
    }
}
