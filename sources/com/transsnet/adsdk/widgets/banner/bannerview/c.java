package com.transsnet.adsdk.widgets.banner.bannerview;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerViewPager f25623a;

    public c(BannerViewPager bannerViewPager) {
        this.f25623a = bannerViewPager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrollStateChanged(int i7) {
        super.onPageScrollStateChanged(i7);
        this.f25623a.pageScrollStateChanged(i7);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i7, float f10, int i10) {
        super.onPageScrolled(i7, f10, i10);
        this.f25623a.pageScrolled(i7, f10, i10);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        this.f25623a.pageSelected(i7);
    }
}
