package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22541b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f22540a = i7;
        this.f22541b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22540a) {
            case 0:
                ((View) this.f22541b).setAlpha(0.0f);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$4((p300u.b) this.f22541b, valueAnimator);
                break;
            case 2:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$5((FadeThroughDrawable) this.f22541b, valueAnimator);
                break;
            case 3:
                ((SearchViewAnimationHelper) this.f22541b).lambda$addTextFadeAnimatorIfNeeded$7(valueAnimator);
                break;
            default:
                SearchViewAnimationHelper.lambda$addBackButtonAnimatorIfNeeded$3((ImageButton) this.f22541b, valueAnimator);
                break;
        }
    }
}
