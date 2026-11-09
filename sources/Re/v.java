package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.TriangleSkewSpinIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TriangleSkewSpinIndicator f8610b;

    public /* synthetic */ v(TriangleSkewSpinIndicator triangleSkewSpinIndicator, int i7) {
        this.f8609a = i7;
        this.f8610b = triangleSkewSpinIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8609a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TriangleSkewSpinIndicator triangleSkewSpinIndicator = this.f8610b;
                triangleSkewSpinIndicator.f35478i = fFloatValue;
                triangleSkewSpinIndicator.postInvalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TriangleSkewSpinIndicator triangleSkewSpinIndicator2 = this.f8610b;
                triangleSkewSpinIndicator2.f35479j = fFloatValue2;
                triangleSkewSpinIndicator2.postInvalidate();
                break;
        }
    }
}
