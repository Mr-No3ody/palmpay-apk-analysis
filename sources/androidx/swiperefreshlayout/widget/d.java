package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17899a;

    public d(SwipeRefreshLayout swipeRefreshLayout) {
        this.f17899a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout.OnRefreshListener onRefreshListener;
        SwipeRefreshLayout swipeRefreshLayout = this.f17899a;
        if (!swipeRefreshLayout.mRefreshing) {
            swipeRefreshLayout.reset();
            return;
        }
        swipeRefreshLayout.mProgress.setAlpha(255);
        swipeRefreshLayout.mProgress.start();
        if (swipeRefreshLayout.mNotify && (onRefreshListener = swipeRefreshLayout.mListener) != null) {
            onRefreshListener.onRefresh();
        }
        swipeRefreshLayout.mCurrentTargetOffsetTop = swipeRefreshLayout.mCircleView.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
