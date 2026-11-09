package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12678a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScrollingTabContainerView f12679b;

    public F0(ScrollingTabContainerView scrollingTabContainerView) {
        this.f12679b = scrollingTabContainerView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12678a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f12678a) {
            return;
        }
        this.f12679b.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f12679b.setVisibility(0);
        this.f12678a = false;
    }
}
