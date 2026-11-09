package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallGridPulseIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallGridPulseIndicator f8571c;

    public /* synthetic */ f(BallGridPulseIndicator ballGridPulseIndicator, int i7, int i10) {
        this.f8569a = i10;
        this.f8571c = ballGridPulseIndicator;
        this.f8570b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8569a) {
            case 0:
                BallGridPulseIndicator ballGridPulseIndicator = this.f8571c;
                ballGridPulseIndicator.f35445j[this.f8570b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballGridPulseIndicator.postInvalidate();
                break;
            default:
                BallGridPulseIndicator ballGridPulseIndicator2 = this.f8571c;
                ballGridPulseIndicator2.f35444i[this.f8570b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballGridPulseIndicator2.postInvalidate();
                break;
        }
    }
}
