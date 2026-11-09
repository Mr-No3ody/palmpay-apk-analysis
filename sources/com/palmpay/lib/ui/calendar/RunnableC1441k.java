package com.palmpay.lib.ui.calendar;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1441k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarLayout f24214a;

    public RunnableC1441k(CalendarLayout calendarLayout) {
        this.f24214a = calendarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24214a.f24100Q.f24306z0.onViewChange(true);
    }
}
