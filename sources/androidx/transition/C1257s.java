package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.transition.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1257s implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f18104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18105b;

    public C1257s(View view, ArrayList arrayList) {
        this.f18104a = view;
        this.f18105b = arrayList;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f18104a.setVisibility(8);
        ArrayList arrayList = this.f18105b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
