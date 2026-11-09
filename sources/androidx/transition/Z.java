package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Transition f18015a;

    public Z(Transition transition) {
        this.f18015a = transition;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f18015a.runAnimators();
        transition.removeListener(this);
    }
}
