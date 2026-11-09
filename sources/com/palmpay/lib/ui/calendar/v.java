package com.palmpay.lib.ui.calendar;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MonthViewPager f24345a;

    public v(MonthViewPager monthViewPager) {
        this.f24345a = monthViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
        float f11;
        int i11;
        MonthViewPager monthViewPager = this.f24345a;
        if (monthViewPager.f24151c.f24262c == 0) {
            return;
        }
        if (i7 < monthViewPager.getCurrentItem()) {
            f11 = (1.0f - f10) * monthViewPager.f24153e;
            i11 = monthViewPager.f24154f;
        } else {
            f11 = (1.0f - f10) * monthViewPager.f24154f;
            i11 = monthViewPager.f24152d;
        }
        int i12 = (int) ((i11 * f10) + f11);
        ViewGroup.LayoutParams layoutParams = monthViewPager.getLayoutParams();
        layoutParams.height = i12;
        monthViewPager.setLayoutParams(layoutParams);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        CalendarLayout calendarLayout;
        C1435e c1435eD;
        int i10;
        CalendarView.OnYearChangeListener onYearChangeListener;
        int i11;
        MonthViewPager monthViewPager = this.f24345a;
        p pVar = monthViewPager.f24151c;
        C1435e c1435e = new C1435e();
        int i12 = (pVar.f24260a0 + i7) - 1;
        int i13 = (i12 / 12) + pVar.f24257Y;
        c1435e.f24201a = i13;
        int i14 = (i12 % 12) + 1;
        c1435e.f24202b = i14;
        if (pVar.f24259a != 0) {
            int iK = s.k(i13, i14);
            C1435e c1435e2 = pVar.f24228E0;
            if (c1435e2 == null || (i11 = c1435e2.f24203c) == 0) {
                iK = 1;
            } else if (iK >= i11) {
                iK = i11;
            }
            c1435e.f24203c = iK;
        } else {
            c1435e.f24203c = 1;
        }
        if (!s.v(c1435e, pVar)) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(pVar.f24257Y, pVar.f24260a0 - 1, pVar.c0, 12, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(c1435e.f24201a, c1435e.f24202b - 1, c1435e.f24203c, 12, 0);
            c1435e = calendar.getTimeInMillis() < timeInMillis ? pVar.d() : pVar.c();
        }
        int i15 = c1435e.f24201a;
        C1435e c1435e3 = pVar.f24275j0;
        c1435e.f24204d = i15 == c1435e3.f24201a && c1435e.f24202b == c1435e3.f24202b;
        c1435e.f24205e = c1435e.equals(c1435e3);
        r.c(c1435e);
        if (monthViewPager.getVisibility() == 0) {
            monthViewPager.f24151c.getClass();
            p pVar2 = monthViewPager.f24151c;
            C1435e c1435e4 = pVar2.f24228E0;
            if (c1435e4 != null && (i10 = c1435e.f24201a) != c1435e4.f24201a && (onYearChangeListener = pVar2.f24300w0) != null) {
                onYearChangeListener.onYearChange(i10);
            }
            monthViewPager.f24151c.f24228E0 = c1435e;
        }
        CalendarView.OnMonthChangeListener onMonthChangeListener = monthViewPager.f24151c.f24302x0;
        if (onMonthChangeListener != null) {
            onMonthChangeListener.onMonthChange(c1435e.f24201a, c1435e.f24202b);
        }
        if (monthViewPager.f24156i.getVisibility() == 0) {
            monthViewPager.b(c1435e.f24201a, c1435e.f24202b);
            return;
        }
        p pVar3 = monthViewPager.f24151c;
        if (pVar3.f24265e == 0) {
            if (c1435e.f24204d) {
                if (s.v(pVar3.f24275j0, pVar3) && pVar3.f24259a != 2) {
                    c1435eD = pVar3.b();
                } else if (s.v(c1435e, pVar3)) {
                    c1435eD = c1435e;
                } else {
                    c1435eD = pVar3.d().c(c1435e) ? pVar3.d() : pVar3.c();
                }
                pVar3.f24226D0 = c1435eD;
            } else {
                pVar3.f24226D0 = c1435e;
            }
            p pVar4 = monthViewPager.f24151c;
            pVar4.f24228E0 = pVar4.f24226D0;
        } else {
            C1435e c1435e5 = pVar3.f24234H0;
            if (c1435e5 != null && c1435e5.c(pVar3.f24228E0)) {
                p pVar5 = monthViewPager.f24151c;
                pVar5.f24228E0 = pVar5.f24234H0;
            } else if (c1435e.c(monthViewPager.f24151c.f24226D0)) {
                p pVar6 = monthViewPager.f24151c;
                pVar6.f24228E0 = pVar6.f24226D0;
            }
        }
        monthViewPager.f24151c.e();
        if (!monthViewPager.f24158o && monthViewPager.f24151c.f24265e == 0) {
            monthViewPager.f24157j.getClass();
            p pVar7 = monthViewPager.f24151c;
            CalendarView.OnCalendarSelectListener onCalendarSelectListener = pVar7.f24291r0;
            if (onCalendarSelectListener != null) {
                onCalendarSelectListener.onCalendarSelect(pVar7.f24226D0, false);
            }
        }
        BaseMonthView baseMonthView = (BaseMonthView) monthViewPager.findViewWithTag(Integer.valueOf(i7));
        if (baseMonthView != null) {
            int iIndexOf = baseMonthView.f24071A.indexOf(monthViewPager.f24151c.f24228E0);
            if (monthViewPager.f24151c.f24265e == 0) {
                baseMonthView.f24087k0 = iIndexOf;
            }
            if (iIndexOf >= 0 && (calendarLayout = monthViewPager.f24155g) != null) {
                calendarLayout.h(iIndexOf);
            }
            baseMonthView.invalidate();
        }
        monthViewPager.f24156i.a(monthViewPager.f24151c.f24228E0);
        monthViewPager.b(c1435e.f24201a, c1435e.f24202b);
        monthViewPager.f24158o = false;
    }
}
