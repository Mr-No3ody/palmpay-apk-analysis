package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarView f24218a;

    public o(CalendarView calendarView) {
        this.f24218a = calendarView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        CalendarView calendarView = this.f24218a;
        CalendarView.OnYearViewChangeListener onYearViewChangeListener = calendarView.f24114a.f24220A0;
        if (onYearViewChangeListener != null) {
            onYearViewChangeListener.onYearViewChange(true);
        }
        CalendarLayout calendarLayout = calendarView.f24120g;
        if (calendarLayout != null) {
            calendarLayout.d();
            if (calendarView.f24120g.f24104d.getVisibility() == 0) {
                calendarView.f24115b.setVisibility(0);
            } else {
                calendarView.f24116c.setVisibility(0);
                calendarView.f24120g.e(240);
            }
        } else {
            calendarView.f24115b.setVisibility(0);
        }
        calendarView.f24115b.clearAnimation();
    }
}
