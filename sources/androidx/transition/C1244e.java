package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1244e extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18035a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f18036b;

    public C1244e(ViewGroup viewGroup) {
        this.f18036b = viewGroup;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        K.h(this.f18036b, false);
        this.f18035a = true;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (!this.f18035a) {
            K.h(this.f18036b, false);
        }
        transition.removeListener(this);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        K.h(this.f18036b, false);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        K.h(this.f18036b, true);
    }
}
