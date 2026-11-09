package com.palmpay.lib.ui.calendar;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC1437g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarLayout f24209b;

    public /* synthetic */ RunnableC1437g(CalendarLayout calendarLayout, int i7) {
        this.f24208a = i7;
        this.f24209b = calendarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CalendarLayout calendarLayout = this.f24209b;
        switch (this.f24208a) {
            case 0:
                calendarLayout.b(0);
                break;
            case 1:
                calendarLayout.e(0);
                break;
            default:
                ViewGroup viewGroup = calendarLayout.f24108i;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -calendarLayout.f24111p);
                objectAnimatorOfFloat.setDuration(0L);
                objectAnimatorOfFloat.addUpdateListener(new Re.g(this, 2));
                objectAnimatorOfFloat.addListener(new C1440j(this));
                objectAnimatorOfFloat.start();
                break;
        }
    }
}
