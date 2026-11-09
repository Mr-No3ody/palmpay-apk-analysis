package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    public static int a(View view) {
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return a(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int paddingLeft = getPaddingLeft();
        int i16 = i11 - i7;
        int paddingRight = i16 - getPaddingRight();
        int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i17 = gravity & HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR;
        int i18 = gravity & 8388615;
        int paddingTop = i17 != 16 ? i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - measuredHeight : (((i12 - i10) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i20 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i20 < 0) {
                    i20 = i18;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i15 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    } else {
                        i13 = paddingRight - measuredWidth;
                        i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i19)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i21 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    childAt.layout(i15, i21, measuredWidth + i15, i21 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i21;
                } else {
                    i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i14 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i15 = i13 - i14;
                if (hasDividerBeforeChildAt(i19)) {
                    paddingTop += intrinsicHeight;
                }
                int i22 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                childAt.layout(i15, i22, measuredWidth + i15, i22 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i22;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iCombineMeasuredStates;
        int iA;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = alertDialogLayout.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == p241q.f.topPanel) {
                    view = childAt;
                } else if (id2 == p241q.f.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != p241q.f.contentPanel && id2 != p241q.f.customPanel) || view3 != null) {
                        super.onMeasure(i7, i10);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i7);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i7, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i7, 0);
            iA = a(view2);
            measuredHeight = view2.getMeasuredHeight() - iA;
            paddingBottom += iA;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iA = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i12 = size - paddingBottom;
        if (view2 != null) {
            int i13 = paddingBottom - iA;
            int iMin = Math.min(i12, measuredHeight);
            if (iMin > 0) {
                i12 -= iMin;
                iA += iMin;
            }
            view2.measure(i7, View.MeasureSpec.makeMeasureSpec(iA, 1073741824));
            paddingBottom = i13 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i12 > 0) {
            view3.measure(i7, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i12, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = alertDialogLayout.getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i15 = i10;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i7, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i15, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i16 = 0;
            while (i16 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                        int i17 = ((LinearLayout.LayoutParams) layoutParams).height;
                        ((LinearLayout.LayoutParams) layoutParams).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i15, 0);
                        ((LinearLayout.LayoutParams) layoutParams).height = i17;
                    }
                }
                i16++;
                alertDialogLayout = this;
                i15 = i10;
            }
        }
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
