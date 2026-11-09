package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallClipRotateMultipleIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallClipRotateMultipleIndicator f8563b;

    public /* synthetic */ c(BallClipRotateMultipleIndicator ballClipRotateMultipleIndicator, int i7) {
        this.f8562a = i7;
        this.f8563b = ballClipRotateMultipleIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8562a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotateMultipleIndicator ballClipRotateMultipleIndicator = this.f8563b;
                ballClipRotateMultipleIndicator.f35438i = fFloatValue;
                ballClipRotateMultipleIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotateMultipleIndicator ballClipRotateMultipleIndicator2 = this.f8563b;
                ballClipRotateMultipleIndicator2.f35439j = fFloatValue2;
                ballClipRotateMultipleIndicator2.postInvalidate();
                break;
        }
    }
}
