package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22551c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f22549a = i7;
        this.f22550b = obj;
        this.f22551c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22549a) {
            case 0:
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1((MaterialShapeDrawable) this.f22550b, (View) this.f22551c, valueAnimator);
                break;
            default:
                ((SearchViewAnimationHelper) this.f22550b).lambda$addEditTextClipAnimator$6((Rect) this.f22551c, valueAnimator);
                break;
        }
    }
}
