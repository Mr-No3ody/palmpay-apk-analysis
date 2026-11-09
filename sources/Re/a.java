package Re;

import android.animation.ValueAnimator;
import com.wang.avi.indicators.BallBeatIndicator;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallBeatIndicator f8559c;

    public /* synthetic */ a(BallBeatIndicator ballBeatIndicator, int i7, int i10) {
        this.f8557a = i10;
        this.f8559c = ballBeatIndicator;
        this.f8558b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8557a) {
            case 0:
                BallBeatIndicator ballBeatIndicator = this.f8559c;
                ballBeatIndicator.f35434i[this.f8558b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballBeatIndicator.postInvalidate();
                break;
            default:
                BallBeatIndicator ballBeatIndicator2 = this.f8559c;
                ballBeatIndicator2.f35435j[this.f8558b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballBeatIndicator2.postInvalidate();
                break;
        }
    }
}
