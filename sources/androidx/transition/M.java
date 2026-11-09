package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M.f f17967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Transition f17968b;

    public M(Transition transition, M.f fVar) {
        this.f17968b = transition;
        this.f17967a = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f17967a.remove(animator);
        this.f17968b.mCurrentAnimators.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f17968b.mCurrentAnimators.add(animator);
    }
}
