package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransitionSet f18018a;

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        TransitionSet transitionSet = this.f18018a;
        int i7 = transitionSet.f18005c - 1;
        transitionSet.f18005c = i7;
        if (i7 == 0) {
            transitionSet.f18006d = false;
            transitionSet.end();
        }
        transition.removeListener(this);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        TransitionSet transitionSet = this.f18018a;
        if (transitionSet.f18006d) {
            return;
        }
        transitionSet.start();
        transitionSet.f18006d = true;
    }
}
