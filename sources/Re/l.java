package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallScaleRippleMultipleIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallScaleRippleMultipleIndicator f8585c;

    public /* synthetic */ l(BallScaleRippleMultipleIndicator ballScaleRippleMultipleIndicator, int i7, int i10) {
        this.f8583a = i10;
        this.f8585c = ballScaleRippleMultipleIndicator;
        this.f8584b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8583a) {
            case 0:
                BallScaleRippleMultipleIndicator ballScaleRippleMultipleIndicator = this.f8585c;
                ballScaleRippleMultipleIndicator.f35455i[this.f8584b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballScaleRippleMultipleIndicator.postInvalidate();
                break;
            default:
                BallScaleRippleMultipleIndicator ballScaleRippleMultipleIndicator2 = this.f8585c;
                ballScaleRippleMultipleIndicator2.f35456j[this.f8584b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballScaleRippleMultipleIndicator2.postInvalidate();
                break;
        }
    }
}
