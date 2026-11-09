package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.CubeTransitionIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CubeTransitionIndicator f8604b;

    public /* synthetic */ s(CubeTransitionIndicator cubeTransitionIndicator, int i7) {
        this.f8603a = i7;
        this.f8604b = cubeTransitionIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8603a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator cubeTransitionIndicator = this.f8604b;
                cubeTransitionIndicator.f35466p = fFloatValue;
                cubeTransitionIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CubeTransitionIndicator cubeTransitionIndicator2 = this.f8604b;
                cubeTransitionIndicator2.f35465o = fFloatValue2;
                cubeTransitionIndicator2.postInvalidate();
                break;
        }
    }
}
