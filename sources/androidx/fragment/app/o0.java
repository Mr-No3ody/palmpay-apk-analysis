package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f17189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q0 f17193e;

    public o0(q0 q0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f17193e = q0Var;
        this.f17189a = obj;
        this.f17190b = arrayList;
        this.f17191c = obj2;
        this.f17192d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        q0 q0Var = this.f17193e;
        Object obj = this.f17189a;
        if (obj != null) {
            q0Var.t(obj, this.f17190b, null);
        }
        Object obj2 = this.f17191c;
        if (obj2 != null) {
            q0Var.t(obj2, this.f17192d, null);
        }
    }
}
