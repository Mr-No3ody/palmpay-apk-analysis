package com.palmpay.lib.ui.calendar;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalCalendarView f24350a;

    public y(VerticalCalendarView verticalCalendarView) {
        this.f24350a = verticalCalendarView;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        p pVar;
        CalendarView.OnYearChangeListener onYearChangeListener;
        VerticalCalendarView verticalCalendarView = this.f24350a;
        if (verticalCalendarView.f24116c.getVisibility() == 0 || (onYearChangeListener = (pVar = verticalCalendarView.f24114a).f24300w0) == null) {
            return;
        }
        onYearChangeListener.onYearChange(i7 + pVar.f24257Y);
    }
}
