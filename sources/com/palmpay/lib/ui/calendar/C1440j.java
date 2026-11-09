package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1440j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC1437g f24213a;

    public C1440j(RunnableC1437g runnableC1437g) {
        this.f24213a = runnableC1437g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        CalendarView.OnViewChangeListener onViewChangeListener;
        super.onAnimationEnd(animator);
        RunnableC1437g runnableC1437g = this.f24213a;
        CalendarLayout calendarLayout = runnableC1437g.f24209b;
        calendarLayout.f24095B = false;
        calendarLayout.f24103c = true;
        CalendarLayout.a(calendarLayout);
        p pVar = runnableC1437g.f24209b.f24100Q;
        if (pVar == null || (onViewChangeListener = pVar.f24306z0) == null) {
            return;
        }
        onViewChangeListener.onViewChange(false);
    }
}
