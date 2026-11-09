package B7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f544a;

    public e(f fVar) {
        this.f544a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SmartRefreshLayout smartRefreshLayout = this.f544a.f547c;
        smartRefreshLayout.f25015A1 = null;
        RefreshState refreshState = smartRefreshLayout.f25070p1;
        RefreshState refreshState2 = RefreshState.ReleaseToLoad;
        if (refreshState != refreshState2) {
            smartRefreshLayout.f25065n1.setState(refreshState2);
        }
        if (!smartRefreshLayout.f25020D0) {
            smartRefreshLayout.h();
            return;
        }
        smartRefreshLayout.f25020D0 = false;
        smartRefreshLayout.h();
        smartRefreshLayout.f25020D0 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        SmartRefreshLayout smartRefreshLayout = this.f544a.f547c;
        smartRefreshLayout.f25066o = smartRefreshLayout.getMeasuredWidth() / 2;
        smartRefreshLayout.f25065n1.setState(RefreshState.PullUpToLoad);
    }
}
