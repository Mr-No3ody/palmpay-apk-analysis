package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39802c})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12638c;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12638c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.ButtonBarLayout);
        androidx.core.view.N.p(this, context, p241q.j.ButtonBarLayout, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f12636a = typedArrayObtainStyledAttributes.getBoolean(p241q.j.ButtonBarLayout_allowStacking, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f12636a);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f12637b != z3) {
            if (!z3 || this.f12636a) {
                this.f12637b = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View viewFindViewById = findViewById(p241q.f.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec;
        boolean z3;
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f12636a) {
            if (size > this.f12638c && this.f12637b) {
                setStacked(false);
            }
            this.f12638c = size;
        }
        if (this.f12637b || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z3 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f12636a && !this.f12637b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i7, i10);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f12637b) {
                int childCount2 = getChildCount();
                for (int i13 = i12 + 1; i13 < childCount2; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i11 = i13;
                        break;
                    }
                }
                paddingBottom = i11 >= 0 ? getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i7, i10);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f12636a != z3) {
            this.f12636a = z3;
            if (!z3 && this.f12637b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
