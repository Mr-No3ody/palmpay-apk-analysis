package Ub;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MarqueeView f9521c;

    public a(MarqueeView marqueeView, int i7, int i10) {
        this.f9521c = marqueeView;
        this.f9519a = i7;
        this.f9520b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        int i10 = MarqueeView.f31390Q;
        MarqueeView marqueeView = this.f9521c;
        marqueeView.removeAllViews();
        marqueeView.clearAnimation();
        List list = marqueeView.f31392B;
        if (list == null || list.isEmpty()) {
            throw new RuntimeException("The messages cannot be empty!");
        }
        marqueeView.f31391A = 0;
        marqueeView.addView(marqueeView.a(marqueeView.f31392B.get(0)));
        if (marqueeView.f31392B.size() > 1) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(marqueeView.getContext(), this.f9519a);
            if (marqueeView.f31398b) {
                animationLoadAnimation.setDuration(marqueeView.f31399c);
            }
            marqueeView.setInAnimation(animationLoadAnimation);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(marqueeView.getContext(), this.f9520b);
            if (marqueeView.f31398b) {
                animationLoadAnimation2.setDuration(marqueeView.f31399c);
            }
            marqueeView.setOutAnimation(animationLoadAnimation2);
            marqueeView.startFlipping();
        }
        if (marqueeView.getInAnimation() != null) {
            marqueeView.getInAnimation().setAnimationListener(new b(marqueeView, i7));
        }
    }
}
