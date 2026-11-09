package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallSpinFadeLoaderIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallSpinFadeLoaderIndicator f8588c;

    public /* synthetic */ m(BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator, int i7, int i10) {
        this.f8586a = i10;
        this.f8588c = ballSpinFadeLoaderIndicator;
        this.f8587b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8586a) {
            case 0:
                BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator = this.f8588c;
                ballSpinFadeLoaderIndicator.f35457i[this.f8587b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballSpinFadeLoaderIndicator.postInvalidate();
                break;
            default:
                BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator2 = this.f8588c;
                ballSpinFadeLoaderIndicator2.f35458j[this.f8587b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballSpinFadeLoaderIndicator2.postInvalidate();
                break;
        }
    }
}
