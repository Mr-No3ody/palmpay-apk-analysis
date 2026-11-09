package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallScaleRippleIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallScaleRippleIndicator f8582b;

    public /* synthetic */ k(BallScaleRippleIndicator ballScaleRippleIndicator, int i7) {
        this.f8581a = i7;
        this.f8582b = ballScaleRippleIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8581a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallScaleRippleIndicator ballScaleRippleIndicator = this.f8582b;
                ballScaleRippleIndicator.f35453i = fFloatValue;
                ballScaleRippleIndicator.postInvalidate();
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BallScaleRippleIndicator ballScaleRippleIndicator2 = this.f8582b;
                ballScaleRippleIndicator2.f35454j = iIntValue;
                ballScaleRippleIndicator2.postInvalidate();
                break;
        }
    }
}
