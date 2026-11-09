package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallRotateIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallRotateIndicator f8575b;

    public /* synthetic */ h(BallRotateIndicator ballRotateIndicator, int i7) {
        this.f8574a = i7;
        this.f8575b = ballRotateIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8574a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator ballRotateIndicator = this.f8575b;
                ballRotateIndicator.f35451i = fFloatValue;
                ballRotateIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallRotateIndicator ballRotateIndicator2 = this.f8575b;
                ballRotateIndicator2.f35452j = fFloatValue2;
                ballRotateIndicator2.postInvalidate();
                break;
        }
    }
}
