package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f17903a;

    public f(SwipeRefreshLayout swipeRefreshLayout) {
        this.f17903a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SwipeRefreshLayout swipeRefreshLayout = this.f17903a;
        if (swipeRefreshLayout.mScale) {
            return;
        }
        swipeRefreshLayout.startScaleDownAnimation(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
