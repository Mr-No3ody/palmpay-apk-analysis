package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1439i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CalendarLayout f24212a;

    public C1439i(CalendarLayout calendarLayout) {
        this.f24212a = calendarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p pVar;
        CalendarView.OnViewChangeListener onViewChangeListener;
        super.onAnimationEnd(animator);
        CalendarLayout calendarLayout = this.f24212a;
        calendarLayout.f24095B = false;
        if (calendarLayout.f24109j == 2) {
            calendarLayout.requestLayout();
        }
        if (calendarLayout.f24104d.getVisibility() != 0 && (pVar = calendarLayout.f24100Q) != null && (onViewChangeListener = pVar.f24306z0) != null && calendarLayout.f24103c) {
            onViewChangeListener.onViewChange(true);
        }
        calendarLayout.f24106f.setVisibility(8);
        calendarLayout.f24104d.setVisibility(0);
        CalendarView.OnViewChangeListener onViewChangeListener2 = calendarLayout.f24100Q.f24306z0;
        if (onViewChangeListener2 != null && calendarLayout.f24103c) {
            onViewChangeListener2.onViewChange(true);
        }
        calendarLayout.f24103c = false;
    }
}
