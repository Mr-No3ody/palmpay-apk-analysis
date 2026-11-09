package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallZigZagDeflectIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallZigZagDeflectIndicator f8596c;

    public /* synthetic */ p(BallZigZagDeflectIndicator ballZigZagDeflectIndicator, int i7, int i10) {
        this.f8594a = i10;
        this.f8596c = ballZigZagDeflectIndicator;
        this.f8595b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8594a) {
            case 0:
                BallZigZagDeflectIndicator ballZigZagDeflectIndicator = this.f8596c;
                ballZigZagDeflectIndicator.f35461i[this.f8595b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballZigZagDeflectIndicator.postInvalidate();
                break;
            default:
                BallZigZagDeflectIndicator ballZigZagDeflectIndicator2 = this.f8596c;
                ballZigZagDeflectIndicator2.f35462j[this.f8595b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballZigZagDeflectIndicator2.postInvalidate();
                break;
        }
    }
}
