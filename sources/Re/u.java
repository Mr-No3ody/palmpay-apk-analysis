package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.SquareSpinIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SquareSpinIndicator f8608b;

    public /* synthetic */ u(SquareSpinIndicator squareSpinIndicator, int i7) {
        this.f8607a = i7;
        this.f8608b = squareSpinIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8607a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SquareSpinIndicator squareSpinIndicator = this.f8608b;
                squareSpinIndicator.f35474i = fFloatValue;
                squareSpinIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                SquareSpinIndicator squareSpinIndicator2 = this.f8608b;
                squareSpinIndicator2.f35475j = fFloatValue2;
                squareSpinIndicator2.postInvalidate();
                break;
        }
    }
}
