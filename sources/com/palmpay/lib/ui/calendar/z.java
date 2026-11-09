package com.palmpay.lib.ui.calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements CalendarView.OnInnerDateSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalCalendarView f24351a;

    public z(VerticalCalendarView verticalCalendarView) {
        this.f24351a = verticalCalendarView;
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView.OnInnerDateSelectedListener
    public final void onMonthDateSelected(C1435e c1435e, boolean z3) {
        VerticalCalendarView verticalCalendarView = this.f24351a;
        p pVar = verticalCalendarView.f24114a;
        pVar.f24228E0 = c1435e;
        if (pVar.f24265e == 0 || z3) {
            pVar.f24226D0 = c1435e;
        }
        verticalCalendarView.f24116c.a(c1435e);
        verticalCalendarView.f24160j.c();
        if (verticalCalendarView.f24119f != null) {
            int i7 = verticalCalendarView.f24114a.f24265e;
        }
    }

    @Override // com.palmpay.lib.ui.calendar.CalendarView.OnInnerDateSelectedListener
    public final void onWeekDateSelected(C1435e c1435e, boolean z3) {
        VerticalCalendarView verticalCalendarView = this.f24351a;
        p pVar = verticalCalendarView.f24114a;
        pVar.f24228E0 = c1435e;
        if (pVar.f24265e == 0 || z3 || c1435e.equals(pVar.f24226D0)) {
            verticalCalendarView.f24114a.f24226D0 = c1435e;
        }
        int i7 = c1435e.f24201a;
        p pVar2 = verticalCalendarView.f24114a;
        int i10 = pVar2.f24257Y;
        int i11 = pVar2.f24228E0.f24202b;
        int i12 = pVar2.f24260a0;
        verticalCalendarView.f24116c.b();
        verticalCalendarView.f24160j.c();
        if (verticalCalendarView.f24119f != null) {
            p pVar3 = verticalCalendarView.f24114a;
            if (pVar3.f24265e == 0 || z3 || pVar3.f24228E0.equals(pVar3.f24226D0)) {
                WeekBar weekBar = verticalCalendarView.f24119f;
                int i13 = verticalCalendarView.f24114a.f24261b;
                weekBar.getClass();
            }
        }
    }
}
