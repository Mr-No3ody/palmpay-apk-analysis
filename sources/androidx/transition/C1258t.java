package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.transition.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1258t extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f18115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1260v f18116e;

    public C1258t(C1260v c1260v, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f18116e = c1260v;
        this.f18112a = obj;
        this.f18113b = arrayList;
        this.f18114c = obj2;
        this.f18115d = arrayList2;
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // androidx.transition.U, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        C1260v c1260v = this.f18116e;
        Object obj = this.f18112a;
        if (obj != null) {
            c1260v.t(obj, this.f18113b, null);
        }
        Object obj2 = this.f18114c;
        if (obj2 != null) {
            c1260v.t(obj2, this.f18115d, null);
        }
    }
}
