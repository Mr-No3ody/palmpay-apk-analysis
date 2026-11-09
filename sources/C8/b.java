package C8;

import android.animation.ValueAnimator;
import com.transsnet.mtn.sdk.ui.view.avloading.BallSpinFadeLoaderIndicator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallSpinFadeLoaderIndicator f1247c;

    public /* synthetic */ b(BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator, int i7, int i10) {
        this.f1245a = i10;
        this.f1247c = ballSpinFadeLoaderIndicator;
        this.f1246b = i7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1245a) {
            case 0:
                BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator = this.f1247c;
                ballSpinFadeLoaderIndicator.f25755i[this.f1246b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ballSpinFadeLoaderIndicator.postInvalidate();
                break;
            default:
                BallSpinFadeLoaderIndicator ballSpinFadeLoaderIndicator2 = this.f1247c;
                ballSpinFadeLoaderIndicator2.f25756j[this.f1246b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ballSpinFadeLoaderIndicator2.postInvalidate();
                break;
        }
    }
}
