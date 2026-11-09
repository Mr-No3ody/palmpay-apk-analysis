package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallClipRotateIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallClipRotateIndicator f8561b;

    public /* synthetic */ b(BallClipRotateIndicator ballClipRotateIndicator, int i7) {
        this.f8560a = i7;
        this.f8561b = ballClipRotateIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8560a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotateIndicator ballClipRotateIndicator = this.f8561b;
                ballClipRotateIndicator.f35436i = fFloatValue;
                ballClipRotateIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotateIndicator ballClipRotateIndicator2 = this.f8561b;
                ballClipRotateIndicator2.f35437j = fFloatValue2;
                ballClipRotateIndicator2.postInvalidate();
                break;
        }
    }
}
