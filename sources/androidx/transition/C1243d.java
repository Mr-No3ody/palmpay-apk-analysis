package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1243d extends AnimatorListenerAdapter implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f18020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f18022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18025g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18027j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18029p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f18030v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f18031w;

    public C1243d(View view, Rect rect, boolean z3, Rect rect2, boolean z8, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f18019a = view;
        this.f18020b = rect;
        this.f18021c = z3;
        this.f18022d = rect2;
        this.f18023e = z8;
        this.f18024f = i7;
        this.f18025g = i10;
        this.f18026i = i11;
        this.f18027j = i12;
        this.f18028o = i13;
        this.f18029p = i14;
        this.t = i15;
        this.f18030v = i16;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.f18031w = true;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        View view = this.f18019a;
        view.setTag(E.transition_clip, view.getClipBounds());
        view.setClipBounds(this.f18023e ? null : this.f18022d);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i7 = E.transition_clip;
        View view = this.f18019a;
        Rect rect = (Rect) view.getTag(i7);
        view.setTag(E.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z3) {
        if (this.f18031w) {
            return;
        }
        Rect rect = null;
        if (z3) {
            if (!this.f18021c) {
                rect = this.f18020b;
            }
        } else if (!this.f18023e) {
            rect = this.f18022d;
        }
        View view = this.f18019a;
        view.setClipBounds(rect);
        if (z3) {
            k0.a(view, this.f18024f, this.f18025g, this.f18026i, this.f18027j);
        } else {
            k0.a(view, this.f18028o, this.f18029p, this.t, this.f18030v);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z3) {
        int i7 = this.f18026i;
        int i10 = this.f18024f;
        int i11 = this.t;
        int i12 = this.f18028o;
        int iMax = Math.max(i7 - i10, i11 - i12);
        int i13 = this.f18027j;
        int i14 = this.f18025g;
        int i15 = this.f18030v;
        int i16 = this.f18029p;
        int iMax2 = Math.max(i13 - i14, i15 - i16);
        if (z3) {
            i10 = i12;
        }
        if (z3) {
            i14 = i16;
        }
        View view = this.f18019a;
        k0.a(view, i10, i14, iMax + i10, iMax2 + i14);
        view.setClipBounds(z3 ? this.f18022d : this.f18020b);
    }
}
