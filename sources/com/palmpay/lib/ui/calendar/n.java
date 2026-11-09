package com.palmpay.lib.ui.calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements YearRecyclerView.OnMonthSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarView f24217a;

    public n(CalendarView calendarView) {
        this.f24217a = calendarView;
    }

    @Override // com.palmpay.lib.ui.calendar.YearRecyclerView.OnMonthSelectedListener
    public final void onMonthSelected(int i7, int i10) {
        CalendarView calendarView = this.f24217a;
        p pVar = calendarView.f24114a;
        calendarView.a((((i7 - pVar.f24257Y) * 12) + i10) - pVar.f24260a0);
        calendarView.f24114a.getClass();
    }
}
