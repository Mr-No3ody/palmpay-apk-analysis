package com.palmpay.lib.ui.calendar;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends AbstractC1434d {
    @Override // com.palmpay.lib.ui.calendar.AbstractC1434d, androidx.viewpager.widget.ViewPager.PageTransformer
    public final void transformPage(View view, float f10) {
        super.transformPage(view, f10);
        if (0.0f <= f10 && f10 <= 1.0f) {
            view.setAlpha(1.0f - f10);
        } else {
            if (-1.0f >= f10 || f10 >= 0.0f) {
                return;
            }
            view.setAlpha(f10 + 1.0f);
        }
    }
}
