package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M.f f18008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f18009b;

    public V(W w3, M.f fVar) {
        this.f18009b = w3;
        this.f18008a = fVar;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        ((ArrayList) this.f18008a.get(this.f18009b.f18011b)).remove(transition);
        transition.removeListener(this);
    }
}
