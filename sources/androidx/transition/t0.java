package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f18117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f18119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18120d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Visibility f18121e;

    public t0(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f18121e = visibility;
        this.f18117a = viewGroup;
        this.f18118b = view;
        this.f18119c = view2;
    }

    public final void a() {
        this.f18119c.setTag(E.save_overlay_view, null);
        this.f18117a.getOverlay().remove(this.f18118b);
        this.f18120d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f18117a.getOverlay().remove(this.f18118b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f18118b;
        if (view.getParent() == null) {
            this.f18117a.getOverlay().add(view);
        } else {
            this.f18121e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            View view = this.f18119c;
            int i7 = E.save_overlay_view;
            View view2 = this.f18118b;
            view.setTag(i7, view2);
            this.f18117a.getOverlay().add(view2);
            this.f18120d = true;
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        if (this.f18120d) {
            a();
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        a();
    }
}
