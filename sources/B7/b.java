package B7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f539a;

    public b(c cVar) {
        this.f539a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SmartRefreshLayout smartRefreshLayout = this.f539a.f542c;
        smartRefreshLayout.f25015A1 = null;
        RefreshState refreshState = smartRefreshLayout.f25070p1;
        RefreshState refreshState2 = RefreshState.ReleaseToRefresh;
        if (refreshState != refreshState2) {
            smartRefreshLayout.f25065n1.setState(refreshState2);
        }
        smartRefreshLayout.h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        SmartRefreshLayout smartRefreshLayout = this.f539a.f542c;
        smartRefreshLayout.f25066o = smartRefreshLayout.getMeasuredWidth() / 2;
        smartRefreshLayout.f25065n1.setState(RefreshState.PullDownToRefresh);
    }
}
