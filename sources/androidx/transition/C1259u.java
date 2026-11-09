package androidx.transition;

/* JADX INFO: renamed from: androidx.transition.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1259u implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.v0 f18122a;

    public C1259u(androidx.fragment.app.v0 v0Var) {
        this.f18122a = v0Var;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f18122a.run();
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
}
