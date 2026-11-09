package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1255p extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18095b = false;

    public C1255p(View view) {
        this.f18094a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        k0.b(this.f18094a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f18094a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f18095b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        View view = this.f18094a;
        view.setTag(E.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? k0.f18070a.d(view) : 0.0f));
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        this.f18094a.setTag(E.transition_pause_alpha, null);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        boolean z8 = this.f18095b;
        View view = this.f18094a;
        if (z8) {
            view.setLayerType(0, null);
        }
        if (z3) {
            return;
        }
        k0.b(view, 1.0f);
        k0.f18070a.getClass();
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition, boolean z3) {
    }
}
