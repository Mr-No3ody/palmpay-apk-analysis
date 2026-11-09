package B7;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f538a;

    public a(c cVar) {
        this.f538a = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f538a.f542c.f25065n1.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
    }
}
