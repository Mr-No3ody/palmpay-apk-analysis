package com.palmpay.lib.ui.calendar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1435e f24342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ValueAnimator f24343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MonthView f24344g;

    public static int[] a(MonthView monthView, C1435e c1435e) {
        int[] iArr = {-1, -1};
        int i7 = 0;
        loop0: for (int i10 = 0; i10 < monthView.f24068s0; i10++) {
            for (int i11 = 0; i11 < 7; i11++) {
                if (i7 >= monthView.f24071A.size()) {
                    break loop0;
                }
                if (((C1435e) monthView.f24071A.get(i7)) == c1435e) {
                    iArr[0] = i10;
                    iArr[1] = i11;
                    return iArr;
                }
                i7++;
            }
        }
        return iArr;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        MonthView monthView = this.f24344g;
        if (monthView != null) {
            monthView.f24148v0 = null;
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MonthView monthView = this.f24344g;
        if (monthView != null) {
            monthView.invalidate();
        }
    }
}
