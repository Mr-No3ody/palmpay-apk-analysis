package B7;

import android.animation.ValueAnimator;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f558b;

    public q(r rVar, int i7) {
        this.f558b = rVar;
        this.f557a = i7;
    }

    @Override // java.lang.Runnable
    public void run() {
        ValueAnimator valueAnimatorAnimSpinner;
        r rVar = this.f558b;
        SmartRefreshLayout smartRefreshLayout = rVar.f561c;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListenerScrollContentWhenFinished = (!smartRefreshLayout.f25022F0 || this.f557a >= 0) ? null : smartRefreshLayout.f25062k1.scrollContentWhenFinished(smartRefreshLayout.f25047b);
        if (animatorUpdateListenerScrollContentWhenFinished != null) {
            animatorUpdateListenerScrollContentWhenFinished.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
        }
        p pVar = new p(this);
        int i7 = smartRefreshLayout.f25047b;
        if (i7 > 0) {
            valueAnimatorAnimSpinner = smartRefreshLayout.f25065n1.animSpinner(0);
        } else {
            if (animatorUpdateListenerScrollContentWhenFinished != null || i7 == 0) {
                ValueAnimator valueAnimator = smartRefreshLayout.f25015A1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    smartRefreshLayout.f25015A1 = null;
                }
                smartRefreshLayout.f25065n1.moveSpinner(0, false);
                smartRefreshLayout.i();
            } else if (rVar.f560b && smartRefreshLayout.f25090z0) {
                int i10 = -smartRefreshLayout.f25046a1;
                if (i7 >= i10) {
                    smartRefreshLayout.g(RefreshState.None);
                } else {
                    valueAnimatorAnimSpinner = smartRefreshLayout.f25065n1.animSpinner(i10);
                }
            } else {
                valueAnimatorAnimSpinner = smartRefreshLayout.f25065n1.animSpinner(0);
            }
            valueAnimatorAnimSpinner = null;
        }
        if (valueAnimatorAnimSpinner != null) {
            valueAnimatorAnimSpinner.addListener(pVar);
        } else {
            pVar.onAnimationEnd(null);
        }
    }
}
