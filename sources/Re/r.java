package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.CubeTransitionIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CubeTransitionIndicator f8602c;

    public /* synthetic */ r(CubeTransitionIndicator cubeTransitionIndicator, int i7, int i10) {
        this.f8600a = i10;
        this.f8602c = cubeTransitionIndicator;
        this.f8601b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8600a) {
            case 0:
                CubeTransitionIndicator cubeTransitionIndicator = this.f8602c;
                cubeTransitionIndicator.f35463i[this.f8601b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cubeTransitionIndicator.postInvalidate();
                break;
            default:
                CubeTransitionIndicator cubeTransitionIndicator2 = this.f8602c;
                cubeTransitionIndicator2.f35464j[this.f8601b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cubeTransitionIndicator2.postInvalidate();
                break;
        }
    }
}
