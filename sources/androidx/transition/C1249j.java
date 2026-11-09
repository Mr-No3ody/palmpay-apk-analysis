package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.transition.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1249j extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f18064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f18065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f18066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18067d = true;

    public C1249j(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.f18064a = imageView;
        this.f18065b = matrix;
        this.f18066c = matrix2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        this.f18067d = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
        int i7 = E.transition_image_transform;
        ImageView imageView = this.f18064a;
        imageView.setTag(i7, matrix);
        K.b(imageView, this.f18066c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        int i7 = E.transition_image_transform;
        ImageView imageView = this.f18064a;
        Matrix matrix = (Matrix) imageView.getTag(i7);
        if (matrix != null) {
            K.b(imageView, matrix);
            imageView.setTag(E.transition_image_transform, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        this.f18067d = false;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        if (this.f18067d) {
            int i7 = E.transition_image_transform;
            ImageView imageView = this.f18064a;
            imageView.setTag(i7, this.f18065b);
            K.b(imageView, this.f18066c);
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i7 = E.transition_image_transform;
        ImageView imageView = this.f18064a;
        Matrix matrix = (Matrix) imageView.getTag(i7);
        if (matrix != null) {
            K.b(imageView, matrix);
            imageView.setTag(E.transition_image_transform, null);
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18067d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f18067d = false;
    }
}
