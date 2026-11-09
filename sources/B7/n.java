package B7;

import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout f553a;

    public n(SmartRefreshLayout smartRefreshLayout) {
        this.f553a = smartRefreshLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f553a.f25065n1.moveSpinner(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
    }
}
