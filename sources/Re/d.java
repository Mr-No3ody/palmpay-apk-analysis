package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallClipRotatePulseIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallClipRotatePulseIndicator f8565b;

    public /* synthetic */ d(BallClipRotatePulseIndicator ballClipRotatePulseIndicator, int i7) {
        this.f8564a = i7;
        this.f8565b = ballClipRotatePulseIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8564a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator ballClipRotatePulseIndicator = this.f8565b;
                ballClipRotatePulseIndicator.f35440i = fFloatValue;
                ballClipRotatePulseIndicator.postInvalidate();
                break;
            case 1:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator ballClipRotatePulseIndicator2 = this.f8565b;
                ballClipRotatePulseIndicator2.f35441j = fFloatValue2;
                ballClipRotatePulseIndicator2.postInvalidate();
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BallClipRotatePulseIndicator ballClipRotatePulseIndicator3 = this.f8565b;
                ballClipRotatePulseIndicator3.f35442o = fFloatValue3;
                ballClipRotatePulseIndicator3.postInvalidate();
                break;
        }
    }
}
