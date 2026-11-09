package B7;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f543a;

    public d(f fVar) {
        this.f543a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f543a.f547c.f25065n1.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
    }
}
