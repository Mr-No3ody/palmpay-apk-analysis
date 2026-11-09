package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.PacmanIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PacmanIndicator f8606b;

    public /* synthetic */ t(PacmanIndicator pacmanIndicator, int i7) {
        this.f8605a = i7;
        this.f8606b = pacmanIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8605a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PacmanIndicator pacmanIndicator = this.f8606b;
                pacmanIndicator.f35469i = fFloatValue;
                pacmanIndicator.postInvalidate();
                break;
            case 1:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                PacmanIndicator pacmanIndicator2 = this.f8606b;
                pacmanIndicator2.f35470j = iIntValue;
                pacmanIndicator2.postInvalidate();
                break;
            case 2:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PacmanIndicator pacmanIndicator3 = this.f8606b;
                pacmanIndicator3.f35471o = fFloatValue2;
                pacmanIndicator3.postInvalidate();
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PacmanIndicator pacmanIndicator4 = this.f8606b;
                pacmanIndicator4.f35472p = fFloatValue3;
                pacmanIndicator4.postInvalidate();
                break;
        }
    }
}
