package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
import p192n.c;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({c.f39801b})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private boolean itemHorizontalTranslationEnabled;
    private final List<Integer> tempChildWidths;

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        this.tempChildWidths = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.inactiveItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @NonNull
    public NavigationBarItemView createNavigationBarItemView(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        int measuredWidth = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i16 = i13 - measuredWidth;
                    childAt.layout(i16 - childAt.getMeasuredWidth(), 0, i16, i14);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i14);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int iMax;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i7);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        this.tempChildWidths.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE);
        int i14 = 0;
        if (getItemIconGravity() == 0) {
            if (isShifting(getLabelVisibilityMode(), currentVisibleContentItemCount) && isItemHorizontalTranslationEnabled()) {
                View childAt = getChildAt(getSelectedItemPosition());
                int iMax2 = this.activeItemMinWidth;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i15 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = Math.min(size - (this.inactiveItemMinWidth * i15), Math.min(iMax2, this.activeItemMaxWidth));
                int i16 = size - iMin;
                int iMin2 = Math.min(i16 / (i15 != 0 ? i15 : 1), this.inactiveItemMaxWidth);
                int i17 = i16 - (i15 * iMin2);
                int i18 = 0;
                while (i18 < childCount) {
                    if (getChildAt(i18).getVisibility() != 8) {
                        i13 = i18 == getSelectedItemPosition() ? iMin : iMin2;
                        if (i17 > 0) {
                            i13++;
                            i17--;
                        }
                    } else {
                        i13 = 0;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i13));
                    i18++;
                }
            } else {
                int iMin3 = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), this.activeItemMaxWidth);
                int i19 = size - (currentVisibleContentItemCount * iMin3);
                for (int i20 = 0; i20 < childCount; i20++) {
                    if (getChildAt(i20).getVisibility() == 8) {
                        i12 = 0;
                    } else if (i19 > 0) {
                        i12 = iMin3 + 1;
                        i19--;
                    } else {
                        i12 = iMin3;
                    }
                    this.tempChildWidths.add(Integer.valueOf(i12));
                }
            }
            i11 = 0;
            iMax = 0;
            while (i14 < childCount) {
                View childAt2 = getChildAt(i14);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.tempChildWidths.get(i14).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i11;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i11 = measuredWidth;
                }
                i14++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f10 = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f10;
            float f11 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f11);
            int iRound2 = Math.round(f10 / f11);
            int i21 = 0;
            int iMax3 = 0;
            while (i14 < childCount) {
                View childAt3 = getChildAt(i14);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i21;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i21 = measuredWidth2;
                }
                i14++;
            }
            i11 = i21;
            iMax = iMax3;
        }
        setMeasuredDimension(i11, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z3) {
        this.itemHorizontalTranslationEnabled = z3;
    }
}
