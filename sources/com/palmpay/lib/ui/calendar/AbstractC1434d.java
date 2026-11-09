package com.palmpay.lib.ui.calendar;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1434d implements ViewPager.PageTransformer {
    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f10) {
        view.setTranslationX(view.getWidth() * (-f10));
        view.setTranslationY(f10 * view.getHeight());
    }
}
