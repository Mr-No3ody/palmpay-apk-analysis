package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f18108c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18111f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18109d = true;

    public s0(View view, int i7) {
        this.f18106a = view;
        this.f18107b = i7;
        this.f18108c = (ViewGroup) view.getParent();
        a(true);
    }

    public final void a(boolean z3) {
        ViewGroup viewGroup;
        if (!this.f18109d || this.f18110e == z3 || (viewGroup = this.f18108c) == null) {
            return;
        }
        this.f18110e = z3;
        K.h(viewGroup, z3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18111f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f18111f) {
            k0.c(this.f18106a, this.f18107b);
            ViewGroup viewGroup = this.f18108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        a(false);
        if (this.f18111f) {
            return;
        }
        k0.c(this.f18106a, this.f18107b);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        a(true);
        if (this.f18111f) {
            return;
        }
        k0.c(this.f18106a, 0);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        if (z3) {
            k0.c(this.f18106a, 0);
            ViewGroup viewGroup = this.f18108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        if (!this.f18111f) {
            k0.c(this.f18106a, this.f18107b);
            ViewGroup viewGroup = this.f18108c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        a(false);
    }
}
