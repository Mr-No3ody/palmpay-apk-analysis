package com.palmpay.lib.ui.calendar;

import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeekViewPager f24140a;

    public G(WeekViewPager weekViewPager) {
        this.f24140a = weekViewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i7) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i7, float f10, int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i7) {
        ArrayList arrayList;
        CalendarView.OnYearChangeListener onYearChangeListener;
        WeekViewPager weekViewPager = this.f24140a;
        if (weekViewPager.getVisibility() != 0) {
            weekViewPager.f24170e = false;
            return;
        }
        if (weekViewPager.f24170e) {
            weekViewPager.f24170e = false;
            return;
        }
        BaseWeekView baseWeekView = (BaseWeekView) weekViewPager.findViewWithTag(Integer.valueOf(i7));
        if (baseWeekView != null) {
            p pVar = weekViewPager.f24168c;
            C1435e c1435e = pVar.f24265e != 0 ? pVar.f24228E0 : pVar.f24226D0;
            boolean z3 = weekViewPager.f24170e;
            if (baseWeekView.f24091w != null && baseWeekView.f24078a.f24298v0 != null && (arrayList = baseWeekView.f24071A) != null && arrayList.size() != 0) {
                int iS = s.s(c1435e.f24201a, c1435e.f24202b, c1435e.f24203c, baseWeekView.f24078a.f24261b);
                if (baseWeekView.f24071A.contains(baseWeekView.f24078a.f24275j0)) {
                    p pVar2 = baseWeekView.f24078a;
                    C1435e c1435e2 = pVar2.f24275j0;
                    iS = s.s(c1435e2.f24201a, c1435e2.f24202b, c1435e2.f24203c, pVar2.f24261b);
                }
                C1435e c1435e3 = (C1435e) baseWeekView.f24071A.get(iS);
                p pVar3 = baseWeekView.f24078a;
                if (pVar3.f24265e != 0) {
                    if (baseWeekView.f24071A.contains(pVar3.f24226D0)) {
                        c1435e3 = baseWeekView.f24078a.f24226D0;
                    } else {
                        baseWeekView.f24087k0 = -1;
                    }
                }
                if (!baseWeekView.b(c1435e3)) {
                    Calendar calendar = Calendar.getInstance();
                    p pVar4 = baseWeekView.f24078a;
                    calendar.set(pVar4.f24257Y, pVar4.f24260a0 - 1, pVar4.c0);
                    long timeInMillis = calendar.getTimeInMillis();
                    calendar.set(c1435e3.f24201a, c1435e3.f24202b - 1, c1435e3.f24203c);
                    boolean z8 = calendar.getTimeInMillis() < timeInMillis;
                    iS = 0;
                    while (true) {
                        if (iS >= baseWeekView.f24071A.size()) {
                            if (!z8) {
                                iS = 0;
                                break;
                            } else {
                                iS = 6;
                                break;
                            }
                        }
                        boolean zB = baseWeekView.b((C1435e) baseWeekView.f24071A.get(iS));
                        if (!z8 || !zB) {
                            if (!z8 && !zB) {
                                iS--;
                                break;
                            }
                            iS++;
                        } else {
                            break;
                        }
                    }
                    c1435e3 = (C1435e) baseWeekView.f24071A.get(iS);
                }
                c1435e3.f24205e = c1435e3.equals(baseWeekView.f24078a.f24275j0);
                baseWeekView.f24078a.f24298v0.onWeekDateSelected(c1435e3, false);
                baseWeekView.f24091w.i(s.r(c1435e3, baseWeekView.f24078a.f24261b));
                p pVar5 = baseWeekView.f24078a;
                CalendarView.OnCalendarSelectListener onCalendarSelectListener = pVar5.f24291r0;
                if (onCalendarSelectListener != null && !z3 && pVar5.f24265e == 0) {
                    onCalendarSelectListener.onCalendarSelect(c1435e3, false);
                }
                baseWeekView.f24091w.g();
                p pVar6 = baseWeekView.f24078a;
                if (pVar6.f24265e == 0) {
                    baseWeekView.f24087k0 = iS;
                }
                C1435e c1435e4 = pVar6.f24228E0;
                if (c1435e4 != null) {
                    int i10 = c1435e.f24201a;
                    int i11 = c1435e4.f24201a;
                    if (i10 != i11 && (onYearChangeListener = pVar6.f24300w0) != null) {
                        onYearChangeListener.onYearChange(i11);
                    }
                }
                baseWeekView.f24078a.f24228E0 = c1435e3;
                baseWeekView.invalidate();
            }
            CalendarView.OnWeekChangeListener onWeekChangeListener = weekViewPager.f24168c.f24304y0;
            if (onWeekChangeListener != null) {
                onWeekChangeListener.onWeekChange(weekViewPager.getCurrentWeekCalendars());
            }
        }
        weekViewPager.f24170e = false;
    }
}
