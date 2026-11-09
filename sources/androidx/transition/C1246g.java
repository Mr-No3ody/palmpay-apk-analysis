package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1246g extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f18048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f18049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f18050c;

    public C1246g(View view, Rect rect, Rect rect2) {
        this.f18050c = view;
        this.f18048a = rect;
        this.f18049b = rect2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        View view = this.f18050c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = ChangeClipBounds.f17920b;
        }
        view.setTag(E.transition_clip, clipBounds);
        view.setClipBounds(this.f18049b);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i7 = E.transition_clip;
        View view = this.f18050c;
        view.setClipBounds((Rect) view.getTag(i7));
        view.setTag(E.transition_clip, null);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        View view = this.f18050c;
        if (z3) {
            view.setClipBounds(this.f18048a);
        } else {
            view.setClipBounds(this.f18049b);
        }
    }
}
