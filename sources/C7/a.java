package C7;

import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BallPulseFooter f1240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BallPulseFooter f1241c;

    public a(BallPulseFooter ballPulseFooter, int i7, BallPulseFooter ballPulseFooter2) {
        this.f1241c = ballPulseFooter;
        this.f1239a = i7;
        this.f1240b = ballPulseFooter2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1241c.f25114j[this.f1239a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f1240b.postInvalidate();
    }
}
