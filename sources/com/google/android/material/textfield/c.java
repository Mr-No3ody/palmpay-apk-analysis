package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EndIconDelegate f22586b;

    public /* synthetic */ c(EndIconDelegate endIconDelegate, int i7) {
        this.f22585a = i7;
        this.f22586b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22585a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f22586b).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) this.f22586b).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f22586b).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
