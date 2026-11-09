package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VerticalCalendarView f24064a;

    public B(VerticalCalendarView verticalCalendarView) {
        this.f24064a = verticalCalendarView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        VerticalCalendarView verticalCalendarView = this.f24064a;
        CalendarView.OnYearViewChangeListener onYearViewChangeListener = verticalCalendarView.f24114a.f24220A0;
        if (onYearViewChangeListener != null) {
            onYearViewChangeListener.onYearViewChange(true);
        }
        CalendarLayout calendarLayout = verticalCalendarView.f24120g;
        if (calendarLayout != null) {
            calendarLayout.d();
            if (verticalCalendarView.f24120g.f24104d.getVisibility() == 0) {
                verticalCalendarView.f24115b.setVisibility(0);
            } else {
                verticalCalendarView.f24116c.setVisibility(0);
                verticalCalendarView.f24120g.e(240);
            }
        } else {
            verticalCalendarView.f24115b.setVisibility(0);
        }
        verticalCalendarView.f24115b.clearAnimation();
    }
}
