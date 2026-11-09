package com.transsnet.palmpay.p2pcash.ui.atm.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public class MViewPager extends ViewPager {
    public MViewPager(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i7, int i10) {
        int currentItem = getCurrentItem();
        androidx.viewpager.widget.a adapter = getAdapter();
        if (adapter != null) {
            View view = (View) adapter.g(this, currentItem);
            view.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            i10 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
        }
        super.onMeasure(i7, i10);
    }

    public MViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
