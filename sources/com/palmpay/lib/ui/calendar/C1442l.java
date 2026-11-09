package com.palmpay.lib.ui.calendar;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1442l implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarView f24215a;

    public C1442l(CalendarView calendarView) {
        this.f24215a = calendarView;
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
        CalendarView calendarView = this.f24215a;
        if (calendarView.f24116c.getVisibility() == 0 || (onYearChangeListener = (pVar = calendarView.f24114a).f24300w0) == null) {
            return;
        }
        onYearChangeListener.onYearChange(i7 + pVar.f24257Y);
    }
}
