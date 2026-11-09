package com.transsnet.palmpay.custom_view.async;

import F6.d;
import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public class MeasureConstraintLayout extends ConstraintLayout {
    public MeasureConstraintLayout(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onLayout(z3, i7, i10, i11, i12);
        d.h("MeasureCLayout", 3, "onLayout: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onMeasure(i7, i10);
        d.h("MeasureCLayout", 3, "onMeasure: " + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public MeasureConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeasureConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
