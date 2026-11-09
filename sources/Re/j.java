package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallScaleMultipleIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallScaleMultipleIndicator f8580c;

    public /* synthetic */ j(BallScaleMultipleIndicator ballScaleMultipleIndicator, int i7, int i10) {
        this.f8578a = i10;
        this.f8580c = ballScaleMultipleIndicator;
        this.f8579b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8578a) {
            case 0:
                BallScaleMultipleIndicator ballScaleMultipleIndicator = this.f8580c;
                ballScaleMultipleIndicator.f35455i[this.f8579b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballScaleMultipleIndicator.postInvalidate();
                break;
            default:
                BallScaleMultipleIndicator ballScaleMultipleIndicator2 = this.f8580c;
                ballScaleMultipleIndicator2.f35456j[this.f8579b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballScaleMultipleIndicator2.postInvalidate();
                break;
        }
    }
}
