package com.transsnet.palmpay.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class FixedSizeLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35291b;

    public FixedSizeLayout(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f35290a = getMeasuredWidth();
        this.f35291b = getMeasuredHeight();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        int i7 = this.f35290a;
        if (i7 == 0 || this.f35291b == 0) {
            super.requestLayout();
            return;
        }
        measureChildren(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f35291b, 1073741824));
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
        }
    }

    public FixedSizeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedSizeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
