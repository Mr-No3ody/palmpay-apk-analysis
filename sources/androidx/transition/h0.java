package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f18057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18061g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f18062i;

    public h0(View view, View view2, float f10, float f11) {
        this.f18056b = view;
        this.f18055a = view2;
        this.f18060f = f10;
        this.f18061g = f11;
        int[] iArr = (int[]) view2.getTag(E.transition_position);
        this.f18057c = iArr;
        if (iArr != null) {
            view2.setTag(E.transition_position, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18062i = true;
        float f10 = this.f18060f;
        View view = this.f18056b;
        view.setTranslationX(f10);
        view.setTranslationY(this.f18061g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (z3) {
            return;
        }
        float f10 = this.f18060f;
        View view = this.f18056b;
        view.setTranslationX(f10);
        view.setTranslationY(this.f18061g);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.f18062i = true;
        float f10 = this.f18060f;
        View view = this.f18056b;
        view.setTranslationX(f10);
        view.setTranslationY(this.f18061g);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition, boolean z3) {
        if (this.f18062i) {
            return;
        }
        this.f18055a.setTag(E.transition_position, null);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        if (this.f18057c == null) {
            this.f18057c = new int[2];
        }
        int[] iArr = this.f18057c;
        View view = this.f18056b;
        view.getLocationOnScreen(iArr);
        this.f18055a.setTag(E.transition_position, this.f18057c);
        this.f18058d = view.getTranslationX();
        this.f18059e = view.getTranslationY();
        view.setTranslationX(this.f18060f);
        view.setTranslationY(this.f18061g);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        float f10 = this.f18058d;
        View view = this.f18056b;
        view.setTranslationX(f10);
        view.setTranslationY(this.f18059e);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        onTransitionEnd(transition, false);
    }
}
