package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransitionSet f18016a;

    public a0(TransitionSet transitionSet) {
        this.f18016a = transitionSet;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        TransitionSet transitionSet = this.f18016a;
        transitionSet.f18003a.remove(transition);
        if (transitionSet.hasAnimators()) {
            return;
        }
        transitionSet.notifyListeners(Transition.TransitionNotification.f18000c, false);
        transitionSet.mEnded = true;
        transitionSet.notifyListeners(Transition.TransitionNotification.f17999b, false);
    }
}
