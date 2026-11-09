package com.transsnet.palmpay.custom_view.smarttablayout;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmartTabLayout f31700b;

    public b(SmartTabLayout smartTabLayout) {
        this.f31700b = smartTabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
        this.f31699a = i7;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f31700b.f31671o;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i7);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
        SmartTabLayout smartTabLayout = this.f31700b;
        SmartTabStrip smartTabStrip = smartTabLayout.f31662a;
        int childCount = smartTabStrip.getChildCount();
        if (childCount == 0 || i7 < 0 || i7 >= childCount) {
            return;
        }
        smartTabStrip.f31681Q = i7;
        smartTabStrip.f31691k0 = f10;
        if (f10 == 0.0f && smartTabStrip.f31680M != i7) {
            smartTabStrip.f31680M = i7;
        }
        smartTabStrip.invalidate();
        smartTabLayout.a(i7, f10);
        ViewPager.OnPageChangeListener onPageChangeListener = smartTabLayout.f31671o;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i7, f10, i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        int i10 = this.f31699a;
        SmartTabLayout smartTabLayout = this.f31700b;
        SmartTabStrip smartTabStrip = smartTabLayout.f31662a;
        if (i10 == 0) {
            smartTabStrip.f31681Q = i7;
            smartTabStrip.f31691k0 = 0.0f;
            if (smartTabStrip.f31680M != i7) {
                smartTabStrip.f31680M = i7;
            }
            smartTabStrip.invalidate();
            smartTabLayout.a(i7, 0.0f);
        }
        int childCount = smartTabStrip.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            smartTabStrip.getChildAt(i11).setSelected(i7 == i11);
            i11++;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = smartTabLayout.f31671o;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i7);
        }
    }
}
