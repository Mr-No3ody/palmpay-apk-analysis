package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class NavigationRailMenuView extends NavigationBarMenuView {

    @Px
    private int itemMinimumHeight;

    @Px
    private int itemSpacing;
    private final FrameLayout.LayoutParams layoutParams;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        this.itemSpacing = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int makeSharedHeightSpec(int i7, int i10, int i11) {
        int iMax = i10 / Math.max(1, i11);
        int size = this.itemMinimumHeight;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i7);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int measureChildHeight(View view, int i7, int i10) {
        view.measure(i7, i10);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int measureSharedChildHeights(int i7, int i10, int i11, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 0);
        int childCount = getChildCount();
        int iMeasureChildHeight = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!(childAt instanceof NavigationBarItemView)) {
                int iMeasureChildHeight2 = measureChildHeight(childAt, i7, iMakeMeasureSpec);
                i10 -= iMeasureChildHeight2;
                iMeasureChildHeight += iMeasureChildHeight2;
            }
        }
        int iMakeSharedHeightSpec = view == null ? makeSharedHeightSpec(i7, Math.max(i10, 0), i11) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (childAt2.getVisibility() == 0) {
                i13++;
            }
            if ((childAt2 instanceof NavigationBarItemView) && childAt2 != view) {
                iMeasureChildHeight += measureChildHeight(childAt2, i7, iMakeSharedHeightSpec);
            }
        }
        return (Math.max(0, i13 - 1) * this.itemSpacing) + iMeasureChildHeight;
    }

    private int measureShiftingChildHeights(int i7, int i10, int i11) {
        int iMeasureChildHeight;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iMeasureChildHeight = measureChildHeight(childAt, i7, makeSharedHeightSpec(i7, i10, i11));
            i10 -= iMeasureChildHeight;
            i11--;
        } else {
            iMeasureChildHeight = 0;
        }
        return iMeasureChildHeight + measureSharedChildHeights(i7, i10, i11, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @Px
    public int getItemMinimumHeight() {
        return this.itemMinimumHeight;
    }

    @Px
    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getMenuGravity() {
        return this.layoutParams.gravity;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i7;
        int i14 = 0;
        int measuredHeight = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i14++;
            }
        }
        int iMax = i14 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i14 - 1), this.itemSpacing));
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i16, i13, measuredHeight2 + i16);
                i16 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i10);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.resolveSizeAndState((currentVisibleContentItemCount <= 1 || !isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount)) ? measureSharedChildHeights(i7, size, currentVisibleContentItemCount, null) : measureShiftingChildHeights(i7, size, currentVisibleContentItemCount), i10, 0));
    }

    public void setItemMinimumHeight(@Px int i7) {
        if (this.itemMinimumHeight != i7) {
            this.itemMinimumHeight = i7;
            requestLayout();
        }
    }

    public void setItemSpacing(@Px int i7) {
        if (this.itemSpacing != i7) {
            this.itemSpacing = i7;
            requestLayout();
        }
    }

    public void setMenuGravity(int i7) {
        FrameLayout.LayoutParams layoutParams = this.layoutParams;
        if (layoutParams.gravity != i7) {
            layoutParams.gravity = i7;
            setLayoutParams(layoutParams);
        }
    }
}
