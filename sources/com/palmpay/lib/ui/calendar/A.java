package com.palmpay.lib.ui.calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements YearRecyclerView.OnMonthSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalCalendarView f24063a;

    public A(VerticalCalendarView verticalCalendarView) {
        this.f24063a = verticalCalendarView;
    }

    @Override // com.palmpay.lib.ui.calendar.YearRecyclerView.OnMonthSelectedListener
    public final void onMonthSelected(int i7, int i10) {
        VerticalCalendarView verticalCalendarView = this.f24063a;
        p pVar = verticalCalendarView.f24114a;
        verticalCalendarView.a((((i7 - pVar.f24257Y) * 12) + i10) - pVar.f24260a0);
        verticalCalendarView.f24114a.getClass();
    }
}
