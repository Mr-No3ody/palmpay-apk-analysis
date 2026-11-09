package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallTrianglePathIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallTrianglePathIndicator f8593c;

    public /* synthetic */ o(BallTrianglePathIndicator ballTrianglePathIndicator, int i7, int i10) {
        this.f8591a = i10;
        this.f8593c = ballTrianglePathIndicator;
        this.f8592b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8591a) {
            case 0:
                BallTrianglePathIndicator ballTrianglePathIndicator = this.f8593c;
                ballTrianglePathIndicator.f35459i[this.f8592b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballTrianglePathIndicator.postInvalidate();
                break;
            default:
                BallTrianglePathIndicator ballTrianglePathIndicator2 = this.f8593c;
                ballTrianglePathIndicator2.f35460j[this.f8592b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballTrianglePathIndicator2.postInvalidate();
                break;
        }
    }
}
