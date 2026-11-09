package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallScaleIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallScaleIndicator f8577b;

    public /* synthetic */ i(BallScaleIndicator ballScaleIndicator, int i7) {
        this.f8576a = i7;
        this.f8577b = ballScaleIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8576a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallScaleIndicator ballScaleIndicator = this.f8577b;
                ballScaleIndicator.f35453i = fFloatValue;
                ballScaleIndicator.postInvalidate();
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                BallScaleIndicator ballScaleIndicator2 = this.f8577b;
                ballScaleIndicator2.f35454j = iIntValue;
                ballScaleIndicator2.postInvalidate();
                break;
        }
    }
}
