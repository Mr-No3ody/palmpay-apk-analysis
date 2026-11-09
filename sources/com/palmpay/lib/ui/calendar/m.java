package com.palmpay.lib.ui.calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements CalendarView.OnInnerDateSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarView f24216a;

    public m(CalendarView calendarView) {
        this.f24216a = calendarView;
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView.OnInnerDateSelectedListener
    public final void onMonthDateSelected(C1435e c1435e, boolean z3) {
        int i7 = c1435e.f24201a;
        CalendarView calendarView = this.f24216a;
        C1435e c1435e2 = calendarView.f24114a.f24275j0;
        if (i7 == c1435e2.f24201a && c1435e.f24202b == c1435e2.f24202b && calendarView.f24115b.getCurrentItem() != calendarView.f24114a.f24283n0) {
            return;
        }
        p pVar = calendarView.f24114a;
        pVar.f24228E0 = c1435e;
        if (pVar.f24265e == 0 || z3) {
            pVar.f24226D0 = c1435e;
        }
        calendarView.f24116c.a(c1435e);
        calendarView.f24115b.c();
        if (calendarView.f24119f != null) {
            int i10 = calendarView.f24114a.f24265e;
        }
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView.OnInnerDateSelectedListener
    public final void onWeekDateSelected(C1435e c1435e, boolean z3) {
        CalendarView calendarView = this.f24216a;
        p pVar = calendarView.f24114a;
        pVar.f24228E0 = c1435e;
        if (pVar.f24265e == 0 || z3 || c1435e.equals(pVar.f24226D0)) {
            calendarView.f24114a.f24226D0 = c1435e;
        }
        int i7 = c1435e.f24201a;
        p pVar2 = calendarView.f24114a;
        int i10 = (((i7 - pVar2.f24257Y) * 12) + pVar2.f24228E0.f24202b) - pVar2.f24260a0;
        calendarView.f24116c.b();
        calendarView.f24115b.setCurrentItem(i10, false);
        calendarView.f24115b.c();
        if (calendarView.f24119f != null) {
            p pVar3 = calendarView.f24114a;
            if (pVar3.f24265e == 0 || z3 || pVar3.f24228E0.equals(pVar3.f24226D0)) {
                WeekBar weekBar = calendarView.f24119f;
                int i11 = calendarView.f24114a.f24261b;
                weekBar.getClass();
            }
        }
    }
}
