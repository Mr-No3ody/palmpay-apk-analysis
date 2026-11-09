package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class F extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1435e f24137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ValueAnimator f24138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeekView f24139e;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WeekView weekView = this.f24139e;
        if (weekView != null) {
            weekView.f24165p0 = null;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        WeekView weekView = this.f24139e;
        if (weekView != null) {
            weekView.invalidate();
        }
    }
}
