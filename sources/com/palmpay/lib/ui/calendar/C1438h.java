package com.palmpay.lib.ui.calendar;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.palmpay.lib.ui.calendar.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1438h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CalendarLayout f24211b;

    public /* synthetic */ C1438h(CalendarLayout calendarLayout, int i7) {
        this.f24210a = i7;
        this.f24211b = calendarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24210a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f;
                CalendarLayout calendarLayout = this.f24211b;
                calendarLayout.f24104d.setTranslationY(calendarLayout.t * (fFloatValue / calendarLayout.f24111p));
                calendarLayout.f24095B = true;
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f;
                CalendarLayout calendarLayout2 = this.f24211b;
                calendarLayout2.f24104d.setTranslationY(calendarLayout2.t * (fFloatValue2 / calendarLayout2.f24111p));
                calendarLayout2.f24095B = true;
                break;
        }
    }
}
