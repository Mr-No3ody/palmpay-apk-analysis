package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallZigZagIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallZigZagIndicator f8599c;

    public /* synthetic */ q(BallZigZagIndicator ballZigZagIndicator, int i7, int i10) {
        this.f8597a = i10;
        this.f8599c = ballZigZagIndicator;
        this.f8598b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8597a) {
            case 0:
                BallZigZagIndicator ballZigZagIndicator = this.f8599c;
                ballZigZagIndicator.f35461i[this.f8598b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballZigZagIndicator.postInvalidate();
                break;
            default:
                BallZigZagIndicator ballZigZagIndicator2 = this.f8599c;
                ballZigZagIndicator2.f35462j[this.f8598b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballZigZagIndicator2.postInvalidate();
                break;
        }
    }
}
